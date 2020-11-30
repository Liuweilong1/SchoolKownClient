package com.example.schoolkownclient.Adapter.GrowthAdapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class CustomGrowthPictureAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<Bitmap> bitmaps=new ArrayList<>();

    public CustomGrowthPictureAdapter(Context context, int res, List<Bitmap> bitmaps) {
        this.context = context;
        this.res = res;
        this.bitmaps = bitmaps;
    }

    @Override
    public int getCount() {
        if(bitmaps!=null){
            return bitmaps.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(bitmaps!= null){
            return bitmaps.get(position);
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
        convertView = inflater.inflate(res,null);
        //获取控件
        ImageView image=convertView.findViewById(R.id.gridview_growth_item_tv_img);
        image.setImageBitmap(bitmaps.get(position));
        return convertView;
    }
}
