package com.example.android.gingergarlic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    /**Duration of Wait**/
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /**
         * Declare new Handler to start the Main Activity
         * and close this Splash-screen after some seconds
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Create an Intent the will start the Main-Activity.
                Intent spashIntent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(spashIntent);
                SplashActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);

    }
}
