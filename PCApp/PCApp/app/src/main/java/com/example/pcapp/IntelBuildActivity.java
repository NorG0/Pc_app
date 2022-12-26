package com.example.pcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class IntelBuildActivity extends AppCompatActivity {
    Button btnchoncpu,btnchonram,btnchonnguon,btnchonocung,btnchongpu,btncheckbuild;
    TextView cpudcchon,maindcchon,ramdcchon,vgadcchon,psudcchon,ocungdcchon,checkbuild,Checknguon,CheckMvsCPU,CheckRAM;
    Button btnchonmain,btnmua;
    int typecpu=1,typemain=0,psuforGPU=0,typeram=0;;
    int right=0,c1,c2,c3;
    int red=0xFFE40A0A,green=0xFF2BD60C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intel_build);
        cpudcchon=findViewById(R.id.descipcpu);
        vgadcchon=findViewById(R.id.descipgpu);
        psudcchon=findViewById(R.id.descipower);
        ramdcchon=findViewById(R.id.descipRam);
        ocungdcchon=findViewById(R.id.descipocung);
        maindcchon=findViewById(R.id.descipmain);
        checkbuild=findViewById(R.id.check);
        CheckMvsCPU=findViewById(R.id.checkcpuvamain);
        Checknguon=findViewById(R.id.checknguon);
        CheckRAM=findViewById(R.id.checkram);
        //btn
        btnmua=findViewById(R.id.buttonmua);
        btnchongpu=findViewById(R.id.selectvga);
        btnchonram=findViewById(R.id.selectram);
        btnchonnguon=findViewById(R.id.selectpower);
        btnchonocung=findViewById(R.id.select_hardive);
        btnchoncpu= findViewById(R.id.Selectcpu);
        btnchonmain=findViewById(R.id.selectmain);
        btncheckbuild=findViewById(R.id.buttoncheck);
        PopupMenu popupMenucpu = new PopupMenu(this, btnchoncpu);
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
                    cpudcchon.setText("Intel® Core 11th i9-11900K");typecpu=11;
                }
                else if(id==1){
                    cpudcchon.setText("Intel® Core 11th i7-11700");typecpu=11;
                }
                else if(id==2){
                    cpudcchon.setText("Intel® Core 11th i7-11700K");typecpu=11;
                }
                else if(id==3){
                    cpudcchon.setText("Intel® Core 11th i5-11400");typecpu=11;
                }
                else if(id==4){
                    cpudcchon.setText("Intel® Core 11th i5-11600");typecpu=11;
                }
                else if(id==5){
                    cpudcchon.setText("Intel® Core 11th i5-11500");typecpu=11;
                }
                else if(id==6){
                    cpudcchon.setText("Intel® Core 10th i5-10400F no iGPU");typecpu=11;
                }
                else if(id==7){
                    cpudcchon.setText("Intel® Core 10th i3-10100");typecpu=11;
                }
                else if(id==8){
                    cpudcchon.setText("Intel® Core 9th i3-9100F");typecpu=9;
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
        PopupMenu popupMenumain = new PopupMenu(this,btnchonmain);
        popupMenumain.getMenu().add(Menu.NONE,0,0,"Z590");
        popupMenumain.getMenu().add(Menu.NONE,1,2,"Z490");
        popupMenumain.getMenu().add(Menu.NONE,2,3,"Z390");
        popupMenumain.getMenu().add(Menu.NONE,3,4,"B560");
        popupMenumain.getMenu().add(Menu.NONE,4,5,"B460");
        popupMenumain.getMenu().add(Menu.NONE,5,6,"H510");
        popupMenumain.getMenu().add(Menu.NONE,6,7,"H410");
        popupMenumain.getMenu().add(Menu.NONE,7,8,"H310");


        popupMenumain.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem itemmain) {
                int id = itemmain.getItemId();
                if(id==0){
                    maindcchon.setText("Z590");
                    typemain=11;
                }
                else if(id==1){
                    maindcchon.setText("Z490");typemain=11;
                }
                else if(id==2){
                    maindcchon.setText("Z390");typemain=9;
                }
                else if(id==3){
                    maindcchon.setText("B560");typemain=11;
                }
                else if(id==4){
                    maindcchon.setText("B460");typemain=11;
                }
                else if(id==5){
                    maindcchon.setText("H510");typemain=11;
                }
                else if(id==6){
                    maindcchon.setText("H410");typemain=11;
                }
                else if(id==7){
                    maindcchon.setText("H310");typemain=9;
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

        PopupMenu popupMenuvga = new PopupMenu(this,btnchongpu);
        popupMenuvga.getMenu().add(Menu.NONE,0,0,"Radeon RX580 8G GDDR5");
        popupMenuvga.getMenu().add(Menu.NONE,1,1,"GTX 1080 TI ");
        popupMenuvga.getMenu().add(Menu.NONE,2,2,"GTX 980 4G GDDR5");
        popupMenuvga.getMenu().add(Menu.NONE,3,3,"Radeon RT5600X 8G GDDR5 ");
        popupMenuvga.getMenu().add(Menu.NONE,4,4,"GTX 1050Ti 4G GDDR5");
        popupMenuvga.getMenu().add(Menu.NONE,5,5,"GTX 1660 Super 6G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,6,6,"Radeon RX6900XT 16G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,7,7,"RTX 3080 10G GDDR6X");
        popupMenuvga.getMenu().add(Menu.NONE,8,8,"GTX750TI-OC-2GD5");
        popupMenuvga.getMenu().add(Menu.NONE,9,9,"GTX1060 NB 3G");
        popupMenuvga.getMenu().add(Menu.NONE,10,10,"RTX 2080 Super 8G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,11,11,"RTX 2060 6G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,12,12,"RTX 2070 Super 8G GDDR6");
        popupMenuvga.getMenu().add(Menu.NONE,13,13,"GTX 960");
        popupMenuvga.getMenu().add(Menu.NONE,14,14,"GTX 950");
        popupMenuvga.getMenu().add(Menu.NONE,15,15,"GTX 1070Ti");
        popupMenuvga.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem itemvga) {
                int id = itemvga.getItemId();
                psuforGPU= 0;
                if (id == 0) {
                    psuforGPU= 0;
                    vgadcchon.setText("Radeon RX580 8G GDDR5 ");
                    psuforGPU=500;
                } else if (id == 1) {
                    psuforGPU= 0;
                    vgadcchon.setText("GTX 1080 Ti ");
                    psuforGPU=600;
                }
                else if (id == 2) {
                    psuforGPU= 0;
                    vgadcchon.setText("GTX 980 4G GDDR5 ");
                    psuforGPU=450;
                }
                else if (id == 3) {
                    psuforGPU= 0;
                    vgadcchon.setText("Radeon RX570 8G GDDR5 ");
                    psuforGPU=600;
                }
                else if (id == 4) {
                    psuforGPU= 0;
                    vgadcchon.setText("GTX 1050Ti 4G GDDR5");
                    psuforGPU=300;
                }
                else if (id == 5) {
                    psuforGPU= 0;
                    vgadcchon.setText("GTX 1660 Super 6G");
                    psuforGPU=450;

                }else if (id == 6) {
                    psuforGPU= 0;
                    vgadcchon.setText("Radeon RX6900XT 16G");
                    psuforGPU=850;
                }else if (id == 7) {
                    psuforGPU= 0;
                    vgadcchon.setText("RTX 3080 10G");
                    psuforGPU=700;
                }else if (id == 8) {
                    psuforGPU= 0;
                    vgadcchon.setText("GTX750TI");
                    psuforGPU=300;
                }else if (id == 9) {
                    psuforGPU= 0;
                    vgadcchon.setText("GTX1060 3G");
                    psuforGPU=400;
                }
                else if (id == 10) {
                    psuforGPU= 0;
                    vgadcchon.setText("RTX 2080 Super 8G");
                    psuforGPU=650;
                }
                else if (id == 11) {
                    vgadcchon.setText("RTX 2070 Super 8G GDDR6");
                    psuforGPU=650;
                }
                else if (id == 12) {
                    vgadcchon.setText("RTX 2060 6G GDDR6");
                    psuforGPU=500;
                }
                else if (id == 13) {
                    vgadcchon.setText("GTX 960");
                    psuforGPU=300;
                }
                else if (id == 14) {
                    vgadcchon.setText("GTX 950");
                    psuforGPU=300;
                }
                else if (id == 15) {
                    vgadcchon.setText("GTX 1070Ti");
                    psuforGPU=500;
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
        PopupMenu popupMenuRam = new PopupMenu(this,btnchonram);
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
                    ramdcchon.setText("DDR4 4GB 2666MHZ"); typeram=11;
                }
                else if(id==1){
                    ramdcchon.setText("DDR4 8GB 2666MHZ");typeram=11;
                }
                else if(id==2){
                    ramdcchon.setText("DDR4 16GB 2666MHZ");typeram=11;
                }
                else if(id==3){
                    ramdcchon.setText("DDR4 8GB 3000MHZ");typeram=11;
                }
                else if(id==4){
                    ramdcchon.setText("DDR4 16GB 3000MHZ");typeram=11;
                }
                else if(id==5){
                    ramdcchon.setText("DDR4 8GB 3200MHZ");typeram=11;
                }
                else if(id==6){
                    ramdcchon.setText("DDR4 16GB 3200MHZ");typeram=11;
                }
                else if(id==7){
                    ramdcchon.setText("DDR4 16GB 3600MHZ");typeram=11;
                }
                else if(id==8){
                    ramdcchon.setText("DDR3 8GB 1600MHZ");typeram=9;
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
        PopupMenu popupMenunguon = new PopupMenu(this,btnchonnguon);
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
        PopupMenu popupMenuocung = new PopupMenu(this,btnchonocung);
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
                //nguon
                int wattnumber=0;
                wattnumber=Integer.parseInt(psudcchon.getText().toString())  ;
//                if(ramdcchon.getText().toString().contains("DRR4")){
//                    typeram=11;
//                } else if (ramdcchon.getText().toString().contains("DDR3")) {
//                    typeram=3;
//                }
//
//                if(cpudcchon.getText().toString().contains("11th")&&cpudcchon.getText().toString().contains("10th")){
//                    typecpu=11;
//                    //checkbuild.setText("11");
//                } else {
//                    typecpu=9;
//                }
//                if(maindcchon.getText().toString().contains("Z490")||maindcchon.getText().toString().contains("Z590")){
//                    typemain=11;
//                }else
//                    {
//                        typemain=9;
//                    }
                ////BATDAUCHECK////
                if (wattnumber>psuforGPU){
                    c1=1;
                    Checknguon.setTextColor(green);
                    Checknguon.setText("Nguồn OK");}
                else {
                    Checknguon.setTextColor(red);
                    Checknguon.setText("Vui lòng xem lại Nguồn"); c1=0;}

                if(typecpu==typemain){c2=1;
                    CheckMvsCPU.setTextColor(green);
                    CheckMvsCPU.setText("Main va CPU OK");
                } else{ CheckMvsCPU.setTextColor(red);
                        CheckMvsCPU.setText("Xem lai Main va Cpu");c2=0; }
                if(typeram==typemain){
                    c3=1;
                    CheckRAM.setTextColor(green);
                    CheckRAM.setText("RAM OK");
                } else{CheckRAM.setTextColor(red); CheckRAM.setText("Xem lai RAM");
                    c3=0;
                }

            }
        });

        btnmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1==c2&&c1==c3){
                    String tencpu = cpudcchon.getText().toString();
                Intent intent = new Intent(IntelBuildActivity.this,SHOPACTIVITY.class);

                    intent.putExtra("keycpu",tencpu);
                startActivity(intent);

                }
            }
        });
    }

}