package com.example.recyclerviewdemo.view;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.Model.Note;
import com.example.recyclerviewdemo.NoteActivity;
import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.storage.NoteStorage;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public  TextView textView;
    public ImageView imageView;
    public int rowNumber= -1;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        LinearLayout  linearLayout= (LinearLayout) itemView;
        textView=linearLayout.findViewById(R.id.textView1);
        imageView = linearLayout.findViewById(R.id.imageView);
        linearLayout.setOnClickListener(this);

    }
    public void setData(int row){
        rowNumber = row;
        textView.setText(NoteStorage.getNote(rowNumber).getHeadline());
        imageView.setImageResource(getImageId());
        //textView.setText(list.get(row)); //bind data to one row in the view
    }

    private int getImageId( ){
        switch (rowNumber){
            case 0 : return R.drawable.image0;
            case 1 : return R.drawable.image1;
            case 2 : return R.drawable.image2;
            case 3 : return R.drawable.image3;
            case 4 : return R.drawable.image4;
            case 5 : return R.drawable.image5;
            case 6 : return R.drawable.image6;
            case 7 : return R.drawable.image7;
            case 8 : return R.drawable.image8;
            case 9 : return R.drawable.image9;

        }
        return R.drawable.image0;
    }

    @Override
    public void onClick(View v) {
        TextView clickedName=v.findViewById(R.id.textView1);
        Note note = NoteStorage.getNote(getAdapterPosition());

        Toast.makeText(v.getContext(),clickedName.getText().toString(),Toast.LENGTH_LONG).show();
        Intent intent = new Intent(v.getContext(), NoteActivity.class);
        intent.putExtra("SendedData",clickedName.getText().toString());
        intent.putExtra("SendedData2",note.getDescription());
        v.getContext().startActivity(intent);

    }


}
