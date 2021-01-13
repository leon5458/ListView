package com.hly.listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SingleSimpleAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_adapter_activity_layout);

        List<Map<String, Object>> mData = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "张三");
        map1.put("sex", "男");
        map1.put("class", "一年级");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "李四");
        map2.put("sex", "男");
        map2.put("class", "二年级");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "王二");
        map3.put("sex", "男");
        map3.put("class", "三年级");

        Map<String, Object> map4 = new HashMap<>();
        map4.put("name", "春花");
        map4.put("sex", "女");
        map4.put("class", "一年级");

        Map<String, Object> map5 = new HashMap<>();
        map5.put("name", "夏草");
        map5.put("sex", "女");
        map5.put("class", "二年级");

        Map<String, Object> map6 = new HashMap<>();
        map6.put("name", "秋香");
        map6.put("sex", "女");
        map6.put("class", "三年级");

        mData.add(map1);
        mData.add(map2);
        mData.add(map3);
        mData.add(map4);
        mData.add(map5);
        mData.add(map6);

        ListView listView = findViewById(R.id.list);
        SimpleAdapter adapter = new SimpleAdapter(this, mData, R.layout.single_simple_adapter_item
                , new String[] {"name", "sex", "class"},
                new int[] {R.id.simple_name, R.id.simple_sex, R.id.simple_class});
        // 设置分割线
        listView.setDivider(new ColorDrawable(Color.RED));
        // 设置分割线的宽度
        listView.setDividerHeight(5);
        listView.setAdapter(adapter);

    }
}
