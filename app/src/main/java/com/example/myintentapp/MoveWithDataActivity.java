package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

       TextView TvDataReceived = findViewById(R.id.tv_data_received);
       String name = getIntent().getStringExtra(EXTRA_NAME);
       Integer age = getIntent().getIntExtra(EXTRA_AGE,0);

       String text = "Nama : " + name + " Umur : " + age ;
       TvDataReceived.setText(text);
    }
}