package com.crezo.dc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView txt_forgot_onclick, createAccount;
    Common common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        common = new Common();

        txt_forgot_onclick = findViewById(R.id.txt_forgot_onclick);
        createAccount = findViewById(R.id.createAccount);

        createAccount.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            finish();
        });

        txt_forgot_onclick.setOnClickListener(v -> common.toast(LoginActivity.this, String.valueOf(R.string.coming_soon)));



    }
}