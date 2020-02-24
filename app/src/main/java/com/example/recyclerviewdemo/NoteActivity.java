package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        editText = findViewById(R.id.editHeadline);
        editText2=findViewById(R.id.editDescription);
        editText.setText(getIntent().getStringExtra("SendedData"));
        editText2.setText(getIntent().getStringExtra("SendedData2"));

    }
}
