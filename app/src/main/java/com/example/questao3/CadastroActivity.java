package com.example.questao3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    TextInputEditText etNome;
    Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome = findViewById(R.id.et_nome);
        btnConfirmar = findViewById(R.id.btn_confirmar);

        btnConfirmar.setOnClickListener(v -> {
            String nome = etNome.getText().toString();
            Intent intent = new Intent(CadastroActivity.this, ConfirmacaoActivity.class);
            intent.putExtra("nomeCliente", nome);
            startActivity(intent);
        });
    }
}
