package com.example.schoolkownclient.Adapter.GrowthAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Circle;
import com.example.schoolkownclient.Entities.ListViewHeight;
import com.example.schoolkownclient.R;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomGrowthTimeAdapter extends BaseAdapter {
//    private List<String> mList;
    private Context mContext;
    private int res;
    private List<Circle> circles=new ArrayList<>();
    private int height;


    public CustomGrowthTimeAdapter(List<Circle> circles, Context mContext, int res) {
        this.circles = circles;
        this.mContext = mContext;
        this.res = res;
    }

    @Override
    public int getCount() {
        if (circles != null) {
            return circles.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (circles != null) {
            return circles.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        LayoutParams lp;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(mContext, res, null);
            holder.time = (TextView) convertView.findViewById(R.id.time_tv);
            holder.msg = (TextView) convertView.findViewById(R.id.msg_tv);
            holder.up = (View) convertView.findViewById(R.id.line_up);
            holder.down = (View) convertView.findViewById(R.id.line_dowm);
            holder.quan = (ImageView) convertView.findViewById(R.id.quan);
            holder.listView=convertView.findViewById(R.id.growth_listview);
//            setViewLayoutParams(holder.down,20,1000);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        CustomGrowthListAdapter customGrowthListAdapter =new CustomGrowthListAdapter(mContext, R.layout.listview_growth_item,circles);
        holder.listView.setAdapter(customGrowthListAdapter);
        height= ListViewHeight.setListViewHeightBasedOnChildrenTwo(holder.listView);
        System.out.println(height);
        customGrowthListAdapter.notifyDataSetChanged();
        if (position == 0) {//第一条隐藏上边的线
            holder.up.setVisibility(View.INVISIBLE);
            setViewLayoutParams(holder.down,20,height+700);
//            setViewLayoutParams(holder.up,20,10);
        } else if (position == circles.size() - 1) {//最后一条影藏下边的线
            holder.down.setVisibility(View.VISIBLE);
        } else {
            holder.up.setVisibility(View.VISIBLE);
//            setViewLayoutParams(holder.up,20,10);
            holder.down.setVisibility(View.VISIBLE);
            setViewLayoutParams(holder.down,20,height+700);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd hh:mm:ss");
        String time = simpleDateFormat.format(new Date(System.currentTimeMillis()));
//        String msg = mList.get(position);
        holder.time.setText(time);
        holder.msg.setText("这是第"+position+"条数据");

//        initCircles();

        return convertView;
    }


    private static class ViewHolder {
        private TextView time;
        private TextView msg;
        private View up;
        private View down;
        private ImageView quan;
        private ListView listView;


    }
    /**
     * 重设 view 的宽高
     */
    public static void setViewLayoutParams(View view, int nWidth, int nHeight) {
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        if (lp.height != nHeight || lp.width != nWidth) {
            lp.width = nWidth;
            lp.height = nHeight;
            view.setLayoutParams(lp);
        }
    }
//    public void initCircles(){
////        Circle circle1=new Circle();
////        circle1.setText("很好吃");
////        circles.add(circle1);
////        Circle circle2=new Circle();
////        List<Bitmap> bitmaps=new ArrayList<>();
////        bitmaps.add(BitmapFactory.decodeResource(,R.drawable.head));
////        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
////        bitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
////        circle2.setBitmaps(bitmaps);
////        circles.add(circle2);
//        Circle circle3=new Circle();
//        circle3.setText("今天心情非常好");
////        List<Bitmap> bitmaps1=new ArrayList<>();
////        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
////        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
////        bitmaps1.add(BitmapFactory.decodeResource(getResources(),R.drawable.head));
////        circle3.setBitmaps(bitmaps1);
//        circles.add(circle3);
//    }

}
