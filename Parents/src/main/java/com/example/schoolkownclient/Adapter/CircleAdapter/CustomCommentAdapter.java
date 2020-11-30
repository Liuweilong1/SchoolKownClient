package com.example.schoolkownclient.Adapter.CircleAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Comment;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class CustomCommentAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<Comment> comments=new ArrayList<>();

    public CustomCommentAdapter(Context context, int res, List<Comment> comments) {
        this.context = context;
        this.res = res;
        this.comments = comments;
    }

    @Override
    public int getCount() {
        if(comments!=null){
            return comments.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(comments!= null){
            return comments.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(res,null);
        //获取控件
        ImageView img=convertView.findViewById(R.id.item_comment_head);
        TextView name=convertView.findViewById(R.id.item_comment_name);
        TextView txt=convertView.findViewById(R.id.item_comment_context);
        TextView time=convertView.findViewById(R.id.item_comment_time);
        img.setImageBitmap(comments.get(position).getHeadBitmap());
        name.setText(comments.get(position).getName());
        txt.setText(comments.get(position).getContext());
        time.setText(comments.get(position).getTime());
        return convertView;
    }
}
