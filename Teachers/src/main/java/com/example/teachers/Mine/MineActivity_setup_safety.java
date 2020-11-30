package com.example.teachers.Mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.teachers.R;

public class MineActivity_setup_safety extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_setup_safety);

        //返回跳转
        ImageView back = findViewById(R.id.mine_back_setup);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        LinearLayout updatepassword = findViewById(R.id.mine_setup_safety_updatepassword);
        updatepassword.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity_setup_safety.this,MineActivity_setup_safety_updatepassword.class);
                startActivity(intent);
            }
        });
    }
}