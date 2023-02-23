package com.example.mysimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating an instance of Pet
        Pet Jasi = new Pet(1, 1.5f);
        Jasi.name = "Jasi";
    }
}