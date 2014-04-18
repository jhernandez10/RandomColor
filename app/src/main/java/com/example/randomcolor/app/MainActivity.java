package com.example.randomcolor.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(changeColor,100);
    }

    public Runnable changeColor = new Runnable() {
        @Override
        public void run() {
            //get a random number
            int num = (int) (4 * Math.random());

            String color = "#000000";
            if (num == 1) {
                color = "#003DFF";
            } else if (num == 2) {
                color = "#E80CB9";
            } else if (num == 3) {
                color = "#0CE864";
            } else if (num == 4) {
                color = "#FF860D";
            }

            TextView one = (TextView) findViewById(R.id.test);
            one.setTextColor(Color.parseColor(color));
            handler.postDelayed(changeColor, 100);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
