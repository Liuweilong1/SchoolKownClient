package com.example.schoolkownclient.Adapter.MyNotificationAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.MyNotification;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class Mynotificationadapter extends BaseAdapter {

    private Context context;
    private int res;
    private List<MyNotification> myNotifications = new ArrayList<>();

    public Mynotificationadapter(Context context, int res, List<MyNotification> myNotifications) {
        this.context = context;
        this.res = res;
        this.myNotifications = myNotifications;
    }

    @Override
    public int getCount() {
        if(myNotifications!=null){
            return myNotifications.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(myNotifications!= null){
            return myNotifications.get(i);
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        //加载布局文件
        LayoutInflater inflater = LayoutInflater.from(context);
        convertview = inflater.inflate(res,null);

        ImageView imageView = convertview.findViewById(R.id.mynoimg);
        TextView title = convertview.findViewById(R.id.mynotitle);
        TextView content = convertview.findViewById(R.id.mynocontent);
        TextView time = convertview.findViewById(R.id.mynotime);

        imageView.setImageBitmap(myNotifications.get(i).getBitmap());
        title.setText(myNotifications.get(i).getName());
        content.setText(myNotifications.get(i).getNoticontent());
        time.setText(myNotifications.get(i).getTime());
        return convertview;
    }
}
