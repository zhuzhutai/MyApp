package com.hongyang.catmovie.pager.mypager.ceng3;

import android.content.Context;
import android.view.View;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;

/**
 * Created by Administrator on 2016/6/28.
 */
public class MyPendingPayment extends BaseFragment{

    //待付款页面自带下拉刷新效果，需要集成
    public MyPendingPayment(Context context) {
    }

    @Override
    public View initView() {
        View view = inflater.inflate(R.layout.my_pending_payment,null);
        return view;
    }
}
