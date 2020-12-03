package com.example.schoolkownclient.Activity.Shop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.schoolkownclient.Entities.Shop;
import com.example.schoolkownclient.R;

public class ConfirmActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView name;
    private TextView price;
    private Button button;
    private Shop shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        imageView = findViewById(R.id.img_goods);
        name = findViewById(R.id.tv_commodity);
        price = findViewById(R.id.tv_scoring);
        button = findViewById(R.id.btn_confirm);
        Intent intent = getIntent();
        shop = (Shop) intent.getSerializableExtra("shop");
        imageView.setImageBitmap(shop.getPicture());
        name.setText(shop.getName());
        price.setText(shop.getPrice());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"兑换成功",Toast.LENGTH_SHORT);
                finish();
            }
        });
    }
}
