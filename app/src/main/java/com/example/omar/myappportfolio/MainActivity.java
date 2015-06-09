package com.example.omar.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void send_toast1(View view) {
        toasting("This button will launch Spotify Streamer app");
    }
    public void send_toast2(View view) {
        toasting("This button will launch Scores app");
    }
    public void send_toast3(View view) {
        toasting("This button will launch Library app");
    }
    public void send_toast4(View view) {
        toasting("This button will launch Build It Bigger app");
    }
    public void send_toast5(View view) {
        toasting("This button will launch XYZ Reader app");
    }
    public void send_toast6(View view) {
        toasting("This button will launch My Capstone app");
    }
    public void toasting(String str) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, str, duration);
        toast.show();
    }

}
