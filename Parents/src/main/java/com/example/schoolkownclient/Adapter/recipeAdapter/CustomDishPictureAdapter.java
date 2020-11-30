package com.example.schoolkownclient.Adapter.recipeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.schoolkownclient.Entities.Dish;
import com.example.schoolkownclient.R;


import java.util.ArrayList;
import java.util.List;

public class CustomDishPictureAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<Dish> dishes=new ArrayList<>();

    public CustomDishPictureAdapter(Context context, int res, List<Dish> dishes) {
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
        ImageView imageView=convertView.findViewById(R.id.gridview_dish_item);
        imageView.setImageBitmap(dishes.get(position).getDishBitmap());
        return convertView;
    }
}
