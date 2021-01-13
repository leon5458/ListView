package com.hly.listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleAdapterActivity extends AppCompatActivity {

    private String[] project = {"Android", "Java", "C++", "PHP", "Python", "JS", "HTML", "CSS"};
    private String[] dev = {"张三", "李四", "王二", "小赵", "小钱", "小孙", "小李", "小明"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_adapter_activity_layout);

        ArrayList<Map<String, Object>> mData = new ArrayList<>();
        int lengh = project.length;
        for (int i = 0; i < lengh; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("project", project[i]);
            item.put("dev", dev[i]);
            mData.add(item);
        }

        ListView listView = findViewById(R.id.list);

        SimpleAdapter adapter = new SimpleAdapter(this, mData, android.R.layout.simple_list_item_2,
                new String[] {"project", "dev"},
                new int[] {android.R.id.text1, android.R.id.text2});
        // 设置分割线
        listView.setDivider(new ColorDrawable(Color.RED));
        // 设置分割线的宽度
        listView.setDividerHeight(5);
        listView.setAdapter(adapter);
    }
}
