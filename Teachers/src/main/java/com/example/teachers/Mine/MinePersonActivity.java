package com.example.teachers.Mine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import com.example.teachers.R;

public class MinePersonActivity extends AppCompatActivity {

    private ImageView ivblack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                intent.setClass(MinePersonActivity.this,MineActivity_pi_update.class);
                startActivity(intent);
            }
        });
    }
}
