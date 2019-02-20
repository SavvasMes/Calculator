package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    boolean adding;
    boolean minus;
    boolean multiply;
    boolean division;
    double num1;
    double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.txt_num);
        final TextView textView = findViewById(R.id.txt_Vw);

        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);
        Button btn_zero = findViewById(R.id.btn_zero);
        Button btn_dot = findViewById(R.id.btn_dot);
        Button btn_add = findViewById(R.id.btn_add);
        Button btn_minus = findViewById(R.id.btn_minus);
        Button btn_multi = findViewById(R.id.btn_multi);
        Button btn_div = findViewById(R.id.btn_div);
        Button btn_equals = findViewById(R.id.btn_equals);
        Button btn_clear = findViewById(R.id.btn_clear);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().matches("")) {
                    editText.setText("");
                    adding = false;
                } else {
                    num1 = Double.parseDouble(editText.getText().toString());
                    adding = true;

                }
                 editText.setText("");
                textView.setText(num1 + " +");
                //Log.i("yes", String.valueOf(num1));


            }
        });



        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().matches("")) {
                    editText.setText("");
                    minus = false;
                } else {
                    num1 = Double.parseDouble(editText.getText().toString());
                    minus = true;

                }
                editText.setText(null);
                textView.setText(num1 + " -");
                //Log.i("yes", String.valueOf(num1));


            }


        });

        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().matches("")) {
                    editText.setText("");
                    multiply = false;
                } else {
                    num1 = Double.parseDouble(editText.getText().toString());
                    multiply = true;

                }
                editText.setText(null);
                textView.setText(num1 + " *");
                //Log.i("yes", String.valueOf(num1));


            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().matches("")) {
                    editText.setText("");
                    division = false;
                } else {
                    num1 = Double.parseDouble(editText.getText().toString());
                    division = true;

                }
                editText.setText(null);
                textView.setText(num1 + " ÷");
                //Log.i("yes", String.valueOf(num1));


            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(editText.getText().toString());
                if(adding==true) {
                    double sum = num1 + num2;
                    editText.setText("" + sum);
                    textView.setText(""+ num1+" + "+num2);
                    adding=false;
                    Log.i("num", String.valueOf(num2));
                    Log.i("num", String.valueOf(num1));
                }

                if(minus==true) {
                    double sum = num1 - num2;
                    editText.setText("" + sum);
                    textView.setText(""+ num1+" - "+num2);
                    minus=false;
                    Log.i("num", String.valueOf(num2));
                    Log.i("num", String.valueOf(num1));
                }

                if(multiply==true) {
                    double sum = num1 * num2;
                    editText.setText("" + sum);
                    textView.setText(""+ num1+" * "+num2);
                    multiply=false;
                    Log.i("num", String.valueOf(num2));
                    Log.i("num", String.valueOf(num1));
                }

                if(division==true) {
                    double sum = num1 / num2;
                    editText.setText("" + sum);
                    textView.setText(""+ num1+" ÷ "+num2);
                    division=false;
                    Log.i("num", String.valueOf(num2));
                    Log.i("num", String.valueOf(num1));
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= 0;
                num2= 0;
                editText.setText("");
                textView.setText("");
            }
        });

    }
}
