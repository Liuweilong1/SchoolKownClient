package com.example.schoolkownclient.Activity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import com.example.schoolkownclient.Activity.ParentFragment.CircleFragment;
import com.example.schoolkownclient.Activity.ParentFragment.HomeFragment;
import com.example.schoolkownclient.Activity.ParentFragment.LocationFragment;
import com.example.schoolkownclient.Activity.ParentFragment.PersonalFragment;
import com.example.schoolkownclient.Activity.ParentFragment.ToastFragment;
import com.example.schoolkownclient.R;

import java.util.HashMap;
import java.util.Map;


public class ParentMainActivity extends AppCompatActivity {
    private Map<String, ImageView> imageIconViewMap=new HashMap<>();//多页面图标
    private Map<String, TextView> textViewMap=new HashMap<>();//多页面图标文字
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_main);
        //获取FragmentHost的引用
        FragmentTabHost fragmentTabHost=findViewById(android.R.id.tabhost);
        //初始化
        fragmentTabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);
        //创建内容页面TabSpec对象
        TabHost.TabSpec tab1=fragmentTabHost.newTabSpec("home_tab").setIndicator(getTabSpecView("home_tab","首页",R.drawable.home));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab1,
                HomeFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab2=fragmentTabHost.newTabSpec("circle_tab").setIndicator(getTabSpecView("circle_tab","圈子",R.drawable.circle));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab2,
                CircleFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab3=fragmentTabHost.newTabSpec("location_tab").setIndicator(getTabSpecView("location_tab","定位",R.drawable.location));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab3,
                LocationFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab4=fragmentTabHost.newTabSpec("toast_tab").setIndicator(getTabSpecView("toast_tab","通知",R.drawable.toast));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab4,
                ToastFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab5=fragmentTabHost.newTabSpec("personal_tab").setIndicator(getTabSpecView("personal_tab","我的",R.drawable.person));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab5,
                PersonalFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null

        //处理fragmentTabHost的选项切换事件
        fragmentTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                //修改图片和文字的颜色
                switch (tabId){
                    case "home_tab"://选中了菜系分类
                        imageIconViewMap.get("home_tab").setImageResource(R.drawable.home1);
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.location);
                        imageIconViewMap.get("toast_tab").setImageResource(R.drawable.toast);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.person);
                        textViewMap.get("home_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("toast_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "circle_tab":
                        imageIconViewMap.get("home_tab").setImageResource(R.drawable.home);
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle1);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.location);
                        imageIconViewMap.get("toast_tab").setImageResource(R.drawable.toast);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.person);
                        textViewMap.get("home_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("toast_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "location_tab":
                        imageIconViewMap.get("home_tab").setImageResource(R.drawable.home);
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.location1);
                        imageIconViewMap.get("toast_tab").setImageResource(R.drawable.toast);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.person);
                        textViewMap.get("home_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("toast_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "toast_tab":
                        imageIconViewMap.get("home_tab").setImageResource(R.drawable.home);
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.location);
                        imageIconViewMap.get("toast_tab").setImageResource(R.drawable.toast1);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.person);
                        textViewMap.get("home_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("toast_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        break;
                    case "personal_tab":
                        imageIconViewMap.get("home_tab").setImageResource(R.drawable.home);
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.location);
                        imageIconViewMap.get("toast_tab").setImageResource(R.drawable.toast);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.person1);
                        textViewMap.get("home_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("toast_tab").setTextColor(getResources().getColor(R.color.colorBlack));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        break;
                }
            }
        });
        //设置默认选中的标签页:参数是下标
        fragmentTabHost.setCurrentTab(0);
        imageIconViewMap.get("home_tab").setImageResource(R.drawable.home1);
        textViewMap.get("home_tab").setTextColor(getResources().getColor(R.color.colorMain));
    }
    public View getTabSpecView(String tag, String title, int drawable){
        View view= getLayoutInflater().inflate(R.layout.tab_spec_layout,null);
        //获取tab_spec_layout布局当中视图控件的引用
        ImageView icon=view.findViewById(R.id.icon);
        icon.setImageResource(drawable);
        //将imageView对象存储在Map中
        imageIconViewMap.put(tag,icon);

        TextView tvTitle=view.findViewById(R.id.title);
        tvTitle.setText(title);
        textViewMap.put(tag,tvTitle);

        return view;
    }

}
