package com.example.snehasis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnClr,btnEquals;
    TextView Result;
    float first_num,second_num;
    String operator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnClr=findViewById(R.id.btnClr);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnEquals=findViewById(R.id.btnEquals);
        Result=findViewById(R.id.result);
        Result.setText("");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText().toString()+"0");
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Result.getText().toString()=="")
                {
                    Result.setText("");
                }
                else {
                    first_num = Float.parseFloat(Result.getText().toString());
                    operator = "+";
                    Result.setText("");
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Result.getText().toString()=="")
                {
                    Result.setText("");
                }
                else {
                    first_num = Float.parseFloat(Result.getText().toString());
                    operator = "-";
                    Result.setText("");
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Result.getText().toString() == "") {
                    Result.setText("");
                } else {
                    first_num = Float.parseFloat(Result.getText().toString());
                    operator = "*";
                    Result.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Result.getText().toString() == "") {
                    Result.setText("");
                } else {
                    first_num = Float.parseFloat(Result.getText().toString());
                    operator = "/";
                    Result.setText("");
                }
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Result.getText().toString() == "") {
                    Result.setText("");
                } else {
                    second_num = Float.parseFloat(Result.getText().toString());

                    if (operator == "+") {
                        Result.setText(Integer.toString((int) (first_num + second_num)));
                    } else if (operator == "-") {
                        Result.setText(Integer.toString((int)(first_num - second_num)));
                    } else if (operator == "*") {
                        Result.setText(Integer.toString((int)(first_num * second_num)));
                    } else if (operator == "/") {
                        if (second_num == 0) {
                            Result.setText("Invalid Input");

                        } else {
                            Result.setText(Float.toString(first_num / second_num));
                        }
                    }
                }
            }
        });
    }
}