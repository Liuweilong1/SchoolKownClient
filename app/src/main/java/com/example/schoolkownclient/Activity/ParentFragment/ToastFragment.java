package com.example.schoolkownclient.Activity.ParentFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.schoolkownclient.Activity.NotificationActivity.MessageFragment;
import com.example.schoolkownclient.Activity.NotificationActivity.NotificationFragment;
import com.example.schoolkownclient.R;

public class ToastFragment extends Fragment implements View.OnClickListener {

    private LayoutInflater inflater;
    private Context mainActivity;
    private MessageFragment messageFragment;
    private NotificationFragment notificationFragment;

    private RadioGroup radioGroup;
    private RadioButton rb1;
    private RadioButton rb2;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mainActivity = getActivity();
        inflater = LayoutInflater.from(getActivity());

        radioGroup = getActivity().findViewById(R.id.two_group);
        rb1 = getActivity().findViewById(R.id.two_one);
        rb2 = getActivity().findViewById(R.id.two_two);

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);

        setDefaultFragment();

    }

    private void setDefaultFragment(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        notificationFragment = new NotificationFragment();
        transaction.add(R.id.fragment,notificationFragment).commit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.toastfragment,null);
    }

    @Override
    public void onClick(View view) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();

        switch (view.getId()){
            case R.id.two_one:
                if (notificationFragment == null){
                    notificationFragment = new NotificationFragment();
                }
                transaction.replace(R.id.fragment,notificationFragment);
                break;
            case R.id.two_two:
                if(messageFragment == null){
                    messageFragment = new MessageFragment();
                }
                transaction.replace(R.id.fragment,messageFragment);
                break;
        }
        transaction.commit();
    }
}
