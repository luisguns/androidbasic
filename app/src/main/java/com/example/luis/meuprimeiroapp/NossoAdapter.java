package com.example.luis.meuprimeiroapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.luis.meuprimeiroapp.model.Repos;

import java.util.List;

class NossoAdapter extends RecyclerView.Adapter {
    public NossoAdapter(List<Repos> repositorios) {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
