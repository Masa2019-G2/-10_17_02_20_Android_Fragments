package com.telran.a17_02_20;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment extends Fragment {
    String name, phone;

    public ViewFragment(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public ViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        TextView nameTxt = view.findViewById(R.id.nameTxt);
        TextView phoneTxt = view.findViewById(R.id.phoneTxt);
        nameTxt.setText(name);
        phoneTxt.setText(phone);
        return view;
    }

}
