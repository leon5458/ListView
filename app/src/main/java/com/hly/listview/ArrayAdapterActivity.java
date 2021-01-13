package com.hly.listview;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ArrayAdapterActivity extends AppCompatActivity {
    private String[] data = {"Android", "Java", "C++", "PHP", "Python", "JS", "HTML", "CSS"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array_adapter_activity_layout);
        final ListView listView = findViewById(R.id.listView);
        final ArrayAdapter<String>
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                data);
        // 设置分割线
        listView.setDivider(new ColorDrawable(Color.RED));
        // 设置分割线的宽度
        listView.setDividerHeight(5);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ArrayAdapterActivity.this, adapter.getItem(position),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
