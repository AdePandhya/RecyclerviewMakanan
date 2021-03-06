package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMakanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan = findViewById(R.id.rv_novel);
        rvMakanan.setHasFixedSize(true);

        list.addAll(MakananData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listNovelAdapter = new ListMakananAdapter(list);
        rvMakanan.setAdapter(listNovelAdapter);
    }
}