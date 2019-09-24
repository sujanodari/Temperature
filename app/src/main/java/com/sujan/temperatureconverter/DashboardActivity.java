package com.sujan.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSum, btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        btnSum = findViewById(R.id.btnSum);
        btnCal = findViewById(R.id.btnCal);

        btnCal.setOnClickListener(this);
        btnSum.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.btnCal){
            Intent intent= new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }

        if(v.getId()==R.id.btnSum){
        }

    }
}