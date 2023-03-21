package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AnimeAdapter adapter;
    ArrayList<String> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }

    private void initList() {
        arrayList = new ArrayList<>();

        arrayList.add("Demon Slayer: Kimetsu no Yaiba ");
        arrayList.add("Cowboy Bebop");
        arrayList.add("Jujutsu Kaisen");
        arrayList.add("Fullmetal Alchemist: Brotherhood");
        arrayList.add("Attack on Titan");
        arrayList.add("Naruto");
        arrayList.add("Death Note");
        arrayList.add("One Punch Man");
        arrayList.add("Sword Art Online");
        arrayList.add("Boku no Hero Academia");
        arrayList.add("Tokyo Ghoul");
        arrayList.add("Hunter x Hunter");
        arrayList.add("Kimi no Na wa");
        arrayList.add("No Game No Life");
        arrayList.add("Toradora!");
        arrayList.add("Akame ga Kill!");
        arrayList.add("Haikyuu!!");
        arrayList.add("Bleach");
        arrayList.add("Violet Evergarden");
        arrayList.add("Fairy Tail");
        arrayList.add("Dr. Stone");
        arrayList.add("Darling in the FranXX");
        arrayList.add("Charlotte");
        arrayList.add("Overlord");
        arrayList.add("Elfen Lied");
        arrayList.add("Bakemonogatari");

        adapter=new AnimeAdapter(arrayList);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }
}