package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.recyclerviewdemo.storage.NoteStorage;

public class AddActivity extends AppCompatActivity {

    EditText headline;
    EditText description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void addNote (View view){

        headline = findViewById(R.id.headline);
        description=findViewById(R.id.description);
        NoteStorage.setNote(headline.getText().toString(),description.getText().toString());
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
