package com.example.logbookproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalculator;
    Button btnImageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculator= findViewById(R.id.btnCalculator);
        btnImageSlider = findViewById(R.id.btnSliderImage);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculatorIntent=new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(calculatorIntent);
            }
        });
        btnImageSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sliderIntent= new Intent(MainActivity.this, ImageSliderActivity.class);
                startActivity(sliderIntent);
            }
        });
    }
}