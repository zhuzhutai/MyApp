package com.hongyang.catmovie.pager.mypager.ceng1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;

import java.util.HashMap;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.qzone.QZone;
import cn.sharesdk.wechat.friends.Wechat;

/**
 * Created by Administrator on 2016/.
 */
public class MyUserRegister extends BaseFragment implements View.OnClickListener {
    private final RadioGroup rg_group;
    //从MainActivity得到的管理者

    private TextView tv_user_register,tv_forget_psd,tv_quick_login;
    private ImageView iv_weixin_login,iv_qq_login,iv_xinlang_login,iv_qqz_login;

    public MyUserRegister(RadioGroup rg_group) {
        this.rg_group = rg_group;
    }


    @Override
    public View initView() {
//1.开启我的中的专属界面，需要设置radioGroup的隐藏，在销毁时再显示出来；
        /*rg_group.setVisibility(View.GONE);*/
        View view = inflater.inflate(R.layout.my_user_register,null);
        //立即注册
        tv_user_register = (TextView) view.findViewById(R.id.tv_user_register);
        //忘记密码
        tv_forget_psd = (TextView)view.findViewById(R.id.tv_forget_psd);
        //手机快捷登录
        tv_quick_login = (TextView)view.findViewById(R.id.tv_quick_login);

        tv_user_register.setOnClickListener(this);
        tv_forget_psd.setOnClickListener(this);
        tv_quick_login.setOnClickListener(this);


        //第三方登录
        iv_weixin_login = (ImageView) view.findViewById(R.id.iv_weixin_login);
        iv_qq_login = (ImageView) view.findViewById(R.id.iv_qq_login);
        iv_xinlang_login = (ImageView) view.findViewById(R.id.iv_xinlang_login);
        iv_qqz_login = (ImageView) view.findViewById(R.id.iv_qqz_login);


        tv_quick_login.setOnClickListener(this);
        iv_weixin_login.setOnClickListener(this);
        iv_qq_login.setOnClickListener(this);
        iv_xinlang_login.setOnClickListener(this);
        iv_qqz_login.setOnClickListener(this);
        return view;
    }

    @Override
    public void initData() {
        //界面中所有的点击跳转页面的响应
       /* tv_user_register.setOnClickListener(this);
        tv_forget_psd.setOnClickListener(this);
        tv_quick_login.setOnClickListener(this);*/

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_user_register :
                register();
                break;
            case R.id.tv_forget_psd:

                break;
            case R.id.tv_quick_login:
                showShare();
                break;

            //第三方与分享
            case R.id.iv_weixin_login:
                WechatLogin();
                break;
            case R.id.iv_qq_login:
                QQLogin();
                break;
            case R.id.iv_xinlang_login:
                sinaWeiboLogin();
                break;
            case R.id.iv_qqz_login:
                qZoneLogin();
                break;
        }
    }

    //QQ登录
    private void QQLogin() {
        Log.e("第三方登录","执行");
        Platform weibo = ShareSDK.getPlatform(QQ.NAME);
        weibo.SSOSetting(false);  //设置false表示使用SSO授权方式
        weibo.setPlatformActionListener(new PlatformActionListener() {
            @Override
            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                Log.e("第三方登录","成功");
            }

            @Override
            public void onError(Platform platform, int i, Throwable throwable) {
                Log.e("第三方登录","失败");
            }

            @Override
            public void onCancel(Platform platform, int i) {
                Log.e("第三方登录","取消");
            }
        }); // 设置分享事件回调
        weibo.authorize();
    }

    //微信登录
    private void WechatLogin() {
        Log.e("第三方登录", "执行");
        Platform wechat = ShareSDK.getPlatform(Wechat.NAME);
        wechat.SSOSetting(false);  //设置false表示使用SSO授权方式
        wechat.setPlatformActionListener(new PlatformActionListener() {
            @Override
            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                Log.e("第三方登录", "成功");
            }

            @Override
            public void onError(Platform platform, int i, Throwable throwable) {
                Log.e("第三方登录", "失败");
            }

            @Override
            public void onCancel(Platform platform, int i) {
                Log.e("第三方登录", "取消");
            }
        }); // 设置分享事件回调
        wechat.authorize();
    }

    //QQ空间登录
    private void qZoneLogin() {
        Log.e("第三方登录","执行");
        Platform qZone = ShareSDK.getPlatform(QZone.NAME);
        qZone.SSOSetting(false);  //设置false表示使用SSO授权方式
        qZone.setPlatformActionListener(new PlatformActionListener() {
            @Override
            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                Log.e("第三方登录","成功");
            }

            @Override
            public void onError(Platform platform, int i, Throwable throwable) {
                Log.e("第三方登录","失败");
            }

            @Override
            public void onCancel(Platform platform, int i) {
                Log.e("第三方登录","取消");
            }
        }); // 设置分享事件回调
        qZone.authorize();
    }

    //QQ空间登录
    private void sinaWeiboLogin() {
        Log.e("第三方登录","执行");
        Platform sinaWeibo = ShareSDK.getPlatform(SinaWeibo.NAME);
        sinaWeibo.SSOSetting(false);  //设置false表示使用SSO授权方式
        sinaWeibo.setPlatformActionListener(new PlatformActionListener() {
            @Override
            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                Log.e("第三方登录","成功");
            }

            @Override
            public void onError(Platform platform, int i, Throwable throwable) {
                Log.e("第三方登录","失败");
            }

            @Override
            public void onCancel(Platform platform, int i) {
                Log.e("第三方登录","取消");
            }
        }); // 设置分享事件回调
        sinaWeibo.authorize();
    }












    //立即注册
    private void register() {
        MyMeiTuanRegister myMeiTuanRegister = new MyMeiTuanRegister();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        /////
        transaction.remove(this).add(R.id.fl_main_base,myMeiTuanRegister,"meitun").addToBackStack(null).commit();
        myMeiTuanRegister.initData();
    }

    private void showShare() {
        ShareSDK.initSDK(context);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

// 分享时Notification的图标和文字  2.5.9以后的版本不调用此方法
        //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
        oks.setTitle(getString(R.string.share));
        // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://sharesdk.cn");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://sharesdk.cn");

// 启动分享GUI
        oks.show(context);
    }




    @Override
    public void onDestroy() {
        super.onDestroy();
        rg_group.setVisibility(View.VISIBLE);
        Log.e("生命周期2", "destroy");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("生命周期2", "start");
    }


    @Override
    public void onResume() {
//        rg_group.setVisibility(View.VISIBLE);
        super.onResume();
        Log.e("生命周期2", "resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("生命周期2", "pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("生命周期2", "stop");
    }
}
