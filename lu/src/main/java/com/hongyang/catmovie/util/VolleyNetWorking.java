package com.hongyang.catmovie.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.hongyang.catmovie.R;
import com.hongyang.catmovie.volley.VolleyManager;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/6/23.
 */
public class VolleyNetWorking {
    private String url;

    public VolleyNetWorking(String url) {
        this.url = url;
    }

//1.使用volley请求并直接加载图片到指定的控件上
    public void loaderImager(final ImageView imageView) {
        imageView.setTag(url);
        ImageLoader.ImageListener listener = new ImageLoader.ImageListener() {
            @Override
            public void onResponse(ImageLoader.ImageContainer imageContainer, boolean b) {
                if (imageContainer != null) {
                    if (imageView != null) {
                        if (imageContainer.getBitmap() != null) {
                            imageView.setImageBitmap(imageContainer.getBitmap());
                        } else {
                            imageView.setImageResource(R.drawable.backgroud_logo);
                        }
                    }
                }
            }
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                //如果出错，则说明都不显示（简单处理），最好准备一张出错图片
                imageView.setImageResource(R.drawable.backgroud_logo);
            }
        };
        VolleyManager.getImageLoader().get(url, listener);
    }


//2.使用volley联网请求数据；
    public void progressData(Context context) {
            //１．判断网络是否连接正常
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        if(info != null) {
                            Log.e("网络连接情况","网络正常，可以上网--"+info);
                            Log.e("VolleyNetWorking--联网地址", url);
            //２.使用volley请求数据；
            StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String json) {
                            Log.e("VolleyNetWorking--联网成功", json);
                    volleyUtil.getJson(json);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                            Log.e("VolleyNetWorking--联网失败", "什么都没有");
                    volleyUtil.getJson("");
                }
            }) {
            //３．解决乱码问题
                @Override
                protected Response<String> parseNetworkResponse(NetworkResponse response) {
                    try {
                        String parsed = new String(response.data, "UTF-8");
                        return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
                    } catch (UnsupportedEncodingException var4) {
                        var4.printStackTrace();
                    }
                    return super.parseNetworkResponse(response);
                }
            };
            //４.获取线程池；（如果没有封装，需要创建线程池）
            VolleyManager.getRequestQueue().add(request);

        }else{
                            Log.e("网络连接情况","没有网络，加载缓存--"+info);
            //５．通过设置url为tag加载缓存文件（volley自己设置的）；
            Cache.Entry entry = VolleyManager.getRequestQueue().getCache().get(url);
            String json = new String(entry.data);
                            Log.e("VolleyNetWorking--我是缓存",json);
            volleyUtil.getJson(json);
        }
    }


    /*
    使用接口，将volley封装成工具类

    返回联网的结果:
            联网成功时返回json数据，以供调用者解析
            联网失败，返回＂＂，告知联网失败*/

     public interface VolleyUtil {
         void getJson(String json);
     }
     public VolleyUtil volleyUtil;
     public void getVolleyData(VolleyUtil getresult){
        this.volleyUtil = getresult;
     }

}
