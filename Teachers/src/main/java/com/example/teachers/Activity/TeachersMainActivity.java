package com.example.teachers.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.teachers.Activity.TeacherFragment.CircleFragment;
import com.example.teachers.Activity.TeacherFragment.LocationFragment;
import com.example.teachers.Activity.TeacherFragment.ManageFragment;
import com.example.teachers.Activity.TeacherFragment.PersonalFragment;
import com.example.teachers.R;

import java.util.HashMap;
import java.util.Map;

public class TeachersMainActivity extends AppCompatActivity {
    private Map<String, ImageView> imageIconViewMap=new HashMap<>();//多页面图标
    private Map<String, TextView> textViewMap=new HashMap<>();//多页面图标文字
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_main);
        //获取FragmentHost的引用
        FragmentTabHost fragmentTabHost=findViewById(android.R.id.tabhost);
        //初始化
        fragmentTabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);
        //创建内容页面TabSpec对象
        TabHost.TabSpec tab1=fragmentTabHost.newTabSpec("circle_tab").setIndicator(getTabSpecView("circle_tab","圈子",R.drawable.circle));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab1,
                CircleFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab2=fragmentTabHost.newTabSpec("news_tab").setIndicator(getTabSpecView("news_tab","消息",R.drawable.news));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab2,
                CircleFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab3=fragmentTabHost.newTabSpec("manage_tab").setIndicator(getTabSpecView("manage_tab","管理",R.drawable.manage));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab3,
                ManageFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab4=fragmentTabHost.newTabSpec("location_tab").setIndicator(getTabSpecView("location_tab","定位",R.drawable.bus));
        //Class参数：类名.class1,对象.getClass()，Class.forName()
        fragmentTabHost.addTab(tab4,
                LocationFragment.class,//FirstFragment类的class对象
                null);//传递数据时使用，不需要传递数据直接传null
        TabHost.TabSpec tab5=fragmentTabHost.newTabSpec("personal_tab").setIndicator(getTabSpecView("personal_tab","我的",R.drawable.personal));
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
                    case "circle_tab"://选中了菜系分类
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle1);
                        imageIconViewMap.get("news_tab").setImageResource(R.drawable.news);
                        imageIconViewMap.get("manage_tab").setImageResource(R.drawable.manage);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.bus);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.personal);
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("news_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("manage_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case "news_tab":
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("news_tab").setImageResource(R.drawable.news1);
                        imageIconViewMap.get("manage_tab").setImageResource(R.drawable.manage);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.bus);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.personal);
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("news_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("manage_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case "manage_tab":
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("news_tab").setImageResource(R.drawable.news);
                        imageIconViewMap.get("manage_tab").setImageResource(R.drawable.manage1);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.bus);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.personal);
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("news_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("manage_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case "location_tab":
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("news_tab").setImageResource(R.drawable.news);
                        imageIconViewMap.get("manage_tab").setImageResource(R.drawable.manage);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.bus1);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.personal);
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("news_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("manage_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case "personal_tab":
                        imageIconViewMap.get("circle_tab").setImageResource(R.drawable.circle);
                        imageIconViewMap.get("news_tab").setImageResource(R.drawable.news);
                        imageIconViewMap.get("manage_tab").setImageResource(R.drawable.manage);
                        imageIconViewMap.get("location_tab").setImageResource(R.drawable.bus);
                        imageIconViewMap.get("personal_tab").setImageResource(R.drawable.personal1);
                        textViewMap.get("circle_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("news_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("manage_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("location_tab").setTextColor(getResources().getColor(R.color.colorGrey));
                        textViewMap.get("personal_tab").setTextColor(getResources().getColor(R.color.colorMain));
                        break;
                }
            }
        });
        //设置默认选中的标签页:参数是下标
        fragmentTabHost.setCurrentTab(2);
        imageIconViewMap.get("manage_tab").setImageResource(R.drawable.manage1);
        textViewMap.get("manage_tab").setTextColor(getResources().getColor(R.color.colorMain));
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
