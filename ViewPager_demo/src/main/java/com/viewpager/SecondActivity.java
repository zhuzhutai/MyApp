package com.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by TnnoWu on 2016/01/28.
 */
public class SecondActivity extends AppCompatActivity{
    private ViewPager viewPager;
    private ArrayList<View> arrayList;
    private ArrayList<String> stringArrayList;
    private MyPagerAdapterII myPagerAdapterII;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        viewPager = (ViewPager) findViewById(R.id.vp_two);
        arrayList = new ArrayList<View>();
        LayoutInflater layoutInflater = getLayoutInflater();
        arrayList.add(layoutInflater.inflate(R.layout.view1,null,false));
        arrayList.add(layoutInflater.inflate(R.layout.view2,null,false));
        arrayList.add(layoutInflater.inflate(R.layout.view3,null,false));
        stringArrayList = new ArrayList<String>();
        stringArrayList.add("橘黄");
        stringArrayList.add("淡黄");
        stringArrayList.add("浅棕");
        myPagerAdapterII = new MyPagerAdapterII(arrayList,stringArrayList);
        viewPager.setAdapter(myPagerAdapterII);
    }
}
