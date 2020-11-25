package com.example.schoolkownclient.Adapter.MyMessageAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.MyMessage;
import com.example.schoolkownclient.Entities.MyNotification;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class Mymessageadapter extends BaseAdapter {

    private Context context;
    private int res;
    private List<MyMessage> myMessages = new ArrayList<>();

    public Mymessageadapter(Context context, int res, List<MyMessage> myMessages) {
        this.context = context;
        this.res = res;
        this.myMessages = myMessages;
    }

    @Override
    public int getCount() {
        if(myMessages!=null){
            return myMessages.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(myMessages!= null){
            return myMessages.get(i);
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //加载布局文件
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(res,null);

        ImageView imageView = view.findViewById(R.id.mymesimg);
        TextView title = view.findViewById(R.id.mymestitle);
        TextView content = view.findViewById(R.id.mymescontent);
        TextView time = view.findViewById(R.id.mymestime);

        imageView.setImageBitmap(myMessages.get(i).getBitmap());
        title.setText(myMessages.get(i).getName());
        content.setText(myMessages.get(i).getMescontent());
        time.setText(myMessages.get(i).getTime());
        return view;
    }
}
