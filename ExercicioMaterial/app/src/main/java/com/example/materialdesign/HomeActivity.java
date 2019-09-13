package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;


public class HomeActivity extends  AppCompatActivity {

    private TextInputLayout inputLayoutMusica;
    private FloatingActionButton btnAdd;
    private TextView txtNomeMusicas;
    private Button btnFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity_main);

        inputLayoutMusica = findViewById(R.id.inputLayoutMusica);
        btnAdd = findViewById(R.id.btnAdd);
        txtNomeMusicas = findViewById(R.id.txtNomeMusicas);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String musica = inputLayoutMusica.getEditText().getText().toString();

                if(musica.isEmpty() || musica == ""){
                    inputLayoutMusica.setError("O campo não pode ser nulo");
                } else {
                    txtNomeMusicas.setText(musica);
                    Snackbar.make(inputLayoutMusica, "Musica adicionada",Snackbar.LENGTH_LONG).show();
                }

                btnFinalizar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(HomeActivity.this, TerceiraTelaActivity.class));
                    }
                });
            }



        });
    }
}
