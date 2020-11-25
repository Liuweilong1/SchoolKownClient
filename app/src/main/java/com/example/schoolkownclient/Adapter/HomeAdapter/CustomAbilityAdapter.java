package com.example.schoolkownclient.Adapter.HomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Ability;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAbilityAdapter extends BaseAdapter {

    private Context context;
    private int res;
    private List<Ability> abilities=new ArrayList<>();

    public CustomAbilityAdapter(Context context, int res, List<Ability> abilities) {
        this.context = context;
        this.res = res;
        this.abilities = abilities;
    }

    @Override
    public int getCount() {
        if(abilities!=null){
            return abilities.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(abilities!= null){
            return abilities.get(position);
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
        ImageView imageView=convertView.findViewById(R.id.gridview_item_img);
        TextView title=convertView.findViewById(R.id.gridview_item_title);
        TextView introduction=convertView.findViewById(R.id.gridview_item_introduction);
        imageView.setImageBitmap(abilities.get(position).getBitmap());
        title.setText(abilities.get(position).getTitle());
        introduction.setText(abilities.get(position).getIntroduction());
        return convertView;
    }
}
