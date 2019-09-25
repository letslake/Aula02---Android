package com.judeoemurilo.aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private TextView exibir_TextoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        exibir_TextoTextView = findViewById(R.id.exibir_TextoTextView);
        Intent origemIntent = getIntent();
        String texto = origemIntent.getStringExtra("texto");
        exibir_TextoTextView.setText(texto);

    }

}
