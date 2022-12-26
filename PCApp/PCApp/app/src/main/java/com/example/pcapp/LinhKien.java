package com.example.pcapp;

import java.io.Serializable;

public class LinhKien implements Serializable {
    public String TenLK;
    public String denghi;
    public String HinhLK;
    public int Gia;
    public int Spinner;

    public int getSpinner() {
        return Spinner;
    }

    public void setSpinner(int spinner) {
        Spinner = spinner;
    }

    public LinhKien(int spinner) {
        Spinner = spinner;
    }

    public LinhKien(String tenLK, String hinhLK,  int gia) {
        TenLK = tenLK;
        HinhLK = hinhLK;
        Gia = gia;
   //     denghi = Denghi;
    }
    public String getTenLK() {
        return TenLK;
    }

    public void setTenLK(String tenLK) {
        TenLK = tenLK;
    }

    public String getHinhLK() {
        return HinhLK;
    }

    public void setHinhLK(String hinhLK) {
        HinhLK = hinhLK;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }
    @Override
    public String toString()  {
        return this.TenLK+" (Gia: "+ this.Gia+")";
    }
}
