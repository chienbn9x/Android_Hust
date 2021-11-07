package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvKetqua, tvPheptinh;

    Button btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9;
    Button btnSub, btnPlus, btnMul, btnDiv, btnCE, btnC, btnOpp, btnDot, btnEqual;
    ImageButton btnDelete;

    String str = "";
    Double var1;
    Double var2;
    Double ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvKetqua = findViewById(R.id.tvKetqua);
        tvPheptinh = findViewById(R.id.tvPheptinh);

        btnNum0 = findViewById(R.id.btnNum0);
        btnNum1 = findViewById(R.id.btnNum1);
        btnNum2 = findViewById(R.id.btnNum2);
        btnNum3 = findViewById(R.id.btnNum3);
        btnNum4 = findViewById(R.id.btnNum4);
        btnNum5 = findViewById(R.id.btnNum5);
        btnNum6 = findViewById(R.id.btnNum5);
        btnNum7 = findViewById(R.id.btnNum7);
        btnNum8 = findViewById(R.id.btnNum8);
        btnNum9 = findViewById(R.id.btnNum9);
        btnSub = findViewById(R.id.btnSub);
        btnPlus = findViewById(R.id.btnPlus);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnDelete = findViewById(R.id.btnDelete);
        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnOpp = findViewById(R.id.btnOpp);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);

        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"0");
                str = str + "0";
            }
        });

        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"1");
                str = str + "1";
            }
        });

        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"2");
                str = str + "2";
            }
        });

        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"3");
                str = str + "3";
            }
        });

        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"4");
                str = str + "4";
            }
        });

        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"5");
                str = str + "5";
            }
        });

        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"6");
                str = str + "6";
            }
        });

        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"7");
                str = str + "7";
            }
        });

        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"8");
                str = str + "8";
            }
        });

        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"9");
                str = str + "9";
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+".");
                str = str + ".";
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"+");
                setVar1();
                buttonFalse();
                addition = true;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"-");
                setVar1();
                buttonFalse();
                subtract = true;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"x");
                setVar1();
                buttonFalse();
                multiply = true;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPheptinh.setText(tvPheptinh.getText()+"÷");
                setVar1();
                buttonFalse();
                divide = true;
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allReset();
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allReset();
            }
        });

        // xu ly not
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = tvPheptinh.getText().toString();
                // chua xu ly duocj cho nay
                if(str1.isEmpty())
                {
                    buttonTrue();
                    str = var1.toString();
                }
                else
                {
                    str = str.substring(0, str.length() - 1);
                }
                tvPheptinh.setText(str);
            }
        });

        btnOpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(str);
                str = "";
                if(addition)
                {
                    ans = var1 + var2;
                    addition = false;
                }
                else if(subtract)
                {
                    ans = var1 - var2;
                    subtract = false;
                }
                else if(multiply)
                {
                    ans = var1 * var2;
                    multiply = false;
                }
                else if(divide)
                {
                    ans = var1 / var2;
                    divide = false;
                }
                else
                {
                    ans = ans + 0;
                }

                tvKetqua.setText(ans.toString());
                btnEqual.setEnabled(false);
            }
        });
    }

    // To disable buttons
    public void buttonFalse() {
        btnPlus.setEnabled(false);
        btnSub.setEnabled(false);
        btnMul.setEnabled(false);
        btnDiv.setEnabled(false);
    }

    public void buttonTrue() {
        btnPlus.setEnabled(true);
        btnSub.setEnabled(true);
        btnMul.setEnabled(true);
        btnDiv.setEnabled(true);
    }

    // To set val1 value
    public void setVar1()
    {
        var1 = Double.parseDouble(str);
        str = "";
    }

    // to reset all buttons and textview
    public void allReset()
    {
        btnEqual.setEnabled(true);
        btnPlus.setEnabled(true);
        btnSub.setEnabled(true);
        btnMul.setEnabled(true);
        btnDiv.setEnabled(true);

        tvPheptinh.setText("");
        tvKetqua.setText("");
    }
}