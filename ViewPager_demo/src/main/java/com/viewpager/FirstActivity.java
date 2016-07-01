package com.viewpager;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TnnoWu on 2016/01/28.
 */
public class FirstActivity extends AppCompatActivity{
    private ViewPager viewPager;
    private ArrayList<View> arrayList;
//    private MyPagerAdapter myPagerAdapter;
    // 图片都存放在这里
    private List<ImageView> imageViewlist;
    private ImageView iv;
    // 线程开关，当activity销毁后，线程也应该停止运行
    private boolean isStop = false;
    private int previousPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);
        initView();
        //设置图片自动滚动
        new Thread(new Runnable() {

            @Override
            public void run() {
                //如果activity未销毁则一直执行
                while (!isStop) {
                    //先休息5秒钟
                    SystemClock.sleep(5000);
                    //以下代码发送到主线程中执行
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            viewPager.setCurrentItem(viewPager
                                    .getCurrentItem() + 1);
                        }
                    });
                }
            }
        }).start();
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                if ( imageViewlist.size() > 1) { //多于1，才会循环跳转
                    if ( position < 1) { //首位之前，跳转到末尾（N）
                        position = 5;
                        viewPager.setCurrentItem(position,false);
                    } else if ( position > 5) { //末位之后，跳转到首位（1）
                        viewPager.setCurrentItem(1,false); //false:不显示跳转过程的动画
                        position = 1;
                    }
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.vp_one);
        prepareData();
//        arrayList = new ArrayList<View>();
//        LayoutInflater layoutInflater = getLayoutInflater();
//        arrayList.add(layoutInflater.inflate(R.layout.view1,null,false));
//        arrayList.add(layoutInflater.inflate(R.layout.view2,null,false));
//        arrayList.add(layoutInflater.inflate(R.layout.view3,null,false));

        // 先拿到图片id
        int[] ivIDs = new int[] { R.drawable.a, R.drawable.b, R.drawable.c,
                R.drawable.d, R.drawable.e };
        // 计算应用打开时显示的第一项 Integer.MAX_VALUE /2 - 3=0
        int index = Integer.MAX_VALUE / 2 - 3;
        // 给mViewPager设置数据
        viewPager.setAdapter(new ViewPagerAdapter());
        // 给mViewPager设置页面滑动事件
        viewPager.setOnPageChangeListener(new MyOnPageChangeListener());

        // 设置应用打开时显示的第一项，index的值为0
        // 使用这种方式得到的0，和直接写0有什么区别呢？
        // 直接写0，应用打开后不能直接向右滑动，因为viewpager中存image位置不能为负值，只能先向左滑动
        // 这种方式得到的0，可以实现应用一打开，就可以向右滑动
        viewPager.setCurrentItem(700);
//        myPagerAdapter = new MyPagerAdapter(arrayList);
    }
    private void prepareData() {
        imageViewlist = new ArrayList<ImageView>();
        int[] imageResIDs = getImageResIDs();
        ImageView iv;
        for (int i = 0; i < imageResIDs.length; i++) {
            iv = new ImageView(this);
            iv.setBackgroundResource(imageResIDs[i]);
            imageViewlist.add(iv);
        }
    }

    /**
     * 在此处本来是5张图片，现在在数组首尾各加了一张图
     * @return
     */
    private int[] getImageResIDs() {
        return new int[]{
                R.drawable.aa,
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.bb,
        };
    }
    class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
        // 开始
        @Override
        public void onPageScrollStateChanged(int arg0) {
        }
        // 正在进行时
        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }
        // 结束
        @Override
        public void onPageSelected(int position) {
            if ( imageViewlist.size() > 1) { //多于1，才会循环跳转
                if ( position < 1) { //首位之前，跳转到末尾（N）
                    position = 5;
                    viewPager.setCurrentItem(position,false);
                } else if ( position > 5) { //末位之后，跳转到首位（1）
                    viewPager.setCurrentItem(1,false); //false:不显示跳转过程的动画
                    position = 1;
                }
            }
        }
    }
    class ViewPagerAdapter extends PagerAdapter {
        /**
         * 返回图片总数，Integer.MAX_VALUE的值为 2147483647这个数有21亿，也就是说我们的viewpager
         * 理论上在每次使用应用的时候可以滑动21亿次,当然，实际上是没人要去这么做的，我们这样做是为了实现实现viewpager循环滑动的效果
         * 即当滑动到viewpager的最后一页时，继续滑动就可以回到第一页
         */
        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        // 当某一页滑出去的时候，将其销毁
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(imageViewlist.get(position
                    % imageViewlist.size()));
        }

        // 向容器中添加图片，由于我们要实现循环滑动的效果，所以要对position取模
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container
                    .addView(imageViewlist.get(position % imageViewlist.size()));
            return imageViewlist.get(position % imageViewlist.size());
        }
    }

    // 当activity销毁时，让线程停止
    @Override
    protected void onDestroy() {
        isStop = true;
        super.onDestroy();
    }
}
