package com.example.schoolkownclient.Activity.Mine;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.R;

public class MineActivity_aboutus_aboutxx extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_aboutus_aboutxx);

        //返回跳转
        ImageView back = findViewById(R.id.mine_back_aboutus);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}
