package edu.umass.cs.client.locationtracking;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;

import edu.umass.cs.client.sql.GPSLocation;
import edu.umass.cs.client.sql.LocationDAO;

public class ContextService extends Service implements LocationListener{

    static ContextService sInstance = null;
    final Messenger mMessenger = new Messenger(new IncomingHandler());
    private LocationManager locationManager;
    ArrayList<Messenger> mClients = new ArrayList<Messenger>(); //List of bound clients/activities to this service

    private static boolean isRunning = false;
    private static boolean isLocationRunning = false;

    public final static int MSG_REGISTER_CLIENT = 0;
    public final static int MSG_UNREGISTER_CLIENT = 1;
    public final static int MSG_START_LOCATION = 2;
    public final static int MSG_STOP_LOCATION = 3;
    public final static int MSG_LOCATION_STARTED = 4;
    public final static int MSG_LOCATION_STOPPED = 5;
    public final static int MSG_LOCATION_UPDATE = 6;
    private final static long MIN_TIME = 5000;
    private final static float MIN_DISTANCE = 0;

    public ContextService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        isRunning = true;
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
    }

    protected static boolean isRunning(){
        return isRunning;
    }

    protected static boolean isLocationRunning(){
        return isLocationRunning;
    }

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
                case MSG_START_LOCATION:
                    startLocation();
                    break;
                case MSG_STOP_LOCATION:
                    stopLocation();
                    break;
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

    @Override
    public IBinder onBind(Intent intent) {
        return mMessenger.getBinder();
    }

    private void startLocation() {
        locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                ContextService.MIN_TIME,
                ContextService.MIN_DISTANCE,
                sInstance, getMainLooper());
        isLocationRunning = true;
        sendMessageToUI(MSG_LOCATION_STARTED);
    }

    private void stopLocation() {
        locationManager.removeUpdates(sInstance);
        isLocationRunning = false;
        sendMessageToUI(MSG_LOCATION_STOPPED);
    }


    //TODO: Consider moving this out and save location every X seconds for clustering
    @Override
    public void onLocationChanged(Location location) {
        Log.i("Location", location.toString());
        sendMessageToUI(MSG_LOCATION_UPDATE);

        //TODO: Consider using 'if (location.getSpeed() !> 0)' for better data

        LocationDAO dao = new LocationDAO(getApplicationContext());
        dao.openWrite();
        dao.insert(new GPSLocation(location.getTime(), location.getLatitude(), location.getLongitude(), location.getAccuracy()));
        dao.close();
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
