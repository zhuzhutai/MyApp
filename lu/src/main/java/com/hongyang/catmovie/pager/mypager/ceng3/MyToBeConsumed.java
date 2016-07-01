package com.hongyang.catmovie.pager.mypager.ceng3;

import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hongyang.catmovie.R;
import com.hongyang.catmovie.base.BaseFragment;

/**
 * Created by Administrator on 2016/6/28.
 */
public class MyToBeConsumed extends BaseFragment{

    private WebView wv_web;

    //待消费页面自带下拉刷新效果，需要集成
    public MyToBeConsumed(Context context) {

    }

    @Override
    public View initView() {
        View view = inflater.inflate(R.layout.to_be_consumed, null);
        wv_web = (WebView) view.findViewById(R.id.wv_web);

        wv_web.loadUrl("http://m.maoyan.com/movie/246333?_v_=yes");
        WebSettings settings = wv_web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        wv_web.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });

        return view;
    }
}
