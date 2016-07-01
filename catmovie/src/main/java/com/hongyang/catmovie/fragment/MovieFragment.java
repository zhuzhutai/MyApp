package com.hongyang.catmovie.fragment;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;
import com.hongyang.catmovie.base.BaseViewPager;
import com.hongyang.catmovie.bean.MovieFimlBean;
import com.hongyang.catmovie.pager.MovieHotPager;
import com.hongyang.catmovie.util.VolleyNetWorking;
import com.hongyang.catmovie.util.Website;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/25.
 */
public class MovieFragment extends BaseFragment{
    private ViewPager vp_movie_fragment;
    private List<BaseViewPager> datas;
    private List<MovieFimlBean.DataBean.MoviesBean> movies;

    @Override
    public View initView() {
//1.创建viewpager的布局和视图对象的初始化
        View view = inflater.inflate(R.layout.movie_pager, null);
        vp_movie_fragment = (ViewPager) view.findViewById(R.id.vp_movie_fragment);
        return view;
    }

    @Override
    public void initData(){
//2.创建集合，在ViewPage中添加对应的三个页面
        datas = new ArrayList();

//3.联网请求数据
        VolleyNetWorking volleyNetWorking = new VolleyNetWorking(Website.MOVIE_HOT_URL);
        volleyNetWorking.getVolleyData(new VolleyNetWorking.VolleyUtil() {
            @Override
            public void getJson(String json) {
                //解析数据
                if (json != "" && json != null) {
                    resolveData(json);
                } else {
                    Toast.makeText(context, "没有数据", Toast.LENGTH_SHORT).show();
                }
            }
        });
        volleyNetWorking.progressData(context);
    }
//4.解析json数据
    private void resolveData(String json) {
        MovieFimlBean movieFimlBeans = new Gson().fromJson(json, MovieFimlBean.class);
        //取得item对应的电影信息，加载时每次12个item，一共52个；暂定
        movies = movieFimlBeans.getData().getMovies();


//5.创建list集合，存放需要显示到viewpager中视图对象
        //添加热映界面的数据
        datas.add(new MovieHotPager(context, movies));
        //添加待映界面的数据
        datas.add(new MovieHotPager(context, movies));
        //添加海外界面的数据
        datas.add(new MovieHotPager(context, movies));
//6.将数据和页面加载到ViewPager上
        vp_movie_fragment.setAdapter(new MyViewpagerAdapter());
        vp_movie_fragment.addOnPageChangeListener(new MyPageChangeListener());
    }


    private class MyViewpagerAdapter extends PagerAdapter {
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            MovieHotPager movieView = (MovieHotPager) datas.get(position);
            container.addView(movieView.view );
            return movieView.view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
           container.removeView((View) object);
        }

        @Override
        public int getCount() {
            return datas.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }

    private class MyPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

}
