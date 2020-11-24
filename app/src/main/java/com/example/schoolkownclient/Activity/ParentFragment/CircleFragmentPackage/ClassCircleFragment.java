package com.example.schoolkownclient.Activity.ParentFragment.CircleFragmentPackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.schoolkownclient.Adapter.CircleAdapter.CustomCircleAdapter;
import com.example.schoolkownclient.Entities.Circle;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class ClassCircleFragment extends Fragment {
    private View view;
    private ListView listView;
    private List<Circle> circles=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_circle_class, container, false);
            //获取控件
            listView=view.findViewById(R.id.listview_circleclass);
            initCircles();
            CustomCircleAdapter customCircleAdapter=new CustomCircleAdapter(getContext(),R.layout.listview_circle_item,circles);
            listView.setAdapter(customCircleAdapter);

        }
        return view;
    }
    public void initCircles(){
        Circle circle1=new Circle();
        circle1.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle1.setName("打酱油的憨憨");
        circle1.setTime("2020/11/24 11:01");
        circle1.setText("很好吃很好吃很好吃很好吃很好吃很好吃很好吃很好吃很好吃很好吃");
        circle1.setThumsupNum(28);
        circles.add(circle1);
        Circle circle2=new Circle();
        circle2.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle2.setName("小明");
        List<Bitmap> bitmaps=new ArrayList<>();
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.logo));
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.ability3));
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.ability1));
        circle2.setTime("2019/11/24 12:01");
        circle2.setBitmaps(bitmaps);
        circle2.setThumsupNum(11);
        circles.add(circle2);
        Circle circle3=new Circle();
        circle3.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle3.setName("我是彭于晏");
        circle3.setTime("2028/11/24 09:01");
        circle3.setText("今天心情非常好");
        List<Bitmap> bitmaps1=new ArrayList<>();
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.article1));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.article2));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.article3));
        circle3.setThumsupNum(33);
        circle3.setBitmaps(bitmaps1);
        circles.add(circle3);
    }
}
