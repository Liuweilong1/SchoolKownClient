package com.example.schoolkownclient.Activity.Mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.R;

public class MineActivity_setup extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_setup);

        //返回跳转
        ImageView back = findViewById(R.id.mine_back_setup);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        LinearLayout safety = findViewById(R.id.mine_setup_safety);
        safety.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity_setup.this,MineActivity_setup_safety.class);
                startActivity(intent);
            }
        });
        LinearLayout warn = findViewById(R.id.mine_setup_warn);
        warn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity_setup.this,MineActivity_setup_warn.class);
                startActivity(intent);
            }
        });
    }
}