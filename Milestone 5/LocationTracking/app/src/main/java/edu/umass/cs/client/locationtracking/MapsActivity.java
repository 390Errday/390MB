package edu.umass.cs.client.locationtracking;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.umass.cs.client.cluster.Cluster;
import edu.umass.cs.client.cluster.DBScan;
import edu.umass.cs.client.sql.GPSLocation;
import edu.umass.cs.client.sql.LocationDAO;

public class MapsActivity extends FragmentActivity {

    MapsActivity mActivity = null;
    private Messenger mService = null;
    private boolean mIsBound;
    private final Messenger mMessenger = new Messenger(new IncomingHandler());
    Handler handler;
    private MediaPlayer mPlayer;
    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        mActivity = this;
        handler = new Handler();
        mPlayer = MediaPlayer.create(this, R.raw.quack);
        bindToService();
        setUpMapIfNeeded();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_clear:
                clearDatabase();
                return true;
        }
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            unbindFromService();
        } catch (Throwable t) {
        }
    }

    //------ Handle Google Maps API v2 ------//

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap(View view)} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap(null);
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    public void setUpMap(View view) {
        mMap.clear();

        LocationDAO dao = new LocationDAO(getApplicationContext());
        dao.openRead();
        GPSLocation[] locations = dao.getAllLocations();
        dao.close();

        DBScan dbScan = new DBScan(50, 15);
        List<Cluster<GPSLocation>> clusters = dbScan.cluster(Arrays.asList(locations));

        int counter = 0;
        for (Cluster cluster : clusters) {
            List<GPSLocation> points = cluster.getPoints();
            for (Object point : cluster.getPoints()) {
                GPSLocation location = (GPSLocation) point;
                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(location.getLatitude(), location.getLongitude()))
                        .title("At " + LocationDAO.getISOTimeString(location.timestamp)));
            }
            Log.i("cluster", "cluster number: " + counter + " size: " + cluster.getPoints().size());
            counter++;
            drawHullFromPoints(points.toArray(new GPSLocation[points.size()]));
        }

        playQuack();
    }

    private void drawHullFromPoints(GPSLocation[] locations){
        try {
            ArrayList<GPSLocation> hull = FastConvexHull.execute(locations);
            PolygonOptions options = new PolygonOptions();
            for (GPSLocation loc : hull) {
                options.add(new LatLng(loc.latitude, loc.longitude));
            }
            options = options.strokeColor(Color.RED).fillColor(Color.BLUE);
            mMap.addPolygon(options); // draw a polygon
            Log.i("drawHull", "options visible?: " + options.isVisible());
        } catch (IndexOutOfBoundsException e) {
            Log.i("FUCK", e.toString());
        }
    }

    private void moveMap(LatLng location) {
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(location)      // Sets the center of the map
                .zoom(17)              // Sets the zoom
                .build();              // Creates a CameraPosition from the builder
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }

    //------ Handle onclick events for buttons ------//

    public void toggleLocation(View view) {
        if(ContextService.isLocationRunning()){
            try {
                Message msg = Message.obtain(null, ContextService.MSG_STOP_LOCATION);
                msg.replyTo = mMessenger;
                mService.send(msg);
                ImageButton btn = (ImageButton) findViewById(R.id.imageButton);
                btn.setImageResource(R.drawable.ic_pin_drop_blue_grey_500_48dp);
            } catch (RemoteException e) {
                // Service crashed!
            }
        }
        else {
            try {
                Message msg = Message.obtain(null, ContextService.MSG_START_LOCATION);
                msg.replyTo = mMessenger;
                mService.send(msg);
                view.setBackgroundResource(R.drawable.ic_pin_drop_blue_600_48dp);
                ImageButton btn = (ImageButton) findViewById(R.id.imageButton);
                btn.setImageResource(R.drawable.ic_pin_drop_blue_600_48dp);
            } catch (RemoteException e) {
                // Service crashed!
            }
        }
    }

    private void clearDatabase() {
        LocationDAO dao = new LocationDAO(getApplicationContext());
        dao.openWrite();
        dao.deleteAll();
        dao.close();
    }

    public void playQuack() {
        mPlayer.start();
    }

    //------ Handle connecting/talking to the service ------//

    public void bindToService() {
        // Start Background Service if not already started
        if(!ContextService.isRunning()) {
            Intent cs = new Intent(this, ContextService.class);
            startService(cs);
        }

        handler.postDelayed(new BindRunnable(), 1000);
    }

    private class BindRunnable implements Runnable {
        public void run() {
            // Try to bind to service
            if (ContextService.isRunning()) {
                bindService(new Intent(mActivity, ContextService.class), mConnection, Context.BIND_AUTO_CREATE);
            }
            else {
                handler.postDelayed(new BindRunnable(), 1000);
            }
        }
    }

    void unbindFromService() {
        if (mIsBound) {
            // If we have received the service, and hence registered with it, then now is the time to unregister.
            if (mService != null) {
                try {
                    Message msg = Message.obtain(null, ContextService.MSG_UNREGISTER_CLIENT);
                    msg.replyTo = mMessenger;
                    mService.send(msg);
                } catch (RemoteException e) {
                    // There is nothing special we need to do if the service has crashed.
                }
            }
            // Detach our existing connection.
            unbindService(mConnection);
        }
    }

    /**
     * Connection with the service
     */
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            mService = new Messenger(service);
            mIsBound = true;
            try {
                Message msg = Message.obtain(null, ContextService.MSG_REGISTER_CLIENT);
                msg.replyTo = mMessenger;
                mService.send(msg);
            } catch (RemoteException e) {
                // In this case the service has crashed before we could even do anything with it
            }

            // Once binded, we want to zoom into current location.
            try{
                Message msg = Message.obtain(null, ContextService.MSG_GET_LOCATION);
                msg.replyTo = mMessenger;
                mService.send(msg);
            } catch (RemoteException e) {
                // Service crashed!
            }
        }

        public void onServiceDisconnected(ComponentName className) {
            // This is called when the connection with the service has been unexpectedly disconnected - process crashed.
            mIsBound = false;
            mService = null;
        }
    };

    /**
     * Handler to handle incoming messages
     */
    @SuppressLint("HandlerLeak")
    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            Toast toast;
            switch (msg.what) {
                case ContextService.MSG_LOCATION_STARTED:
                    toast = Toast.makeText(mActivity, "Location tracking started!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 20);
                    toast.show();
                    break;
                case ContextService.MSG_LOCATION_STOPPED:
                    toast = Toast.makeText(mActivity, "Location tracking stopped!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 20);
                    toast.show();
                    break;
                case ContextService.MSG_LOCATION_UPDATE:
                    toast = Toast.makeText(mActivity, "New location added.", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 20);
                    toast.show();
                    break;
                case ContextService.MSG_LOCATION_CURRENT:
                    double lat = msg.getData().getDouble("lat");
                    double lng = msg.getData().getDouble("lng");
                    moveMap(new LatLng(lat, lng));
                    break;
            }
        }
    }
}
