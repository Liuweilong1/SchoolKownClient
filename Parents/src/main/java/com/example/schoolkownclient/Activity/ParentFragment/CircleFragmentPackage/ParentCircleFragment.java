package com.example.schoolkownclient.Activity.ParentFragment.CircleFragmentPackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import com.example.schoolkownclient.Adapter.CircleAdapter.CustomCommentAdapter;
import com.example.schoolkownclient.Entities.Circle;
import com.example.schoolkownclient.Entities.Comment;
import com.example.schoolkownclient.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class ParentCircleFragment extends Fragment {
    private View view;
    private ListView listView;
    private List<Comment> comments=new ArrayList<>();
    private List<Circle> circles=new ArrayList<>();
    private LinearLayout root;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_circle_parent, container, false);
            //获取控件
            listView=view.findViewById(R.id.listview_circleparent);
            root=view.findViewById(R.id.parent_circle_root);
            initCircles();
            CustomCircleAdapter customCircleAdapter=new CustomCircleAdapter(getContext(),R.layout.listview_circle_item,circles);
            listView.setAdapter(customCircleAdapter);
        }
        return view;
    }
    //处理事件的方法
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateUI(String msg){
        //threadMode = ThreadMode.MAIN在主线程执行
        if (msg.equals("forward")) {
            showForwardPopupWindow();
        }else if(msg.equals("comment")){
            showCommentPopupWindow();
        }
    }
    @Override
    public void onStart() {
        super.onStart();
        if(!EventBus.getDefault().isRegistered(this)){//加上判断
            EventBus.getDefault().register(this);
        }
    }
    public void initCircles(){
        Circle circle1=new Circle();
        circle1.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle1.setName("张晓华的爸爸");
        circle1.setTime("2020/11/24 11:01");
        circle1.setText("我是憨憨我是憨憨我是憨憨我是憨憨我是憨憨我是憨憨我是憨憨");
        circle1.setThumsupNum(28);
        circles.add(circle1);
        Circle circle2=new Circle();
        circle2.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle2.setName("哆唻的妈妈");
        List<Bitmap> bitmaps=new ArrayList<>();
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.ability1));
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.ability2));
        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.ability3));
        circle2.setTime("2019/11/24 12:01");
        circle2.setBitmaps(bitmaps);
        circle2.setThumsupNum(11);
        circles.add(circle2);
        Circle circle3=new Circle();
        circle3.setHeadBitMap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        circle3.setName("狗哥的爷爷");
        circle3.setTime("2028/11/24 09:01");
        circle3.setText("干就完了");
        List<Bitmap> bitmaps1=new ArrayList<>();
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.article1));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.article3));
        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.xiaoxiong));
        circle3.setThumsupNum(33);
        circle3.setBitmaps(bitmaps1);
        circles.add(circle3);
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
    private void showCommentPopupWindow(){
        //设置它的视图
        View view2=getLayoutInflater().inflate(R.layout.commentpopupwindow,null);
        //创建PopupWindow对象
        final PopupWindow popupWindow=new PopupWindow(view2, LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT,true);
        //设置弹出窗口的宽度
        popupWindow.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        //设置视图当中控件的属性和监听器
        //获取控件
        ListView listView=view2.findViewById(R.id.listview_comment);
        ImageView close=view2.findViewById(R.id.close_comment);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        initComments();
        CustomCommentAdapter customCommentAdapter=new CustomCommentAdapter(getContext(),R.layout.listview_comment_item,comments);
        listView.setAdapter(customCommentAdapter);
        popupWindow.setContentView(view2);

        popupWindow.setFocusable(true);
// 该属性设置为true则你在点击屏幕的空白位置也会退出

        popupWindow.setTouchable(true);

        popupWindow.setOutsideTouchable(true);
        //显示PopupWindow(必须指定显示的位置)
        popupWindow.showAtLocation(root, Gravity.CENTER,0,0);
//        popupWindow.showAsDropDown(btnPop);  //将试图显示在某个控件的下方
    }
    public void initComments(){
        Comment comment1=new Comment();
        comment1.setHeadBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        comment1.setName("用户1");
        comment1.setContext("这是评论1...");
        comment1.setTime("2009/12/12 22:34");
        comments.add(comment1);
        Comment comment2=new Comment();
        comment2.setHeadBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        comment2.setName("用户2");
        comment2.setContext("这是评论2...");
        comment2.setTime("2020/11/25 13:34");
        comments.add(comment2);
        Comment comment3=new Comment();
        comment3.setHeadBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        comment3.setName("用户3");
        comment3.setContext("这是评论3...");
        comment3.setTime("2022/01/12 02:48");
        comments.add(comment3);
        Comment comment4=new Comment();
        comment4.setHeadBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        comment4.setName("用户4");
        comment4.setContext("这是评论4...");
        comment4.setTime("2022/01/12 02:48");
        comments.add(comment4);
        Comment comment5=new Comment();
        comment5.setHeadBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.head));
        comment5.setName("用户5");
        comment5.setContext("这是评论5...");
        comment5.setTime("2022/01/12 02:48");
        comments.add(comment5);
    }

}
