package com.example.pcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button login;
    private EditText user;
    private EditText pass;
    private TextView changepass;
    private TextView signup;
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Anhxa();

        database = new Database(this, "member.sqlite", null, 1);

        database.QueryData("CREATE TABLE IF NOT EXISTS ThanhVien(Id INTEGER PRIMARY KEY AUTOINCREMENT, User VARCHAR(200), Password VARCHAR(200))");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user2 = user.getText().toString().trim();
                String pass2 = pass.getText().toString().trim();
                Cursor dataCongViec = database.GetData("SELECT * FROM ThanhVien");
                while (dataCongViec.moveToNext()) {
                    String user1 = dataCongViec.getString(1);
                    String pass1 = dataCongViec.getString(2);
                    if (user2.equals(user1) && pass2.equals(pass1)) {
//                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                        startActivity(intent);
//                       // setContentView(R.layout.activity_main);
                        finish();
                    }
                    else Toast.makeText(LoginActivity.this, "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }

            }
        });
        changepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ActivityChangepass.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogSignup();
            }
        });
    }
    protected void Anhxa(){
        login = findViewById(R.id.btnlogin);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        changepass = findViewById(R.id.cpass);
        signup = findViewById(R.id.signup);
    }
    private void DialogSignup(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_signup);

        EditText user = dialog.findViewById(R.id.nuser);
        EditText npass = dialog.findViewById(R.id.npass);
        EditText rpass = dialog.findViewById(R.id.rpass);
        Button dki = dialog.findViewById(R.id.button1);
        Button huy= dialog.findViewById(R.id.button2);

        huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taikhoan = user.getText().toString().trim();
                String matkhau=npass.getText().toString().trim();
                String nhaplaimatkhau = rpass.getText().toString().trim();
                if (matkhau.equals(nhaplaimatkhau)){
                    database.QueryData("INSERT INTO ThanhVien VALUES(null, '"+ taikhoan +"', '"+ matkhau +"')");
                }else{
                    Toast.makeText(LoginActivity.this, "Sai mat khau", Toast.LENGTH_SHORT).show();
                }
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}