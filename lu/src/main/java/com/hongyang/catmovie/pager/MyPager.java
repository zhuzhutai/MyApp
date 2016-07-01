package com.hongyang.catmovie.pager;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseViewPager;

/**
 * Created by Administrator on 2016/6/27.
 */
public class MyPager extends BaseViewPager {
    private RelativeLayout rl_base;

    private LinearLayout my_ll_message,my_ll_leaguer,my_ll_achievement,my_ll_coupon,my_ll_remainder,my_ll_leaguercard,my_ll_shopping,my_ll_setting;
    private TextView tv_ml_message,tv_ml_leaguer,tv_ml_achievement,tv_ml_coupon,tv_ml_remainder,tv_ml_leaguercard,tv_ml_shopping,tv_ml_setting;
    public MyPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.my_scroll_pager,null);
        //登录框，除ImageView点击外父类点击有效
        rl_base = (RelativeLayout) view.findViewById(R.id.rl_user_login);

    //底部纵向菜单的点击
        //我的消息
        my_ll_message = (LinearLayout) view.findViewById(R.id.my_ll_message);
        tv_ml_message = (TextView) view.findViewById(R.id.tv_ml_message);
        //会员中心
        my_ll_leaguer = (LinearLayout) view.findViewById(R.id.my_ll_leaguer);
        tv_ml_leaguer = (TextView) view.findViewById(R.id.tv_ml_leaguer);
        //我的成就
        my_ll_achievement = (LinearLayout) view.findViewById(R.id.my_ll_achievement);
        tv_ml_achievement = (TextView) view.findViewById(R.id.tv_ml_achievement);
        //优惠券
        my_ll_coupon = (LinearLayout) view.findViewById(R.id.my_ll_coupon);
        tv_ml_coupon = (TextView) view.findViewById(R.id.tv_ml_coupon);
        //我的钱包
        my_ll_remainder = (LinearLayout) view.findViewById(R.id.my_ll_remainder);
        tv_ml_remainder = (TextView) view.findViewById(R.id.tv_ml_remainder);
        //影院会员卡:默认隐藏，登录后显示
        my_ll_leaguercard = (LinearLayout) view.findViewById(R.id.my_ll_leaguercard);
        tv_ml_leaguercard = (TextView) view.findViewById(R.id.tv_ml_leaguercard);
        //商城
        my_ll_shopping = (LinearLayout) view.findViewById(R.id.my_ll_shopping);
        tv_ml_shopping = (TextView) view.findViewById(R.id.tv_ml_shopping);
        //设置
        my_ll_setting = (LinearLayout) view.findViewById(R.id.my_ll_setting);
        tv_ml_setting = (TextView) view.findViewById(R.id.tv_ml_setting);






        return view;
    }
}
