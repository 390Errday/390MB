package com.ryanarifswana.bioflix;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class CurrentSessionActivity extends AppCompatActivity {
    private String movieName;
    private String viewerName;
    private TextView hrRateView;
    private TextView gsrView;
    private Button startSessionButton;
    MSBandService bandService;
    BandResultsReceiver resultsReceiver;
    boolean serviceBound = false;
    CurrentSessionActivity currentSessionActivity;
    CoordinatorLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_session);
        currentSessionActivity = this;
        mainLayout = (CoordinatorLayout) findViewById(R.id.currentSessionCoordinatorLayout);
        Intent intent = getIntent();

        movieName = intent.getStringExtra("movieName");
        viewerName = intent.getStringExtra("viewerName");
        hrRateView = (TextView) findViewById(R.id.hrText);
        gsrView = (TextView) findViewById(R.id.gsrText);
        startSessionButton = (Button) findViewById(R.id.startButton);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(movieName);
        setSupportActionBar(toolbar);
        bindToService();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

//    public void onDestroy() {
//        super.onDestroy();
//        finish();
//    }

    private void bindToService() {
        if(!serviceBound) {
            resultsReceiver = new BandResultsReceiver(null);
            Intent intent = new Intent(this, MSBandService.class);
            intent.putExtra("receiver", resultsReceiver);
            intent.putExtra("movieName", movieName);
            intent.putExtra("viewerName", viewerName);
            this.bindService(intent, bandConnection, Context.BIND_AUTO_CREATE);
        }
    }

    //onClickListener for startMovieButton
    public void startMovie(View view) {
        MSBandService.startSession();
    }

    class UpdateHr implements Runnable {
        int updatedHr;

        public UpdateHr(int updatedHr) {
            this.updatedHr = updatedHr;
        }
        public void run() {
            hrRateView.setText(""+updatedHr);
        }
    }

    class UpdateGSR implements Runnable {
        int updatedGSR;

        public UpdateGSR(int updatedGSR) {
            this.updatedGSR = updatedGSR;
        }
        public void run() {
            gsrView.setText(""+updatedGSR);
        }
    }

    public void showRegisterBandSnackbar() {
        Snackbar snackbar = Snackbar
            .make(mainLayout, "You haven't given consent to access heart rate yet.", Snackbar.LENGTH_LONG)
            .setAction("Give Consent", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final WeakReference<Activity> reference = new WeakReference<Activity>(currentSessionActivity);
                    bandService.requestConsent(reference);
                }
            });
        snackbar.show();
    }

    /** Defines callbacks for service binding, passed to bindService() */
    private ServiceConnection bandConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName className,
                                       IBinder service) {
            // We've bound to LocalService, cast the IBinder and get LocalService instance
            MSBandService.LocalBinder binder = (MSBandService.LocalBinder) service;
            bandService = binder.getService();
            bandService.startHeartRate();
            bandService.startGsr();
            serviceBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            Log.d("CURRENT SESSION:", "UNBOUND FROM SERVICE");
            serviceBound = false;
        }
    };

    // Recieves data from MSBandService
    class BandResultsReceiver extends ResultReceiver {
        public BandResultsReceiver(Handler handler) {
            super(handler);
        }

        @Override
        protected void onReceiveResult(int resultCode, Bundle resultData) {
            switch (resultCode) {
                case MSBandService.MSG_HR_TICK:
                    runOnUiThread(new UpdateHr(resultData.getInt(MSBandService.BUNDLE_HR_HR)));
                    break;
                case MSBandService.MSG_GSR_TICK:
                    runOnUiThread(new UpdateGSR(resultData.getInt(MSBandService.BUNDLE_GSR_RESISTANCE)));
                    break;
                case MSBandService.MSG_BAND_NOT_REGISTERED:
                    showRegisterBandSnackbar();
                    break;
                case MSBandService.MSG_ERROR:
                    Log.d("Error: ", resultData.getString(MSBandService.BUNDLE_ERROR_TEXT));
                    break;
            }
        }
    }
}
