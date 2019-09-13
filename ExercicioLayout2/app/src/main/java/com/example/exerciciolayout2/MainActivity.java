package com.example.exerciciolayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText nomeproduto;
    private EditText preco;
    private EditText desconto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeproduto = findViewById(R.id.nomeproduto);
        preco = findViewById(R.id.editTextpreco);
        desconto = findViewById(R.id.editTextquantidade);
        button = findViewById(R.id.button);

                button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String produto = nomeproduto.getText().toString();
                String nome = preco.getText().toString();
                String percentual = desconto.getText().toString();

                int nomeValor = Integer.parseInt(nome);
                int porcentagem = Integer.parseInt(percentual);

                int resultado = nomeValor - (porcentagem*nomeValor)/100;


                Toast.makeText(getApplicationContext(),"O preço do celular com desconto é" + resultado , Toast.LENGTH_SHORT).show();

            }
        });

;
    }
}
