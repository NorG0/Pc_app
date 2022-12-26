package com.example.pcapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GioHangAdapter extends BaseAdapter {
    Context context;
    ArrayList<GioHang> arraygiohang;

    public GioHangAdapter(Context context, ArrayList<GioHang> arraygiohang) {
        this.context = context;
        this.arraygiohang = arraygiohang;
    }

    @Override
    public int getCount() {
        return arraygiohang.size();
    }

    @Override
    public Object getItem(int position) {
        return arraygiohang.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public class ViewHolder{
        public TextView txttenhang, txtgia;
        public ImageView imgHinhSP;
        public Button btnadd,btnsub,btngt;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_dong_gio_hoang,null);
            viewHolder.txttenhang = (TextView) convertView.findViewById(R.id.textView_TenLK);
            viewHolder.txtgia =(TextView) convertView.findViewById(R.id.TextView_Gia);
            viewHolder.btnadd= (Button) convertView.findViewById(R.id.btn_add);
            viewHolder.btnsub=(Button) convertView.findViewById(R.id.btn_sub);
            viewHolder.btngt=(Button) convertView.findViewById((R.id.btn_gt));
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        GioHang gioHang = (GioHang) getItem(position);
        viewHolder.txttenhang.setText(gioHang.getTenLK());
        viewHolder.txtgia.setText((int) gioHang.getGiasp());
        viewHolder.btngt.setText(gioHang.getSoluongsp() +"");
        return convertView;
    }
}

