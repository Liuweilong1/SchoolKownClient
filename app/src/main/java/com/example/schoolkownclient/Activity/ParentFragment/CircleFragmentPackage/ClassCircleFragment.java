package com.example.schoolkownclient.Activity.ParentFragment.CircleFragmentPackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.schoolkownclient.Adapter.CircleAdapter.CustomCircleAdapter;
import com.example.schoolkownclient.Entities.Circle;
import com.example.schoolkownclient.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class ClassCircleFragment extends Fragment {
    private View view;
    private ListView listView;
    private List<Circle> circles=new ArrayList<>();
    private LinearLayout root;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_circle_class, container, false);
            //获取控件
            listView=view.findViewById(R.id.listview_circleclass);
            root=view.findViewById(R.id.class_circle_root);
            initCircles();
            CustomCircleAdapter customCircleAdapter=new CustomCircleAdapter(getContext(),R.layout.listview_circle_item,circles);
            listView.setAdapter(customCircleAdapter);

        }
        return view;
    }
    public void initCircles(){
        Circle circle1=new Circle();
        circle1.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle1.setName("打酱油的憨憨");
        circle1.setTime("2020/11/24 11:01");
        circle1.setText("很好吃很好吃很好吃很好吃很好吃很好吃很好吃很好吃很好吃很好吃");
        circle1.setThumsupNum(28);
        circles.add(circle1);
        Circle circle2=new Circle();
        circle2.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle2.setName("小明");
        List<Bitmap> bitmaps=new ArrayList<>();
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.huanlesong));
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.meidaodao));
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.mochabaojiangdangao));
        circle2.setTime("2019/11/24 12:01");
        circle2.setBitmaps(bitmaps);
        circle2.setThumsupNum(11);
        circles.add(circle2);
        Circle circle3=new Circle();
        circle3.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle3.setName("我是彭于晏");
        circle3.setTime("2028/11/24 09:01");
        circle3.setText("今天心情非常好");
        List<Bitmap> bitmaps1=new ArrayList<>();
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.motianlun));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.sichongzou));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.xiaoxiong));
        circle3.setThumsupNum(33);
        circle3.setBitmaps(bitmaps1);
        circles.add(circle3);
    }
    //处理事件的方法
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateUI(String msg){
        //threadMode = ThreadMode.MAIN在主线程执行
        if (msg.equals("forward")) {
            showForwardPopupWindow();
        }
    }
    @Override
    public void onStart() {
        super.onStart();
        if(!EventBus.getDefault().isRegistered(this)){//加上判断
            EventBus.getDefault().register(this);
        }
    }
    private void showForwardPopupWindow(){
        //设置它的视图
        View view1=getLayoutInflater().inflate(R.layout.forwardpopupwindow,null);
        ImageView close=view1.findViewById(R.id.pop_forward_close);

        //创建PopupWindow对象
        final PopupWindow popupWindow=new PopupWindow(view1, LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT,true);
        //设置弹出窗口的宽度
//        popupWindow.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);

//        popupWindow.setFocusable(true);
//        popupWindow.setOutsideTouchable(true);

        //设置视图当中控件的属性和监听器
        popupWindow.setContentView(view1);
        //显示PopupWindow(必须指定显示的位置)
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        popupWindow.showAtLocation(root, Gravity.CENTER,0,0);
//        popupWindow.showAsDropDown(btnPop);  //将试图显示在某个控件的下方
    }

}
