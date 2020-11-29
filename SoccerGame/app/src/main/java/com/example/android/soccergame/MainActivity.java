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
    
    public void setValues(){
        TextView juventusScore = findViewById(R.id.juventusScore);
        juventusScore.setText("" + juventusScoreNumber);
        TextView ferencvarosiScore = findViewById(R.id.ferencvarosiScore);
        ferencvarosiScore.setText("" + ferencvarosScoreNumber);
    }

    public void incrementJuventus(View view) {
        juventusScoreNumber++;
        setValues();
    }

    public void incrementFerencvaros(View view){
        ferencvarosScoreNumber++;
        setValues();
    }

    public void resetScore(View view) {
        juventusScoreNumber = 0;
        ferencvarosScoreNumber = 0;
        setValues();
    }

}