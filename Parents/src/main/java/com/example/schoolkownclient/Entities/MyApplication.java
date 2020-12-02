package com.example.schoolkownclient.Entities;

import android.app.Application;

import com.mob.MobApplication;

public class MyApplication extends Application {
    private static MyApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public static MyApplication getContext() {
        return mApplication;
    }
}
