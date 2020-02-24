package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recyclerviewdemo.Model.Note;
import com.example.recyclerviewdemo.adapter.MyRecycleViewAdapter;
import com.example.recyclerviewdemo.storage.FileStorage;
import com.example.recyclerviewdemo.storage.NoteStorage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NoteStorage.setFileStorage(new FileStorage(this));
        recyclerView =findViewById(R.id.recycleView1);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyRecycleViewAdapter());

    }



    public void newNote (View view){
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }

}
//TODO: send kun rownumber med fra Viewholder  til Noteactivy, byg noteacivaity ud fra rownumber og notestorage.getnote. På den måde kan man også bare ændre den note.