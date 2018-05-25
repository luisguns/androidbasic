package com.example.luis.meuprimeiroapp.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServerGenerate {
    private String CHAVE_API = "https://api.github.com/";

    public UrlService criarServer(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CHAVE_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UrlService service = retrofit.create(UrlService.class);
        return  service;
    }

}
