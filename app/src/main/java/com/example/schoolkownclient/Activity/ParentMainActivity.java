package com.example.schoolkownclient.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTabHost;

import com.example.schoolkownclient.Activity.ParentFragment.CircleFragment;
import com.example.schoolkownclient.Activity.ParentFragment.HomeFragment;
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
        //Class参数：类名.class,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab1,
                HomeFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab2=fragmentTabHost.newTabSpec("circle_tab").setIndicator(getTabSpecView("circle_tab","圈子",R.drawable.circle));
        //Class参数：类名.class,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab2,
                CircleFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab3=fragmentTabHost.newTabSpec("location_tab").setIndicator(getTabSpecView("location_tab","定位",R.drawable.location));
        //Class参数：类名.class,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab3,
                ToastFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab4=fragmentTabHost.newTabSpec("toast_tab").setIndicator(getTabSpecView("toast_tab","通知",R.drawable.toast));
        //Class参数：类名.class,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab4,
                BuyerPersonalFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab5=fragmentTabHost.newTabSpec("buyer_person_tab").setIndicator(getTabSpecView("buyer_person_tab","我的中心",R.drawable.buyerpersonal1));
        //Class参数：类名.class,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab5,
                BuyerPersonalFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null

        //处理fragmentTabHost的选项切换事件
        fragmentTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                //修改图片和文字的颜色
                switch (tabId){
                    case "cookie_info_tab"://选中了菜系分类
                        imageIconViewMap.get("cookie_info_tab").setImageResource(R.drawable.cookieinfo2);
                        imageIconViewMap.get("cart_tab").setImageResource(R.drawable.cart1);
                        imageIconViewMap.get("buyer_person_tab").setImageResource(R.drawable.buyerpersonal1);
                        textViewMap.get("cookie_info_tab").setTextColor(getResources().getColor(R.color.colorBrown));
                        textViewMap.get("cart_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("buyer_person_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case "cart_tab":
                        imageIconViewMap.get("cookie_info_tab").setImageResource(R.drawable.cookieinfo1);
                        imageIconViewMap.get("cart_tab").setImageResource(R.drawable.cart2);
                        imageIconViewMap.get("buyer_person_tab").setImageResource(R.drawable.buyerpersonal1);
                        textViewMap.get("cookie_info_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("cart_tab").setTextColor(getResources().getColor(R.color.colorBrown));
                        textViewMap.get("buyer_person_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case "buyer_person_tab":
                        imageIconViewMap.get("cookie_info_tab").setImageResource(R.drawable.cookieinfo1);
                        imageIconViewMap.get("cart_tab").setImageResource(R.drawable.cart1);
                        imageIconViewMap.get("buyer_person_tab").setImageResource(R.drawable.buyerpersonal2);
                        textViewMap.get("cookie_info_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("cart_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("buyer_person_tab").setTextColor(getResources().getColor(R.color.colorBrown));
                        break;
                }
            }
        });
        //设置默认选中的标签页:参数是下标
        fragmentTabHost.setCurrentTab(0);
        imageIconViewMap.get("cookie_info_tab").setImageResource(R.drawable.cookieinfo2);
        textViewMap.get("cookie_info_tab").setTextColor(getResources().getColor(R.color.colorBrown));
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
