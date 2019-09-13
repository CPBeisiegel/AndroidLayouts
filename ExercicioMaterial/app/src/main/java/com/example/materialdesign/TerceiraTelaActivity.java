package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class TerceiraTelaActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private TextInputLayout textInputLayout;
    private Button button;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textInputLayout = findViewById(R.id.textInputLayout);
        button = findViewById(R.id.button);
        floatingActionButton = findViewById(R.id.floatingActionButton4);


        String nomedigitado = textInputLayout.getEditText().getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
