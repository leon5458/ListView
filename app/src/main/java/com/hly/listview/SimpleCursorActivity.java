package com.hly.listview;

import android.database.MatrixCursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleCursorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_adapter_activity_layout);

        String[] simpleCursor = new String[] {"_id", "name", "sex", "class"};
        MatrixCursor cursor = new MatrixCursor(simpleCursor);
        cursor.addRow(new Object[] {null,"张三", "男", "一年级"});
        cursor.addRow(new Object[] {null,"李四", "男", "二年级"});
        cursor.addRow(new Object[] {null,"王二", "男", "三年级"});
        cursor.addRow(new Object[] {null,"春花", "女", "一年级"});
        cursor.addRow(new Object[] {null,"夏草", "女", "二年级"});
        cursor.addRow(new Object[] {null,"秋香", "女", "三年级"});

        ListView listView = findViewById(R.id.list);
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                R.layout.single_simple_adapter_item, cursor, simpleCursor,
                new int[] {R.id.simple_id,R.id.simple_name, R.id.simple_sex, R.id.simple_class});
        // 设置分割线
        listView.setDivider(new ColorDrawable(Color.RED));
        // 设置分割线的宽度
        listView.setDividerHeight(5);
        listView.setAdapter(adapter);
    }
}
