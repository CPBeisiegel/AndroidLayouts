package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class IntroductionActivity extends AppCompatActivity {

    private ImageView imgSplach;
    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgSplach = findViewById(R.id.img_music);

        imgSplach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                jump();
            }
        },8000);
    }

    private void jump(){
        timer.cancel();
        startActivity(new Intent(IntroductionActivity.this, HomeActivity.class));
        finish();
    }
}


