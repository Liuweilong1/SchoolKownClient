package com.example.schoolkownclient.Adapter.ShopAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import com.example.schoolkownclient.Entities.Shop;

import java.util.List;

public class shopadapter extends BaseAdapter{
    private Context mContext;
    private List<Shop> shops;
    private int itemLayoutRes;

    public shopadapter(Context mContext, List<Shop> shops, int itemLayoutRes) {
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


        return convertView;
    }
}
