package com.example.camera;

/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/*
 * Reference: http://www.41post.com/3470/programming/android-retrieving-the-camera-preview-as-a-pixel-array
 * https://code.google.com/p/ketai/
 * http://www.javamex.com/tutorials/conversion/decimal_hexadecimal.shtml
 * http://developer.android.com/training/camera/cameradirect.html
 */

//strings.xml, app_name added
//camera_menu.xml under res
//camera permission in manifest x3lines
//change manifest file-> minAPI->from 8 to 9
//changeactivity android:name=".CameraPreview" from mainactivity in manifest.xml

//camera manifest change

//show camera stream on app
//http://stackoverflow.com/questions/11687939/in-android-stream-camera-preview-onto-a-view

//Useful: out of sync: file>refresh and delete file

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
// Need the following import to get access to the app resources, since this
// class is in a sub-package.

// ----------------------------------------------------------------------

public class CameraPreview extends Activity implements OnClickListener{


	private Preview mPreview;
	Camera mCamera;
	int numberOfCameras;
	int cameraCurrentlyLocked;

	boolean isMeasuring=false;
	Button btn_startmeasure;
	TextView txt_status, activityValue, heartRateValue;
	// The first rear facing camera
	int defaultCameraId;

	BufferedWriter bw;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		// Hide the window title.
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_main);
		txt_status=(TextView)findViewById(R.id.txt_status);
		activityValue = (TextView) findViewById(R.id.activityValue);
		heartRateValue = (TextView) findViewById(R.id.heartRateValue);
		Log.i("heartRateVlue", heartRateValue.toString());


		//Set the buttons and the text accordingly
		btn_startmeasure = (Button) findViewById(R.id.btn_startmeasure);
		btn_startmeasure.setOnClickListener(this);


		// Create a RelativeLayout container that will hold a SurfaceView,
		// and set it as the content of our activity.
		mPreview = new Preview(this);


		FrameLayout preview = (FrameLayout) findViewById(R.id.cam_preview);
		preview.addView(mPreview);
		preview.setOnClickListener(this);

		// Find the total number of cameras available
		numberOfCameras = Camera.getNumberOfCameras();

		// Find the ID of the default camera
		CameraInfo cameraInfo = new CameraInfo();
		for (int i = 0; i < numberOfCameras; i++) {
			Camera.getCameraInfo(i, cameraInfo);
			if (cameraInfo.facing == CameraInfo.CAMERA_FACING_BACK) {
				defaultCameraId = i;
			}
		}

	}



	public void onClick(View v){
		//Start measuring PPG
		if (v==btn_startmeasure) {
			Parameters p = mCamera.getParameters();
			if (!isMeasuring) {
				txt_status.setText("Measuring...");
				btn_startmeasure.setText("Stop");
				p.setFlashMode(Parameters.FLASH_MODE_TORCH);
				mCamera.setParameters(p);
				mCamera.startPreview();
				isMeasuring = true;
			} else {
				txt_status.setText("Please Press Start");
				btn_startmeasure.setText("Start");
				p.setFlashMode(Parameters.FLASH_MODE_OFF);
				mCamera.setParameters(p);
				mCamera.stopPreview();
				isMeasuring = false;
			}
		}
		//if you tap the camera view on the screen, autofocus the camera
		if(isMeasuring && v.getId()==R.id.cam_preview) {
			mCamera.autoFocus(null);
			Toast toast = Toast.makeText(this, "Camera focused", Toast.LENGTH_SHORT);
			toast.show();
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		mCamera = Camera.open();
		cameraCurrentlyLocked = defaultCameraId;
		mPreview.setCamera(mCamera);
	}

	@Override
	protected void onPause() {
		super.onPause();

		// Because the Camera object is a shared resource, it's very
		// important to release it when the activity is paused.
		if (mCamera != null) {
			mPreview.setCamera(null);
			//mPreview.getHolder().removeCallback(mPreview);
			mCamera.release();
			mCamera = null;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate our menu which can gather user input for switching camera
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.camera_menu, menu);
		return true;
	}
}

