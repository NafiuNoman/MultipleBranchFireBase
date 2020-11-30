package com.example.dataimputfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.IdRecycerView);

        FirebaseRecyclerOptions<DataHolder> options =
                new FirebaseRecyclerOptions.Builder<DataHolder>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Student"), DataHolder.class)
                        .build();






    }
}