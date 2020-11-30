package com.example.schoolkownclient.Adapter.recipeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Dish;
import com.example.schoolkownclient.Entities.ListViewHeight;
import com.example.schoolkownclient.Entities.Menu;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class CustomMenuTypeAdapter extends BaseAdapter {
    private Context context;
    private int res;
    private List<Menu> menus=new ArrayList<>();
    private List<Dish> dishes=new ArrayList<>();


    public CustomMenuTypeAdapter(Context context, int res, List<Menu> menus, List<Dish> dishes) {
        this.context = context;
        this.res = res;
        this.menus = menus;
        this.dishes=dishes;
    }

    @Override
    public int getCount() {
        if (menus != null) {
            return menus.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (menus != null) {
            return menus.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局文件
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(res, null);
        ImageView imageView=convertView.findViewById(R.id.menu_img);
        TextView menuName=convertView.findViewById(R.id.menu_name);
        ListView listView=convertView.findViewById(R.id.menuType_listview);
        listView.setDividerHeight(0);
        imageView.setImageBitmap(menus.get(position).getTypeBitmap());
        menuName.setText(menus.get(position).getMenuType());
//        initDishes();
        CustomDishTypeAdapter customDishTypeAdapter=new CustomDishTypeAdapter(context,R.layout.listview_dish_item,menus.get(position).getDishes());
        listView.setAdapter(customDishTypeAdapter);
        ListViewHeight.setListViewHeightBasedOnChildren(listView);
        return convertView;
    }
//    public void initDishes(){
//        Dish dish1=new Dish();
//        dish1.setId(1);
//        dish1.setName("牛奶");
//        dish1.setStandards("100ml");
//        dish1.setMenuType("早餐");
//        dish1.setDishBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.milk));
//        dishes.add(dish1);
//        Dish dish2=new Dish();
//        dish2.setId(2);
//        dish2.setName("曲奇饼");
//        dish2.setStandards("5块");
//        dish2.setMenuType("早餐");
//        dish2.setDishBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.cookie));
//        dishes.add(dish2);
//        Dish dish3=new Dish();
//        dish3.setId(3);
//        dish3.setName("西红柿炒鸡蛋");
//        dish3.setStandards("一碗");
//        dish3.setMenuType("午餐");
//        dish3.setDishBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.tomato));
//        dishes.add(dish3);
//        Dish dish4=new Dish();
//        dish4.setId(4);
//        dish4.setName("馒头");
//        dish4.setStandards("1个");
//        dish4.setMenuType("午餐");
//        dish4.setDishBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.bread));
//        dishes.add(dish4);
//        Dish dish5=new Dish();
//        dish5.setId(5);
//        dish5.setName("米饭");
//        dish5.setStandards("一碗");
//        dish5.setMenuType("晚餐");
//        dish5.setDishBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.rice));
//        dishes.add(dish5);
//        Dish dish6=new Dish();
//        dish6.setId(6);
//        dish6.setName("八宝粥");
//        dish6.setStandards("300ml");
//        dish6.setMenuType("晚餐");
//        dish6.setDishBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.porridge));
//        dishes.add(dish6);
//        Dish dish7=new Dish();
//        dish7.setId(7);
//        dish7.setName("水果");
//        dish7.setStandards("2个");
//        dish7.setMenuType("晚餐");
//        dish7.setDishBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.fruit));
//        dishes.add(dish7);
//
//    }
}
