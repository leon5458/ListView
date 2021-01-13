package com.hly.listview;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListBaseAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_adapter_activity_layout);

        final List<ListBean> list = new ArrayList<>();
        ListBean listBean = new ListBean(R.mipmap.one, "标题头", "内容内容", "删除");
        list.add(listBean);
        ListBean listBean1 = new ListBean(R.mipmap.ic_launcher, "今天", "内容内容", "删除");
        list.add(listBean1);
        ListBean listBean2 = new ListBean(R.mipmap.image, "明天", "内容内容", "删除");
        list.add(listBean2);
        ListBean listBean3 = new ListBean(R.mipmap.photo, "后天", "内容内容", "删除");
        list.add(listBean3);

        final ListView listView = findViewById(R.id.list);
        final MyAdapter adapter = new MyAdapter(ListBaseAdapterActivity.this, list);
        // 设置分割线
        listView.setDivider(new ColorDrawable(Color.RED));
        // 设置分割线的宽度
        listView.setDividerHeight(5);

        listView.setAdapter(adapter);

    }
}
