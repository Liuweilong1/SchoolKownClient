package com.example.schoolkownclient.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.schoolkownclient.Entities.GlideImageLoader;
import com.example.schoolkownclient.R;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class BannerActivity extends AppCompatActivity {
    private List<String> images=new ArrayList<>();
    private Banner banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        banner=findViewById(R.id.home_banner);
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        images.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1968633353,4219736989&fm=15&gp=0.jpg");
        images.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2342324247,2362231983&fm=11&gp=0.jpg");
        images.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=124643587,619926761&fm=11&gp=0.jpg");
        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}
