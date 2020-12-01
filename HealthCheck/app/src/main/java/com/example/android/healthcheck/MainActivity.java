package com.example.android.healthcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkbox(View view){
        CheckBox checkbox = (CheckBox) view;
        if(checkbox.isChecked()) {
            count += 5;
        } if(!(checkbox.isChecked())) {
            count -= 5;
        }
    }


    public void healthcheck(View view){
        TextView problemSpecify = (TextView) findViewById(R.id.problemSpecify);
        if(count >= 30) {
            problemSpecify.setTextColor(Color.parseColor("#FF0000"));
            problemSpecify.setText("You must consult a doctor as fast as possible to check on your health!");
            problemSpecify.setVisibility(problemSpecify.VISIBLE);
        } else if(count >= 15) {
            problemSpecify.setTextColor(Color.parseColor("#FFFF00"));
            problemSpecify.setText("It is advised to visit a doctor.");
            problemSpecify.setVisibility(problemSpecify.VISIBLE);
        } else {
            problemSpecify.setTextColor(Color.parseColor("#00FF00"));
            problemSpecify.setText("You are healthy!");
            problemSpecify.setVisibility(problemSpecify.VISIBLE);
        }
    }
}