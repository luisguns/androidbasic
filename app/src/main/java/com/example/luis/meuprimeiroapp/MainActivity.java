package com.example.luis.meuprimeiroapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.luis.meuprimeiroapp.API.ServerGenerate;
import com.example.luis.meuprimeiroapp.model.Repos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private TextView texto;
    private EditText edtTexto;
    private Button btnProxima;
    private Button btnNavegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        Log.d("onCreate", "Entrei");
        setContentView(R.layout.activity_main);
        btnClick = findViewById(R.id.button);
        texto = findViewById(R.id.textView);
        btnProxima = findViewById(R.id.activity_main_btn_proximaTela);
        edtTexto = findViewById(R.id.textoEdt);
        btnNavegador = findViewById(R.id.activity_main_btn_navegador);

        Call<List<Repos>> requisicao = new ServerGenerate().criarServer().pegarRepos("google");
        requisicao.enqueue(new Callback<List<Repos>>() {
            @Override
            public void onResponse(Call<List<Repos>> call, Response<List<Repos>> response) {
                List<Repos> repositorios = response.body();
                for (Repos res: repositorios
                     ) {
                    Log.d("RespostaAPI", res.getFull_name());

                }
            }

            @Override
            public void onFailure(Call<List<Repos>> call, Throwable t) {

            }
        });




        btnClick.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                texto.setTextColor(getColor(R.color.nossaCor));
            }













        });

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nossaIntent = new Intent(MainActivity.this,SegundaActivity.class);
                nossaIntent.putExtra("text",edtTexto.getText().toString());
                startActivity(nossaIntent);
            }
        });


        btnNavegador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/watch?v=8bUCzIPDOes";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart", "Entrei");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "Entrei");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","Entrei");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "Entrei");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "Entrei");
    }
}
