package com.example.pcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Chitiet extends AppCompatActivity {

    ImageView  imageLK;
    TextView txtTen, txtGia, txtdenghi;
    Spinner spinner;
    Button btnmua;
    int id =0;
    String TenLK ="";
    int Gia = 0;
    String HinhLK ="";
    public static ArrayList<GioHang> manggiohang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        Anhxa();
        Laythongtin();
        CatchSpinner();
        EventButtonHam();
    }

    private void EventButtonHam() {
        Button button = (Button)findViewById(R.id.btn_mua);
        btnmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Chitiet.manggiohang.size()>0){

                }else {
                    int soluong = Integer.parseInt(spinner.getSelectedItem().toString());
                    long giamoi = soluong * Gia;
                    Chitiet.manggiohang.add(new GioHang(TenLK,giamoi,HinhLK,soluong));

                }
                Intent i = new Intent(v.getContext(), GioHoang.class);
                v.getContext().startActivity(i);
            }
        });
    }

    private void CatchSpinner() {
        Integer[]soluong=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        ArrayAdapter<Integer>arrayAdapter= new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item,soluong);
        spinner.setAdapter(arrayAdapter);
    }

    private void Laythongtin() {

        LinhKien linhKien = (LinhKien) getIntent().getSerializableExtra("thongtinlk");
        TenLK = linhKien.getTenLK();
        Gia = linhKien.getGia();
        txtTen.setText(TenLK);
        txtGia.setText("Giá: " + Gia +" Đ");
        HinhLK = linhKien.getHinhLK();


    }

    private void Anhxa() {
        imageLK = findViewById(R.id.imageView_LK);
        txtTen = findViewById(R.id.textView_TenLK);
        txtGia = findViewById(R.id.TextView_Gia);
        spinner = findViewById(R.id.spinner);
        btnmua = findViewById(R.id.btn_mua);

        if(manggiohang !=null){

        }else {
            manggiohang = new ArrayList<>();
        }
    }
}