package com.hongyang.catmovie.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.fragment.CinemaFragment;
import com.hongyang.catmovie.fragment.FindFragment;
import com.hongyang.catmovie.fragment.MovieFragment;
import com.hongyang.catmovie.fragment.MyFragment;

import java.util.Date;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {
    private RelativeLayout rl_main_title;

    public FrameLayout fl_content;
    private RadioGroup rg_group;
    public TextView tv_movie_goto;
    private TextView cinema_tv_name;

    public FrameLayout fl_movie_scroll;
    private LinearLayout movietitle_scroll_parent;
    private TextView movietitle_scroll_slider,movietitle_scroll_hot,movietitle_scroll_wait,movietitle_scroll_sea;

    private LinearLayout ll_cinema_title;
    public ImageButton cinema_ib_region, cinema_ib_search;

    private FragmentManager fragmentManager;
//四个Fragment对象
    private MovieFragment movieFragment;
    private CinemaFragment cinemaFragment;
    private FindFragment findFragment;
    private MyFragment myFragment;

    private String isShow = "";
    private long startTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basepager);
        initView();
        initData();
        rg_group.setOnCheckedChangeListener(this);
        if(scrollPagerControl != null) {
            scrollPagerControl.scrollPager(movietitle_scroll_slider,movietitle_scroll_hot,movietitle_scroll_wait,movietitle_scroll_sea);
        }
    }

    private void initView() {
//1.初始化所有主界面中的视图对象，包括标题栏和RadioGroup，RadioButton不需要初始化；
        //公共的主界面视图对象
        rl_main_title = (RelativeLayout) findViewById(R.id.rl_main_title);

        rg_group = (RadioGroup) findViewById(R.id.rg_group);
        fl_content = (FrameLayout)findViewById(R.id.fl_content);
        tv_movie_goto = (TextView)findViewById(R.id.tv_movie_goto);
        cinema_tv_name = (TextView) findViewById(R.id.cinema_tv_name);

        //自定义的滑块的移动动画控件
        fl_movie_scroll = (FrameLayout)findViewById(R.id.fl_movie_scroll);//设置总体的隐藏
        movietitle_scroll_parent = (LinearLayout) findViewById(R.id.movietitle_scroll_parent);//获取距离参数，实时滚动，不需要时再删
        movietitle_scroll_slider = (TextView) findViewById(R.id.movietitle_scroll_slider);
        movietitle_scroll_hot = (TextView) findViewById(R.id.movietitle_scroll_hot);
        movietitle_scroll_wait = (TextView) findViewById(R.id.movietitle_scroll_wait);
        movietitle_scroll_sea = (TextView) findViewById(R.id.movietitle_scroll_sea);

        //影院页面中的需要的标题栏视图对象
        ll_cinema_title = (LinearLayout) findViewById(R.id.ll_cinema_title);//设置总体的隐藏
        cinema_ib_region = (ImageButton)findViewById(R.id.cinema_ib_region);
        cinema_ib_search = (ImageButton)findViewById(R.id.cinema_ib_search);
    }

    private void initData() {
        rg_group.check(R.id.rb_movie);
        //隐藏影院中的相关视图对象
        ll_cinema_title.setVisibility(View.INVISIBLE);
        cinema_tv_name.setVisibility(View.INVISIBLE);

        fragmentManager = getSupportFragmentManager();
//2.首次进入即创建第一个MovieFragment页面并加载数据
        movieFragment = new MovieFragment();
        isShow = "movie";
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fl_content,movieFragment, "movie").commit();
    }

    //3.按钮的点击事件的监听
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_movie:
                rl_main_title.setVisibility(View.VISIBLE);
                //显示本视图对象
                tv_movie_goto.setVisibility(View.VISIBLE);
                fl_movie_scroll.setVisibility(View.VISIBLE);
                //隐藏影院中的相关视图对象
                ll_cinema_title.setVisibility(View.INVISIBLE);
                cinema_tv_name.setVisibility(View.INVISIBLE);

               /* if(movieFragment == null) {
                    movieFragment = new MovieFragment();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.add(R.id.fl_content,movieFragment, "movie").commit();
                }*/
                fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag(isShow)).show(movieFragment).commit();
                isShow = "movie";

                Log.e("显示movieFragment","隐藏"+isShow+"Fragment"+movieFragment.toString());
                break;
            case R.id.rb_cinema:
                rl_main_title.setVisibility(View.VISIBLE);
                //显示影院中的视图对象
                tv_movie_goto.setVisibility(View.VISIBLE);
                ll_cinema_title.setVisibility(View.VISIBLE);
                cinema_tv_name.setVisibility(View.VISIBLE);
                cinema_tv_name.setText("影院");
                //隐藏其他相关视图对象
                fl_movie_scroll.setVisibility(View.INVISIBLE);

                if(cinemaFragment == null) {
                    cinemaFragment = new CinemaFragment();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.hide(fragmentManager.findFragmentByTag(isShow)).add(R.id.fl_content,cinemaFragment, "cinema").commit();
                }else{
                    fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag(isShow)).show(cinemaFragment).commit();
                }
                isShow = "cinema";

                Log.e("显示cinemaFragment","隐藏"+isShow+"Fragment"+cinemaFragment.toString());
                break;
            case R.id.rb_find:
                rl_main_title.setVisibility(View.VISIBLE);
                //只显示标题，其他隐藏
                cinema_tv_name.setVisibility(View.VISIBLE);
                cinema_tv_name.setText("发现");
                ll_cinema_title.setVisibility(View.INVISIBLE);
                fl_movie_scroll.setVisibility(View.INVISIBLE);
                tv_movie_goto.setVisibility(View.INVISIBLE);

                if(findFragment == null) {
                    findFragment = new FindFragment();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.hide(fragmentManager.findFragmentByTag(isShow)).add(R.id.fl_content,findFragment, "find").commit();
                }else{
                    fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag(isShow)).show(findFragment).commit();
                }
                isShow = "find";
                Log.e("显示findFragment", "隐藏"+isShow+"Fragment"+findFragment.toString());
                break;
            case R.id.rb_my:
                rl_main_title.setVisibility(View.GONE);

                if(myFragment == null) {
                    myFragment = new MyFragment();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.hide(fragmentManager.findFragmentByTag(isShow)).add(R.id.fl_content, myFragment, "my").commit();
                }else{
                    fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag(isShow)).show(myFragment).commit();
                }
                isShow = "my";
                Log.e("显示myFragment", "隐藏"+isShow+"Fragment"+myFragment.toString());
                break;
        }
    }

//设置2秒内连续两次点击返回，退出应用；
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.KEYCODE_BACK:
                Log.e("系统时间", startTime + "");
                Toast.makeText(MainActivity.this, "再次点击退出", Toast.LENGTH_SHORT).show();
                long endTime = new Date(System.currentTimeMillis()).getTime();
                if (endTime - startTime < 2000) {
                    finish();
                }
                startTime = endTime;
                break;
        }
        return true;
    }


//创建接口，实现标题栏的点击可改变viewpager的页面
    public interface ScrollPagerControl{
        void scrollPager(TextView movietitle_scroll_slider, TextView movietitle_scroll_hot, TextView movietitle_scroll_wait, TextView movietitle_scroll_sea);
    }
    private ScrollPagerControl scrollPagerControl;
    public void getScrollPagerManager(ScrollPagerControl scrollPagerControl){
        this.scrollPagerControl = scrollPagerControl;
    }
}
