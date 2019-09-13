package com.example.exerciciolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayoutActivity extends AppCompatActivity {

    private Button btnFrame;
    private Button btnRelative;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        btnFrame = findViewById(R.id.btnFrameLayout);
        btnRelative = findViewById(R.id.btnRelativeLayout);

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayoutActivity.this, FrameLayoutActivity.class));
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayoutActivity.this, RelativeLayoutActivity.class));
            }
        });

    }


}
