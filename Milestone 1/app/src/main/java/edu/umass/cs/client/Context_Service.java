package edu.umass.cs.client;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

import edu.umass.cs.accelerometer.Filter;

/**
 * 
 * Context_Service: This is a sample class to reads sensor data (accelerometer). 
 * 
 * @author CS390MB
 * 
 */
public class Context_Service extends Service implements SensorEventListener{

	private NotificationManager nm;
	private SensorManager mSensorManager;
    private Sensor mAccelerometer;

	//List of bound clients/activities to this service
	ArrayList<Messenger> mClients = new ArrayList<Messenger>();

	//Message codes sent and received by the service
	static final int MSG_REGISTER_CLIENT = 1;
	static final int MSG_UNREGISTER_CLIENT = 2;
	static final int MSG_ACTIVITY_STATUS = 3;
	static final int MSG_STEP_COUNTER = 4;
	static final int MSG_ACCEL_VALUES = 5;
	static final int MSG_START_ACCELEROMETER = 6;
	static final int MSG_STOP_ACCELEROMETER = 7;
	static final int MSG_ACCELEROMETER_STARTED = 8;
	static final int MSG_ACCELEROMETER_STOPPED = 9;

	static Context_Service sInstance = null;
	private static boolean isRunning = false;
	private static boolean isAccelRunning = false;
	private static final int NOTIFICATION_ID = 777;

	//Messenger used by clients
	final Messenger mMessenger = new Messenger(new IncomingHandler());

	//Used for determining a dynamic threshold
	private static final double MIN_THRESHOLD = .5;
	private int thresholdCount = 0;
	double[] prev_acc_values = new double[500];

	//Used for determining when a step has occurred
	private static final double UNDEFINED_ACC = -1000;
	double prev_filt_acc = UNDEFINED_ACC;
	long prev_step_time = 0;

	private Filter filter = null;
	private double threshold = MIN_THRESHOLD;
	private int stepCount = 0;