/**
 * A simple wrapper around a Camera and a SurfaceView that renders a centered preview of the Camera
 * to the surface. We need to center the SurfaceView because not all devices have cameras that
 * support preview sizes at the same aspect ratio as the device's display.
 */
class Preview extends ViewGroup implements SurfaceHolder.Callback, PreviewCallback {
	private final String TAG = "Preview";

	SurfaceView mSurfaceView;
	SurfaceHolder mHolder;
	Size mPreviewSize;
	List<Size> mSupportedPreviewSizes;
	Camera mCamera;


	int defaultCameraId;

	CameraPreview myActivity = (CameraPreview) getContext();


	//Parameters for PPG
	//This variable is responsible for getting and setting the camera settings  
	private Parameters parameters;  
	//this array stores the pixels as hexadecimal for RGB color: eg.    
	private int[] pixels;  
	//crop center 100 pixels
	//private int nCenterPixels=200*200; 
	private int npixels;

	//number of frames to record
	private final int nframe=500;
	//frame countdown till nframe
	private int frameCount=0;
	//bpm result
	private int result=0;

	

	double meanFiltSm, meanFiltBW;

	private boolean readyForAnalysis=false;

	double sum=0;
	int color;
	double red;
	private double mean;

	private boolean filterOn=false;


	private double[] meanreds=new double[nframe];
	private long[] meanredsTimestamps=new long[nframe];

	int pp=0;
	String hexStr="";

	Preview(Context context) {
		super(context);

		mSurfaceView = new SurfaceView(context);
		addView(mSurfaceView);

		// Install a SurfaceHolder.Callback so we get notified when the
		// underlying surface is created and destroyed.
		mHolder = mSurfaceView.getHolder();
		mHolder.addCallback(this);
		mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
	}

	public void setCamera(Camera camera) {
		mCamera = camera;
		if (mCamera != null) {
			mSupportedPreviewSizes = mCamera.getParameters().getSupportedPreviewSizes();
			for(Size o : mSupportedPreviewSizes) {
				Log.d("test", ""+ o.height + " x " + o.width);
			}
			requestLayout();
		}
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// We purposely disregard child measurements because act as a
		// wrapper to a SurfaceView that centers the camera preview instead
		// of stretching it.
		final int width = resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec);
		final int height = resolveSize(getSuggestedMinimumHeight(), heightMeasureSpec);
		setMeasuredDimension(width, height);

		if (mSupportedPreviewSizes != null) {
			mPreviewSize = mSupportedPreviewSizes.get(10);
			Log.i("finalwidth: ",""+mPreviewSize.width);
		}
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		if (changed && getChildCount() > 0) {
			final View child = getChildAt(0);
			final int width = r - l;
			final int height = b - t;

			int previewWidth = width;
			int previewHeight = height;
			if (mPreviewSize != null) {
				previewWidth = mPreviewSize.width;
				previewHeight = mPreviewSize.height;
			}

			// Center the child SurfaceView within the parent.
			if (width * previewHeight > height * previewWidth) {
				final int scaledChildWidth = previewWidth * height / previewHeight;
				child.layout((width - scaledChildWidth) / 2, 0,
						(width + scaledChildWidth) / 2, height);
			} else {
				final int scaledChildHeight = previewHeight * width / previewWidth;
				child.layout(0, (height - scaledChildHeight) / 2,
						width, (height + scaledChildHeight) / 2);
			}
		}
	}

	public void surfaceCreated(SurfaceHolder holder) {
		// The Surface has been created, acquire the camera and tell it where
		// to draw.
		if(mCamera == null) {
			mCamera = Camera.open();
		}
		try {
			if (mCamera != null) {
				mCamera.setPreviewDisplay(holder);
				pixels = new int[mPreviewSize.width * mPreviewSize.height];
				npixels=pixels.length;
				parameters = mCamera.getParameters();
				int dataBufferSize=(int)(mPreviewSize.height*mPreviewSize.width*
						(ImageFormat.getBitsPerPixel(parameters.getPreviewFormat())/8.0));

				pp=dataBufferSize;

				mCamera.addCallbackBuffer(new byte[dataBufferSize]);
				mCamera.addCallbackBuffer(new byte[dataBufferSize]);
				mCamera.addCallbackBuffer(new byte[dataBufferSize]);
				//ADDED AFTER SETTTING THE PREVIEW DISPLAY!!! NOT BEFORE
				//sets the camera callback to be the one defined in this class  
				mCamera.setPreviewCallbackWithBuffer(this);
			}
		} catch (IOException exception) {
			Log.e(TAG, "IOException caused by setPreviewDisplay()", exception);

		}
	}

	public void surfaceDestroyed(SurfaceHolder holder) {
		// Surface will be destroyed when we return, so stop the preview.
		if (mCamera != null) {
			mCamera.stopPreview();
		}
	}

	public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
		Camera.Parameters parameters = mCamera.getParameters();
		parameters.setPreviewSize(mPreviewSize.width, mPreviewSize.height);
		requestLayout();
		mCamera.setParameters(parameters);
