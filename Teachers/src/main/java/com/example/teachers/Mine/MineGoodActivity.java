package com.example.teachers.Mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;


import com.example.teachers.Mine.Fragment.FirstFragment;
import com.example.teachers.Mine.Fragment.SecondFragment;
import com.example.teachers.R;

import java.util.HashMap;
import java.util.Map;

public class MineGoodActivity extends AppCompatActivity {

    private ImageView ivBlue;
    private Map<String, ImageView> imageViewMap=new HashMap<>();
    private Map<String, TextView> textViewMap = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_good);

        FragmentTabHost fragmentTabHost = findViewById(android.R.id.tabhost);

        fragmentTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        TabHost.TabSpec tab1 = fragmentTabHost.newTabSpec("tab1")
                .setIndicator(getTabSpecView("tab1","谁赞了我",R.drawable.mine_good_purpre));
        fragmentTabHost.addTab(tab1, FirstFragment.class, null);


        TabHost.TabSpec tab2 = fragmentTabHost.newTabSpec("tab2")
                .setIndicator(getTabSpecView("tab2","我赞了谁",R.drawable.mine_good_gray));
        fragmentTabHost.addTab(tab2, SecondFragment.class, null);

        fragmentTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                switch (tabId){
                    case "tab1":
                        textViewMap.get("tab1").setTextColor(getResources().getColor(R.color.mainColor_deep));
                        textViewMap.get("tab2").setTextColor(getResources().getColor(R.color.black));
                        imageViewMap.get("tab1").setImageResource(R.drawable.mine_good_purpre);
                        imageViewMap.get("tab2").setImageResource(R.drawable.mine_good_gray);
                        break;
                    case "tab2":
                        textViewMap.get("tab1").setTextColor(getResources().getColor(R.color.black));
                        textViewMap.get("tab2").setTextColor(getResources().getColor(R.color.mainColor_deep));
                        imageViewMap.get("tab1").setImageResource(R.drawable.mine_good_gray);
                        imageViewMap.get("tab2").setImageResource(R.drawable.mine_good_purpre);
                        break;
                }
            }
        });

        fragmentTabHost.setCurrentTab(0);
        textViewMap.get("tab1").setTextColor(getResources().getColor(R.color.mainColor_deep));
        imageViewMap.get("tab1").setImageResource(R.drawable.mine_good_purpre);
    }

    public View getTabSpecView(String tag,String title,int drawable){
        View view = getLayoutInflater().inflate(R.layout.activity_mine_good_tab_spec_layout,null);

        ImageView ivBlue=view.findViewById(R.id.iv_blue);
        ivBlue.setImageResource(drawable);
        //将imageView对象存储在Map中
        imageViewMap.put(tag,ivBlue);


        TextView tvTitle = view.findViewById(R.id.tv_title);
        tvTitle.setText(title);
        textViewMap.put(tag,tvTitle);

        return view;
    }
}
