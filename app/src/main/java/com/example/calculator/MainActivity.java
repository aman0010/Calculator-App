package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnDivide, btnMultiply, btnMinus, btnPlus, btnDot, btnEqual;
    TextView tvFirst, tvSecond;
    String process, operation   = null;
    Double first, second;

    @Override   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus     = findViewById(R.id.btnPlus);
        btnMinus    = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide   = findViewById(R.id.btnDivide);

        btnDot      = findViewById(R.id.btnDot);
        btnEqual    = findViewById(R.id.btnEqual);
        btnClear    = findViewById(R.id.btnClear);

        tvFirst     = findViewById(R.id.tvFirst);
        tvSecond    = findViewById(R.id.tvSecond);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvFirst.setText("");
                tvSecond.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = tvSecond.getText().toString();
                tvSecond.setText(process + ".");
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvFirst.getText().toString() == "" & tvSecond.getText().toString() == "") return;
                if (operation != null){
                    process = tvFirst.getText().toString();
                    tvFirst.setText(process.replace(operation, "+"));
                    operation = "+";
                    return;
                }
                performOperation();
                tvFirst.setText(process + "+");
                operation = "+";
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvFirst.getText().toString() == "" & tvSecond.getText().toString() == "") return;
                if (operation != null){
                    process = tvFirst.getText().toString();
                    tvFirst.setText(process.replace(operation,"-"));
                    operation = "-";
                    return;
                }
                performOperation();
                tvFirst.setText(process + "-");
                operation = "-";
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvFirst.getText().toString() == "" & tvSecond.getText().toString() == "") return;
                if (operation != null){
                    process = tvFirst.getText().toString();
                    tvFirst.setText(process.replace(operation,"*"));
                    operation = "*";
                    return;
                }
                performOperation();
                tvFirst.setText(process + "*");
                operation = "*";
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvFirst.getText().toString() == "" & tvSecond.getText().toString() == "") return;
                if (operation != null){
                    process = tvFirst.getText().toString();
                    tvFirst.setText(process.replace(operation,"/"));
                    operation = "/";
                    return;
                }
                performOperation();
                tvFirst.setText(process + "/");
                operation = "/";
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvSecond.getText().toString() == "") return;
                second = Double.parseDouble(tvSecond.getText().toString());
                Log.i("TAG", second.toString());
                if (operation =="+"){
                    tvSecond.setText((first + second)+"");
                } else if (operation == "-"){
                    tvSecond.setText((first - second)+"");
                } else if (operation == "*"){
                    tvSecond.setText((first * second)+"");
                } else if (operation == "/"){
                    tvSecond.setText((first / second)+"");
                }
                tvFirst.setText("");
                operation = null;
            }
        });
    }

    public void performOperation(){
        process = tvSecond.getText().toString();
        first = Double.parseDouble(process);
        tvSecond.setText("");
    }
}