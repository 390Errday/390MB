package com.ryanarifswana.bioflix;


import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;

import com.microsoft.band.BandClient;
import com.microsoft.band.BandClientManager;
import com.microsoft.band.BandException;
import com.microsoft.band.BandInfo;
import com.microsoft.band.ConnectionState;
import com.microsoft.band.UserConsent;
import com.microsoft.band.sensors.BandGsrEvent;
import com.microsoft.band.sensors.BandGsrEventListener;
import com.microsoft.band.sensors.BandHeartRateEvent;
import com.microsoft.band.sensors.BandHeartRateEventListener;
import com.microsoft.band.sensors.HeartRateConsentListener;

import java.lang.ref.WeakReference;

public class MSBandService extends Service {
    public final static int MSG_ERROR = 0;
    public final static String BUNDLE_ERROR_TEXT = "err";

    public final static int MSG_BAND_NOT_REGISTERED = 1;

    public final static int     MSG_HR_TICK = 2;
    public final static String  BUNDLE_HR_HR = "hr";
    public final static String  BUNDLE_HR_QUALITY = "quality";
    public final static String  BUNDLE_HR_TIME = "time";

    public final static int     MSG_GSR_TICK = 3;
    public final static String  BUNDLE_GSR_RESISTANCE = "resistance";
    public final static String  BUNDLE_GSR_TIME = "time";

    private final IBinder mBinder = new LocalBinder();
    private BandClient client;
    ResultReceiver resultReceiver;
    Bundle hrBundle;
    Bundle gsrBundle;
    Bundle errBundle;


    public class LocalBinder extends Binder {
        MSBandService getService() {
            return MSBandService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("Inside IBINDER", "HERE");
        resultReceiver = intent.getParcelableExtra("receiver");
        hrBundle = new Bundle();
        gsrBundle = new Bundle();
        errBundle = new Bundle();
        return mBinder;
    }

    public void startHeartRate() {
        new HeartRateSubscriptionTask().execute();
    }

    public void requestConsent(WeakReference<Activity> reference) {
        Log.d("Consent received", "True!!");
        new HeartRateConsentTask().execute(reference);
        new GsrSubscriptionTask().execute();
    }

    public void sendError(String error) {
        errBundle.clear();
        errBundle.putString(BUNDLE_ERROR_TEXT, error);
        resultReceiver.send(MSG_ERROR, errBundle);
    }

    private BandGsrEventListener mGsrEventListener = new BandGsrEventListener() {
        @Override
        public void onBandGsrChanged(final BandGsrEvent event) {
            if (event != null) {
                Log.d("GSR Tick", ""+event.getTimestamp());
                gsrBundle.clear();
                gsrBundle.putInt(BUNDLE_GSR_RESISTANCE, event.getResistance());
                gsrBundle.putLong(BUNDLE_GSR_TIME, event.getTimestamp());
                resultReceiver.send(MSG_GSR_TICK, gsrBundle);
            }
        }
    };

    private BandHeartRateEventListener mHeartRateEventListener = new BandHeartRateEventListener() {
        @Override
        public void onBandHeartRateChanged(final BandHeartRateEvent event) {
            if (event != null) {
                Log.d("HR Tick", ""+event.getTimestamp());
                hrBundle.clear();
                hrBundle.putInt(BUNDLE_HR_HR, event.getHeartRate());
                hrBundle.putString(BUNDLE_HR_QUALITY, event.getQuality().toString());
                hrBundle.putLong(BUNDLE_HR_TIME, event.getTimestamp());
                resultReceiver.send(MSG_HR_TICK, hrBundle);
            }
        }
    };

    private boolean getConnectedBandClient() throws InterruptedException, BandException {
        if (client == null) {
            BandInfo[] devices = BandClientManager.getInstance().getPairedBands();
            if (devices.length == 0) {
                sendError("Band isn't paired with your phone.\n");
                return false;
            }
            client = BandClientManager.getInstance().create(getBaseContext(), devices[0]);
        } else if (ConnectionState.CONNECTED == client.getConnectionState()) {
            return true;
        }

        //sendToSnackbar("Band is connecting...\n");
        return ConnectionState.CONNECTED == client.connect().await();
    }

