package com.telran.a17_02_20;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class MyFragment extends Fragment {
//    public static float SCALE = 1.0F;
    private int color;
    private float scale;

    public MyFragment(int color, float scale) {
        this.color = color;
        this.scale = scale;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my,container,false);
//        Random rnd = new Random();
//        int r = rnd.nextInt(256);
//        int g = rnd.nextInt(256);
//        int b = rnd.nextInt(256);
//        int color = Color.rgb(r,g,b);
//        view.setBackgroundColor(color);
//        view.setScaleX(SCALE);
//        view.setScaleY(SCALE);
//        SCALE -= 0.1;
        view.setBackgroundColor(color);
        view.setScaleY(scale);
        view.setScaleX(scale);
        return view;
    }
}
