package com.hly.listview;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TestAdapter extends BaseAdapter {
    private List<String> mDatas;
    private Context mContext;

    public TestAdapter(Context context, List<String> datas) {
        mDatas = datas;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        MyAdapter.ViewHolder holder;
        if (convertView == null) {
            holder = new MyAdapter.ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.test_item_layout, null);

            convertView.setTag(holder);
        } else {
            holder = (MyAdapter.ViewHolder) convertView.getTag();
        }

        return convertView;

    }

    public static class ViewHolder {

    }

}
