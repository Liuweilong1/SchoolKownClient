package com.example.schoolkownclient.Activity.SmallActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.Adapter.GrowthAdapter.CustomGrowthTimeAdapter;
import com.example.schoolkownclient.Entities.Circle;
import com.example.schoolkownclient.R;


import java.util.ArrayList;
import java.util.List;

public class GrowthActivity extends AppCompatActivity {

    private ListView mListView;
//    private List<String> mListBean;
    private CustomGrowthTimeAdapter mAdapter;
    private List<Circle> circles=new ArrayList<>();
    private ImageView publish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growth_line);
        mListView = (ListView) findViewById(R.id.list_time);
        publish=findViewById(R.id.growth_publish);
//        mListBean = new ArrayList();
//        for (int i = 0; i < 9; i++) {
//            mListBean.add("数据第" + i + "条");
//        }
        initCircles();
        mAdapter = new CustomGrowthTimeAdapter(circles,this,R.layout.activity_growth_listview_item);
        mListView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void initCircles(){
        Circle circle1=new Circle();
        circle1.setText("很好吃");
        circles.add(circle1);
//        Circle circle2=new Circle();
//        List<Bitmap> bitmaps=new ArrayList<>();
//        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
//        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
//        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
//        circle2.setBitmaps(bitmaps);
//        circles.add(circle2);
        Circle circle3=new Circle();
        circle3.setText("今天心情非常好");
        List<Bitmap> bitmaps1=new ArrayList<>();
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle3.setBitmaps(bitmaps1);
        circles.add(circle3);
    }

}
