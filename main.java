package com.example.digitalclockstopwatch;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer;
    Button btnStart, btnStop, btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        btnReset = findViewById(R.id.btnReset);

        btnStart.setOnClickListener(v -> {
            chronometer.start();
        });

        btnStop.setOnClickListener(v -> {
            chronometer.stop();
        });

        btnReset.setOnClickListener(v -> {
            chronometer.setBase(SystemClock.elapsedRealtime());
        });
    }
}
