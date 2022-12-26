package com.example.pcapp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LKViewHolder extends   RecyclerView.ViewHolder {

    ImageView HinhLK;
    TextView TenLK;
    TextView Gia,Denghi;
    Spinner spinner;
    Button btn_Xem;

    // @itemView: recyclerview_item_layout.xml
    public LKViewHolder(@NonNull View itemView) {
        super(itemView);

        this.HinhLK = (ImageView) itemView.findViewById(R.id.imageView_LK);
        this.TenLK = (TextView) itemView.findViewById(R.id.textView_TenLK);
        this.Gia = (TextView) itemView.findViewById(R.id.TextView_Gia);
        this.btn_Xem = (Button) itemView.findViewById(R.id.btn_xem);
        spinner = (Spinner) itemView.findViewById(R.id.spinner);
    }
}
