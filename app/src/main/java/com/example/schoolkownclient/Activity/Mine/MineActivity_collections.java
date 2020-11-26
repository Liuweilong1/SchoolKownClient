package com.example.schoolkownclient.Activity.Mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolkownclient.R;

public class MineActivity_collections extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_collections);

        //返回跳转
        ImageView back = findViewById(R.id.mine_back_collections);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(MineActivity_collections.this, MineActivity.class);
                startActivity(intent);
            }
        });
    }
}
