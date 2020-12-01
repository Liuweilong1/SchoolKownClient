package com.example.schoolkownclient.Activity.Shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Shop;
import com.example.schoolkownclient.R;

import java.io.Serializable;

public class ShopShop extends AppCompatActivity {
    private ImageView imageView;
    private TextView name;
    private TextView price;
    private TextView scoring;
    private Shop shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_item);
        imageView = findViewById(R.id.img_shop);
        name = findViewById(R.id.tv_goods);
        price = findViewById(R.id.tv_num);
        scoring = findViewById(R.id.tv_scoring);
        Intent intent = getIntent();
        shop = (Shop) intent.getSerializableExtra("shop");
        imageView.setImageBitmap(shop.getPicture());
        name.setText(shop.getName());
        price.setText(shop.getPrice());
        scoring.setText(shop.getIntroduction());
    }

}
