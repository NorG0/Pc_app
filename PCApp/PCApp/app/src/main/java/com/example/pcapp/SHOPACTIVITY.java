package com.example.pcapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SHOPACTIVITY extends AppCompatActivity {
    public static final String LOG_TAG = "AndroidExample";
    private RecyclerView recyclerView;
    TextView txtdenghi;
    private Spinner spinner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopactivity);
        List<LinhKien> linhkien = getListData();
        this.recyclerView = (RecyclerView) this.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(this, linhkien));

        // RecyclerView scroll vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
    private  List<LinhKien> getListData() {

        List<LinhKien> list = new ArrayList<LinhKien>();
        LinhKien MH = new LinhKien("Screen", "manhinh", 1000000);
        LinhKien Card = new LinhKien("Card", "card", 1500000);
        LinhKien HP = new LinhKien("Headphone", "headphone", 2000000);
        LinhKien CPU = new LinhKien("CPU", "cpu", 7000000);
        return list;
    }
}