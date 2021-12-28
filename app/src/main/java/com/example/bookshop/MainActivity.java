package com.example.bookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView kannadaBooks = findViewById(R.id.kannadaBooks);
        kannadaBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kannadaBookIntent = new Intent(getApplicationContext(),KannadaBooks.class);
                startActivity(kannadaBookIntent);
            }
        });

        TextView englishBooks = findViewById(R.id.EnglishBooks);
        englishBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishBookIntent = new Intent(getApplicationContext(),EnglishBooks.class);
                startActivity(englishBookIntent);
            }
        });

    }
}