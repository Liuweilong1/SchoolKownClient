package com.example.schoolkownclient.Activity.SmallActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.Entities.CircularProgressView;
import com.example.schoolkownclient.R;


import java.text.NumberFormat;

public class AttendActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);

        //获取控件
        CircularProgressView circularProgressView=findViewById(R.id.attend_circle_view);
        TextView rate=findViewById(R.id.attend_rate);
        TextView should=findViewById(R.id.should_arrive);
        TextView come= findViewById(R.id.come_arrive);
        int shouldArrive=100;
        int comeTrue=60;// 创建一个数值bai格式化对象du  
        should.setText(shouldArrive+"人");
        come.setText(comeTrue+"人");
        NumberFormat numberFormat= NumberFormat.getInstance();
        // 设置精确到小数点后2位  
        numberFormat.setMaximumFractionDigits(2);
        String result=numberFormat.format((float)comeTrue/(float)shouldArrive*100);
        rate.setText(result);
        circularProgressView.setProgress(comeTrue,10000);
//        int[] colors=new int[7];
//        colors[0]=R.color.colorAccent;
//        colors[1]=R.color.colorPrimary;
//        colors[2]=R.color.colorPrimaryDark;
//        colors[3]=R.color.colorMain;
//        colors[4]=R.color.colorMainLight;
//        colors[5]=R.color.color_28d19d;
//        colors[6]=R.color.color_000000;
//        circularProgressView.setProgColor(colors);

    }
}
