package com.hongyang.catmovie.pager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseViewPager;
import com.hongyang.catmovie.bean.MovieFimlBean;
import com.hongyang.catmovie.bean.MovieTopPicBean;
import com.hongyang.catmovie.util.RecyclerViewDecoration;
import com.hongyang.catmovie.util.VolleyNetWorking;
import com.hongyang.catmovie.adapter.HeadFootAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/26.
 */
public class MovieHotPager extends BaseViewPager {

    private final ArrayList booleans;
    private final List<MovieTopPicBean.DataBean> pics;
    private List<MovieFimlBean.DataBean.MoviesBean> movies;
    private RecyclerView rv_movie_hot;
    public View view;

    public MovieHotPager(Context context,
                         List<MovieFimlBean.DataBean.MoviesBean> movies,
                         ArrayList booleans,
                         List<MovieTopPicBean.DataBean> pics) {
        super(context);
        this.movies = movies;
        this.view = initView();
        this.booleans = booleans;
        this.pics = pics;
    }

    @Override
    public View initView() {
        View view = View.inflate(context,R.layout.movie_hot,null);
        rv_movie_hot = (RecyclerView)view.findViewById(R.id.rv_movie_hot);

        //使用第三方的Adapter
        rv_movie_hot.setAdapter(new myHeadAdapter());
        rv_movie_hot.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        //设置分隔线
        rv_movie_hot.addItemDecoration(new RecyclerViewDecoration(context, RecyclerViewDecoration.VERTICAL_LIST
        ));

        return view;
    }


    class myHeadAdapter extends HeadFootAdapter<HeadViewHolder,FootViewHolder,ItemViewHolder>{
        @Override
        public HeadViewHolder onCreateHeaderViewHolder(ViewGroup parent, int position) {
            View view = View.inflate(context, R.layout.movie_recyclerview_header,null);
            return new HeadViewHolder(view);
        }

        @Override public ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int position) {
            View view = View.inflate(context, R.layout.hot_item,null);
            return new ItemViewHolder(view);
        }

        @Override public FootViewHolder onCreateFooterViewHolder(ViewGroup parent, int position) {
            return null;
        }

        @Override public void onBindHeaderViewHolder(HeadViewHolder holder, int position) {
            holder.vp_content.setAdapter(new PagerAdapter() {
                @Override
                public int getCount() {
                    return 3;
                }

                @Override
                public boolean isViewFromObject(View view, Object object) {
                    return view == object;
                }

                @Override
                public Object instantiateItem(ViewGroup container, int position) {
                    ImageView imageView = new ImageView(context);
                    new VolleyNetWorking(pics.get(position).getImgUrl()).loaderImager(imageView);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    container.addView(imageView);
                    return imageView;
                }

                @Override
                public void destroyItem(ViewGroup container, int position, Object object) {
                    container.removeView((View) object);
                }
            });
        }

        @Override
        public void onBindItemViewHolder(ItemViewHolder holder, int position) {
            MovieFimlBean.DataBean.MoviesBean moviesBean = movies.get(position);
            holder.tv_item_title.setText(moviesBean.getNm());
            holder.tv_score.setText(moviesBean.getSc()+"");
            holder.tv_content_three.setText(moviesBean.getScm());
            holder.tv_cinema_content.setText(moviesBean.getShowInfo());

            //1.购票预售的判断
            switch (moviesBean.getPreSale()) {
                case  1:
                    holder.bt_item_buy.setText("预售");
                    holder.bt_item_buy.setTextColor(0xff3399cb);
                    break;
                case 0:
                    holder.bt_item_buy.setText("购票");
                    holder.bt_item_buy.setTextColor(0xffff9a02);
                    break;
            }

            //2.分数，想看的判断
            if(moviesBean.getSc() > 0) {
                holder.tv_score.setText(moviesBean.getSc()+"");
                holder.tv_score_suffix.setText("分");
            }else{
                holder.tv_score.setText(moviesBean.getWish()+"");
                holder.tv_score_suffix.setText("人想看");
            }
            //3.3dMax的判断
            //Log.e("tag",booleans.toString());
            if((boolean)booleans.get(position)) {
                holder.tv_3d.setVisibility(View.VISIBLE);
                if(moviesBean.isImax()) {
                    holder.tv_imax.setVisibility(View.VISIBLE);
                }else{
                    holder.tv_imax.setVisibility(View.GONE);
                }
            }else{
                holder.tv_3d.setVisibility(View.GONE);
                holder.tv_imax.setVisibility(View.GONE);
            }
            //4.

            VolleyNetWorking volleyNetWorking = new VolleyNetWorking(moviesBean.getImg());
            volleyNetWorking.loaderImager(holder.iv_item_pic);

        }

        @Override public void onBindFooterViewHolder(FootViewHolder holder, int position) {
        }

        @Override
        public int getItemViewCount() {
            return movies.size();
        }

        @Override
        public int getHeadViewCount() {
            return 1;
        }

        @Override
        public int getFootViewCount() {
            return 0;
        }

    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        private final TextView tv_yingping_content,tv_score,tv_score_suffix,tv_item_two,tv_content_three,tv_cinema_content,tv_imax,tv_3d,tv_item_title;
        private final Button bt_item_buy,bt_yingping;
        private final LinearLayout ll_score,ll_item_add,ll_item_add_child;
        private final ImageView iv_item_pic;


