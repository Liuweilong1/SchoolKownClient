package com.example.teachers.Mine;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.teachers.R;


public class MineActivity_setup_safety_updatepassword extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_setup_safety_updatepassword);

        //返回跳转
        ImageView back = findViewById(R.id.mine_back_setup);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                finish();
            }
        });


    }
}