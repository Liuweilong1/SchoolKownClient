package com.example.schoolkownclient.Activity.Shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Entities.Shop;
import com.example.schoolkownclient.R;

public class ShopShop extends AppCompatActivity {
    private ImageView imageView;
    private TextView name;
    private TextView price;
    private TextView scoring;
    private Shop shop;
    private Button commute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_item);
        imageView = findViewById(R.id.img_shop);
        name = findViewById(R.id.tv_goods);
        price = findViewById(R.id.tv_num);
        scoring = findViewById(R.id.tv_scoring);
        commute = findViewById(R.id.commute);
        final Intent intent = getIntent();
        shop = (Shop) intent.getSerializableExtra("shop");
        imageView.setImageBitmap(shop.getPicture());
        name.setText(shop.getName());
        price.setText(shop.getPrice());
        scoring.setText(shop.getIntroduction());
        commute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ShopShop.this,ConfirmActivity.class);
                intent1.putExtra("shop",shop);
                startActivity(intent1);
            }
        });
    }

}
