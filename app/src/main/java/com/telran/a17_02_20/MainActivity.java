package com.telran.a17_02_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    float scale = 1.0F;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.container,new MyFragment());
//        transaction.commit();
    }

    public int getRndColor() {
        return Color.rgb(rnd.nextInt(256),
                rnd.nextInt(256),
                rnd.nextInt(256));
    }

    public void add(View v) {
        if (count == 3) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new MyFragment(getRndColor(),scale), "MY_FRAG")
                    .addToBackStack(null)
                    .commit();
        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new MyFragment(getRndColor(),scale))
                    .addToBackStack(null)
                    .commit();
        }
        scale -= 0.1;
        count++;
    }

    public void replace(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new MyFragment(0,0))
                .commit();
    }

    public void remove(View v) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentByTag("MY_FRAG");
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }

    public void detach(View v) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentByTag("MY_FRAG");
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .detach(fragment)
                    .commit();
        }
    }

    public void attach(View v) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentByTag("MY_FRAG");
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .attach(fragment)
                    .commit();
        }

    }
}
