package com.NiceWeather.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.NiceWeather.android.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_area);
    }
}