package com.hongyang.catmovie.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;
import com.hongyang.catmovie.pager.mypager.ceng3.MyPendingPayment;
import com.hongyang.catmovie.pager.mypager.ceng3.MyToBeConsumed;
import com.hongyang.catmovie.pager.mypager.ceng1.MyUserRegister;
import com.hongyang.catmovie.pager.mypager.ceng2.ButtonWish1;
import com.hongyang.catmovie.pager.mypager.ceng2.ButtonWish2;
import com.hongyang.catmovie.pager.mypager.ceng2.ButtonWish3;
import com.hongyang.catmovie.pager.mypager.ceng2.ButtonWish4;

/**
 * Created by Administrator on 2016/6/25.
 */
public class MyFragment extends BaseFragment implements View.OnClickListener {

    private final RadioGroup rg_group;

    private RelativeLayout rl_user_login;

    private TextView tv_wish1,tv_wish2,tv_wish3,tv_wish4,
                     tv_order_consume,tv_order_payment,tv_order_evaluate,tv_order_refund,
                     tv_ml_achievement,tv_ml_message,tv_ml_leaguer,
                     tv_ml_coupon,tv_ml_remainder,tv_ml_leaguercard,tv_ml_shopping,tv_ml_setting;

    private LinearLayout my_ll_message,my_ll_leaguer,my_ll_achievement,
                         my_ll_coupon,my_ll_remainder,my_ll_leaguercard,my_ll_shopping,my_ll_setting;

    private FragmentManager manager;

    public MyFragment(RadioGroup rg_group) {
        this.rg_group = rg_group;
    }

    @Override
    public View initView() {
        View view = inflater.inflate(R.layout.my_scroll_pager, null);
        //1.用户登录
        rl_user_login = (RelativeLayout) view.findViewById(R.id.rl_user_login);

        //2.想看的列表
        tv_wish1 = (TextView) view.findViewById(R.id.tv_wish1);
        tv_wish2 = (TextView) view.findViewById(R.id.tv_wish2);
        tv_wish3 = (TextView) view.findViewById(R.id.tv_wish3);
        tv_wish4 = (TextView) view.findViewById(R.id.tv_wish4);

        //3.我的评价4按钮
        tv_order_consume = (TextView)view.findViewById(R.id.tv_order_consume);
        tv_order_payment =(TextView) view.findViewById(R.id.tv_order_payment);
        tv_order_evaluate = (TextView)view.findViewById(R.id.tv_order_evaluate);
        tv_order_refund = (TextView)view.findViewById(R.id.tv_order_refund);

        //4.我的消息
        my_ll_message = (LinearLayout) view.findViewById(R.id.my_ll_message);
        tv_ml_message = (TextView) view.findViewById(R.id.tv_ml_message);
        my_ll_leaguer = (LinearLayout) view.findViewById(R.id.my_ll_leaguer);
        tv_ml_leaguer = (TextView) view.findViewById(R.id.tv_ml_leaguer);
        my_ll_achievement = (LinearLayout) view.findViewById(R.id.my_ll_achievement);
        tv_ml_achievement = (TextView) view.findViewById(R.id.tv_ml_achievement);

        //5.商城
        my_ll_coupon = (LinearLayout) view.findViewById(R.id.my_ll_coupon);
        tv_ml_coupon = (TextView) view.findViewById(R.id.tv_ml_coupon);
        my_ll_remainder = (LinearLayout) view.findViewById(R.id.my_ll_remainder);
        tv_ml_remainder = (TextView) view.findViewById(R.id.tv_ml_remainder);
        my_ll_leaguercard = (LinearLayout) view.findViewById(R.id.my_ll_leaguercard);
        tv_ml_leaguercard = (TextView) view.findViewById(R.id.tv_ml_leaguercard);
        my_ll_shopping = (LinearLayout) view.findViewById(R.id.my_ll_shopping);
        tv_ml_shopping = (TextView) view.findViewById(R.id.tv_ml_shopping);

        //6.设置
        my_ll_setting = (LinearLayout) view.findViewById(R.id.my_ll_setting);
        tv_ml_setting = (TextView) view.findViewById(R.id.tv_ml_setting);

        manager = getFragmentManager();
        return view;
    }

