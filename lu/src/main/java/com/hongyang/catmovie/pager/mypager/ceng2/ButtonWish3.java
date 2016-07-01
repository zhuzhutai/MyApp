package com.hongyang.catmovie.pager.mypager.ceng2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;

/**
 * Created by Administrator on 2016/6/29.
 */
public class ButtonWish3 extends BaseFragment {
    private ImageButton ib_back;
    private TextView tv_login;
    private TextView tv_forget_psd;
    private ImageButton ib_share;

    private TextView bt_wish_all,bt_wish_now,bt_wish_soon;
    private RecyclerView rv_wish_1;
    private LinearLayout ll_buttons;

    @Override
    public View initView() {
        View view = inflater.inflate(R.layout.buttonwish1, null);

        //设置返回键
        ib_back = (ImageButton) view.findViewById(R.id.ib_back);

        //设置标题的名称
        tv_login = (TextView) view.findViewById(R.id.tv_login);
        tv_login.setText("我的影评");

        //按钮组:本届面实例化需要隐藏
        ll_buttons = (LinearLayout) view.findViewById(R.id.ll_buttons);
        ll_buttons.setVisibility(View.GONE);

        tv_forget_psd = (TextView) view.findViewById(R.id.tv_forget_psd);
        tv_forget_psd.setVisibility(View.GONE);
        //分享按钮的隐藏
        ib_share = (ImageButton) view.findViewById(R.id.ib_share);
        ib_share.setVisibility(View.GONE);

        //按钮的初始化
        bt_wish_all = (TextView) view.findViewById(R.id.bt_wish_all);
        bt_wish_now = (TextView) view.findViewById(R.id.bt_wish_now);
        bt_wish_soon = (TextView) view.findViewById(R.id.bt_wish_soon);

        //recyclerView的初始化
        rv_wish_1 = (RecyclerView) view.findViewById(R.id.rv_wish_1);

        return view;
    }
}
