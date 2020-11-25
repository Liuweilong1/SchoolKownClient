package com.example.schoolkownclient.Adapter.MyClassAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Studentparent;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class ParentAdapter extends BaseAdapter {

    private Context context;
    private int res;
    private List<Studentparent> studentparents = new ArrayList<>();

    public ParentAdapter(Context context, int res, List<Studentparent> studentparents) {
        this.context = context;
        this.res = res;
        this.studentparents = studentparents;
    }

    @Override
    public int getCount() {
        if(studentparents!=null){
            return studentparents.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(studentparents!=null){
            return studentparents.get(i);
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

        imageView.setImageBitmap(studentparents.get(i).getBitmap());
        name.setText(studentparents.get(i).getName());
        phone.setText(studentparents.get(i).getPhone());

        return view;
    }
}
