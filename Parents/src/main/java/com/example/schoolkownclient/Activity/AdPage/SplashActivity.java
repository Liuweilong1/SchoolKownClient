package com.example.schoolkownclient.Activity.AdPage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.schoolkownclient.R;

public class SplashActivity extends Activity {

    private LinearLayout llSkip;
    private TextView tvTime;
    private int time = 6;
    // private final int SPLASH_DISPLAY_LENGHT = 2000; // 两秒后进入系统
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏状态栏
        //getSupportActionBar().hide();//隐藏标题栏
        setContentView(R.layout.activity_splash);
        llSkip = findViewById(R.id.ll_skip);
        tvTime = findViewById(R.id.tv_time);
        llSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(getApplicationContext(),LeadActivity.class);//启动MainActivity
                startActivity(it);
                finish();//关闭当前活动
            }
        });

        handler.sendEmptyMessageDelayed(1, 1000);
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            time--;
            if (time == 0) {
                Intent it=new Intent(getApplicationContext(),LeadActivity.class);//启动MainActivity
                startActivity(it);
                finish();//关闭当前活动

            } else {
                tvTime.setText(time + "秒");
                handler.sendEmptyMessageDelayed(1, 1000);
            }
        }
    };
}

