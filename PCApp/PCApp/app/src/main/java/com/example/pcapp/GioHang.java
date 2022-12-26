package com.example.pcapp;

public class GioHang {
    public  String TenLK;
    public long giasp;
    public String hinhsp;
    public int soluongsp;

    public GioHang(String tenLK, long giasp, String hinhsp, int soluongsp) {
        this.TenLK = tenLK;
        this.giasp = giasp;
        this.hinhsp = hinhsp;
        this.soluongsp = soluongsp;
    }

    public String getTenLK() {
        return TenLK;
    }

    public void setTenLK(String tenLK) {
        TenLK = tenLK;
    }

    public long getGiasp() {
        return giasp;
    }

    public void setGiasp(long giasp) {
        this.giasp = giasp;
    }

    public String getHinhsp() {
        return hinhsp;
    }

    public void setHinhsp(String hinhsp) {
        this.hinhsp = hinhsp;
    }

    public int getSoluongsp() {
        return soluongsp;
    }

    public void setSoluongsp(int soluongsp) {
        this.soluongsp = soluongsp;
    }
}
