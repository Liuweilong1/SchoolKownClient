package com.example.schoolkownclient.Adapter.CircleAdapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Circle;
import com.example.schoolkownclient.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;

public class CustomCircleAdapter extends BaseAdapter implements View.OnClickListener {
    private Context context;
    private int res;
    private List<Circle> circles=new ArrayList<>();
    private Button dianzan;
    private Button comment;
    private Button zhuanfa;

    public CustomCircleAdapter(Context context, int res, List<Circle> cirlces) {
        this.context = context;
        this.res = res;
        this.circles = cirlces;
    }

    @Override
    public int getCount() {
        if(circles!=null){
            return circles.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(circles!= null){
            return circles.get(position);
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
        //获取控件
        ImageView head=convertView.findViewById(R.id.circle_item_head);
        TextView name=convertView.findViewById(R.id.circle_item_name);
        TextView time=convertView.findViewById(R.id.circle_item_time);
        TextView article=convertView.findViewById(R.id.circle_item_article);
        GridView gridView=convertView.findViewById(R.id.circle_item_gridview);
        TextView thumsNum=convertView.findViewById(R.id.circle_item_dianzannum);
        dianzan=convertView.findViewById(R.id.circle_item_diannzan);
        comment=convertView.findViewById(R.id.circle_item_pinglun);
        zhuanfa=convertView.findViewById(R.id.circle_item_zhuanfa);
        dianzan.setOnClickListener(this);
        comment.setOnClickListener(this);
        zhuanfa.setOnClickListener(this);
//        if(!circles.get(position).getText().equals("")){
            article.setText(circles.get(position).getText());
//        }
        if(circles.get(position).getBitmaps().size()!=0){
            CustomCirclePictureAdapter customCirclePictureAdapter=new CustomCirclePictureAdapter(context,R.layout.gridview_circle_item,circles.get(position).getBitmaps());
            gridView.setAdapter(customCirclePictureAdapter);
        }
        head.setImageBitmap(circles.get(position).getHeadBitMap());
        name.setText(circles.get(position).getName());
        time.setText(circles.get(position).getTime());
        thumsNum.setText(circles.get(position).getThumsupNum()+"");

        return convertView;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.circle_item_diannzan:
                dianzan.setBackgroundResource(R.drawable.dianzan1);
                Log.e("点击了点赞按钮","1");
                break;
            case R.id.circle_item_pinglun:

                break;
            case R.id.circle_item_zhuanfa:

                break;
        }


    }
}
