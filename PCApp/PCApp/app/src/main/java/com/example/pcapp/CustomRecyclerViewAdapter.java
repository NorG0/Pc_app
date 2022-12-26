package com.example.pcapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<LKViewHolder>{
    private List<LinhKien> linhkien;
    private Context context;
    private LayoutInflater mLayoutInflater;

    public CustomRecyclerViewAdapter(Context context, List<LinhKien> datas ) {
        this.context = context;
        this.linhkien = datas;
        this.mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public LKViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        // Inflate view from recyclerview_item_layout.xml
        View recyclerViewItem = mLayoutInflater.inflate(R.layout.recyclerview_lk_layout, parent, false);

        recyclerViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRecyclerItemClick( (RecyclerView)parent, v);
            }
        });
        return new LKViewHolder(recyclerViewItem);
    }


    @Override
    public void onBindViewHolder(LKViewHolder holder, int position) {
        // Cet country in countries via position
        LinhKien linhkiens = this.linhkien.get(position);

        int imageResId = this.getDrawableResIdByName(linhkiens.getHinhLK());
        // Bind data to viewholder
        holder.HinhLK.setImageResource(imageResId);
        holder.TenLK.setText(linhkiens.getTenLK() );
        holder.Gia.setText("Giá: "+ linhkiens.getGia() +" Đ");
        holder.btn_Xem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//           v.getContext().startActivity(new Intent(context, Chitiet.class));
                Intent i = new Intent(v.getContext(), Chitiet.class);
                i.putExtra("thongtinlk",linhkien.get(position));
                v.getContext().startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return this.linhkien.size();
    }

    // Find Image ID corresponding to the name of the image (in the directory drawable).
    public int getDrawableResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "drawable", pkgName);
        Log.i(SHOPACTIVITY.LOG_TAG, "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    // Click on RecyclerView Item.
    private void handleRecyclerItemClick(RecyclerView recyclerView, View itemView) {
        int itemPosition = recyclerView.getChildLayoutPosition(itemView);
        LinhKien linhKiens  = this.linhkien.get(itemPosition);

        Toast.makeText(this.context, linhKiens.getTenLK(), Toast.LENGTH_LONG).show();
    }
}