    private class GsrSubscriptionTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            try {
                if (getConnectedBandClient()) {
                    int hardwareVersion = Integer.parseInt(client.getHardwareVersion().await());
                    if (hardwareVersion >= 20) {
                        sendError("Band is connected.");
                        client.getSensorManager().registerGsrEventListener(mGsrEventListener);
                    } else {
                        sendError("The Gsr sensor is not supported with your Band version. Microsoft Band 2 is required.\n");
                    }
                } else {
                    sendError("Band isn't connected. Please make sure bluetooth is on and the band is in range.\n");
                }
            } catch (BandException e) {
                String exceptionMessage="";
                switch (e.getErrorType()) {
                    case UNSUPPORTED_SDK_VERSION_ERROR:
                        exceptionMessage = "Microsoft Health BandService doesn't support your SDK Version. Please update to latest SDK.\n";
                        break;
                    case SERVICE_ERROR:
                        exceptionMessage = "Microsoft Health BandService is not available. Please make sure Microsoft Health is installed and that you have the correct permissions.\n";
                        break;
                    default:
                        exceptionMessage = "Unknown error occured: " + e.getMessage() + "\n";
                        break;
                }
                sendError(exceptionMessage);

            } catch (Exception e) {
                sendError(e.getMessage());
            }
            return null;
        }
    }

    private class HeartRateSubscriptionTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            try {
                if (getConnectedBandClient()) {
                    if (client.getSensorManager().getCurrentHeartRateConsent() == UserConsent.GRANTED) {
                        client.getSensorManager().registerHeartRateEventListener(mHeartRateEventListener);
                    } else {
                        //not subscribed. do something
                        Bundle bundle = new Bundle();
                        resultReceiver.send(MSG_BAND_NOT_REGISTERED, bundle);
                    }
                } else {
                    sendError("Band isn't connected. Please make sure bluetooth is on and the band is in range.\n");
                }
            } catch (BandException e) {
                String exceptionMessage="";
                switch (e.getErrorType()) {
                    case UNSUPPORTED_SDK_VERSION_ERROR:
                        exceptionMessage = "Microsoft Health BandService doesn't support your SDK Version. Please update to latest SDK.\n";
                        break;
                    case SERVICE_ERROR:
                        exceptionMessage = "Microsoft Health BandService is not available. Please make sure Microsoft Health is installed and that you have the correct permissions.\n";
                        break;
                    default:
                        exceptionMessage = "Unknown error occured: " + e.getMessage() + "\n";
                        break;
                }
                sendError(exceptionMessage);

            } catch (Exception e) {
                sendError(e.getMessage());
            }
            return null;
        }
    }

    private class HeartRateConsentTask extends AsyncTask<WeakReference<Activity>, Void, Void> {
        @Override
        protected Void doInBackground(WeakReference<Activity>... params) {
            try {
                if (getConnectedBandClient()) {

                    if (params[0].get() != null) {
                        client.getSensorManager().requestHeartRateConsent(params[0].get(), new HeartRateConsentListener() {
                            @Override
                            public void userAccepted(boolean consentGiven) {
                            }
                        });
                    }
                } else {
                    sendError("Band isn't connected. Please make sure bluetooth is on and the band is in range.\n");
                }
            } catch (BandException e) {
                String exceptionMessage="";
                switch (e.getErrorType()) {
                    case UNSUPPORTED_SDK_VERSION_ERROR:
                        exceptionMessage = "Microsoft Health BandService doesn't support your SDK Version. Please update to latest SDK.\n";
                        break;
                    case SERVICE_ERROR:
                        exceptionMessage = "Microsoft Health BandService is not available. Please make sure Microsoft Health is installed and that you have the correct permissions.\n";
                        break;
                    default:
                        exceptionMessage = "Unknown error occured: " + e.getMessage() + "\n";
                        break;
                }
                sendError(exceptionMessage);

            } catch (Exception e) {
                sendError(e.getMessage());
            }
            return null;
        }
    }

}
