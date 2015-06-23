package com.blakestiller.lifecycle;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Log.d(getClass().getSimpleName(), "onCreate()");
        Toast.makeText(this, R.string.onCreateToast, Toast.LENGTH_SHORT).show();
    }
    public void onRestart() {
        super.onRestart();
        //Log.d(getClass().getSimpleName(), "onRestart()");
        Toast.makeText(this, R.string.onRestartToast, Toast.LENGTH_SHORT)
                .show();
    }
    @Override
    public void onStart() {
        super.onStart();
        //Log.d(getClass().getSimpleName(), "onStart()");
        Toast.makeText(this, R.string.onStartToast, Toast.LENGTH_SHORT)
                .show();
    }
    @Override
    public void onResume() {
        super.onResume();
       // Log.d(getClass().getSimpleName(), "onResume()");
        Toast.makeText(this, R.string.onResumeToast, Toast.LENGTH_SHORT)
                .show();
    }
    @Override
    public void onPause() {
       // Log.d(getClass().getSimpleName(), "onPause()");
        Toast.makeText(this, R.string.onPauseToast, Toast.LENGTH_SHORT)
                .show();
        super.onPause();
    }
    @Override
    public void onStop() {
        //Log.d(getClass().getSimpleName(), "onStop()");
        Toast.makeText(this, R.string.onStopToast, Toast.LENGTH_SHORT)
                .show();
        super.onStop();
    }
    @Override
    public void onDestroy() {
        //Log.d(getClass().getSimpleName(), "onDestroy()");
        Toast.makeText(this, R.string.onDestroyToast, Toast.LENGTH_SHORT)
                .show();
               super.onDestroy();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
}
