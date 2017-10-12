package com.example.vudinhai.project_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ImageView img;
    Button btn1, btn2;
    TextView txt;

    ArrayList<Pictures> arr = new ArrayList<>();

    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addControl();
        initDatas();
        addEvent();

    }

    private void addEvent() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if(pos == arr.size())
                    pos = 0;

                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos--;
                if(pos < 0)
                    pos = arr.size()-1;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });
    }

    private void initDatas() {
        arr.add(new Pictures(R.drawable.a01,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a02,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a03,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a04,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a05,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a06,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a07,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a08,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a09,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a10,"sadjhgjhagsd"));
        arr.add(new Pictures(R.drawable.a11,"sadjhgjhagsd"));


        img.setImageResource(arr.get(pos).getImage());
        txt.setText(arr.get(pos).getText());

    }

    private void addControl() {
        img = (ImageView) findViewById(R.id.imageView);
        btn1 = (Button)findViewById(R.id.btn_next);
        btn2 = (Button)findViewById(R.id.btn_previous);
        txt = (TextView)findViewById(R.id.textView3);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

      

        super.onSaveInstanceState(outState);
    }
}
