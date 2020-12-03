package com.example.teachers.Mine.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.teachers.Adapter.GoodAdapter;
import com.example.teachers.Entities.Good;
import com.example.teachers.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FirstFragment extends Fragment {

    private ListView lvGood;
    private List<Good> goods = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_mine_good_fragment_layout,container,false);

        //1.准备数据源
        initDate();
        //2.准备item的布局文件（自定义）

        //3.3选择一种Adapter,绑定Adapter
        GoodAdapter goodAdapter = new GoodAdapter(getContext(),goods,R.layout.acticity_mine_good_list_item);
        ListView lvgood = view.findViewById(R.id.lv_goodList);
        lvgood.setAdapter(goodAdapter);

        return view;
    }

    public void initDate(){
        Good g1 = new Good();
        g1.setHeadPhoto(R.drawable.mine_headphoto);
        g1.setName("刘伟龙");
        g1.setTime("2020-11-22");

        Good g2 = new Good();
        g2.setHeadPhoto(R.drawable.mine_headphoto);
        g2.setName("李勇见");
        g2.setTime("2020-11-23");


        Good g3 = new Good();
        g3.setHeadPhoto(R.drawable.mine_headphoto);
        g3.setName("徐一江");
        g3.setTime("2020-11-24");

        goods.clear();
        goods.add(g1);
        goods.add(g2);
        goods.add(g3);
    }
}
