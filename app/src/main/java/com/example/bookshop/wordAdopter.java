package com.example.bookshop;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class wordAdopter extends ArrayAdapter<word> {
    public wordAdopter(Activity context, ArrayList<word> words) {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        word Iaa = getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(Iaa.getTitle());
        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(Iaa.getAuthor());
        TextView publisher = (TextView) listItemView.findViewById(R.id.publisher);
        publisher.setText(Iaa.getPublisher());
        TextView price = (TextView) listItemView.findViewById(R.id.price);
        price.setText(Iaa.getPrice());
        return listItemView;
    }
}
