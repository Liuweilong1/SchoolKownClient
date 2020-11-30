package com.example.schoolkownclient.Adapter.CircleAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.schoolkownclient.R;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class CustomChooseImgAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<String> urls=new ArrayList<>();

    public CustomChooseImgAdapter(Context context, int res, List<String> urls) {
        this.context = context;
        this.res = res;
        this.urls = urls;
    }

    @Override
    public int getCount() {
        if(urls!=null){
            return urls.size()+1;
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(urls!= null){
            return urls.get(position);
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
        ImageView img=convertView.findViewById(R.id.gridview_item_img);
        if(urls.size()==position){
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //发布一个字符串事件:要求必须先注册再发布才能收到
                    EventBus.getDefault().post("添加图片");
                }
            });
        }
        if(position<urls.size()){
            Glide.with(context).load(urls.get(position)).into(img);
        }else{
            img.setBackgroundResource(R.drawable.add);
        }


        return convertView;
    }
}
