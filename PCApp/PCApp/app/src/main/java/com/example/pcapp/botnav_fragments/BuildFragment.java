package com.example.pcapp.botnav_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.pcapp.IntelBuild;
import com.example.pcapp.IntelBuildActivity;
import com.example.pcapp.R;

public class BuildFragment extends Fragment {
    Button btnIntel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_build1, container, false);
        btnIntel = v.findViewById(R.id.btnintel);
        btnIntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IntelBuildActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}