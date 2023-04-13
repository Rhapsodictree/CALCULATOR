package com.example.additionof2numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText N1;
    private EditText N2;
    private Button button2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView);
        N1 = findViewById(R.id.N1);
        N2 = findViewById(R.id.N2);
        button2 = findViewById(R.id.button2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(N1.getText().toString()) + Integer.parseInt(N2.getText().toString());
                textview.setText("The sum of the given numbers is:"+ sum);
            }});
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int difference = Integer.parseInt(N1.getText().toString()) - Integer.parseInt(N2.getText().toString());
                    textview.setText("The difference of the given numbers is:"+ difference);
        }

    });
}}