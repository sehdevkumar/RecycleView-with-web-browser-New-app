package com.example.againrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class launch extends AppCompatActivity {
    protected boolean _active = true;
    protected int _splashTime = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
                Intent i3 = new Intent(launch.this, MainActivity.class);
                startActivity(i3);
            }
        }, _splashTime);
    }
}
