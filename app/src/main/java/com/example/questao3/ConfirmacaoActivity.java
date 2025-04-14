package com.example.questao3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmacaoActivity extends AppCompatActivity {

    TextView tvMensagem;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        tvMensagem = findViewById(R.id.tv_mensagem);
        btnVoltar = findViewById(R.id.btn_voltar);

        String nome = getIntent().getStringExtra("nomeCliente");
        tvMensagem.setText("Bem-vindo, " + nome + "!");

        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(ConfirmacaoActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // limpa a pilha
            startActivity(intent);
        });
    }
}
