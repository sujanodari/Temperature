package com.sujan.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText etFah;
    private Button btnCalculate;
    double fah, cel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFah = findViewById(R.id.etFah);
        btnCalculate = findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fah = Double.parseDouble(etFah.getText().toString());

                cel = (5 * fah - 160) / 9;

                Toast.makeText(MainActivity.this, "The celsus is " + cel, Toast.LENGTH_SHORT).show();


            }
        });

    }
}
