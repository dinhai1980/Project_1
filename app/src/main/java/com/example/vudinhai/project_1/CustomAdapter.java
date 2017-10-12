package com.example.vudinhai.project_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by vudinhai on 6/21/17.
 */

public class CustomAdapter extends ArrayAdapter<ImageR> {

    Context context;
    int layout;
    ArrayList<ImageR> arrayList;

    public CustomAdapter(Context context, int resource, ArrayList<ImageR> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.arrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layout,null);

        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView3);
        imageView.setImageResource(arrayList.get(position).getImage());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
            }
        });


        return convertView;
    }
}
