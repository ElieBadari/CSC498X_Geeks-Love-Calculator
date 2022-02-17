package com.example.csc498x_geeks_love_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText input;
    String full_name;
    Spinner spinner;
    String[] languages;
    ArrayAdapter<String> adapter;
    ImageView img;
    TextView output;
    Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.img);
        spinner = (Spinner) findViewById(R.id.lang_sp);
        languages = new String[]{"", "JavaScript", "HTML", "CSS", "Swift", "C++", "C#", "TypeScript"};
        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, languages);
        spinner.setAdapter(adapter);
        input = (EditText) findViewById(R.id.user);
        output = (TextView) findViewById(R.id.output);

    }

    public void match(View view){
        full_name = input.getText().toString();
        img.setTranslationY(-1500);

        int out = (int)(Math.random()*(100-0+1)+0);
        output.setText(out);
        if (spinner.getSelectedItem().toString() == languages[1]){
            img.setImageResource(R.drawable.javascript);
        }else if (spinner.getSelectedItem().toString() == languages[2]){
            img.setImageResource(R.drawable.html);
        }else if (spinner.getSelectedItem().toString() == languages[3]){
            img.setImageResource(R.drawable.css);
        }else if (spinner.getSelectedItem().toString() == languages[4]){
            img.setImageResource(R.drawable.swift);
        }else if (spinner.getSelectedItem().toString() == languages[5]){
            img.setImageResource(R.drawable.c);
        }else if (spinner.getSelectedItem().toString() == languages[6]){
            img.setImageResource(R.drawable.csharp);
        }else if (spinner.getSelectedItem().toString() == languages[7]){
            img.setImageResource(R.drawable.typescript);
        }
        img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);




    }


}