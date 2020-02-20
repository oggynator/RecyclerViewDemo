package com.example.recyclerviewdemo.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.storage.NoteStorage;
import com.example.recyclerviewdemo.view.ViewHolder;

import java.util.ArrayList;
import java.util.Random;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<ViewHolder> implements View.OnClickListener{







    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout ll = (LinearLayout ) LayoutInflater.
                from(parent.getContext()).inflate(R.layout.customrow, parent, false);
        ll.setOnClickListener(this);
        return new ViewHolder(ll);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(position);
        //holder.textView.setText(list.get(position)); //bind data to one row in the view
       // int[] res = {R.drawable.image0,R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6 , R.drawable.image7 , R.drawable.image8};
        //int rndInt = random.nextInt(res .length);
        //holder.imageView.setImageResource(res[rndInt]); //Bind image to one row in the view
    }

    @Override
    public int getItemCount() {
        return NoteStorage.getLength();
    }

    @Override
    public void onClick(View v) {
        TextView clickedName=v.findViewById(R.id.textView1);
        Toast.makeText(v.getContext(),clickedName.getText().toString(),Toast.LENGTH_LONG).show();

    }
}
