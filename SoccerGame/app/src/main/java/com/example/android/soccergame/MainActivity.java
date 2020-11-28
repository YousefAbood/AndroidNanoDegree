package com.example.android.soccergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int juventusScoreNumber, ferencvarosScoreNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void incrementJuventus(View view) {
        juventusScoreNumber++;
        TextView juventusScore = (TextView) findViewById(R.id.juventusScore);
        juventusScore.setText("" + juventusScoreNumber);
    }

    public void incrementFerencvaros(View view){
        ferencvarosScoreNumber++;
        TextView ferencvarosiScore = (TextView) findViewById(R.id.ferencvarosiScore);
        ferencvarosiScore.setText("" + ferencvarosScoreNumber);
    }

}