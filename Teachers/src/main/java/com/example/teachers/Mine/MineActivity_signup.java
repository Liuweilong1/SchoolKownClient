package com.example.teachers.Mine;


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

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.example.teachers.Activity.TeacherFragment.PersonalFragment;
import com.example.teachers.R;

import java.util.Calendar;

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
        btn_true = findViewById(R.id.datetrue);
        //btn_true=(Button)findViewById(R.id.datetrue);
        dateDisplay = (TextView) findViewById(R.id.dateDisplay);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_DIALOG);
            }
        });

        final Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);

        dateDisplay.setText(mYear+"-"+mMonth+"-"+mDay);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.datetrue:
                btn_true.setText("已签到");
                Toast toast=Toast.makeText(getApplicationContext(), "签到成功", Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent();
                intent.putExtra("data","true");
                MineActivity_signup.this.setResult(11,intent);
                MineActivity_signup.this.finish();
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
        dateDisplay.setText(new StringBuffer().append(mYear + 1).append("-").append(mMonth).append("-").append(mDay).append(" "));
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
