package com.example.baitaptrenlop_01112021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = findViewById(R.id.btnSubmit);

        final TextView tvFullName = findViewById(R.id.tvFullName);
        final EditText edtFullName = findViewById(R.id.edtFullName);
        final TextView tvMSSV = findViewById(R.id.tvMSSV);
        final EditText edtMSSV = findViewById(R.id.edtMSSV);
        final TextView tvNgaysinh = findViewById(R.id.tvNgaysinh);
        final EditText edtNgaysinh = findViewById(R.id.edtNgaysinh);
        final TextView tvGioitinh = findViewById(R.id.tvGioitinh);
        final RadioButton rdbtnNam = findViewById(R.id.rdbtnNam);
        final RadioButton rdbtnNu = findViewById(R.id.rdbtnNu);
        final TextView tvAddress = findViewById(R.id.tvAddress);
        final EditText edtAddress = findViewById(R.id.edtAddress);
        final TextView tvPhone = findViewById(R.id.tvPhone);
        final EditText edtPhone = findViewById(R.id.edtPhone);
        final TextView tvEmail = findViewById(R.id.tvEmail);
        final EditText edtEmail = findViewById(R.id.edtEmail);
        final TextView tvInterest = findViewById(R.id.tvInterest);
        final CheckBox cb1 = findViewById(R.id.cb1);
        final CheckBox cb2 = findViewById(R.id.cb2);
        final CheckBox cb3 = findViewById(R.id.cb3);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // noi dung
                String str1 = edtFullName.getText().toString();
                String str2 = edtMSSV.getText().toString();
                String str3 = edtNgaysinh.getText().toString();
                String str4 = edtPhone.getText().toString();
                String str5 = edtEmail.getText().toString();
                if (str1.length() == 0 || str2.length() == 0
                        || str3.length() == 0 || str4.length() == 0
                        || str5.length() == 0)
                {
                    showToast(v);
                }
            }
        });
    }

    public void showToast(View view)
    {
        String str = "Lỗi submit";
        Toast toast = Toast.makeText(this, str, Toast.LENGTH_SHORT);
        toast.show();
    }

}