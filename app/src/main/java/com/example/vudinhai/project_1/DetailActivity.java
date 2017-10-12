package com.example.vudinhai.project_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txt = (TextView)findViewById(R.id.textView4);
        img = (ImageView)findViewById(R.id.imageView4);

        Intent intent = getIntent();

        ImageR imageR = (ImageR) intent.getSerializableExtra("imageR");
        txt.setText(imageR.getText());
        img.setImageResource(imageR.getImage());

    }
}
