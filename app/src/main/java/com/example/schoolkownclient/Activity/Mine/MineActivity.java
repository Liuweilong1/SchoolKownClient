package com.example.schoolkownclient.Activity.Mine;



import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.schoolkownclient.R;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
//        //设置背景磨砂效果
//        Glide.with(this).load(R.mipmap.ic_launcher)
//                .bitmapTransform(new BlurTransformation(getActivity(), 25), new CenterCrop(getActivity()))
//                .into(hBack);
//        //设置圆形图像
//        Glide.with(this).load(R.mipmap.ic_launcher)
//                .bitmapTransform(new CropCircleTransformation(getActivity()))
//                .into(hHead);
    }


}
