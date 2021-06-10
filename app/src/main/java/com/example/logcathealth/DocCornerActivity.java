package com.example.logcathealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.logcathealth.Adapter.RecyclerViewAdapter;

public class DocCornerActivity extends AppCompatActivity {
    private RecyclerView recyclerview;
    private RecyclerViewAdapter recyclerViewAdapter;
    ImageView home1,marcketplace1, profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_corner);
        home1=findViewById(R.id.home1);
        marcketplace1=findViewById(R.id.marcketplace1);
        profile=findViewById(R.id.profile);



        //recyclerView initialisation
        recyclerview=findViewById(R.id.recyclerview);


        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DocCornerActivity.this, "We will be adding this feature soon!", Toast.LENGTH_SHORT).show();
            }
        });
        marcketplace1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DocCornerActivity.this, "We will be adding this feature soon!", Toast.LENGTH_SHORT).show();
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DocCornerActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });



    }
}