package com.hly.listview;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private List<ListBean> mDatas = null;
    private Context mContext = null;

    public MyAdapter(Context context, List<ListBean> datas) {
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
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_base_item, null);
            holder.image = convertView.findViewById(R.id.image);
            holder.title = convertView.findViewById(R.id.title);
            holder.content = convertView.findViewById(R.id.content);
            holder.delete = convertView.findViewById(R.id.btn);

            holder.delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mDatas.remove(position);
                    notifyDataSetChanged();
                }
            });
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.image.setImageResource(mDatas.get(position).getImgId());
        holder.title.setText(mDatas.get(position).getTitle());
        holder.content.setText(mDatas.get(position).getContent());
        holder.delete.setText(mDatas.get(position).getDelete());

        return convertView;

    }

    public final class ViewHolder {
        ImageView image;
        TextView title;
        TextView content;
        Button delete;
    }

}
