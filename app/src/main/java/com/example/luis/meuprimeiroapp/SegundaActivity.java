package com.example.luis.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegundaActivity extends AppCompatActivity {
    private TextView teste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        teste = findViewById(R.id.teste);
        Bundle str = getIntent().getExtras();
        String dado = (String) str.get("text");
        teste.setText(dado);
    }
}
