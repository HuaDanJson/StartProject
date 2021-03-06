package com.example.jason.constellation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jason.constellation.R;

public class MainGridViewAdapter extends BaseAdapter {

    private String[] title = {"匹配星座", "星座运势", "星座宝典"};
    private int img[] = {R.drawable.category_dream, R.drawable.category_star, R.drawable.icon_start_bao_dian};
    private ImageView imageView;

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return title[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dream_grid_item_layout, null, false);
        imageView = ((ImageView) view.findViewById(R.id.dream_item_img));
        TextView textView = (TextView) view.findViewById(R.id.dream_item_text);
        imageView.setImageResource(img[position]);
        textView.setText(title[position]);
        return view;
    }
}
