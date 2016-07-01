package com.viewpager;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TnnoWu on 2016/01/28.
 */
public class ForthActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {
    private ViewPager viewPager;
    private ImageView imageView;
    private TextView tv_one,tv_two,tv_three,tv_abs;
    private View view4,view5,view6;

    private ArrayList<View> arrayList;
    private int offset = 0;//移动条图片的偏移量
    private int currIndex = 0;//当前页面的编号
    private int bmpWidth;// 移动条图片的长度
    private int one = 0; //移动条滑动一页的距离
    private int two = 0; //滑动条移动两页的距离

    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forthactivity);
        initview();
    }

    private void initview() {


        viewPager = (ViewPager) findViewById(R.id.vp_four);
        imageView = (ImageView) findViewById(R.id.image);
        tv_one = (TextView) findViewById(R.id.tv_one);
        tv_two = (TextView) findViewById(R.id.tv_two);
        tv_three = (TextView) findViewById(R.id.tv_three);

        //下划线动画相关设置
        bmpWidth = BitmapFactory.decodeResource(getResources(),R.mipmap.line).getWidth();   //获取图片宽度
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenW = displayMetrics.widthPixels;   //获取分辨率宽度
        offset = (screenW / 3 - bmpWidth) / 2;  //  计算偏移量
        Matrix matrix = new Matrix();
        matrix.postTranslate(offset,0);
        imageView.setImageMatrix(matrix);   //设置动画初始位置

        //移动的距离
        one = offset * 2 + bmpWidth;    //移动一页的偏移量，比如1->2,或者2->3
        two = one * 2;  //移动两夜的偏移量，比如1直接跳到3

        //往ViewPager填充View，同时设置点击事件与页面切换事件
        arrayList = new ArrayList<View>();
        LayoutInflater layoutInflater = getLayoutInflater();

        View viewq = View.inflate(this, R.layout.view1, null);
        ImageView picq = (ImageView) viewq.findViewById(R.id.pic1);
        tv_abs = (TextView) viewq.findViewById(R.id.tv_abs);
        tv_abs.setText("zhebushiahdasdasd");
        picq.setImageResource(R.drawable.a);

        arrayList.add(layoutInflater.inflate(R.layout.view1,null,false));
        arrayList.add(layoutInflater.inflate(R.layout.view2,null,false));
        arrayList.add(layoutInflater.inflate(R.layout.view3,null,false));
        viewPager.setAdapter(new MyPagerAdapter(arrayList));
        viewPager.setCurrentItem(0);    //设置ViewPager当前页，从0开始算

        tv_one.setOnClickListener(this);
        tv_two.setOnClickListener(this);
        tv_three.setOnClickListener(this);

        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_one:
                viewPager.setCurrentItem(0);
                break;
            case R.id.tv_two:
                viewPager.setCurrentItem(1);
                break;
            case R.id.tv_three:
                viewPager.setCurrentItem(2);
                break;
        }
    }

    @Override
    public void onPageScrolled(int state, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Animation animation = null;
        switch (position)
        {
            case 0:
                if (currIndex == 1)
                {
                    animation = new TranslateAnimation(one,0,0,0);
                }
                else if (currIndex == 2)
                {
                    animation = new TranslateAnimation(two,0,0,0);
                }
                break;
            case 1:
                if (currIndex == 0)
                {
                    animation = new TranslateAnimation(offset,one,0,0);
                }
                else if (currIndex == 2)
                {
                    animation = new TranslateAnimation(two,one,0,0);
                }
                break;
            case 2:
                if (currIndex == 0)
                {
                    animation = new TranslateAnimation(offset,two,0,0);
                }
                else if (currIndex == 1)
                {
                    animation = new TranslateAnimation(one,two,0,0);
                }
                break;
        }
        currIndex = position;
        animation.setFillAfter(true);   //true表示图片停在动画结束位置
        animation.setDuration(300); //设置动画时间为300毫秒
        imageView.startAnimation(animation);    //开始动画s
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
