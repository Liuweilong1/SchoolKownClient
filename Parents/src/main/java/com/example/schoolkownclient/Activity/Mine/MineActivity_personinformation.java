package com.example.schoolkownclient.Activity.Mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.R;

public class MineActivity_personinformation extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_personinformation);

        //返回跳转
        ImageView back = findViewById(R.id.mine_back_personinformation);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        Button update = findViewById(R.id.mine_pi_update);
        update.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity_personinformation.this,MineActivity_pi_update.class);
                startActivity(intent);
            }
        });
    }
}
