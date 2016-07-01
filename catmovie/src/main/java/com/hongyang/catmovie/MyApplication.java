package com.hongyang.catmovie;

import android.app.Application;

import com.hongyang.catmovie.volley.VolleyManager;

/**
 * Created by Administrator on 2016/6/22.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VolleyManager.init(this);
    }
}
