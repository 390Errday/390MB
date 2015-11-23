package edu.umass.cs.client.locationtracking;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
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

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
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
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
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
                mMap.addMarker(new MarkerOptions().position(new LatLng(location.getLatitude(), location.getLongitude())).title("Marker"));
            }
            Log.i("cluster", "cluster number: " + counter + " size: " + cluster.getPoints().size());
            counter++;
            drawHullFromPoints(points.toArray(new GPSLocation[points.size()]));
        }
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
}
