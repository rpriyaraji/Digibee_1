package com.developer.raja.digibee.Models;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.developer.raja.digibee.R;

public class splashscreen extends AppCompatActivity{
private int SLEEP_TIMER = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);
        X Y = new X() {
            @Override
            public void run() {
                super.run();
            }
        };
        Y.start();
    }


    private class X extends Thread
    {
        public void run() {
            try {
                sleep(1000*SLEEP_TIMER);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent intent;
            intent = new Intent(splashscreen.this, MainActivity.class);
            startActivity(intent);
            splashscreen.this.finish();
        }
    }
}
