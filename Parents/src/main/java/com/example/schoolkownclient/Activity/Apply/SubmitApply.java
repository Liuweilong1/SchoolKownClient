package com.example.schoolkownclient.Activity.Apply;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.TimePickerView;
import com.example.pickerviewlibrary.picker.TeaPickerView;
import com.example.pickerviewlibrary.picker.entity.PickerData;
import com.example.pickerviewlibrary.picker.util.JsonArrayUtil;
import com.example.schoolkownclient.Activity.SmallActivity.SendCircleActivity;
import com.example.schoolkownclient.Adapter.CircleAdapter.CustomChooseImgAdapter;
import com.example.schoolkownclient.Entities.GlideLoder;
import com.example.schoolkownclient.R;
import com.lcw.library.imagepicker.ImagePicker;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubmitApply extends AppCompatActivity {

    private LinearLayout start;
    private LinearLayout stop;
    private LinearLayout apply;
    private TextView starttxt;
    private TextView stoptxt;
    private TextView applytype;
    private TextView applytypes;
    private TextView applycontent;
    private TextView textView;
    private ImageView imageView;
    private static final int REQUEST_SELECT_IMAGES_CODE = 0x01;
    private ArrayList<String> mImageList = new ArrayList<>();
    private GridView gridView;

    List<String> mProvinceDatas=new ArrayList<>();
    Map<String, List<String>> mSecondDatas= new HashMap<>();
    Map<String, List<String>> mThirdDatas= new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_apply);

        start = findViewById(R.id.startlinear);
        stop = findViewById(R.id.stopliear);
        apply = findViewById(R.id.applylinear);
        starttxt = findViewById(R.id.starttime);
        stoptxt = findViewById(R.id.stoptime);
        applytype = findViewById(R.id.applytype);
        applytypes = findViewById(R.id.applytypes);
        applycontent = findViewById(R.id.applycouse);
        gridView = findViewById(R.id.applyimg_girdView);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDate();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showstopDate();
            }
        });

        initPickerView();

        //注册当前的NewFragment对象作为事件订阅者
        EventBus.getDefault().register(this);
        if(mImageList.size()==0){
            CustomChooseImgAdapter customChooseImgAdapter=new CustomChooseImgAdapter(this,R.layout.choose_img_gridview_item,mImageList);
            gridView.setAdapter(customChooseImgAdapter);
        }
    }

    private void showDate(){
        TimePickerView pickerView = new TimePickerView.Builder(this, new TimePickerView.OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                starttxt.setText(getTime(date));
            }
        }).setType(new boolean[]{true,true,true,false,false,false})
                .setCancelText("取消")
                .setSubmitText("确定")
                .isCenterLabel(false)
                .build();
        pickerView.show();
    }

    private void showstopDate(){
        TimePickerView pickerView = new TimePickerView.Builder(this, new TimePickerView.OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                stoptxt.setText(getTime(date));
            }
        }).setType(new boolean[]{true,true,true,false,false,false})
                .setCancelText("取消")
                .setSubmitText("确定")
                .isCenterLabel(false)
                .build();
        pickerView.show();
    }

    private String getTime(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    private void initPickerView(){
        //一级列表
        First provinceBean = new First();
        mProvinceDatas.addAll(provinceBean.getRepData().getf());


        //二级列表
        Secound secondBean = new Secound();
        mSecondDatas.putAll(secondBean.getRepData().getSecond());

        //三级列表
        Third thirdBean = new Third();
        mThirdDatas.putAll(thirdBean.getRepData().getThird());

        Log.i("json", JsonArrayUtil.toJson(mProvinceDatas));
        Log.i("json",JsonArrayUtil.toJson(mSecondDatas));
        Log.i("json",JsonArrayUtil.toJson(mThirdDatas));

        //设置数据有多少层级
        PickerData data=new PickerData();
        data.setFirstDatas(mProvinceDatas);
        data.setSecondDatas(mSecondDatas);
        data.setThirdDatas(mThirdDatas);
        data.setInitSelectText("请选择");

        TeaPickerView teaPickerView =new TeaPickerView(this,data);
        teaPickerView.setScreenH(3)
                .setDiscolourHook(true)
                .setRadius(25)
                .setContentLine(true)
                .setRadius(25)
                .build();

        apply.setOnClickListener(v -> {
            //显示选择器
            teaPickerView.show(apply);
        });

        //选择器点击事件
        teaPickerView.setOnPickerClickListener(pickerData -> {
            Toast.makeText(SubmitApply.this,pickerData.getFirstText()+","+pickerData.getSecondText()+","+pickerData.getThirdText(),Toast.LENGTH_SHORT).show();
            teaPickerView.dismiss();//关闭选择器
            applytype.setText(pickerData.getFirstText());
            applytypes.setText(pickerData.getSecondText());
            applycontent.setText(pickerData.getThirdText());
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(String str){
        if(str.equals("添加图片")){
            ImagePicker.getInstance()
                    .setTitle("标题")
                    .showCamera(true)
                    .showImage(true)
                    .showVideo(true)
                    .setSingleType(true)
                    .setMaxCount(5)
                    .setImagePaths(mImageList)
                    .setImageLoader(new GlideLoder())
                    .start(SubmitApply.this, REQUEST_SELECT_IMAGES_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SELECT_IMAGES_CODE && resultCode == RESULT_OK) {
            mImageList = data.getStringArrayListExtra(ImagePicker.EXTRA_SELECT_IMAGES);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("当前选中图片路径：\n\n");
            for (int i = 0; i < mImageList.size(); i++) {
                stringBuffer.append(mImageList.get(i) + "\n\n");
            }
//            textView.setText(stringBuffer.toString());
//            Glide.with(this).load(mImageList.get(0)).into(imageView);
            CustomChooseImgAdapter customChooseImgAdapter=new CustomChooseImgAdapter(this,R.layout.choose_img_gridview_item,mImageList);
            gridView.setAdapter(customChooseImgAdapter);

        }
    }

}
