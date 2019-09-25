package com.judeoemurilo.aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edit_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_message = findViewById(R.id.edit_message);
    }
    public void sendMessage(View view){
        String textoDigitado = edit_message.getEditableText().toString();
        Intent intent =
                new Intent (this, DisplayMessageActivity.class);
        intent.putExtra("texto", textoDigitado);
        startActivity(intent);
    }

}
