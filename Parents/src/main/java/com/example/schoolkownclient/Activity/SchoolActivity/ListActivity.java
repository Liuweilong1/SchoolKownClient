package com.example.schoolkownclient.Activity.SchoolActivity;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.Adapter.SchoolActivitiesAdapter.ActivityAdapter;
import com.example.schoolkownclient.Entities.Activities;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private List<Activities> activitiess = new ArrayList<>();
    private ListView activityListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activities);

        //1.准备数据源
        initDate();
        //2.准备item的布局文件

        //3.选择一种Adapter,绑定Adapter
        ActivityAdapter activityAdapter = new ActivityAdapter(this,activitiess,R.layout.activity_main_activities_item);
        activityListView = findViewById(R.id.lv_activity);
        activityListView.setAdapter(activityAdapter);
        //4.给ListView设置item点击事件的监听器
        activityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.setClass(ListActivity.this,ListDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    public void initDate(){
        Activities activities = new Activities();
        activities.setTitle("暑假已到，跟同学们一起逛馆，你还等什么");
        activities.setTime("2020/7/01-2020/7/12");
        activities.setState("待参加");
        activities.setPhoto(R.drawable.saphoto);
        activities.setType(R.drawable.flag);

        activitiess.add(activities);
    }
}