//		mCamera.startPreview();
	}

	//Reference: http://stackoverflow.com/questions/20298699/onpreviewframe-data-image-to-imageview
	//define what the callback should do before rendering a preview frame to the screen
	@Override  
	public void onPreviewFrame(byte[] data, Camera camera) {  
		//transforms NV21 pixel data into RGB pixels  


		camera.addCallbackBuffer(data);

		//Collect color data and store them but now replacing each frame with new frame
		decodeYUV420SP(pixels, data, mPreviewSize.width,  mPreviewSize.height);  
		hexStr=Integer.toHexString(pixels[0]);

		for (int i=0;i<npixels;i+=3){

			hexStr=Integer.toHexString(pixels[i]);

			color = (int)Long.parseLong(hexStr, 16);
			red = (double)(((color >> 16) & 0xFF));
			sum=sum+red;
		}


		mean=(double)(sum/npixels);

		//Log.i("SUM: ",""+sum);
		//Log.i("MEAN: ",""+mean);

		sum=0;

		if (frameCount<nframe && frameCount!=-1){
			long time = System.currentTimeMillis();
			meanreds[frameCount]=mean;
			meanredsTimestamps[frameCount]=time;
			processData(time, mean);

			frameCount++;
			Log.d("frameCount: ", ""+frameCount);
			//Log.d("FILE: ","RECORDING..."+frameCount);

		}
		else if(frameCount==-1){
			Log.d("FILE: ","DONE!");

		}
		else{
			generateDATA();
			Toast toast = Toast.makeText(myActivity, "Data written!", Toast.LENGTH_SHORT);
			toast.show();
			frameCount=-1;
		}

	}  

	int bufferSize = 200;
	long lastTime = System.currentTimeMillis();
	long bufferTime = 5000;
	int bufferIndex = 0;
	long[] timeBuffer = new long[bufferSize];
	double[] meanBuffer = new double[bufferSize];
	public void processData(long time, double mean) {
		if(time - lastTime > bufferTime) {
			//analyse
			int heartRate = calculateHeartbeat(timeBuffer, meanBuffer, time - lastTime);
			if(heartRate > 40 && heartRate < 200) {
				myActivity.heartRateValue.setText(Integer.toString(heartRate));
			}
			if(heartRate > 40 && heartRate < 95) {
				myActivity.activityValue.setText("Resting");
			}
			else if (heartRate >= 95 && heartRate <= 200) {
				myActivity.activityValue.setText("Exercising");
			}
			else {
				myActivity.activityValue.setText("N/A");
			}
			// reset
			lastTime = time;
			bufferIndex = 0;
			timeBuffer = new long[bufferSize];
			meanBuffer = new double[bufferSize];
		}
		else {
			timeBuffer[bufferIndex] = time;
			meanBuffer[bufferIndex] = mean;
			bufferIndex++;
		}
	}

	public int calculateHeartbeat(long[] timeBuffer, double[] meanBuffer, long timeWindow) {
		double lastPoint = 0;
		double localMin = 0;
		double localMax = 0;
		long localMinTime = 0;
		ArrayList<Long> localMinTimes = new ArrayList<Long>(meanBuffer.length);
		for(int i = 0; i < meanBuffer.length; i++) {
			double point = meanBuffer[i];
			if (point == 0.0) break;
			if (point < lastPoint) { //is the slope negative
				localMin = point;
				localMinTime = timeBuffer[i];
				if (localMax < lastPoint) {
					localMax = lastPoint;
				}
			} else {
				if (localMax - localMin > 0.45) {
					//found a real dip
					localMinTimes.add(localMinTime);
				}
				localMax = 0;
				localMin = 0;
			}
			lastPoint = point;
		}
		long avg = 0;
		for (int i = 1; i < localMinTimes.size(); i++) {
			long point = localMinTimes.get(i);
			long prevPoint = localMinTimes.get(i-1);
			avg += (point - prevPoint);
		}

		int numIntervals = localMinTimes.size() - 1;
		int heartRate = 0;
		if(numIntervals > 0) {
			long avgTimePerBeat = avg / (numIntervals);
			if (avgTimePerBeat > 0) heartRate = (int) (60000 / avgTimePerBeat);
		}
		return heartRate;
	}


	//This method writes the red pixel values in a text file and stored it in Downloads/MyPPG
	public void generateDATA() {
		//This will get the SD Card directory and create a folder named MyFiles in it.
		File root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
		File directory = new File (root.getAbsolutePath() + "/MyPPG");
		directory.mkdirs();


		DateFormat df = new SimpleDateFormat("HH:mm:ss.SSS");
//		df.setTimeZone(TimeZone.getTimeZone("ET"));
		String date = df.format(Calendar.getInstance().getTime());

		//Now create the file in the above directory and write the contents into it
		File file = new File(directory, "RedValues_"+date+".txt");
		FileOutputStream fOut;
		try {
			fOut = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fOut);
			osw.write("Index\tTime Stamp\tred Values\n");
			osw.write("Start: "+System.currentTimeMillis()+"\n");

			for (int i=0; i<meanreds.length;i++){

				if (filterOn){
					//osw.write(i+"\t"+Double.toString(meanreds[i])+"\t"+Double.toString(meanredsFiltSm[i])+"\t"+Double.toString(meanredsFiltBW[i])+"\n");
				}
				else{
					osw.write(i+"\t"+df.format(new Date(meanredsTimestamps[i]))+"\t"+Double.toString(meanreds[i])+"\n");
				}

			}
			osw.write("End: "+System.currentTimeMillis());
			osw.flush();
			osw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public double getSum(double[] array){
		double sum=0;

		for (int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return (double)sum;
	}
	public double getMean(double[] array){

		return getSum(array)/array.length;
	}

	public boolean readyForAnalysis(){
		return readyForAnalysis;
	}

	public int measureBPM(){
		return result;
	}

	//Decode YUV color code to hex
	void decodeYUV420SP(int[] rgb, byte[] yuv420sp, int width, int height) {  

		final int frameSize = width * height;  

		//Log.i("FRAMESIZE: ",""+frameSize);

		for (int j = 0, yp = 0; j < height; j++) {       int uvp = frameSize + (j >> 1) * width, u = 0, v = 0;  
		for (int i = 0; i < width; i++, yp++) {  
			int y = (0xff & ((int) yuv420sp[yp])) - 16;  
			if (y < 0)  
				y = 0;  
			if ((i & 1) == 0) {  
				v = (0xff & yuv420sp[uvp++]) - 128;  
				u = (0xff & yuv420sp[uvp++]) - 128;  
			}  

			int y1192 = 1192 * y;  
			int r = (y1192 + 1634 * v);  
			int g = (y1192 - 833 * v - 400 * u);  
			int b = (y1192 + 2066 * u);  

			if (r < 0)                  r = 0;               else if (r > 262143)  
				r = 262143;  
			if (g < 0)                  g = 0;               else if (g > 262143)  
				g = 262143;  
			if (b < 0)                  b = 0;               else if (b > 262143)  
				b = 262143;  

			rgb[yp] = 0xff000000 | ((r << 6) & 0xff0000) | ((g >> 2) & 0xff00) | ((b >> 10) & 0xff);  


		}  
		}  

	}  
}  