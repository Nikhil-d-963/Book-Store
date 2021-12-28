package com.example.bookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KannadaBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kannada_books);

        //Create an word list using array
        ArrayList<word> words = new ArrayList<word>();


        //just a examples for list of items
        words.add(new word("Title: Kannada ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));
        words.add(new word("Title: XXXXX ","Author name: XXXXX","Publisher: XXXXX","Price: XXX"));

        //Set a Words into custom array adopter
        wordAdopter wrdAdapter = new wordAdopter(this, words);

        //Set a ListView to list.xml
        ListView listView = findViewById(R.id.list);

        //set array adopter into ListView
        listView.setAdapter(wrdAdapter);


    }
}