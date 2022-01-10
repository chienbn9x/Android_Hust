package com.tool.chien_file_manage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTXTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_txtactivity);

        String path = getIntent().getStringExtra("path");
        String name = getIntent().getStringExtra("name");


        TextView nameFile = findViewById(R.id.nameFile);
        TextView dataFile = findViewById(R.id.dataFile);

        File file = new File(path);



        StringBuilder builder = new StringBuilder();
        Log.e("main", "read start");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine())!=null){
                builder.append(line);
                builder.append("\n");
            }
            br.close();
        }catch (Exception e){
            Log.e("main", " error is "+e.toString());
        }
        Log.e("main", " read text is "+ builder.toString());
        dataFile.setText(builder.toString());

        nameFile.setText(name);

    }
}