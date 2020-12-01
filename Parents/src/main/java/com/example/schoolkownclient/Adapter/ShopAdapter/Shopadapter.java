package com.example.schoolkownclient.Adapter.ShopAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.schoolkownclient.Entities.Shop;
import com.example.schoolkownclient.R;

import java.util.List;

public class Shopadapter extends BaseAdapter{
    private Context mContext;
    private List<Shop> shops;
    private int itemLayoutRes;

    public Shopadapter(Context mContext, List<Shop> shops, int itemLayoutRes) {
        this.mContext = mContext;
        this.shops = shops;
        this.itemLayoutRes = itemLayoutRes;
    }

    @Override
    public int getCount() {//获得数据的条数
        if (null != shops){
            return shops.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {//获取每个item显示的数据对象
        if (null != shops){
            return shops.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {//获取每个item的id值
        return position;
    }//获取每个item的id值

    @Override
    //获取每个item的视图对象
    public View getView(final int position, View convertView, ViewGroup parent) {
        //convertView是每个item的视图对象
        //加载布局文件
        LayoutInflater inflater = LayoutInflater.from(mContext);//布局填充器
        convertView = inflater.inflate(itemLayoutRes, null);
        ImageView imageView = convertView.findViewById(R.id.iv_shopview);
        TextView name = convertView.findViewById(R.id.tv_shopname);
        TextView price = convertView.findViewById(R.id.tv_shopprice);
        TextView scoring = convertView.findViewById(R.id.tv_shopscoring);
        imageView.setImageBitmap(shops.get(position).getPicture());
        name.setText(shops.get(position).getName());
        price.setText(shops.get(position).getPrice());
        scoring.setText(shops.get(position).getScoring());

        return convertView;
    }
}
