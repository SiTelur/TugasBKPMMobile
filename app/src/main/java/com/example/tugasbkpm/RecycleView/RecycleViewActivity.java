package com.example.tugasbkpm.RecycleView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasbkpm.LinearLayout;
import com.example.tugasbkpm.R;
import com.example.tugasbkpm.model.Mahasiswa;
import com.example.tugasbkpm.model.MahasiswaAdapter;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> MahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
addData();
        recyclerView = findViewById(R.id.rv);

        adapter = new MahasiswaAdapter(MahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecycleViewActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData(){
        MahasiswaArrayList = new ArrayList<>();
        MahasiswaArrayList.add(new Mahasiswa("E41221566","Mochammad Lury Choirul Rizky","0895322195063"));
        MahasiswaArrayList.add(new Mahasiswa("E42344322","Deli Kurniawati","085895680106"));
        MahasiswaArrayList.add(new Mahasiswa("E41244454","Putri","085859097002"));
    }


}