    @Override
    public void initData(){
        //1.用户登录
        rl_user_login.setOnClickListener(this);

        //2.想看的列表
        tv_wish1.setOnClickListener(this);
        tv_wish2.setOnClickListener(this);
        tv_wish3.setOnClickListener(this);
        tv_wish4.setOnClickListener(this);

        //3.我的评价4点击事件
        tv_order_consume.setOnClickListener(this);
        tv_order_payment.setOnClickListener(this);
        tv_order_evaluate.setOnClickListener(this);
        tv_order_refund.setOnClickListener(this);

        //4.我的消息
        my_ll_message.setOnClickListener(this);
        my_ll_leaguer.setOnClickListener(this);
        my_ll_achievement.setOnClickListener(this);

        //5.商城
        my_ll_coupon.setOnClickListener(this);
        my_ll_remainder.setOnClickListener(this);
        my_ll_leaguercard.setOnClickListener(this);
        my_ll_shopping.setOnClickListener(this);

        //6.设置
        my_ll_setting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_user_login :
        //1.用户登陆或详情
                myUserLogin();
                break;

        //2.想看的列表
            case R.id.tv_wish1:
                wishLook1();
                break;
            case R.id.tv_wish2:
                wishLook2();
                break;
            case R.id.tv_wish3:
                wishLook3();
                break;
            case R.id.tv_wish4:
                wishLook4();
                break;

        //3.我的评价4点击事件
            case R.id.tv_order_consume:
                //待消费
                toBeConsumed();
                break;
            case R.id.tv_order_payment:
                //待付款
                PendingPayment();
                break;
            case R.id.tv_order_evaluate:
                //待评价
                toBeEvaluated();
                break;
            case R.id.tv_order_refund:
                //退款
                Refund();
                break;

        //4.我的消息
            case R.id.my_ll_message:
                message();
                break;
            case R.id.my_ll_leaguer:
                leaguer();
                break;
            case R.id.my_ll_achievement:
                achievement();
                break;

        //5.商城
            case R.id.my_ll_coupon:
                coupon();
                break;
            case R.id.my_ll_remainder:
                remainder();
                break;
            case R.id.my_ll_leaguercard:
                leaguercard();
                break;
            case R.id.my_ll_shopping:
                shopping();
                break;

        //6.设置
            case R.id.my_ll_setting:
                setting();
                break;



        }
        rg_group.setVisibility(View.GONE);
    }


    //1.楼
    //A.登录或个人详情页面
    private void myUserLogin() {

        MyUserRegister myUserRegister = new MyUserRegister(rg_group);
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null).remove(this).add(R.id.fl_main_base,myUserRegister,"user").commit();
        myUserRegister.initData();

    }


//2.楼
    private void wishLook1() {
        ButtonWish1 buttonWish1 = new ButtonWish1();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null).remove(this).add(R.id.fl_main_base,buttonWish1,"wish1").commit();
        buttonWish1.initData();
    }

    private void wishLook2() {
        ButtonWish2 buttonWish2 = new ButtonWish2();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null).remove(this).add(R.id.fl_main_base,buttonWish2,"wish2").commit();
        buttonWish2.initData();
    }

    private void wishLook3() {
        ButtonWish3 buttonWish3 = new ButtonWish3();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null).remove(this).add(R.id.fl_main_base,buttonWish3,"wish3").commit();
        buttonWish3.initData();
    }

    private void wishLook4() {
        ButtonWish4 buttonWish4 = new ButtonWish4();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null).remove(this).add(R.id.fl_main_base,buttonWish4,"wish4").commit();
        buttonWish4.initData();
    }

//3.楼
    //B.待消费
    private void toBeConsumed() {
        MyToBeConsumed myToBeConsumed = new MyToBeConsumed(context);
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null).remove(this).add(R.id.fl_main_base,myToBeConsumed,"payment").commit();
        myToBeConsumed.initData();
    }

    //C.待付款
    private void PendingPayment() {
        MyPendingPayment myPendingPayment = new MyPendingPayment(context);
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null).remove(this).add(R.id.fl_main_base,myPendingPayment,"payment").commit();
        myPendingPayment.initData();
    }

    //D.待评价
    private void toBeEvaluated() {

    }
    //E.退款
    private void Refund() {

    }

//4.楼
    private void message() {

    }

    private void leaguer() {

    }

    private void achievement() {

    }

//5.楼
    private void coupon() {

    }

    private void remainder() {

    }

    private void leaguercard() {

    }

    private void shopping() {

    }

//6.楼

    private void setting() {

    }

    @Override
    public void onResume() {
        rg_group.setVisibility(View.VISIBLE);
        super.onResume();
        Log.e("生命周期", "resume");
    }

  /*  @Override
    public void onStart() {
        super.onStart();
        Log.e("生命周期","start");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("生命周期", "pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("生命周期", "stop");
    }

*/
}
