package com.example.pras_if3_10119108;
//nim : 10119108
//nama : Prasetyo Hade M. Winoto
//kelas : if-3
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnNote             = findViewById(R.id.btnNote);
        Button btnAbout             = findViewById(R.id.btnAbout);
        Button btnInfo             = findViewById(R.id.btnInfo);
        btnNote.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNote:
                Intent pindahIntent1 = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(pindahIntent1);
                break;
            case R.id.btnAbout:
                Intent pindahIntent2 = new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(pindahIntent2);
                break;
        }
    }
}