package com.example.csc498x_geeks_love_calculator;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText input;
    String full_name;
    Spinner spinner;
    String[] languages;
    ArrayAdapter<String> adapter;
    ImageView img;
    TextView status;
    Random random = new Random();
    String[] lang;
    String[] scores;
    int game_count;
    TableLayout table;
    ArrayList<TableRow> a_tr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        spinner = (Spinner) findViewById(R.id.lang_sp);
        languages = new String[]{"JavaScript", "HTML", "CSS", "Swift", "C++", "C#", "TypeScript"};
        adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, languages);
        spinner.setAdapter(adapter);
//        status.setText(" ");
        input = (EditText) findViewById(R.id.user);
        status = (TextView) findViewById(R.id.out_percent);
        game_count = 0;
        table = (TableLayout) findViewById(R.id.table);
        lang = new String[10];
        scores = new String[10];
        a_tr = new ArrayList<TableRow>();

    }

    public void emptyName(View view){
        input.setText("");
    }
    public void match(View view){
        full_name = input.getText().toString();

        img.setTranslationY(-1500);


        int rand = random.nextInt(100) + 1;
        String message = full_name + " has a compatibility of " + rand + "%";
        status.setText(message);

            if(game_count == 10){

               while(game_count > 0){
                   table.removeView(a_tr.get(0));
                    a_tr.remove(0);
                    game_count--;
               }

            }

            if (spinner.getSelectedItem().toString().equalsIgnoreCase(languages[0])) {
                lang[game_count] = languages[0];
                scores[game_count] = rand + "%";
                game_count++;
                img.setImageResource(R.drawable.javascript);
                img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);
            } else if (spinner.getSelectedItem().toString().equalsIgnoreCase(languages[1])) {
                lang[game_count] = languages[1];
                scores[game_count] = rand + "%";
                game_count++;
                img.setImageResource(R.drawable.html);
                img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);
            } else if (spinner.getSelectedItem().toString().equalsIgnoreCase(languages[2])) {
                lang[game_count] = languages[2];
                scores[game_count] = rand + "%";
                game_count++;
                img.setImageResource(R.drawable.css);
                img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);
            } else if (spinner.getSelectedItem().toString().equalsIgnoreCase(languages[3])) {
                lang[game_count] = languages[3];
                scores[game_count] = rand + "%";
                game_count++;
                img.setImageResource(R.drawable.swift);
                img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);
            } else if (spinner.getSelectedItem().toString().equalsIgnoreCase(languages[4])) {
                lang[game_count] = languages[4];
                scores[game_count] = rand + "%";
                game_count++;
                img.setImageResource(R.drawable.c);
                img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);
            } else if (spinner.getSelectedItem().toString().equalsIgnoreCase(languages[5])) {
                lang[game_count] = languages[5];
                scores[game_count] = rand + "%";
                game_count++;
                img.setImageResource(R.drawable.csharp);
                img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);
            } else if (spinner.getSelectedItem().toString().equalsIgnoreCase(languages[6])) {
                lang[game_count] = languages[6];
                scores[game_count] = rand + "%";
                game_count++;
                img.setImageResource(R.drawable.typescript);
                img.animate().translationYBy(1500).rotation(360*10).setDuration(10000);
            }


            TableRow tr = new TableRow(this);
            TextView tv1 = new TextView(this);
            TextView tv2 = new TextView(this);
//        android:layout_width="0dp"
//        android:layout_height="wrap_content"
//        android:layout_weight="4"
//        android:gravity="center_horizontal"
//        android:padding="10sp"
//        android:text="Language"
//        android:textColor="@color/valentine_col"
//        android:textSize="14sp"

            tr.setLayoutParams(new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

            tv1.setText(scores[game_count-1]);
            tv1.setTextSize(14);
//            tv1.setWidth(100);
//            tv1.setHeight(150);
            tv1.setTextColor(Color.BLACK);
            tv1.setPadding(250,10,100,10);
            tv1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv1.setGravity(Gravity.CENTER_HORIZONTAL);


            tv2.setText(lang[game_count-1]);
            tv2.setTextSize(14);
//            tv2.setWidth(250);
//            tv2.setHeight(150);
            tv2.setTextColor(Color.BLACK);
            tv2.setPadding(300,10,10,10);
            tv2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv2.setGravity(Gravity.CENTER_HORIZONTAL);


            tr.addView(tv1);
            tr.addView(tv2);
            table.addView(tr);
            a_tr.add(tr);












    }


}