package com.example.luis.meuprimeiroapp.API;

import com.example.luis.meuprimeiroapp.model.Repos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UrlService {

    @GET("users/{user}/repos")
    Call<List<Repos>> pegarRepos(@Path("user") String user);

}