        public ItemViewHolder(View itemView) {
            super(itemView);
            //隐藏或加载布局视图组件
            tv_3d = (TextView) itemView.findViewById(R.id.tv_3d );
            tv_imax= (TextView) itemView.findViewById(R.id.tv_imax);
            ll_score= (LinearLayout) itemView.findViewById(R.id.ll_score);
            ll_item_add= (LinearLayout) itemView.findViewById(R.id.ll_item_add);

            //相对定位用到的id，可不初始化
               /* rl_title
                ll_item*/

            //加载内容视图对象
            iv_item_pic= (ImageView) itemView.findViewById(R.id.iv_item_pic);
            tv_item_title= (TextView) itemView.findViewById(R.id.tv_item_title);

            tv_score= (TextView) itemView.findViewById(R.id.tv_score);
            tv_score_suffix = (TextView) itemView.findViewById(R.id.tv_score_suffix);

            tv_item_two= (TextView) itemView.findViewById(R.id.tv_item_two);
            tv_content_three= (TextView) itemView.findViewById(R.id.tv_content_three);
            tv_cinema_content= (TextView) itemView.findViewById(R.id.tv_cinema_content);
            bt_item_buy= (Button) itemView.findViewById(R.id.bt_item_buy);
            ll_item_add_child= (LinearLayout) itemView.findViewById(R.id.ll_item_add_child);
            bt_yingping= (Button) itemView.findViewById(R.id.bt_yingping);
            tv_yingping_content= (TextView) itemView.findViewById(R.id.tv_yingping_content);
        }
    }

    class HeadViewHolder extends RecyclerView.ViewHolder{
        private final ViewPager vp_content;

        public HeadViewHolder(View itemView) {
            super(itemView);
            vp_content = (ViewPager) itemView.findViewById(R.id.vp_content);

        }
    }

    class FootViewHolder extends RecyclerView.ViewHolder{
        public FootViewHolder(View itemView) {
            super(itemView);
        }
    }





     /* private class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyHolder> {
        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(context, R.layout.hot_item,null);
            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {

            MovieFimlBean.DataBean.MoviesBean moviesBean = movies.get(position);
            holder.tv_item_title.setText(moviesBean.getNm());
            holder.tv_score.setText(moviesBean.getSc()+"");
            holder.tv_content_three.setText(moviesBean.getScm());
            holder.tv_cinema_content.setText(moviesBean.getShowInfo());

            //1.购票预售的判断
            switch (moviesBean.getPreSale()) {
                case  1:
                    holder.bt_item_buy.setText("预售");
                    holder.bt_item_buy.setTextColor(0xff3399cb);
                    break;
                case 0:
                    holder.bt_item_buy.setText("购票");
                    holder.bt_item_buy.setTextColor(0xffff9a02);
                    break;
            }

            //2.分数，想看的判断
            if(moviesBean.getSc() > 0) {
                holder.tv_score.setText(moviesBean.getSc()+"");
                holder.tv_score_suffix.setText("分");
            }else{
                holder.tv_score.setText(moviesBean.getWish()+"");
                holder.tv_score_suffix.setText("人想看");
            }
            //3.3dMax的判断
            //Log.e("tag",booleans.toString());
            if((boolean)booleans.get(position)) {
                holder.tv_3d.setVisibility(View.VISIBLE);
                if(moviesBean.isImax()) {
                    holder.tv_imax.setVisibility(View.VISIBLE);
                }else{
                    holder.tv_imax.setVisibility(View.GONE);
                }
            }else{
                holder.tv_3d.setVisibility(View.GONE);
               holder.tv_imax.setVisibility(View.GONE);
            }
            //4.

            VolleyNetWorking volleyNetWorking = new VolleyNetWorking(moviesBean.getImg());
            volleyNetWorking.loaderImager(holder.iv_item_pic);

        }

        @Override
        public int getItemCount() {
            return movies.size();
        }

        class MyHolder extends RecyclerView.ViewHolder{

            private final TextView tv_yingping_content,tv_score,tv_score_suffix,tv_item_two,tv_content_three,tv_cinema_content,tv_imax,tv_3d,tv_item_title;
            private final Button bt_item_buy,bt_yingping;
            private final LinearLayout ll_score,ll_item_add,ll_item_add_child;
            private final ImageView iv_item_pic;


            public MyHolder(View itemView) {
                super(itemView);
                //隐藏或加载布局视图组件
                tv_3d = (TextView) itemView.findViewById(R.id.tv_3d );
                tv_imax= (TextView) itemView.findViewById(R.id.tv_imax);
                ll_score= (LinearLayout) itemView.findViewById(R.id.ll_score);
                ll_item_add= (LinearLayout) itemView.findViewById(R.id.ll_item_add);

                //相对定位用到的id，可不初始化
               *//* rl_title
                ll_item*//*

                //加载内容视图对象
                iv_item_pic= (ImageView) itemView.findViewById(R.id.iv_item_pic);
                tv_item_title= (TextView) itemView.findViewById(R.id.tv_item_title);

                tv_score= (TextView) itemView.findViewById(R.id.tv_score);
                tv_score_suffix = (TextView) itemView.findViewById(R.id.tv_score_suffix);

                tv_item_two= (TextView) itemView.findViewById(R.id.tv_item_two);
                tv_content_three= (TextView) itemView.findViewById(R.id.tv_content_three);
                tv_cinema_content= (TextView) itemView.findViewById(R.id.tv_cinema_content);
                bt_item_buy= (Button) itemView.findViewById(R.id.bt_item_buy);
                ll_item_add_child= (LinearLayout) itemView.findViewById(R.id.ll_item_add_child);
                bt_yingping= (Button) itemView.findViewById(R.id.bt_yingping);
                tv_yingping_content= (TextView) itemView.findViewById(R.id.tv_yingping_content);
            }
        }
    }

   */
}
