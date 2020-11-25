package com.example.schoolkownclient.Activity.Mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.R;

public class MineActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mine);


        //个人信息跳转
        LinearLayout personinformation = findViewById(R.id.mine_personinformation);
        personinformation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity.this,MineActivity_personinformation.class);
                startActivity(intent);
            }
        });
        //签到打卡跳转
        LinearLayout signup = findViewById(R.id.mine_signup);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity.this,MineActivity_signup.class);
                startActivity(intent);
            }
        });
        //点赞收藏跳转
        LinearLayout setup = findViewById(R.id.mine_signup);
        setup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity.this,MineActivity_setup.class);
                startActivity(intent);
            }
        });
        //积分商城跳转
        LinearLayout shop = findViewById(R.id.mine_shop);
        shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity.this,MineActivity_setup.class);
                startActivity(intent);
            }
        });
        //使用帮助跳转
        LinearLayout help = findViewById(R.id.mine_help);
        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity.this,MineActivity_help.class);
                startActivity(intent);
            }
        });
        //设置跳转
        //关于我们跳转

    }




}