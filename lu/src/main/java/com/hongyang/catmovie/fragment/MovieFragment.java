package com.hongyang.catmovie.fragment;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;
import com.hongyang.catmovie.base.BaseViewPager;
import com.hongyang.catmovie.bean.MovieFimlBean;
import com.hongyang.catmovie.bean.MovieTopPicBean;
import com.hongyang.catmovie.pager.MovieHotPager;
import com.hongyang.catmovie.util.VolleyNetWorking;
import com.hongyang.catmovie.util.Website;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/25.
 */
public class MovieFragment extends BaseFragment implements View.OnClickListener {
    private final TextView movietitle_scroll_slider,movietitle_scroll_hot, movietitle_scroll_wait,movietitle_scroll_sea;
    private ViewPager vp_movie_fragment;
    private List<BaseViewPager> datas;
    private List<MovieFimlBean.DataBean.MoviesBean> movies;
    private ArrayList<Boolean> booleans;
    private List<MovieTopPicBean.DataBean> pics;
    private int width;
    private int height;

    public MovieFragment(TextView movietitle_scroll_slider,TextView movietitle_scroll_hot
            ,TextView movietitle_scroll_wait
                        ,TextView movietitle_scroll_sea) {
        this.movietitle_scroll_slider = movietitle_scroll_slider;
        this.movietitle_scroll_hot = movietitle_scroll_hot;
        this.movietitle_scroll_wait = movietitle_scroll_wait;
        this.movietitle_scroll_sea = movietitle_scroll_sea;
    }

    @Override
    public View initView() {
//1.创建viewpager的布局和视图对象的初始化
        View view = inflater.inflate(R.layout.movie_pager, null);
        vp_movie_fragment = (ViewPager) view.findViewById(R.id.vp_movie_fragment);


        movietitle_scroll_hot.setOnClickListener(this);
        movietitle_scroll_wait.setOnClickListener(this);
        movietitle_scroll_sea.setOnClickListener(this);

        return view;
    }

    @Override
    public void initData(){
//2.创建集合，在ViewPage中添加对应的三个页面
        datas = new ArrayList();


        movietitle_scroll_slider.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onGlobalLayout() {
                movietitle_scroll_slider.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                width = movietitle_scroll_slider.getWidth();
                height = movietitle_scroll_slider.getHeight();
                Log.e("控件的宽度", "" + width);

            }
        });


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

//4.联网请求轮播图的数据
        VolleyNetWorking volleyPic = new VolleyNetWorking(Website.MOVIE_LUNBO);
        volleyPic.getVolleyData(new VolleyNetWorking.VolleyUtil() {
            @Override
            public void getJson(String json) {
                //解析数据
                if (json != "" && json != null) {
                    resolveData2(json);
                } else {
                    Toast.makeText(context, "没有数据", Toast.LENGTH_SHORT).show();
                }
            }
        });
        volleyPic.progressData(context);
    }

    private void resolveData2(String json) {
        MovieTopPicBean topPicBean = new Gson().fromJson(json, MovieTopPicBean.class);
        pics = topPicBean.getData();

    }

//4.解析json数据
    private void resolveData(String json) {
        MovieFimlBean movieFimlBeans = new Gson().fromJson(json, MovieFimlBean.class);
        //取得item对应的电影信息，加载时每次12个item，一共52个；暂定
        movies = movieFimlBeans.getData().getMovies();
        booleans = new ArrayList<>();
        try {
            JSONObject data = new JSONObject(json).optJSONObject("data");
            JSONArray movies = data.optJSONArray("movies");
            for (int i = 0; i < movies.length(); i++) {
                JSONObject jdata = (JSONObject) movies.get(i);
                booleans.add(jdata.optBoolean("3d"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

//5.创建list集合，存放需要显示到viewpager中视图对象
        //添加热映界面的数据
        datas.add(new MovieHotPager(context, movies,booleans,pics));
        //添加待映界面的数据
        datas.add(new MovieHotPager(context, movies,booleans,pics));
        //添加海外界面的数据
        datas.add(new MovieHotPager(context, movies,booleans,pics));
//6.将数据和页面加载到ViewPager上
        vp_movie_fragment.setAdapter(new MyViewpagerAdapter());
        vp_movie_fragment.addOnPageChangeListener(new MyPageChangeListener());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.movietitle_scroll_hot:
                vp_movie_fragment.setCurrentItem(0);
                break;
            case  R.id.movietitle_scroll_wait:
                vp_movie_fragment.setCurrentItem(1);
                break;
            case  R.id.movietitle_scroll_sea:
                vp_movie_fragment.setCurrentItem(2);
                break;
        }
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
            float marginLeft = width * (position + positionOffset);
            Log.e("控件移动", "" + marginLeft);
            Log.e("positionOffset", "" + positionOffset);
            /*movietitle_scroll_hot
                    movietitle_scroll_wait
            movietitle_scroll_sea*/
            float v = position + positionOffset;
            Log.e("测试总值", "" + v);
//            movietitle_scroll_hot.setTextColor(Color.argb((int) (127 * v), 255, 0, 0));
//            movietitle_scroll_wait.setTextColor(Color.argb((int) (127 * v), 255, 255, 255));
//            movietitle_scroll_sea.setTextColor(Color.argb((int)(127*v),255,0,0));
            if(v > 0 && v < 0.4) {
                movietitle_scroll_hot.setTextColor(Color.argb((int) (500*(0.999-positionOffset)), 255, 0, 0));
                movietitle_scroll_wait.setTextColor(Color.argb((int)(500*(0.999-positionOffset)),255,255,255));
            }else if(v >= 0.6 && v < 1){
                movietitle_scroll_hot.setTextColor(Color.argb((int)(500*positionOffset),255,255,255));
                movietitle_scroll_wait.setTextColor(Color.argb((int)(500*positionOffset),255,0,0));
            }else if(v > 1 && v <= 1.4){
                movietitle_scroll_wait.setTextColor(Color.argb((int)(500*(0.999-positionOffset)),255,0,0));
                movietitle_scroll_sea.setTextColor(Color.argb((int)(500*(0.999-positionOffset)),255,255,255));
            }else if(v > 1.6 && v < 2){
                movietitle_scroll_wait.setTextColor(Color.argb((int)(500*positionOffset),255,255,255));
                movietitle_scroll_sea.setTextColor(Color.argb((int)(500*positionOffset),255,0,0));
            }else if(v == 2){
                movietitle_scroll_sea.setTextColor(Color.argb(255, 255, 0, 0));
                movietitle_scroll_wait.setTextColor(Color.argb(255, 255, 255, 255));
                movietitle_scroll_hot.setTextColor(Color.argb(255, 255, 255, 255));
            }else if(v == 1) {
                movietitle_scroll_wait.setTextColor(Color.argb(255, 255, 0, 0));
                movietitle_scroll_hot.setTextColor(Color.argb(255, 255, 255, 255));
                movietitle_scroll_sea.setTextColor(Color.argb(255, 255, 255, 255));
            }else if(v == 0) {
                movietitle_scroll_hot.setTextColor(Color.argb(255, 255, 0, 0));
                movietitle_scroll_wait.setTextColor(Color.argb(255, 255, 255, 255));
                movietitle_scroll_sea.setTextColor(Color.argb(255,255,255,255));
            }
            RelativeLayout.LayoutParams params  = new RelativeLayout.LayoutParams(width,height);
            params.leftMargin  = (int) marginLeft;
            Log.e("控件移动2", "" + params);
            movietitle_scroll_slider.setLayoutParams(params);
        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

}
