package com.hongyang.catmovie.fragment;

import android.view.View;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;

/**
 * Created by Administrator on 2016/6/25.
 */
public class FindFragment extends BaseFragment {

    @Override
    public View initView() {
        View view = inflater.inflate(R.layout.movie_pager, null);
        return view;
    }

    @Override
    public void initData(){
    }
}
