package com.softwaredevschool.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnOne, btnTwo, btnThree, btnEqual, btnPlus;
    private TextView anstv;
    private EditText etOne, etTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = findViewById(R.id.oneBtn);
        btnTwo = findViewById(R.id.twoBtn);
        btnThree = findViewById(R.id.threeBtn);
        btnEqual = findViewById(R.id.equalBtn);
        btnPlus = findViewById(R.id.plusBtn);
        anstv = findViewById(R.id.ansTv);
        etOne = findViewById(R.id.firstEt);
        etTwo = findViewById(R.id.secondEt);
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = etOne.getText().toString().trim();
                String secondInput = etTwo.getText().toString().trim();
                int firstNum = Integer.parseInt(firstInput);
                int secondNum = Integer.parseInt(secondInput);

                int sum = firstNum + secondNum;
                anstv.setText("" + sum);
            }

        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOne.setText("1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTwo.setText("2");
            }
        });
    }
}