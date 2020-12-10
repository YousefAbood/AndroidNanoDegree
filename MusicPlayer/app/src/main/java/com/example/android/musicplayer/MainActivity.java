package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    TextView song1, song2, song3, song4, song5, song6, song7, song8, song9, song10, song11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        song1 = this.findViewById(R.id.song1);
        song1.setSelected(true);

        song2 = this.findViewById(R.id.song2);
        song2.setSelected(true);

        song3 = this.findViewById(R.id.song3);
        song3.setSelected(true);

        song4 = this.findViewById(R.id.song4);
        song4.setSelected(true);

        song5 = this.findViewById(R.id.song5);
        song5.setSelected(true);

        song6 = this.findViewById(R.id.song6);
        song6.setSelected(true);

        song7 = this.findViewById(R.id.song7);
        song7.setSelected(true);

        song8 = this.findViewById(R.id.song8);
        song8.setSelected(true);

        song9 = this.findViewById(R.id.song9);
        song9.setSelected(true);

        song10 = this.findViewById(R.id.song10);
        song10.setSelected(true);

        song11 = this.findViewById(R.id.song11);
        song11.setSelected(true);

    }

    public void firstTrack(View view){
        Intent i = new Intent(this, song1.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void secondTrack(View view){
        Intent i = new Intent(this, song2.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void thirdTrack(View view){
        Intent i = new Intent(this, song3.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void fourthTrack(View view){
        Intent i = new Intent(this, song4.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void fifthTrack(View view){
        Intent i = new Intent(this, song5.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void sixthTrack(View view){
        Intent i = new Intent(this, song6.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void seventhTrack(View view){
        Intent i = new Intent(this, song7.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void eighthTrack(View view){
        Intent i = new Intent(this, song8.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void ninthTrack(View view){
        Intent i = new Intent(this, song9.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void tenthTrack(View view){
        Intent i = new Intent(this, song10.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void eleventhTrack(View view){
        Intent i = new Intent(this, song11.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}