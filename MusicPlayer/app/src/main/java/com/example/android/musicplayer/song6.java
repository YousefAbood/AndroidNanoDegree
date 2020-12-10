package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class song6 extends AppCompatActivity {
    MediaPlayer player;
    TextView track1, author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song6);
        ImageButton playButton = findViewById(R.id.imageButton4);
        player = MediaPlayer.create(this, R.raw.track6);
        track1 = (TextView) this.findViewById(R.id.holstOp32);
        track1.setSelected(true);

        author = (TextView) this.findViewById(R.id.author);
        author.setSelected(true);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(player.isPlaying())) {
                    player.start();
                    playButton.setImageResource(R.drawable.pause);
                } else {
                    player.pause();
                    playButton.setImageResource(R.drawable.play);
                }
            }
        });

        if(!(player.isPlaying())){
            player.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        player.pause();
    }



    public void goHomePage(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void previousSong(View view) {
        Intent i = new Intent(this, song5.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void nextSong(View view) {
        Intent i = new Intent(this, song7.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}