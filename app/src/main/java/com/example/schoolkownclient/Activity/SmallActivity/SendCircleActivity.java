package com.example.schoolkownclient.Activity.SmallActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.schoolkownclient.Adapter.CircleAdapter.CustomChooseImgAdapter;
import com.example.schoolkownclient.Entities.GlideLoder;
import com.example.schoolkownclient.R;
import com.lcw.library.imagepicker.ImagePicker;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

public class SendCircleActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private static final int REQUEST_SELECT_IMAGES_CODE = 0x01;
    private ArrayList<String> mImageList = new ArrayList<>();
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_circle);

        //注册当前的NewFragment对象作为事件订阅者
        EventBus.getDefault().register(this);
        gridView=findViewById(R.id.img_girdView);
        if(mImageList.size()==0){
            CustomChooseImgAdapter customChooseImgAdapter=new CustomChooseImgAdapter(this,R.layout.choose_img_gridview_item,mImageList);
            gridView.setAdapter(customChooseImgAdapter);
        }
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
                    .start(SendCircleActivity.this, REQUEST_SELECT_IMAGES_CODE);
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
