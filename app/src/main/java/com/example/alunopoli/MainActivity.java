package com.example.alunopoli;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    FirebaseDatabase database;
    DatabaseReference ref,rootRef;
    RecyclerView recyclerView;
    ArrayList<Salas> list;
    MyAdapter adapter;
    Salas salas;

//    avisosAdapter adapter;
//    Avisos avisos;

    Button avisosButton , salasButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button avisosButton = (Button) findViewById(R.id.avisosButton);
        Button salasButton = (Button) findViewById(R.id.salasButton);

        avisosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, avisosActivity.class);
                startActivity(myIntent);

            }
        });


        salasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, salasActivity.class);
                startActivity(myIntent);

            }
        });

    }
}
