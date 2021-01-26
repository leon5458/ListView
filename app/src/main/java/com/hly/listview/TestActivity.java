package com.hly.listview;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    ListView listView;
    TestAdapter adapter;
    List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_activity_layout);

        listView = findViewById(R.id.list);

        for(int i=0;i<20;i++){
            list.add("");
        }

        adapter = new TestAdapter(TestActivity.this, list);
        // 设置分割线
        listView.setDivider(new ColorDrawable(Color.RED));
        // 设置分割线的宽度
        listView.setDividerHeight(5);
        listView.setAdapter(adapter);
    }
}