	/**
	 * Handler to handle incoming messages
	 */
	@SuppressLint("HandlerLeak")
	class IncomingHandler extends Handler { 
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_REGISTER_CLIENT:
				mClients.add(msg.replyTo);
				break;
			case MSG_UNREGISTER_CLIENT:
				mClients.remove(msg.replyTo);
				break;
			case MSG_START_ACCELEROMETER:
			{
				isAccelRunning = true;
				mSensorManager.registerListener(sInstance, mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
				sendMessageToUI(MSG_ACCELEROMETER_STARTED);
				showNotification();
				//Set up filter
				//Following sets up smoothing filter from mcrowdviz
				//int SMOOTH_FACTOR = 10;
				//filter = new Filter(SMOOTH_FACTOR);
				//OR Use Butterworth filter from mcrowdviz
				double CUTOFF_FREQUENCY = 0.9;
				filter = new Filter(CUTOFF_FREQUENCY);
				stepCount = 0;
				break;
			}
			case MSG_STOP_ACCELEROMETER:
			{
				isAccelRunning = false;
				mSensorManager.unregisterListener(sInstance);
				sendMessageToUI(MSG_ACCELEROMETER_STOPPED);
				showNotification();
				//Free filter and step detector
				filter = null;
				break;
			}
			default:
				super.handleMessage(msg);
			}
		}
	}


	private void sendMessageToUI(int message) {
		for (int i=mClients.size()-1; i>=0; i--) {
			try {
				// Send message value
				mClients.get(i).send(Message.obtain(null, message));
			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}
	
	private void sendAccelValuesToUI(float accX, float accY, float accZ) {
		for (int i=mClients.size()-1; i>=0; i-- ) {
			try {
				
				//Send Accel Values
				Bundle b = new Bundle();
				b.putFloat("accx", accX);
				b.putFloat("accy", accY);
				b.putFloat("accz", accZ);
				Message msg = Message.obtain(null, MSG_ACCEL_VALUES);
				msg.setData(b);
				mClients.get(i).send(msg);

			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}
	
	private void sendUpdatedStepCountToUI() {
		for (int i=mClients.size()-1; i>=0; i-- ) {
			try {
				//Send Step Count
				Message msg = Message.obtain(null, MSG_STEP_COUNTER,stepCount,0);
				mClients.get(i).send(msg);

			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}

	/**
	 * On Binding, return a binder
	 */
	@Override
	public IBinder onBind(Intent intent) {
		return mMessenger.getBinder();
	}

	//Start service automatically if we reboot the phone
	public static class Context_BGReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			Intent bootUp = new Intent(context,Context_Service.class);
			context.startService(bootUp);
		}		
	}

	@SuppressWarnings("deprecation")
	private void showNotification() {
		//Cancel previous notification
		if(nm!=null)
			nm.cancel(NOTIFICATION_ID);
		else
			nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

		// The PendingIntent to launch our activity if the user selects this notification
		PendingIntent contentIntent = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0);

		// Use the commented block of code if your target environment is Android-16 or higher 
		/*Notification notification = new Notification.Builder(this)
		.setContentTitle("Context Service")
		.setContentText("Running").setSmallIcon(R.drawable.icon)
		.setContentIntent(contentIntent)
		.build();
		
		nm.notify(NOTIFICATION_ID, notification); */
		
		//For lower versions of Android, the following code should work
		Notification notification = new Notification();
		notification.icon = R.drawable.icon;
		notification.tickerText = getString(R.string.app_name);
		notification.contentIntent = contentIntent;
        notification.when = System.currentTimeMillis();
        if(isAccelerometerRunning())
        	notification.setLatestEventInfo(getApplicationContext(), getString(R.string.app_name), "Accelerometer Running", contentIntent);
        else
        	notification.setLatestEventInfo(getApplicationContext(), getString(R.string.app_name), "Accelerometer Not Started", contentIntent);
        
        // Send the notification.
        nm.notify(NOTIFICATION_ID, notification);
	}

	/* getInstance() and isRunning() are required by the */
	static Context_Service getInstance(){
		return sInstance;
	}

	protected static boolean isRunning(){
		return isRunning;
	}
	
	protected static boolean isAccelerometerRunning() {
		return isAccelRunning;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		showNotification();
		isRunning = true;
		sInstance = this;
		Log.i("exist", "not being skipped");
		mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
		mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		nm.cancel(NOTIFICATION_ID); // Cancel the persistent notification.
        isRunning = false;
		//Don't let Context_Service die!
		Intent mobilityIntent = new Intent(this,Context_Service.class);
		startService(mobilityIntent);
	}

	@Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY; // run until explicitly stopped.
    }

	/* (non-Javadoc)
	 * @see android.hardware.SensorEventListener#onAccuracyChanged(android.hardware.Sensor, int)
	 */
	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		
	}

	/* (non-Javadoc)
	 * @see android.hardware.SensorEventListener#onSensorChanged(android.hardware.SensorEvent)
	 */
	@Override
	public void onSensorChanged(SensorEvent event) {
		if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
			
			float accel[] = event.values;
			sendAccelValuesToUI(accel[0], accel[1], accel[2]);
			
			
			/**
			 * TODO: Step Detection
			 */
			//First, Get filtered values
			double filtAcc[] = filter.getFilteredValues(accel[0], accel[1], accel[2]);
			//Now, increment 'stepCount' variable if you detect any steps here
			stepCount += detectSteps(filtAcc[0], filtAcc[1], filtAcc[2]); 
			//detectSteps() is not implemented 
			sendUpdatedStepCountToUI();
			
		}

	}
	
	/**
	 * This should return number of steps detected.
	 * @param filt_acc_x
	 * @param filt_acc_y
	 * @param filt_acc_z
	 * @return
	 */
	public int detectSteps(double filt_acc_x, double filt_acc_y, double filt_acc_z) {
		double filt_acc = Math.sqrt(Math.pow(filt_acc_x, 2) + Math.pow(filt_acc_y, 2) + Math.pow(filt_acc_z, 2));
		filt_acc -= 9.8;
		double threshold = calculateDynamicThreshold(filt_acc);
		return calculateStep(filt_acc, threshold);
	}

	/**
	 * This should return a threshold level calculated from 50 accelerometer readings.
	 * The threshold level is updated after each group of 50 readings.
	 * If less than the minimum accepted reading for a threshold, returns MIN_THRESHOLD.
	 * If less than 50 readings, returns the MIN_THRESHOLD;
	 * @param filt_acc
	 * @return
	 */
	private double calculateDynamicThreshold(double filt_acc){
		if(thresholdCount == prev_acc_values.length){
			double sum = 0.0;
			for (double prev_acc : prev_acc_values) sum += prev_acc;
			double calc_threshold = sum/prev_acc_values.length;

			threshold = (calc_threshold > MIN_THRESHOLD) ? calc_threshold : MIN_THRESHOLD;

			prev_acc_values = new double[prev_acc_values.length];
			thresholdCount = 0;
		}
		prev_acc_values[thresholdCount] = filt_acc;
		thresholdCount++;
		return threshold;
	}

	/**
	 * This should return either a 1 or 0 depending on if a step was detected.
	 * @param filt_acc
	 * @param threshold
	 * @return
	 */
	private int calculateStep(double filt_acc, double threshold){
		if(prev_filt_acc == UNDEFINED_ACC) {
			prev_filt_acc = filt_acc;
			return 0;
		}

		boolean prevAboveThresh = prev_filt_acc > threshold;
		boolean currBelowThresh = filt_acc <= threshold;
		boolean enoughTimeElapsed = System.currentTimeMillis() - prev_step_time > 250;

		if(prevAboveThresh && currBelowThresh && enoughTimeElapsed) {
			prev_step_time = System.currentTimeMillis();
			prev_filt_acc = filt_acc;
			return 1;
		}
		else {
			prev_filt_acc = filt_acc;
			return 0;
		}
	}

}