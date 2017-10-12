package com.example.vudinhai.project_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListExampleActivity extends AppCompatActivity {

    ListView list;
    ArrayList<ImageR> arrayList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);

        list = (ListView)findViewById(R.id.list);

        arrayList = ImageR.initData();

        customAdapter = new CustomAdapter(ListExampleActivity.this,
                                          R.layout.layout_row,
                                        arrayList  );

        list.setAdapter(customAdapter);

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(ListExampleActivity.this, DetailActivity.class);
//
//                intent.putExtra("imageR",arrayList.get(position));
//
//                startActivity(intent);
//            }
//        });


    }
}
