package com.example.schoolkownclient.Adapter.MyClassAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Teacher;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class Myclassadapter extends BaseAdapter {

    private Context context;
    private int res;
    private List<Teacher> teachers = new ArrayList<>();

    public Myclassadapter(Context context, int res, List<Teacher> teachers) {
        this.context = context;
        this.res = res;
        this.teachers = teachers;
    }

    @Override
    public int getCount() {
        if(teachers!=null){
            return teachers.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(teachers!=null){
            return teachers.get(i);
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

        ImageView imageView = view.findViewById(R.id.myclassimg);
        TextView name = view.findViewById(R.id.myclassname);
        TextView phone = view.findViewById(R.id.myclassphone);

        imageView.setImageBitmap(teachers.get(i).getBitmap());
        name.setText(teachers.get(i).getName());
        phone.setText(teachers.get(i).getPhone());

        return view;
    }
}
