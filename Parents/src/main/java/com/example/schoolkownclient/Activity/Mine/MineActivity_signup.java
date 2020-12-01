package com.example.schoolkownclient.Activity.Mine;


import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.schoolkownclient.R;

import java.util.Calendar;

import cn.pedant.SweetAlert.SweetAlertDialog;

/*
预约时间表 安卓自带的时间表
 */
public class MineActivity_signup extends AppCompatActivity {
    int mYear, mMonth, mDay;
    Button btn;
    Button btn_true;
    TextView dateDisplay;
    final int DATE_DIALOG = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_signup);

        //返回跳转
        ImageView back = findViewById(R.id.mine_back_signup);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                finish();
            }
        });


        btn = (Button) findViewById(R.id.dateChoose);
        //btn_true=(Button)findViewById(R.id.datetrue);
        dateDisplay = (TextView) findViewById(R.id.dateDisplay);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_DIALOG);
            }
        });
//        btn_true.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 给bnt1添加点击响应事件
////                Intent intent2=new Intent(Forward.this, Patient_ChatRoom.class);
////                //启动
////                startActivity(intent2);
//                Toast toast=Toast.makeText(getApplicationContext(), "预约成功", Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
        final Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);
    }
    public void onClick(View view){
        switch (view.getId()){
//            case R.id.back:
//                // 给bnt1添加点击响应事件
//                Intent intent2=new Intent(Forward.this, MainActivity.class);
//                //启动
//                startActivity(intent2);
//                break;
            case R.id.datetrue:
//                Toast toast=Toast.makeText(getApplicationContext(), "签到成功", Toast.LENGTH_SHORT);
//                toast.show();
                new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("签到成功!")
                        .setContentText("增加200积分!")
                        .show();

                break;
        }
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG:
                return new DatePickerDialog(this, mdateListener, mYear, mMonth, mDay);

        }
        return null;
    }
    /**
     * 设置日期 利用StringBuffer追加
     */
    public void display() {
        dateDisplay.setText(new StringBuffer().append(mMonth + 1).append("-").append(mDay).append("-").append(mYear).append(" "));
    }
    private DatePickerDialog.OnDateSetListener mdateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            mYear = year;
            mMonth = monthOfYear;
            mDay = dayOfMonth;
            display();
        }
    };

}
