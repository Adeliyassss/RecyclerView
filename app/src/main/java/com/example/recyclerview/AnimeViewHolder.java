package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimeViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    public AnimeViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String animeName){
        imageView=itemView.findViewById(R.id.imageViewMain);
        textView=itemView.findViewById(R.id.textViewMain);

        textView.setText(animeName);

    }
}
