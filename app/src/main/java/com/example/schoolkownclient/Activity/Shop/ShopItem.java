package com.example.schoolkownclient.Activity.Shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolkownclient.R;
import com.example.schoolkownclient.bean.JsonDataActivity;

public class ShopItem extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_item);
        findViewById(R.id.duihuan).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(ShopItem.this, JsonDataActivity.class));
    }
}
