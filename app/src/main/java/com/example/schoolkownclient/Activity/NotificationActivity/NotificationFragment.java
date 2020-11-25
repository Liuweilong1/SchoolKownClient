package com.example.schoolkownclient.Activity.NotificationActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.schoolkownclient.Adapter.MyNotificationAdapter.Mynotificationadapter;
import com.example.schoolkownclient.Entities.MyNotification;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {

    private List<MyNotification> myNotifications = new ArrayList<>();
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        myNotifications.clear();
        View view = inflater.inflate(R.layout.notificationfagment,
                container,
                false);


        MyNotification myNotification = new MyNotification();
        myNotification.setId(1);
        myNotification.setName("学校通知");
        myNotification.setNoticontent("已放学");
        myNotification.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        myNotification.setTime("12:00");
        myNotifications.add(myNotification);

        MyNotification myNotification1 = new MyNotification();
        myNotification1.setId(2);
        myNotification1.setName("学校通知");
        myNotification1.setNoticontent("已放学");
        myNotification1.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        myNotification1.setTime("11/25 12:00");
        myNotifications.add(myNotification1);

        MyNotification myNotification2 = new MyNotification();
        myNotification2.setId(3);
        myNotification2.setName("学校通知");
        myNotification2.setNoticontent("已放学");
        myNotification2.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        myNotification2.setTime("11/25 12:00");
        myNotifications.add(myNotification2);


        listView=view.findViewById(R.id.mynolist);

        Mynotificationadapter mynotificationadapter=new Mynotificationadapter(getContext(),R.layout.listview_notification_item,myNotifications);
        listView.setAdapter(mynotificationadapter);


        return view;
    }
}
