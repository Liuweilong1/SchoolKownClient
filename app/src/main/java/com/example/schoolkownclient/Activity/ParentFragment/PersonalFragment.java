package com.example.schoolkownclient.Activity.ParentFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.schoolkownclient.Activity.Mine.MineActivity;
import com.example.schoolkownclient.Activity.Mine.MineActivity_aboutus;
import com.example.schoolkownclient.Activity.Mine.MineActivity_collections;
import com.example.schoolkownclient.Activity.Mine.MineActivity_help;
import com.example.schoolkownclient.Activity.Mine.MineActivity_personinformation;
import com.example.schoolkownclient.Activity.Mine.MineActivity_setup;
import com.example.schoolkownclient.Activity.Mine.MineActivity_signup;
import com.example.schoolkownclient.Activity.Shop.ShopActivity;
import com.example.schoolkownclient.R;

public class PersonalFragment extends Fragment {
    private View view;
    private LinearLayout personinformation;
    private LinearLayout signup;
    private LinearLayout collections;
    private LinearLayout shop;
    private LinearLayout help;
    private LinearLayout setup;
    private LinearLayout aboutus;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.activity_mine, container, false);
            personinformation = view.findViewById(R.id.mine_personinformation);
            signup = view.findViewById(R.id.mine_signup);
            //点赞收藏跳转
            collections = view.findViewById(R.id.mine_collections);
            shop = view.findViewById(R.id.mine_shop);
            help = view.findViewById(R.id.mine_help);
            setup = view.findViewById(R.id.mine_setup);
            aboutus = view.findViewById(R.id.mine_aboutus);

        }
        personinformation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), MineActivity_personinformation.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), MineActivity_signup.class);
                startActivity(intent);
            }
        });
        collections.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), MineActivity_collections.class);
                startActivity(intent);
            }
        });
        shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), ShopActivity.class);
                startActivity(intent);
            }
        });
        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), MineActivity_help.class);
                startActivity(intent);
            }
        });
        setup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), MineActivity_setup.class);
                startActivity(intent);
            }
        });
        aboutus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), MineActivity_aboutus.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
