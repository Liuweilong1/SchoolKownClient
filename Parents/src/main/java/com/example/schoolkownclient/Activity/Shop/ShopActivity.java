package com.example.schoolkownclient.Activity.Shop;


import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.Adapter.ShopAdapter.Shopadapter;
import com.example.schoolkownclient.Entities.Shop;
import com.example.schoolkownclient.R;

import java.util.ArrayList;
import java.util.List;

public class ShopActivity extends AppCompatActivity {
    private List<Shop> shops = new ArrayList<>();
    private Shopadapter shopadapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        Shop shop = new Shop();
        shop.setName("iphone12");
        shop.setPrice("80000积分");
        shop.setIntroduction("超级视网膜XDR显示屏，分辨率为2532x1170，对比度为200万：1，亮度高达1200尼特，支持杜比视界和HDR10。\n" +
                "采用六核A14 Bionic芯片。\n" +
                "双镜头后置摄像头系统，配备1200万像素超广角和广角镜头以及7元件镜头，低光性能提升27%。 [3] \n" );
        shop.setPicture(BitmapFactory.decodeResource(getResources(),R.drawable.iphone12));
        shop.setScoring("【12期白条免息限量抢】A14仿生芯片，6.1英寸超视网膜XDR显示屏，升维大提速，现实力登场！点击抢券");
        shops.add(shop);
        initView();
    }

    public void initView(){
        shopadapter = new Shopadapter(
                this,shops,R.layout.shopitem);
        GridView stuListView = findViewById(R.id.gv_list);
        stuListView.setAdapter(shopadapter);
        stuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(ShopActivity.this, ShopShop.class);
                Shop shop1 = shops.get(position);
                intent.putExtra("shop",shop1);
                startActivity(intent);
            }
        });

    }
}
