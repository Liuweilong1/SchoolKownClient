package com.example.schoolkownclient.Adapter.SchoolActivitiesAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Activities;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class ActivityAdapter extends BaseAdapter {

    private Context mContext;
    private List<Activities> activitiess=new ArrayList<>();
    private int itemLayoutRes;

    public ActivityAdapter(Context mContext, List<Activities> activitiess, int itemLayoutRes) {
        this.mContext = mContext;
        this.activitiess = activitiess;
        this.itemLayoutRes = itemLayoutRes;
    }

    @Override
    public int getCount() {
        if(null!=activitiess){
            return activitiess.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(null!=activitiess){
            return activitiess.get(i);
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //加载item的布局文件
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.activity_main_activities_item, null);

        //获取item控件的引用
        ImageView ivPhoto = view.findViewById(R.id.iv_activity);
        TextView tvTitle = view.findViewById(R.id.tv_title);
        TextView tvTime = view.findViewById(R.id.tv_time);
        ImageView ivType = view.findViewById(R.id.iv_type);
        TextView tvState = view.findViewById(R.id.tv_state);

        //设置控件内容
        ivPhoto.setImageResource(activitiess.get(i).getPhoto());
        tvTitle.setText(activitiess.get(i).getTitle());
        tvTime.setText(activitiess.get(i).getTime());
        ivType.setImageResource(activitiess.get(i).getType());
        tvState.setText(activitiess.get(i).getState());

        return view;
    }
}
