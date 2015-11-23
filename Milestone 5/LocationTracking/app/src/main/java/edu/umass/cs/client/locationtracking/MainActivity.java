package edu.umass.cs.client.locationtracking;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Message;
import android.widget.Toast;

public class MainActivity extends Activity {

    MainActivity mActivity = null;
    private Messenger mService = null;
    private boolean mIsBound;
    private final Messenger mMessenger = new Messenger(new IncomingHandler());
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        handler = new Handler();
        bindToService();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            unbindFromService();
        } catch (Throwable t) {
            Log.e("MainActivity", "Failed to unbind from the service", t);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toggleLocation(View view) {
        if(ContextService.isLocationRunning()){
            try {
                Message msg = Message.obtain(null, ContextService.MSG_STOP_LOCATION);
                msg.replyTo = mMessenger;
                mService.send(msg);
            }
            catch (RemoteException e) {
                // Service crashed!
            }
        }
        else {
            try {
                Message msg = Message.obtain(null, ContextService.MSG_START_LOCATION);
                msg.replyTo = mMessenger;
                mService.send(msg);
            }
            catch (RemoteException e) {
                // Service crashed!
            }
        }
    }

    public void openMap(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }

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
                //TODO toast
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
            //TODO toast
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
            switch (msg.what) {
                case ContextService.MSG_LOCATION_STARTED:
                    Toast.makeText(mActivity, "MSG_LOCATION_STARTED", Toast.LENGTH_SHORT).show();
                    break;
                case ContextService.MSG_LOCATION_STOPPED:
                    Toast.makeText(mActivity, "MSG_LOCATION_STOPPED", Toast.LENGTH_SHORT).show();
                    break;
                case ContextService.MSG_LOCATION_UPDATE:
                    Toast.makeText(mActivity, "MSG_LOCATION_UPDATE", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

}
