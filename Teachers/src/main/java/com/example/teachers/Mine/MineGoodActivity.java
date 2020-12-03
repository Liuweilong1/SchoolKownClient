package com.example.teachers.Mine;

import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTabHost;
import androidx.fragment.app.FragmentTransaction;


import com.example.teachers.Mine.Fragment.FirstFragment;
import com.example.teachers.Mine.Fragment.SecondFragment;
import com.example.teachers.R;

import java.util.HashMap;
import java.util.Map;

public class MineGoodActivity extends AppCompatActivity {

    private RelativeLayout rlOne;
    private RelativeLayout rlTwo;
    private Fragment subFragment1;
    private Fragment subFragment2;
    private TextView tvOne;
    private TextView tvTwo;
    private ImageView ivOne;
    private ImageView ivTwo;
    private Button btnBack;
    private FragmentManager manager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_good);
        rlOne = findViewById(R.id.rl_one);
        rlTwo = findViewById(R.id.rl_two);
        tvOne = findViewById(R.id.tv_one);
        tvTwo = findViewById(R.id.tv_two);
        ivOne = findViewById(R.id.iv_one);
        ivTwo = findViewById(R.id.iv_two);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //初始化视图控件
        initView();

    }

    private void initView(){
        //获取管理
        manager = getSupportFragmentManager();
        //Fragment实例化
        subFragment1 = new FirstFragment();
        subFragment2 = new SecondFragment();

        //点击事件
        rlOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectFragment(0);
                tvOne.setTextColor(getResources().getColor(R.color.mainColor_deep));
                tvTwo.setTextColor(getResources().getColor(R.color.black));
                ivOne.setImageResource(R.drawable.mine_good_purpre);
                ivTwo.setImageResource(R.drawable.mine_good_gray);
            }
        });
        rlTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectFragment(1);
                tvOne.setTextColor(getResources().getColor(R.color.black));
                tvTwo.setTextColor(getResources().getColor(R.color.mainColor_deep));
                ivOne.setImageResource(R.drawable.mine_good_gray);
                ivTwo.setImageResource(R.drawable.mine_good_purpre);
            }
        });

        //默认选中第一个
        selectFragment(0);
        tvOne.setTextColor(getResources().getColor(R.color.mainColor_deep));
        ivOne.setImageResource(R.drawable.mine_good_purpre);
    }

    private void selectFragment(int index) {
        //每次切换都要获取一个新的事务
        FragmentTransaction transaction = manager.beginTransaction();
        switch (index) {
            case 0:
                transaction.replace(R.id.framelayout, subFragment1);
                break;
            case 1:
                transaction.replace(R.id.framelayout, subFragment2);
                break;
        }
        //提交事务
        transaction.commit();
    }

}
