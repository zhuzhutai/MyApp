package com.hongyang.catmovie.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.hongyang.catmovie.R;

public class SplashActivity extends Activity {

   /* private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0 :
                    startMainActivity();
                    break;
            }
        }
    };*/
    private int flag = 0;
    private ImageView image;
    private ImageView backGround;
    private Button button;
    private long startTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        image = (ImageView) findViewById(R.id.image);
        backGround = (ImageView) findViewById(R.id.id);
        button = (Button) findViewById(R.id.button);
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
/*
//1.使用volley联网:volley在分线程处理联网情况，下面会依次执行
        VolleyNetWorking volleyNetWorking = new VolleyNetWorking(Website.SPLASH_URL);
        volleyNetWorking.getVolleyData(new VolleyNetWorking.VolleyUtil() {
            @Override
            public void getJson(String json) {
                //联网失败时得到的数据,联网成功，但是本来就是null
                if (json != "" && json != null) {
                    resolveData(json);
                } else {
                    handler.sendEmptyMessageDelayed(0,3000);
                }
            }
        });
        //该方法需要写在接口回调方法的后面，否则空指针
        volleyNetWorking.progressData(this);
    //跳过按钮的点击事件；
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacksAndMessages(null);
                startMainActivity();
            }
        });
    }

//2.使用Gson解析数据；
    private void resolveData(String json) {
        SplashBean splashBean = new Gson().fromJson(json, SplashBean.class);
        List<SplashBean.PostersBean> posters = splashBean.getPosters();
        if(posters != null && posters.size() > 0) {
            String picUrl = posters.get(posters.size() - 1).getPic();
            Log.e("MainActivity--数据存在，准备解析",picUrl);
            loadImage(picUrl);
        }else{
            Log.e("MainActivity--无法解析","json为空"+json);
            handler.sendEmptyMessageDelayed(0, 3000);
        }
    }

//3.得到数据后，使用volley请求图片
    private void loadImage(String picUrl) {
        new VolleyNetWorking(picUrl).loaderImager(image);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                backGround.setVisibility(View.GONE);
                button.setVisibility(View.VISIBLE);
                ScaleAnimation sa = new ScaleAnimation(1, 1.1f, 1, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                sa.setDuration(3000);
                sa.setFillAfter(true);
                image.startAnimation(sa);
            }
        }, 2000);
        //因为有动画，需要延时启动主界面
        handler.sendEmptyMessageDelayed(0, 5000);
    }

//4.启动主界面
    public void startMainActivity(){
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

//设置2秒内连续两次点击返回，退出应用；
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.KEYCODE_BACK :
                Log.e("系统时间",startTime+"");
                Toast.makeText(SplashActivity.this, "再次点击退出", Toast.LENGTH_SHORT).show();
                long endTime = new Date(System.currentTimeMillis()).getTime();
                if(endTime - startTime < 2000) {
                    handler.removeCallbacksAndMessages(null);
                    finish();
                }
                startTime = endTime;
                break;
        }
        return true;
    }


*/
    }

}
