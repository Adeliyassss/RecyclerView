package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeViewHolder> {

    ArrayList<String> arrayListForAdapter;

    public AnimeAdapter(ArrayList<String> arrayList){
        arrayListForAdapter=arrayList;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        holder.onBind(arrayListForAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayListForAdapter.size();
    }
}
