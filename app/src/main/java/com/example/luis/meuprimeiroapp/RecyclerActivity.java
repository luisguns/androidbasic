package com.example.luis.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.luis.meuprimeiroapp.API.ServerGenerate;
import com.example.luis.meuprimeiroapp.model.Repos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecyclerActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        final RecyclerView recycerViews = findViewById(R.id.recycler);

        Call<List<Repos>> requisicao = new ServerGenerate().criarServer().pegarRepos("google");
        requisicao.enqueue(new Callback<List<Repos>>() {
            @Override
            public void onResponse(Call<List<Repos>> call, Response<List<Repos>> response) {
                List<Repos> repositorios = response.body();

                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
                recycerViews.setAdapter(new NossoAdapter(repositorios));


            }

            @Override
            public void onFailure(Call<List<Repos>> call, Throwable t) {

            }
        });


    }
}
