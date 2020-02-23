package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        editText = findViewById(R.id.editText2);
        editText.setText(getIntent().getStringExtra("SendedData"));
    }
}
