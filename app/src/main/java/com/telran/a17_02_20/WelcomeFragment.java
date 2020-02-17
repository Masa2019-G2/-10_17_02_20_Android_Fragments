package com.telran.a17_02_20;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment implements View.OnClickListener {
    EditText inputName, inputPhone;
    Button nextBtn;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        inputName = view.findViewById(R.id.inputName);
        inputPhone = view.findViewById(R.id.inputPhone);
        nextBtn = view.findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.nextBtn){
            String name = inputName.getText().toString();
            String phone = inputPhone.getText().toString();
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.root,new ViewFragment(name,phone))
                    .addToBackStack(null)
                    .commit();
        }
    }
}
