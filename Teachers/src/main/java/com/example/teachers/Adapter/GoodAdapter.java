package com.example.teachers.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.teachers.Entities.Good;
import com.example.teachers.Entities.RoundImageView;
import com.example.teachers.R;

import java.util.ArrayList;
import java.util.List;

public class GoodAdapter extends BaseAdapter {
    private Context mContext;
    private List<Good> goods=new ArrayList<>();
    private int itemLayoutRes;

    public GoodAdapter(Context mContext, List<Good> goods, int itemLayoutRes) {
        this.mContext = mContext;
        this.goods = goods;
        this.itemLayoutRes = itemLayoutRes;
    }

    @Override
    public int getCount() {
        if(null!=goods){
            return goods.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(null!=goods){
            return goods.get(i);
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.acticity_mine_good_list_item, null);

        //获取item控件的引用
        RoundImageView rivHeadPhoto = view.findViewById(R.id.riv_headPhoto);
        TextView tvName = view.findViewById(R.id.tv_name);
        TextView tvTime = view.findViewById(R.id.tv_time);

        //设置控件内容
        rivHeadPhoto.setImageResource(goods.get(i).getHeadPhoto());
        tvName.setText(goods.get(i).getName());
        tvTime.setText(goods.get(i).getTime());

        return view;
    }
}
