package com.hongyang.catmovie.base;

import android.content.Context;
import android.view.View;

/**
 * Created by Administrator on 2016/6/24.
 */
public abstract class BaseViewPager {

    public Context context;
    public View rootview;

    public BaseViewPager(Context context) {
        this.context = context;
        this.rootview = initView();
    }

    public abstract View initView();

    public void initData(){

    }

}
