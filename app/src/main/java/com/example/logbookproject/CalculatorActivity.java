package com.example.logbookproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    Button btnPlus, btnMinus, btnMultiply, btnDivision, btnClear , btnEqual, btnOne, btnTwo, btnThree, btnFour,
            btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    TextView txtResult;
    int firstOperand, secondOperand;
    int operator;//1 for plus, 2 for minus
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btnClear = findViewById(R.id.clearBtn);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnEqual = findViewById(R.id.btnEqual);
        btnZero = findViewById(R.id.btnNumber0);
        btnOne = findViewById(R.id.btnNumber1);
        btnTwo = findViewById(R.id.btnNumber2);
        btnThree = findViewById(R.id.btnNumber3);
        btnFour = findViewById(R.id.btnNumber4);
        btnFive = findViewById(R.id.btnNumber5);
        btnSix = findViewById(R.id.btnNumber6);
        btnSeven = findViewById(R.id.btnNumber7);
        btnEight = findViewById(R.id.btnNumber8);
        btnNine = findViewById(R.id.btnNumber9);
        txtResult = findViewById(R.id.txtResult);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstOperand = Integer.parseInt(txtResult.getText().toString());
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
                flag=0;

            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnZero.getText().toString());

            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnOne.getText().toString());

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnTwo.getText().toString());
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnThree.getText().toString());
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnFour.getText().toString());
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnFive.getText().toString());
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnSix.getText().toString());
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnSeven.getText().toString());
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnEight.getText().toString());
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnNine.getText().toString());
            }
        });

    }
}