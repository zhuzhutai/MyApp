package com.hongyang.catmovie.util;

/**
 * Created by Administrator on 2016/6/22.
 */
public class Website {
    //1.启动页面加载图片的网址
    public static final String SPLASH_URL = "http://api.meituan.com/dianying/posters.json?city_id=1&poster_type=1&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463656383990&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=09cbe8d3-3cb0-4e54-bc41-8f0b3387cdf2&__skcy=RbOZVh%2BK%2Bf86K3WlGJYg4ls7DIU%3D";

    //热映轮播图数据
    public static final String MOVIE_LUNBO = "http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=11&version=6.9.0&new=0&app=movie&clienttp=android&uuid=2C2C0ECD557F366849954BEF88D0017AD7728D62217D32C728489E789FB4DFEE&devid=000000000000000&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6901&utm_source=meituan&utm_medium=android&utm_term=6.9.0&utm_content=000000000000000&ci=1&net=3&dModel=Android%20SDK%20built%20for%20x86&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466999254619&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=2579edc5-3449-4ed6-b982-3b7e992c1379&__skcy=G03DC9ijK0CNsv4RC4yRIAgYwZ0%3D";
    //2.1电影热映界面的网址
    public static final String MOVIE_HOT_URL = "http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000";
//    2.2电影热映的联网地址，但是只有5个；抓包
//    public static final String MOVIE_HOT_title_URL = "http://api.meituan.com/mmdb/movie/v3/list/hot.json?ci=662&limit=12&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6901&utm_source=meituan&utm_medium=android&utm_term=6.9.0&utm_content=000000000000000&net=3&dModel=Android%20SDK%20built%20for%20x86&uuid=2C2C0ECD557F366849954BEF88D0017AD7728D62217D32C728489E789FB4DFEE&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466997203008&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=68aa532d-1e86-4e7c-a9f7-cc1921dd6f20&__skcy=mXY%2BT604EEsV%2BKoPCVMX1i%2F1CGI%3D";

    public static final String MOVIE_WWW = "http://m.maoyan.com/#type=movies";

}
