package com.example.schoolkownclient.Adapter.GrowthAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;


import com.example.schoolkownclient.Adapter.CircleAdapter.CustomCirclePictureAdapter;
import com.example.schoolkownclient.Entities.Circle;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class CustomGrowthListAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<Circle> circles = new ArrayList<>();

    public CustomGrowthListAdapter(Context context, int res, List<Circle> circles) {
        this.context = context;
        this.res = res;
        this.circles = circles;
    }

    @Override
    public int getCount() {
        if (circles != null) {
            return circles.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (circles != null) {
            return circles.get(position);
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
        TextView txt=convertView.findViewById(R.id.growth_item_article);
        GridView gridView=convertView.findViewById(R.id.growth_item_gridview);
        txt.setText(circles.get(position).getText());
        if(circles.get(position).getBitmaps().size()!=0){
            CustomCirclePictureAdapter customCirclePictureAdapter=new CustomCirclePictureAdapter(context,R.layout.gridview_growth_item,circles.get(position).getBitmaps());
            gridView.setAdapter(customCirclePictureAdapter);
            customCirclePictureAdapter.notifyDataSetChanged();
        }


        return convertView;
    }
}
