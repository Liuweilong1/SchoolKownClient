package com.example.schoolkownclient.Adapter.MyMessageAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.MyMessage;
import com.example.schoolkownclient.R;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;

import java.util.ArrayList;
import java.util.List;

public class Mymessageadapter extends BaseAdapter {

    private Context context;
    private int res;
    private List<MyMessage> myMessages = new ArrayList<>();

    public Mymessageadapter(Context context, int res, List<MyMessage> myMessages) {
        this.context = context;
        this.res = res;
        this.myMessages = myMessages;
    }

    @Override
    public int getCount() {
        if(myMessages!=null){
            return myMessages.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if(myMessages!= null){
            return myMessages.get(i);
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
        viewHolder.linearLayout = convertview.findViewById(R.id.messageliear);
        viewHolder.button = convertview.findViewById(R.id.tv_mes_delete);
        viewHolder.swipeMenuLayout = convertview.findViewById(R.id.swipmenulayoutmessage);
        convertview.setTag(viewHolder);

        ImageView imageView = convertview.findViewById(R.id.mymesimg);
        TextView title = convertview.findViewById(R.id.mymestitle);
        TextView content = convertview.findViewById(R.id.mymescontent);
        TextView time = convertview.findViewById(R.id.mymestime);

        imageView.setImageBitmap(myMessages.get(i).getBitmap());
        title.setText(myMessages.get(i).getName());
        content.setText(myMessages.get(i).getMescontent());
        time.setText(myMessages.get(i).getTime());

        //点击事件
        final ViewHolder finalViewHolder= viewHolder;
        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              删除list中对应的数据
                myMessages.remove(i);
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
