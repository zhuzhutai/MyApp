package com.hongyang.catmovie.pager.mypager.ceng1;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;

/**
 * Created by Administrator on 2016/6/28.
 */
public class MyMeiTuanRegister extends BaseFragment implements View.OnClickListener {
    private TextView tv_login;
    private TextView tv_forget_psd;


    @Override
    public View initView() {
        View view = inflater.inflate(R.layout.my_meituan_register, null);

        //复用的标题栏布局，需要修改或隐藏
        tv_login = (TextView) view.findViewById(R.id.tv_login);
        tv_login.setText("注册");
        //发送验证码时显示：秒数动态变化
        tv_forget_psd = (TextView) view.findViewById(R.id.tv_forget_psd);
        tv_forget_psd.setText("获取验证码");
        //重新获取验证码时会弹出alertDialog，动态变化秒数

        tv_forget_psd.setOnClickListener(this);
        return view;
    }

    @Override
    public void initData() {
//        tv_forget_psd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_forget_psd :
                Dialog dialog = new Dialog(context);
                break;
        }
    }
}
