package com.example.schoolkownclient.Activity.NotificationActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.schoolkownclient.R;

import java.util.HashMap;
import java.util.Map;

public class NotActivity extends AppCompatActivity {

    private Map<String, ImageView> imageViewMap = new HashMap<>();
    private Map<String, TextView> textViewMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not);

        FragmentTabHost fragmentTabHost = findViewById(android.R.id.tabhost);

        fragmentTabHost.setup(this,
                getSupportFragmentManager(),
                android.R.id.tabcontent);

        TabHost.TabSpec tab1 = fragmentTabHost.newTabSpec("first_tab")
                .setIndicator(getTabSpecView("first_tab","通知",R.drawable.not1));

//        fragmentTabHost.addTab(tab1,);
    }

    public View getTabSpecView(String tag, String tiltle, int drawable){
        View view = getLayoutInflater().inflate(R.layout.nottab_spec,null);

        ImageView icon = view.findViewById(R.id.noticon);
        icon.setImageResource(drawable);
        imageViewMap.put(tag,icon);

        TextView textView = view.findViewById(R.id.nottiltle);
        textView.setText(tiltle);
        textViewMap.put(tag,textView);

        return view;
    }
}
