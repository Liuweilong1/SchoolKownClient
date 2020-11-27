package com.example.schoolkownclient.Activity.SmallActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.schoolkownclient.Adapter.recipeAdapter.CustomMenuTypeAdapter;
import com.example.schoolkownclient.Entities.Dish;
import com.example.schoolkownclient.Entities.ListViewHeight;
import com.example.schoolkownclient.Entities.Menu;
import com.example.schoolkownclient.Entities.MyGridView;
import com.example.schoolkownclient.R;
import com.example.schoolkownclient.recipe.view.DataView;

import java.util.ArrayList;
import java.util.List;


/**
 * author：Administrator on 2017/4/10 16:03
 * description:文件说明
 * version:版本
 */
public class RecipeActivity extends FragmentActivity {
    private DataView dataView ;
    private TextView info ;
    private ListView listView;
    private MyGridView gridView;
    private List<Menu> menus=new ArrayList<>();
    private List<Dish> dishes=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        info = (TextView) findViewById(R.id.info);
        dataView = (DataView) findViewById(R.id.week);
        listView=findViewById(R.id.recipe_listview);
        initMenus();
        initDishes();
        CustomMenuTypeAdapter customMenuTypeAdapter=new CustomMenuTypeAdapter(this,R.layout.listview_menu_item,menus,dishes);
        listView.setAdapter(customMenuTypeAdapter);
        ListViewHeight.setListViewHeightBasedOnChildren(listView);
//        gridView=findViewById(R.id.recipe_gridview);
//        CustomDishPictureAdapter customDishPictureAdapter=new CustomDishPictureAdapter(this,R.layout.gridview_menu_item,dishes);
//        gridView.setAdapter(customDishPictureAdapter);
//        dataView.setOnSelectListener(new DataView.OnSelectListener() {
//            @Override
//            public void onSelected(DateEntity date) {
//                info.setText("日期："+ date.date+"\n"+
//                        "周几："+ date.weekName+"\n"+
//                        "今日："+ date.isToday+"\n"+
//                        "时间戳："+ date.million+"\n");
//                Log.e("wenzhiao--------------",date.toString());
//            }
//        });
        dataView.getData("2020-11-27");
    }
    public void initMenus(){
        Menu menu1=new Menu();
        menu1.setId(1);
        menu1.setMenuType("早餐");
        menu1.setTypeBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.breakfast));
        List<Dish> dishes=new ArrayList<>();
        Dish dish1=new Dish();
        dish1.setId(1);
        dish1.setName("牛奶");
        dish1.setStandards("100ml");
        dish1.setMenuType("早餐");
        dish1.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.milk));
        dishes.add(dish1);
        Dish dish2=new Dish();
        dish2.setId(2);
        dish2.setName("曲奇饼");
        dish2.setStandards("5块");
        dish2.setMenuType("早餐");
        dish2.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.cookie));
        dishes.add(dish2);
        menu1.setDishes(dishes);
        menus.add(menu1);
        Menu menu2=new Menu();
        menu2.setId(2);
        menu2.setMenuType("午餐");
        menu2.setTypeBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.lunch));

        List<Dish> dishes1=new ArrayList<>();
        Dish dish3=new Dish();
        dish3.setId(3);
        dish3.setName("西红柿炒鸡蛋");
        dish3.setStandards("一碗");
        dish3.setMenuType("午餐");
        dish3.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.tomato));
        dishes1.add(dish3);
        Dish dish4=new Dish();
        dish4.setId(4);
        dish4.setName("馒头");
        dish4.setStandards("1个");
        dish4.setMenuType("午餐");
        dish4.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bread));
        dishes1.add(dish4);
        menu2.setDishes(dishes1);
        menus.add(menu2);

        Menu menu3=new Menu();
        menu3.setId(3);
        menu3.setMenuType("晚餐");
        menu3.setTypeBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.dinner));
        List<Dish> dishes2=new ArrayList<>();

        Dish dish5=new Dish();
        dish5.setId(5);
        dish5.setName("米饭");
        dish5.setStandards("一碗");
        dish5.setMenuType("晚餐");
        dish5.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.rice));
        dishes2.add(dish5);
        Dish dish6=new Dish();
        dish6.setId(6);
        dish6.setName("八宝粥");
        dish6.setStandards("300ml");
        dish6.setMenuType("晚餐");
        dish6.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.porridge));
        dishes2.add(dish6);
        Dish dish7=new Dish();
        dish7.setId(7);
        dish7.setName("水果");
        dish7.setStandards("2个");
        dish7.setMenuType("晚餐");
        dish7.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.fruit));
        dishes2.add(dish7);
        menu3.setDishes(dishes2);
        menus.add(menu3);
    }
    public void initDishes(){
        Dish dish1=new Dish();
        dish1.setId(1);
        dish1.setName("牛奶");
        dish1.setStandards("100ml");
        dish1.setMenuType("早餐");
        dish1.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.milk));
        dishes.add(dish1);
        Dish dish2=new Dish();
        dish2.setId(2);
        dish2.setName("曲奇饼");
        dish2.setStandards("5块");
        dish2.setMenuType("早餐");
        dish2.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.cookie));
        dishes.add(dish2);
        Dish dish3=new Dish();
        dish3.setId(3);
        dish3.setName("西红柿炒鸡蛋");
        dish3.setStandards("一碗");
        dish3.setMenuType("午餐");
        dish3.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.tomato));
        dishes.add(dish3);
        Dish dish4=new Dish();
        dish4.setId(4);
        dish4.setName("馒头");
        dish4.setStandards("1个");
        dish4.setMenuType("午餐");
        dish4.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bread));
        dishes.add(dish4);
        Dish dish5=new Dish();
        dish5.setId(5);
        dish5.setName("米饭");
        dish5.setStandards("一碗");
        dish5.setMenuType("晚餐");
        dish5.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.rice));
        dishes.add(dish5);
        Dish dish6=new Dish();
        dish6.setId(6);
        dish6.setName("八宝粥");
        dish6.setStandards("300ml");
        dish6.setMenuType("晚餐");
        dish6.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.porridge));
        dishes.add(dish6);
        Dish dish7=new Dish();
        dish7.setId(7);
        dish7.setName("水果");
        dish7.setStandards("2个");
        dish7.setMenuType("晚餐");
        dish7.setDishBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.fruit));
        dishes.add(dish7);

    }

}
