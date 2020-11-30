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

import com.example.schoolkownclient.Adapter.MyMessageAdapter.Mymessageadapter;
import com.example.schoolkownclient.Adapter.MyNotificationAdapter.Mynotificationadapter;
import com.example.schoolkownclient.Entities.MyMessage;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class MessageFragment extends Fragment {

    private List<MyMessage> myMessages = new ArrayList<>();
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        myMessages.clear();

        View view = inflater.inflate(R.layout.messagefragment,
                container,
                false);

        MyMessage myMessage1 = new MyMessage();
        myMessage1.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        myMessage1.setId(1);
        myMessage1.setName("太酷不给撩");
        myMessage1.setMescontent("hi");
        myMessage1.setTime("1分钟前");
        myMessages.add(myMessage1);

        MyMessage myMessage2 = new MyMessage();
        myMessage2.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        myMessage2.setId(1);
        myMessage2.setName("太酷不给撩");
        myMessage2.setMescontent("hi");
        myMessage2.setTime("11/25 12:00");
        myMessages.add(myMessage2);

        MyMessage myMessage3 = new MyMessage();
        myMessage3.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mynotification));
        myMessage3.setId(1);
        myMessage3.setName("太酷不给撩");
        myMessage3.setMescontent("hi");
        myMessage3.setTime("11/25 16:00");
        myMessages.add(myMessage3);

        listView=view.findViewById(R.id.mymeslist);

        Mymessageadapter mymessageadapter = new Mymessageadapter(getContext(),R.layout.listview_message_item,myMessages);
        listView.setAdapter(mymessageadapter);

        return view;
    }
}
