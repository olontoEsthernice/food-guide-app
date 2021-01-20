package com.example.foodguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FouthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        getSupportActionBar().hide();
    }
}