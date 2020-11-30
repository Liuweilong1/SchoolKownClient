package com.example.schoolkownclient.Activity.ParentFragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.schoolkownclient.Activity.ParentFragment.CircleFragmentPackage.ClassCircleFragment;
import com.example.schoolkownclient.Activity.ParentFragment.CircleFragmentPackage.ParentCircleFragment;
import com.example.schoolkownclient.Activity.SmallActivity.SendCircleActivity;
import com.example.schoolkownclient.R;

public class CircleFragment extends Fragment implements View.OnClickListener {
    private View view;
    private static String  TAG = CircleFragment.class.getName();
    private LinearLayout lin_sub1, lin_sub2;
    private Fragment subFragment1;
    private Fragment subFragment2;
    private TextView txtClass;
    private TextView txtParent;
    private int mScreen1_2;
    private ImageView publishCircle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circle, null);
        initView(view);
        setLinstener();
        initData();
        return view;
    }
    private void initView(View view) {
        lin_sub1 = (LinearLayout) view.findViewById(R.id.lin_class);
        lin_sub2 = (LinearLayout) view.findViewById(R.id.lin_parent);
        txtClass=view.findViewById(R.id.tv_class);
        txtParent=view.findViewById(R.id.tv_parent);
        publishCircle=view.findViewById(R.id.circle_publish);
    }

    protected void initData() {
        // Display display = getWindow().getWindowManager().getDefaultDisplay();
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        mScreen1_2 = outMetrics.widthPixels / 2;
        //初次显示设置
        setSubFragment(0);
        lin_sub1.setBackground(getResources().getDrawable(R.drawable.fragment_line_light));
        lin_sub2.setBackground(getResources().getDrawable(R.drawable.fragment_line_dark));
        txtClass.setTextColor(getResources().getColor(R.color.colorTwoDark));
        txtParent.setTextColor(getResources().getColor(R.color.colorWhite));
        publishCircle.setVisibility(View.INVISIBLE);
    }

    protected void setLinstener() {
        lin_sub1.setOnClickListener(this);
        lin_sub2.setOnClickListener(this);
        publishCircle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_class:
                setSubFragment(0);
                lin_sub1.setBackground(getResources().getDrawable(R.drawable.fragment_line_light));
                lin_sub2.setBackground(getResources().getDrawable(R.drawable.fragment_line_dark));
                txtClass.setTextColor(getResources().getColor(R.color.colorTwoDark));
                txtParent.setTextColor(getResources().getColor(R.color.colorWhite));
                publishCircle.setVisibility(View.INVISIBLE);
                break;
            case R.id.lin_parent:
                setSubFragment(1);
                lin_sub1.setBackground(getResources().getDrawable(R.drawable.fragment_line_dark));
                lin_sub2.setBackground(getResources().getDrawable(R.drawable.fragment_line_light));
                txtClass.setTextColor(getResources().getColor(R.color.colorWhite));
                txtParent.setTextColor(getResources().getColor(R.color.colorTwoDark));
                publishCircle.setVisibility(View.VISIBLE);
                break;
            case R.id.circle_publish:
                Intent intent=new Intent(getContext(), SendCircleActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void setSubFragment(int i){
        FragmentTransaction transaction =getFragmentManager().beginTransaction();
        if(0 == i ){
            subFragment1 = (subFragment1 == null ? new ClassCircleFragment():subFragment1);
            transaction.replace(R.id.id_content,subFragment1);
            //	transaction.addToBackStack(null);
            transaction.commit();
        }else if(1 == i ){
            subFragment2 = (subFragment2 == null ? new ParentCircleFragment():subFragment2);
            transaction.replace(R.id.id_content,subFragment2);
            //	transaction.addToBackStack(null);
            transaction.commit();
        }
    }



}
