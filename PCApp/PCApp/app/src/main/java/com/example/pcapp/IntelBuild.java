package com.example.pcapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class IntelBuild extends Fragment {
    Button btnchoncpu,btnchonram,btnchonnguon,btnchonocung,btnchongpu,btncheckbuild;
    TextView cpudcchon,maindcchon,ramdcchon,vgadcchon,psudcchon,ocungdcchon,checkbuild;
    Button btnchonmain;
    int typecpu=1,typemain=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_intel_build, container, false);
        cpudcchon=v.findViewById(R.id.descipcpu);
        vgadcchon=v.findViewById(R.id.descipgpu);
        psudcchon=v.findViewById(R.id.descipower);
        ramdcchon=v.findViewById(R.id.descipRam);
        ocungdcchon=v.findViewById(R.id.descipocung);
        maindcchon=v.findViewById(R.id.descipmain);
        checkbuild=v.findViewById(R.id.check);
        //btn
        btnchongpu=v.findViewById(R.id.selectvga);
        btnchonram=v.findViewById(R.id.selectram);
        btnchonnguon=v.findViewById(R.id.selectpower);
        btnchonocung=v.findViewById(R.id.select_hardive);
        btnchoncpu= v.findViewById(R.id.Selectcpu);
        btnchonmain=v.findViewById(R.id.selectmain);
        btncheckbuild=v.findViewById(R.id.buttoncheck);
        PopupMenu popupMenucpu = new PopupMenu(getContext(), btnchoncpu);
        //add menu items
        popupMenucpu.getMenu().add(Menu.NONE,0,0,"Intel® Core™ i9-11900K Processor (16M Cache, up to 5.30 GHz )");
        popupMenucpu.getMenu().add(Menu.NONE,1,1,"Intel® Core™ i7-11700 Processor 8 Cores 4.90 GHz 2.50 GHz 16 MB 11th");
        popupMenucpu.getMenu().add(Menu.NONE,2,2,"Intel® Core™ i7-11700K 8 Cores 4.90 GHz 2.50 GHz 16 MB 11th");
        popupMenucpu.getMenu().add(Menu.NONE,3,3,"Intel® Core™ i5-11400 Processor (12M Cache, up to 4.40 GHz 11th)");
        popupMenucpu.getMenu().add(Menu.NONE,4,4,"Intel® Core™ i5-11600 6 Cores 4.40 GHz 2.60 GHz 12 MB 11th");
        popupMenucpu.getMenu().add(Menu.NONE,5,5,"Intel® Core™ i5-11500 4.4Ghz 6 Cores 12 MB 11th");
        popupMenucpu.getMenu().add(Menu.NONE,6,6,"Intel® Core™ i5-10400F 4.4Ghz 6 Cores 12 MB no iGPU 10th");
        popupMenucpu.getMenu().add(Menu.NONE,7,7,"Intel® Core™ i3-10100 4 Cores 3.8GHz 6MB Cache 10th");
        popupMenucpu.getMenu().add(Menu.NONE,8,8,"Intel® Core™ i3-9100F 4 Cores 3.8GHz 6MB Cache no iGPU 9th");
        //item clicks
        popupMenucpu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem itemcpu) {
                int id = itemcpu.getItemId();
                if(id==0){
                    cpudcchon.setText("Intel® Core 11th™ i9-11900K Processor (16M Cache, up to 5.30 GHz)");
                }
                else if(id==1){
                    cpudcchon.setText("Intel® Core 11th™ i7-11700 Processor 8 Cores 4.90 GHz 2.50 GHz 16 MB Intel® Smart Cache");
                }
                else if(id==2){
                    cpudcchon.setText("Intel® Core 11th™ i7-11700K 8 Cores 4.90 GHz 2.50 GHz 16 MB Intel® Smart Cache");
                }
                else if(id==3){
                    cpudcchon.setText("Intel® Core 11th™ i5-11400 Processor (12M Cache, up to 4.40 GHz)");
                }
                else if(id==4){
                    cpudcchon.setText("Intel® Core 11th™ i5-11600 6 Cores 4.40 GHz 2.60 GHz 12 MB Intel® Smart Cache");
                }
                else if(id==5){
                    cpudcchon.setText("Intel® Core 11th™ i5-11500 4.4Ghz 6 Cores 12 MB");
                }
                else if(id==6){
                    cpudcchon.setText("Intel® Core 10th™ i5-10400F 4.4Ghz 6 Cores 12 MB no iGPU");
                }
                else if(id==7){
                    cpudcchon.setText("Intel® Core 10th™ i3-10100 4 Cores 3.8GHz 6MB Cache");
                }
                else if(id==8){
                    cpudcchon.setText("Intel® Core 9th™ i3-9100F 4 Cores 3.8GHz 6MB Cache no iGPU");
                }
                return false;
            }
        });
        btnchoncpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenucpu.show();
            }
        });
        //pop menu main
        PopupMenu popupMenumain = new PopupMenu(getContext(),btnchonmain);
        popupMenumain.getMenu().add(Menu.NONE,0,0,"Gigabyte Z590 Aorus Ultra");
        popupMenumain.getMenu().add(Menu.NONE,1,1,"MSI MPG Z590 Gaming Force");
        popupMenumain.getMenu().add(Menu.NONE,2,2,"Gigabyte Z390 Aorus");
        popupMenumain.getMenu().add(Menu.NONE,3,3,"MSI MEG Z490 ACE");
        popupMenumain.getMenu().add(Menu.NONE,4,4,"MSI B460 TOMAHAWK MAX II");
        popupMenumain.getMenu().add(Menu.NONE,5,5,"Asus ROG Strix Z590-F Gaming Wifi");
        popupMenumain.getMenu().add(Menu.NONE,6,6,"Asrock B460M Pro 4");
        popupMenumain.getMenu().add(Menu.NONE,7,7,"Asus H310M-K R2.0 Prime");
        popupMenumain.getMenu().add(Menu.NONE,8,8,"MSI H410M Pro");
        popupMenumain.getMenu().add(Menu.NONE,9,9,"Gigabyte B560 Aorus Pro AX");
        popupMenumain.getMenu().add(Menu.NONE,10,10,"MSI MAG B560 TORPEDO");
        popupMenumain.getMenu().add(Menu.NONE,11,11,"Gigabyte B460M Aorus Elite");
        popupMenumain.getMenu().add(Menu.NONE,12,12,"Asus B460M-Pro TUF Gaming");

        popupMenumain.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem itemmain) {
                int id = itemmain.getItemId();
                if(id==0){
                    maindcchon.setText("Gigabyte Z590 Aorus Ultra");
                }
                else if(id==1){
                    maindcchon.setText("MSI MPG Z590 Gaming Force");
                }
                else if(id==2){
                    maindcchon.setText("Gigabyte Z390 Aorus");
                }
                else if(id==3){
                    maindcchon.setText("MSI MEG Z490 ACE");
                }
                else if(id==4){
                    maindcchon.setText("MSI B460 TOMAHAWK MAX II");
                }
                else if(id==5){
                    maindcchon.setText("Asus ROG Strix Z590-F Gaming Wifi");
                }
                else if(id==6){
                    maindcchon.setText("Asrock B460M Pro 4");
                }
                else if(id==7){
                    maindcchon.setText("Asus H310M-K R2.0 Prime");
                }
                else if(id==8){
                    maindcchon.setText("MSI H410M Pro");
                }
                else if(id==9){
                    maindcchon.setText("Gigabyte B560 Aorus Pro AX");
                }
                else if(id==10){
                    maindcchon.setText("MSI MAG B560 TORPEDO");
                }
                else if(id==11){
                    maindcchon.setText("Gigabyte B460M Aorus Elite");
                }
                else if(id==12){
                    maindcchon.setText("Asus B460M-Pro TUF Gaming");
                }
                return false;
            }
        });
        btnchonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenumain.show();
            }
        });

        PopupMenu popupMenuvga = new PopupMenu(getContext(),btnchongpu);
        popupMenuvga.getMenu().add(Menu.NONE,0,0,"Radeon RX580 8G GDDR5 Dual OC");
        popupMenuvga.getMenu().add(Menu.NONE,1,1,"GTX 1080 TI ");
        popupMenuvga.getMenu().add(Menu.NONE,2,2,"GTX 980 GAMING 4G GDDR5");
        popupMenuvga.getMenu().add(Menu.NONE,3,3,"Radeon RT5600X 8G GDDR5 ");
        popupMenuvga.getMenu().add(Menu.NONE,4,4,"GTX 1050Ti 4G GDDR5");
        popupMenuvga.getMenu().add(Menu.NONE,5,5,"GTX 1660 Super 6G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,6,6,"Radeon RX6900XT 16G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,7,7,"RTX 3080 10G GDDR6X Triple Fan");
        popupMenuvga.getMenu().add(Menu.NONE,8,8,"GTX750TI-OC-2GD5");
        popupMenuvga.getMenu().add(Menu.NONE,9,9,"GTX1060 NB 3G");
        popupMenuvga.getMenu().add(Menu.NONE,10,10,"RTX 2080 Super 8G GDDR6 Dual EVO OC");
        popupMenuvga.getMenu().add(Menu.NONE,11,11,"RTX 2060 6G GDDR6 Gaming");
        popupMenuvga.getMenu().add(Menu.NONE,12,12,"RTX 2070 Super 8G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,13,13,"GTX 960");
        popupMenuvga.getMenu().add(Menu.NONE,14,14,"GTX 950");
        popupMenuvga.getMenu().add(Menu.NONE,15,15,"GTX 1070Ti");
        popupMenuvga.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem itemvga) {
                int id = itemvga.getItemId();
                if (id == 0) {
                    vgadcchon.setText("Radeon RX580 8G GDDR5 ");
                } else if (id == 1) {
                    vgadcchon.setText("GTX 1080 Ti ");
                }
                else if (id == 2) {
                    vgadcchon.setText("GTX 980 GAMING 4G GDDR5 ");
                }
                else if (id == 3) {
                    vgadcchon.setText("Radeon RX580 8G GDDR5 ");
                }
                else if (id == 4) {
                    vgadcchon.setText("GTX 1050Ti 4G GDDR5");
                }
                else if (id == 5) {
                    vgadcchon.setText("GTX 1660 Super 6G GDDR6");
                }else if (id == 6) {
                    vgadcchon.setText("Radeon RX6900XT 16G GDDR6");
                }else if (id == 7) {
                    vgadcchon.setText("RTX 3080 10G GDDR6X Triple Fan ");
                }else if (id == 8) {
                    vgadcchon.setText("GTX750TI-OC-2GD5");
                }else if (id == 9) {
                    vgadcchon.setText("GTX1060 NB 3G");
                }
                else if (id == 10) {
                    vgadcchon.setText("RTX 2080 Super 8G");
                }
                else if (id == 11) {
                    vgadcchon.setText("RTX 2070 Super 8G GDDR6");
                }
                else if (id == 12) {
                    vgadcchon.setText("RTX 2060 6G GDDR6");
                }
                else if (id == 13) {
                    vgadcchon.setText("GTX 960");
                }
                else if (id == 14) {
                    vgadcchon.setText("GTX 950");
                }
                else if (id == 15) {
                    vgadcchon.setText("GTX 1070Ti");
                }
                return false;
            }
        });
        btnchongpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenuvga.show();
            }
        });
        PopupMenu popupMenuRam = new PopupMenu(getContext(),btnchonram);
        popupMenuRam.getMenu().add(Menu.NONE,0,0,"DDR4 4GB 2666MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,1,1,"DDR4 8GB 2666MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,2,2,"DDR4 16GB 2666MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,3,3,"DDR4 8GB 3000MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,4,4,"DDR4 16GB 3000MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,5,5,"DDR4 8GB 3200MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,6,6,"DDR4 16GB 3200MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,7,7,"DDR4 16GB 3600MHZ");
        popupMenuRam.getMenu().add(Menu.NONE,8,8,"DDR3 8GB 1600MHZ");
        popupMenuRam.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id=item.getItemId();
                if(id==0){
                    ramdcchon.setText("DDR4 4GB 2666MHZ");
                }
                else if(id==1){
                    ramdcchon.setText("DDR4 8GB 2666MHZ");
                }
                else if(id==2){
                    ramdcchon.setText("DDR4 16GB 2666MHZ");
                }
                else if(id==3){
                    ramdcchon.setText("DDR4 8GB 3000MHZ");
                }
                else if(id==4){
                    ramdcchon.setText("DDR4 16GB 3000MHZ");
                }
                else if(id==5){
                    ramdcchon.setText("DDR4 8GB 3200MHZ");
                }
                else if(id==6){
                    ramdcchon.setText("DDR4 16GB 3200MHZ");
                }
                else if(id==7){
                    ramdcchon.setText("DDR4 16GB 3600MHZ");
                }
                else if(id==8){
                    ramdcchon.setText("DDR3 8GB 1600MHZ");
                }
                return false;
            }
        });
        btnchonram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenuRam.show();
            }
        });
        PopupMenu popupMenunguon = new PopupMenu(getContext(),btnchonnguon);
        popupMenunguon.getMenu().add(Menu.NONE,0,0,"1000W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,1,1,"750W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,2,2,"650W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,3,0,"700W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,4,0,"600W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,5,0,"550W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,6,0,"500W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,7,0,"450W 80PLUS");
        popupMenunguon.getMenu().add(Menu.NONE,8,0,"400W 80PLUS");
        popupMenunguon.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id= item.getItemId();
                if(id==0){
                    psudcchon.setText("1000");
                }
                else if(id==1){
                    psudcchon.setText("750");
                }
                else if(id==2){
                    psudcchon.setText("650");
                }
                else if(id==3){
                    psudcchon.setText("700");
                }
                else if(id==4){
                    psudcchon.setText("600");
                }
                else if(id==5){
                    psudcchon.setText("550");
                }
                else if(id==6){
                    psudcchon.setText("500");
                }
                else if(id==7){
                    psudcchon.setText("450");
                }
                else if(id==8){
                    psudcchon.setText("400");
                }
                return false;
            }
        });
        btnchonnguon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenunguon.show();
            }
        });
        ///ocung///
        PopupMenu popupMenuocung = new PopupMenu(getContext(),btnchonocung);
        popupMenuocung.getMenu().add(Menu.NONE,0,0,"SSD 512 GB");
        popupMenuocung.getMenu().add(Menu.NONE,1,0,"SSD 256 GB");
        popupMenuocung.getMenu().add(Menu.NONE,2,0,"SSD 128 GB");
        popupMenuocung.getMenu().add(Menu.NONE,3,0,"HDD 1 TB");
        popupMenuocung.getMenu().add(Menu.NONE,4,0,"HDD 2 TB");
        popupMenuocung.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id=item.getItemId();
                if(id==0){
                    ocungdcchon.setText("SSD 512 GB");
                }
                else if(id==1){
                    ocungdcchon.setText("SSD 256 GB");
                }
                else if(id==2){
                    ocungdcchon.setText("SSD 128 GB");
                }
                else if(id==3){
                    ocungdcchon.setText("HDD 1TB");
                }
                else if(id==4){
                    ocungdcchon.setText("HDD 2TB");
                }
                return false;
            }
        });
        btnchonocung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenuocung.show();
            }
        });
        btncheckbuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int defauI = 0;
                int wattnumber=0;
                if (psudcchon.getText().toString().contains("0")){
                 wattnumber=Integer.parseInt(psudcchon.getText().toString())  ;
                }
                int typeram = 0;
                if(vgadcchon.getText().toString().contains("RTX")&&vgadcchon.getText().toString().contains("GTX 980")&&vgadcchon.getText().toString().contains("GTX 1080TI")
                        &&vgadcchon.getText().toString().contains("RX")){
                     defauI=650;
                }
                if(ramdcchon.getText().toString().contains("DRR4")){
                    typeram=11;
                }

                if(cpudcchon.getText().toString().contains("11th")&&cpudcchon.getText().toString().contains("10th")){
                    typecpu=11;
                    //checkbuild.setText("11");
                } else {typecpu=9;
                }
                if(maindcchon.getText().toString().contains("4")||maindcchon.getText().toString().contains("5")){
                    typemain=11;
                }else{ typemain=9;}

                if (wattnumber<defauI){
                    checkbuild.setText("Xem lại nguồn");}
                    else if( typecpu==typemain){
                        if(typeram==typemain){
                        checkbuild.setText("OK");}
                    } else
                    checkbuild.setText("Vui lòng xem Lại CPU và Main va RAM");
                    }
        });
        return v;

    }

}
