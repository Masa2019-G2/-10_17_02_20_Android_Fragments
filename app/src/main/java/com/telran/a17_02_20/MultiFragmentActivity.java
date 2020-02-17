package com.telran.a17_02_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MultiFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_fragment);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.root,new WelcomeFragment())
                .commit();
    }
}
