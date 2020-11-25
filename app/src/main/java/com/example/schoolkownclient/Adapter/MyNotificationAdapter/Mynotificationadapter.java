package com.example.schoolkownclient.Adapter.MyNotificationAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.MyNotification;
import com.example.schoolkownclient.R;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;

import java.util.ArrayList;
import java.util.List;

public class Mynotificationadapter extends BaseAdapter {

    private Context context;
    private int res;
    private List<MyNotification> myNotifications = new ArrayList<>();

    public Mynotificationadapter(Context context, int res, List<MyNotification> myNotifications) {
        this.context = context;
        this.res = res;
        this.myNotifications = myNotifications;
    }

    @Override
    public int getCount() {
        if(myNotifications!=null){
            return myNotifications.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(myNotifications!= null){
            return myNotifications.get(i);
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertview, ViewGroup viewGroup) {
        //加载布局文件
        LayoutInflater inflater = LayoutInflater.from(context);
        convertview = inflater.inflate(res,null);

        ViewHolder viewHolder = new ViewHolder();
        viewHolder.linearLayout = convertview.findViewById(R.id.notilinear);
        viewHolder.button = convertview.findViewById(R.id.tv_usb_delete);
        viewHolder.swipeMenuLayout = convertview.findViewById(R.id.swipeMenuLayout);
        convertview.setTag(viewHolder);

        ImageView imageView = convertview.findViewById(R.id.mynoimg);
        TextView title = convertview.findViewById(R.id.mynotitle);
        TextView content = convertview.findViewById(R.id.mynocontent);
        TextView time = convertview.findViewById(R.id.mynotime);

        imageView.setImageBitmap(myNotifications.get(i).getBitmap());
        title.setText(myNotifications.get(i).getName());
        content.setText(myNotifications.get(i).getNoticontent());
        time.setText(myNotifications.get(i).getTime());

        //点击事件
        final ViewHolder  finalViewHolder= viewHolder;
        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              删除list中对应的数据
                myNotifications.remove(i);
//              重新绑定数据
                notifyDataSetChanged();
//              关闭侧滑菜单
                finalViewHolder.swipeMenuLayout.quickClose();
            }
        });

        return convertview;
    }

    class ViewHolder{
        SwipeMenuLayout swipeMenuLayout;
        LinearLayout linearLayout;
        Button button;
    }
}
