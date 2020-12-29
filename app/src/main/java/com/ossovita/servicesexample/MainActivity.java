package com.ossovita.servicesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View v){
        startService(new Intent(MainActivity.this,ServiceClass.class));
    }
    public void stopService(View v){
        stopService(new Intent(MainActivity.this,ServiceClass.class));
    }
}