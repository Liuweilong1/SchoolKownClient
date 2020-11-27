package com.example.schoolkownclient.Adapter.recipeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Dish;
import com.example.schoolkownclient.R;


import java.util.ArrayList;
import java.util.List;

public class CustomDishTypeAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<Dish> dishes=new ArrayList<>();

    public CustomDishTypeAdapter(Context context, int res, List<Dish> dishes) {
        this.context = context;
        this.res = res;
        this.dishes = dishes;
    }

    @Override
    public int getCount() {
        if (dishes != null) {
            return dishes.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (dishes != null) {
            return dishes.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局文件
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(res, null);
        TextView name=convertView.findViewById(R.id.dish_name);
        TextView standard=convertView.findViewById(R.id.dish_standard);
        ImageView img=convertView.findViewById(R.id.dish_img);
        name.setText(dishes.get(position).getName());
        standard.setText(dishes.get(position).getStandards());
        img.setImageBitmap(dishes.get(position).getDishBitmap());
        return convertView;
    }
}
