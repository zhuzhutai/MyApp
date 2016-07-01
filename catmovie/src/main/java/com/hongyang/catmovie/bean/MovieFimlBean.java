package com.hongyang.catmovie.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/6/23.
 */
public class MovieFimlBean {

    /**
     * expires : 1800
     */

    private ControlBean control;
    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":false,"movies":[{"showInfo":"今天149家影院放映1769场","late":false,"cnms":0,"sn":0,"nm":"海底总动员2：多莉去哪儿","scm":"唠叨鱼多莉，上路找父母","img":"http://p0.meituan.net/165.220/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg","sc":8.7,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2016-06-17上映","pn":123,"preSale":0,"vd":"","dir":"安德鲁·斯坦顿,安格斯·麦克莱恩","star":"艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯","cat":"动画,喜剧,冒险","wish":144949,"3d":true,"src":"","dur":97,"showDate":"","imax":true,"snum":46472,"id":246366,"time":""},{"showInfo":"今天150家影院放映1880场","late":false,"cnms":0,"sn":0,"nm":"魔兽","scm":"怒拳为谁握，联盟斗部落","img":"http://p0.meituan.net/165.220/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg","sc":9.2,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-08上映","pn":347,"preSale":0,"vd":"","dir":"邓肯·琼斯","star":"崔维斯·费米尔,宝拉·巴顿,本·福斯特","cat":"动作,冒险,奇幻","wish":479894,"3d":true,"src":"","dur":124,"showDate":"","imax":true,"snum":673839,"id":78421,"time":""},{"showInfo":"今天92家影院放映95场","late":false,"cnms":0,"sn":0,"nm":"惊天魔盗团2","scm":"周董变魔术，敌人挡不住","img":"http://p0.meituan.net/165.220/movie/9e0e95230b493aafa548e0963c0ef60c274699.jpg","sc":0,"ver":"2D/3D/中国巨幕","rt":"本周五上映","pn":232,"preSale":1,"vd":"","dir":"朱浩伟","star":"杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森","cat":"动作,喜剧,惊悚","wish":506395,"3d":true,"src":"","dur":126,"showDate":"","imax":false,"snum":4967,"id":246333,"time":""},{"showInfo":"今天90家影院放映92场","late":false,"cnms":0,"sn":0,"nm":"独立日：卷土重来","scm":"外星再入侵，地核将燃尽","img":"http://p1.meituan.net/165.220/movie/b408a9322cd0da51d4bdd3261ba3d1c0278866.jpg","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"本周五上映","pn":140,"preSale":1,"vd":"","dir":"罗兰·艾默里奇","star":"利亚姆·海姆斯沃斯,麦卡·梦露,杰西·厄舍","cat":"动作,冒险,科幻","wish":159407,"3d":true,"src":"","dur":120,"showDate":"","imax":true,"snum":3008,"id":246375,"time":""},{"showInfo":"今天144家影院放映972场","late":false,"cnms":0,"sn":0,"nm":"X战警：天启","scm":"天启当炮灰，千年洗剪吹","img":"http://p1.meituan.net/165.220/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg","sc":9.1,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-03上映","pn":688,"preSale":0,"vd":"","dir":"布莱恩·辛格","star":"詹姆斯·麦卡沃伊,迈克尔·法斯宾德,詹妮弗·劳伦斯","cat":"动作,科幻,奇幻","wish":559919,"3d":true,"src":"","dur":144,"showDate":"","imax":true,"snum":419235,"id":246177,"time":""},{"showInfo":"今天36家影院放映36场","late":false,"cnms":0,"sn":0,"nm":"三人行","scm":"悍匪有手段，中枪再作案","img":"http://p1.meituan.net/165.220/movie/1c82df174422d9374f821482f445171b129671.jpg","sc":9.7,"ver":"2D","rt":"本周五上映","pn":186,"preSale":1,"vd":"","dir":"杜琪峰","star":"赵薇,古天乐,钟汉良","cat":"动作,犯罪,悬疑","wish":70065,"3d":false,"src":"","dur":88,"showDate":"","imax":false,"snum":3079,"id":246972,"time":""},{"showInfo":"今天92家影院放映220场","late":false,"cnms":0,"sn":0,"nm":"我叫MT之山口山战记","scm":"贱萌牛头人，爆笑刷副本","img":"http://p0.meituan.net/165.220/movie/73f6abbb90259d1fa8a88fa907ca3062587352.jpg","sc":7.6,"ver":"3D/中国巨幕","rt":"2016-06-17上映","pn":40,"preSale":0,"vd":"","dir":"核桃","star":"奶茶,YOYO,CBI","cat":"动画,喜剧,冒险","wish":43480,"3d":true,"src":"","dur":86,"showDate":"","imax":false,"snum":16802,"id":246045,"time":""},{"showInfo":"今天84家影院放映250场","late":false,"cnms":0,"sn":0,"nm":"爱丽丝梦游仙境2：镜中奇遇记","scm":"镜中再梦游，拯救老朋友","img":"http://p1.meituan.net/165.220/movie/dbcc3eabae012da794fe4b74ed1365fc659390.jpg","sc":8.6,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-05-27上映","pn":82,"preSale":0,"vd":"","dir":"詹姆斯·波宾","star":"约翰尼·德普,安妮·海瑟薇,米娅·华希科沃斯卡","cat":"奇幻,冒险,喜剧","wish":248677,"3d":true,"src":"","dur":115,"showDate":"","imax":true,"snum":217127,"id":248680,"time":""},{"showInfo":"今天69家影院放映111场","late":false,"cnms":0,"sn":0,"nm":"筷仙","scm":"笔仙已玩坏，筷仙来作怪","img":"http://p1.meituan.net/165.220/movie/31a325f0796cfebbab24776024eeec91100800.jpeg","sc":4.6,"ver":"2D","rt":"2016-06-17上映","pn":32,"preSale":0,"vd":"","dir":"姬雨","star":"胡影怡,朱璇,周骏","cat":"恐怖,惊悚","wish":20373,"3d":false,"src":"","dur":87,"showDate":"","imax":false,"snum":10254,"id":343597,"time":""},{"showInfo":"2016-06-24 本周五上映","late":false,"cnms":0,"sn":0,"nm":"近在咫尺的爱恋","scm":"真爱在身旁，挥拳为理想","img":"http://p1.meituan.net/165.220/movie/b77f9474ee477174a8fdff88ded43e76400502.jpg","sc":0,"ver":"2D","rt":"本周五上映","pn":49,"preSale":1,"vd":"","dir":"程孝泽","star":"彭于晏,郭采洁,杨子姗","cat":"爱情,运动,剧情","wish":11950,"3d":false,"src":"","dur":103,"showDate":"","imax":false,"snum":172,"id":57217,"time":""},{"showInfo":"今天28家影院放映61场","late":false,"cnms":0,"sn":0,"nm":"百鸟朝凤","scm":"两代手艺人，唢呐感情深","img":"http://p1.meituan.net/165.220/movie/ef968fd382173c45b0c2d10572ca10b8354896.jpg","sc":9.2,"ver":"2D","rt":"2016-05-06上映","pn":105,"preSale":0,"vd":"","dir":"吴天明","star":"陶泽如,郑伟,李岷城","cat":"历史,音乐,剧情","wish":3981,"3d":false,"src":"","dur":108,"showDate":"","imax":false,"snum":107704,"id":248260,"time":""},{"showInfo":"2016-07-08上映","late":false,"cnms":0,"sn":0,"nm":"致青春·原来你还在这里","scm":"霸道男学霸，爱上女学渣","img":"http://p0.meituan.net/165.220/movie/37e7ed909843270f0880c325b6be7b60436509.jpg","sc":0,"ver":"2D","rt":"2016-07-08上映","pn":332,"preSale":1,"vd":"","dir":"周拓如","star":"吴亦凡,刘亦菲,金世佳","cat":"剧情,爱情","wish":187810,"3d":false,"src":"","dur":98,"showDate":"","imax":false,"snum":3280,"id":246575,"time":""},{"showInfo":"今天21家影院放映52场","late":false,"cnms":0,"sn":0,"nm":"北京遇上西雅图之不二情书","scm":"异国心未远，书信寄情缘","img":"http://p1.meituan.net/165.220/movie/fe80bc40822d0a5f3168b73089c47d71101133.jpg","sc":8.5,"ver":"2D/中国巨幕","rt":"2016-04-29上映","pn":547,"preSale":0,"vd":"","dir":"薛晓路","star":"汤唯,吴秀波,惠英红","cat":"爱情,剧情","wish":307383,"3d":false,"src":"","dur":132,"showDate":"","imax":false,"snum":440391,"id":247575,"time":""},{"showInfo":"今天17家影院放映41场","late":false,"cnms":0,"sn":0,"nm":"南口1937","scm":"南口抗日战，疆场洒血汗","img":"http://p1.meituan.net/165.220/movie/f4b5d903571ec3c3fc952f86261b04fd227842.jpg","sc":0,"ver":"2D","rt":"本周四上映","pn":26,"preSale":0,"vd":"","dir":"朱丹","star":"孙看,孙洪涛,刘忠元","cat":"剧情,历史,战争","wish":2034,"3d":false,"src":"","dur":98,"showDate":"","imax":false,"snum":68,"id":368071,"time":""},{"showInfo":"2016-06-30 下周四上映","late":false,"cnms":0,"sn":0,"nm":"所以\u2026\u2026和黑粉结婚了","scm":"黑粉变新娘，这是闹哪样","img":"http://p1.meituan.net/165.220/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg","sc":0,"ver":"2D","rt":"下周四上映","pn":115,"preSale":1,"vd":"","dir":"金帝荣","star":"朴灿烈,袁姗姗,姜潮","cat":"爱情,喜剧","wish":83647,"3d":false,"src":"","dur":99,"showDate":"","imax":false,"snum":5965,"id":343379,"time":""},{"showInfo":"今天8家影院放映14场","late":false,"cnms":0,"sn":0,"nm":"泰迪熊之玩具大战","scm":"恶势力进攻，泰迪救萌宠","img":"http://p1.meituan.net/165.220/movie/495971f9751f07a720373ad6008146e8575458.jpg","sc":7.3,"ver":"2D","rt":"2016-06-09上映","pn":8,"preSale":0,"vd":"","dir":"胡韵","star":"邓小婷,赵奔,白文显","cat":"动画,冒险,喜剧","wish":7076,"3d":false,"src":"","dur":78,"showDate":"","imax":false,"snum":6117,"id":346658,"time":""},{"showInfo":"今天10家影院放映14场","late":false,"cnms":0,"sn":0,"nm":"海洋之恋","scm":"凄美人鱼恋，海洋是家园","img":"http://p0.meituan.net/165.220/movie/0e3af6f723d8b7d4a3ea62efba49f535814826.jpg","sc":0,"ver":"2D","rt":"2016-06-17上映","pn":26,"preSale":0,"vd":"","dir":"郑淑兰","star":"韩在石,句号,王奎荣","cat":"科幻,爱情,奇幻","wish":2600,"3d":false,"src":"","dur":96,"showDate":"","imax":false,"snum":865,"id":341109,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"赏金猎人","scm":"编外铁饭碗，收钱抓逃犯","img":"http://p1.meituan.net/165.220/movie/45f8587cb425a01c9a279082772a8bd0379497.jpg","sc":0,"ver":"2D/3D","rt":"下周五上映","pn":170,"preSale":1,"vd":"","dir":"申太罗","star":"李敏镐,钟汉良,唐嫣","cat":"动作,喜剧,剧情,悬疑","wish":114200,"3d":true,"src":"","dur":105,"showDate":"","imax":false,"snum":3642,"id":338506,"time":""},{"showInfo":"2016-07-01 下周五上映","late":false,"cnms":0,"sn":0,"nm":"魔轮","scm":"天涯号起航，失控大逃亡","img":"http://p0.meituan.net/165.220/movie/1d44cc6185a7ee4ee1def1f3a0f5821a584683.jpg","sc":0,"ver":"2D/3D","rt":"下周五上映","pn":41,"preSale":1,"vd":"","dir":"王早","star":"林心如,何润东,金世佳","cat":"悬疑,惊悚,恐怖","wish":7730,"3d":true,"src":"","dur":92,"showDate":"","imax":false,"snum":366,"id":342741,"time":""},{"showInfo":"今天5家影院放映10场","late":false,"cnms":0,"sn":0,"nm":"死亡游戏","scm":"同学生日会，恶鬼来相会","img":"http://p1.meituan.net/165.220/movie/c3eec836300c5a9f0429d96921aa168472038.jpg","sc":5.8,"ver":"2D","rt":"2016-06-03上映","pn":145,"preSale":0,"vd":"","dir":"麦子","star":"徐洁儿,陈欢,陈炳强","cat":"恐怖,惊悚,悬疑","wish":3301,"3d":false,"src":"","dur":90,"showDate":"","imax":false,"snum":5162,"id":346286,"time":""},{"showInfo":"今天2家影院放映6场","late":false,"cnms":0,"sn":0,"nm":"白毛女","scm":"欠了高利贷，卖女来抵债","img":"http://p1.meituan.net/165.220/movie/a8dc71209614a071cbc56cfc193b9d9785810.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-03-25上映","pn":80,"preSale":0,"vd":"","dir":"侯克明","star":"雷佳,张英席,高鹏","cat":"剧情","wish":1038,"3d":true,"src":"","dur":122,"showDate":"","imax":false,"snum":1193,"id":345102,"time":""},{"showInfo":"今天4家影院放映5场","late":false,"cnms":0,"sn":0,"nm":"记忆碎片","scm":"宿醉陷疑案，奋力查嫌犯","img":"http://p1.meituan.net/165.220/movie/ea15948d63d527d092a70e39cbb74636357253.jpg","sc":6.9,"ver":"2D","rt":"2016-06-03上映","pn":47,"preSale":0,"vd":"","dir":"朴裕焕","star":"雷佳音,夏梓桐,李菁","cat":"悬疑,喜剧,犯罪","wish":4154,"3d":false,"src":"","dur":94,"showDate":"","imax":false,"snum":2915,"id":345923,"time":""},{"showInfo":"今天4家影院放映5场","late":false,"cnms":0,"sn":0,"nm":"我们毕业啦","scm":"初恋要厮守，毕业不分手","img":"http://p1.meituan.net/165.220/movie/69dbdb2e866a979f3ec1e99a21d8e10868108.jpg","sc":5.3,"ver":"2D","rt":"2016-06-10上映","pn":47,"preSale":0,"vd":"","dir":"程中豪,王凯","star":"童菲,高泰宇,马丁","cat":"爱情,剧情","wish":14685,"3d":false,"src":"","dur":95,"showDate":"","imax":false,"snum":4294,"id":342730,"time":""},{"showInfo":"今天1家影院放映4场","late":false,"cnms":0,"sn":0,"nm":"大唐玄奘","scm":"了却世间恨，尽是取经人","img":"http://p0.meituan.net/165.220/movie/c1cbba6359ef62bbb5bdd5311708c828413080.jpg","sc":7.7,"ver":"2D/中国巨幕","rt":"2016-04-29上映","pn":232,"preSale":0,"vd":"","dir":"霍建起","star":"黄晓明,蒲巴甲,徐峥","cat":"剧情,历史","wish":23799,"3d":false,"src":"","dur":120,"showDate":"","imax":false,"snum":28213,"id":338357,"time":""},{"showInfo":"今天2家影院放映4场","late":false,"cnms":0,"sn":0,"nm":"愤怒的小鸟","scm":"绿猪来偷蛋，鸟儿群奋战","img":"http://p0.meituan.net/165.220/movie/b721e73740601799c065affb619d837e151622.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-05-20上映","pn":132,"preSale":0,"vd":"","dir":"费格尔·雷利,克莱·凯蒂","star":"杰森·苏戴奇斯,乔什·盖德,丹尼·麦克布耐德","cat":"动画,奇幻,冒险","wish":123045,"3d":true,"src":"","dur":97,"showDate":"","imax":false,"snum":312219,"id":246188,"time":""},{"showInfo":"今天2家影院放映4场","late":false,"cnms":0,"sn":0,"nm":"自我救赎","scm":"举报别人易，举报自己难","img":"http://p0.meituan.net/165.220/movie/8f5662a2d71e11c005a3b5f64b973554804794.jpg","sc":0,"ver":"2D","rt":"2016-05-25上映","pn":24,"preSale":0,"vd":"","dir":"朱江华,王首越","star":"孙渤洋,陈美行,陈铮","cat":"剧情","wish":761,"3d":false,"src":"","dur":85,"showDate":"","imax":false,"snum":125,"id":344491,"time":""},{"showInfo":"今天3家影院放映3场","late":false,"cnms":0,"sn":0,"nm":"催眠大师","scm":"催眠治心伤，侧击猜真相","img":"http://p1.meituan.net/165.220/movie/__39582689__9041214.jpg","sc":9,"ver":"2D","rt":"2014-04-29上映","pn":78,"preSale":0,"vd":"","dir":"陈正道","star":"徐峥,莫文蔚,吕中","cat":"剧情,悬疑,惊悚","wish":11396,"3d":false,"src":"","dur":102,"showDate":"","imax":false,"snum":46510,"id":78672,"time":""},{"showInfo":"今天3家影院放映3场","late":false,"cnms":0,"sn":0,"nm":"当流星划过天际","scm":"恋爱遇失忆，错爱富家女","img":"http://p1.meituan.net/165.220/movie/e2b564261eb1230239a52ba911f362a91396648.jpg","sc":0,"ver":"2D","rt":"2016-06-17上映","pn":33,"preSale":0,"vd":"","dir":"宋奇","star":"许诺,孙锂华,梁愚","cat":"爱情,剧情","wish":1781,"3d":false,"src":"","dur":90,"showDate":"","imax":false,"snum":183,"id":341293,"time":""},{"showInfo":"今天2家影院放映2场","late":false,"cnms":0,"sn":0,"nm":"Hold住爱","scm":"假戏变真做，幂威秀爱火","img":"http://p0.meituan.net/165.220/movie/29/274730.jpg","sc":5.9,"ver":"2D","rt":"2012-08-23上映","pn":300,"preSale":0,"vd":"","dir":"张琦","star":"杨幂,刘恺威,周秀娜","cat":"喜剧,爱情,悬疑","wish":280,"3d":false,"src":"","dur":95,"showDate":"","imax":false,"snum":753,"id":729,"time":""},{"showInfo":"今天2家影院放映2场","late":false,"cnms":0,"sn":0,"nm":"山花烂漫时","scm":"学霸变学渣，原来为爸爸","img":"http://p1.meituan.net/165.220/movie/74c2ae23952a874a88b8900eafeaecbc410409.jpg","sc":0,"ver":"2D","rt":"2016-06-17上映","pn":26,"preSale":0,"vd":"","dir":"纪明","star":"陈姗姗,马子晶,赵芙丽","cat":"剧情,家庭","wish":1151,"3d":false,"src":"","dur":88,"showDate":"","imax":false,"snum":264,"id":410649,"time":""},{"showInfo":"2016-06-27 下周一上映","late":false,"cnms":0,"sn":0,"nm":"大火种","scm":"誓死护宣言，智斗救火种","img":"http://p1.meituan.net/165.220/movie/c8545c7bd1f6070f0d52a77bd0ddd8738720802.jpg","sc":0,"ver":"2D","rt":"下周一上映","pn":0,"preSale":1,"vd":"","dir":"苗月","star":"白威,陈瑾,王柠","cat":"剧情,历史,战争","wish":244,"3d":false,"src":"","dur":114,"showDate":"","imax":false,"snum":17,"id":337438,"time":""},{"showInfo":"2016-07-01 下周五上映","late":false,"cnms":0,"sn":0,"nm":"党的女儿尹灵芝","scm":"心中有信仰，少年变战士","img":"http://p1.meituan.net/165.220/movie/f736bb222c8a4048fb19e7e6c27bb569180053.jpg","sc":0,"ver":"2D","rt":"下周五上映","pn":12,"preSale":1,"vd":"","dir":"卫晓茼","star":"郜耀平,张志宏,姚安濂","cat":"剧情,历史","wish":525,"3d":false,"src":"","dur":107,"showDate":"","imax":false,"snum":115,"id":672123,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"叶问2：宗师传奇","scm":"叶问搬香港，仇恨值渐长","img":"http://p0.meituan.net/165.220/movie/70/612717.jpg","sc":8.5,"ver":"2D","rt":"2010-04-27上映","pn":63,"preSale":0,"vd":"","dir":"叶伟信","star":"甄子丹,洪金宝,熊黛林","cat":"动作,历史,传记","wish":211,"3d":false,"src":"","dur":108,"showDate":"","imax":false,"snum":1029,"id":524,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"光棍终结者","scm":"光棍可团购，脱单快节奏","img":"http://p0.meituan.net/165.220/movie/28/668388.jpg","sc":4.2,"ver":"2D","rt":"2011-11-11上映","pn":55,"preSale":0,"vd":"","dir":"赵非","star":"李艾,周韦彤,周晓鸥","cat":"喜剧,爱情","wish":0,"3d":false,"src":"","dur":100,"showDate":"","imax":false,"snum":40,"id":947,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"厨子戏子痞子","scm":"三男一台戏，客栈解僵局","img":"http://p0.meituan.net/165.220/movie/__7277442__6071578.jpg","sc":8.3,"ver":"2D","rt":"2013-03-29上映","pn":281,"preSale":0,"vd":"","dir":"管虎","star":"黄渤,刘烨,张涵予","cat":"剧情,喜剧,动作","wish":10110,"3d":false,"src":"","dur":108,"showDate":"","imax":false,"snum":5753,"id":969,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"爸爸去哪儿","scm":"和动物玩耍，解放了麻麻","img":"http://p1.meituan.net/165.220/movie/__31723366__3815543.jpg","sc":8.5,"ver":"2D","rt":"2014-01-31上映","pn":149,"preSale":0,"vd":"","dir":"谢涤葵","star":"林志颖,小小志,郭涛","cat":"喜剧,家庭","wish":15705,"3d":false,"src":"","dur":95,"showDate":"","imax":false,"snum":40989,"id":78621,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"北京爱情故事","scm":"恋爱分五段，激情不会散","img":"http://p0.meituan.net/165.220/movie/__33456063__6265360.jpg","sc":8,"ver":"2D","rt":"2014-02-14上映","pn":145,"preSale":0,"vd":"","dir":"陈思诚","star":"梁家辉,刘嘉玲,王学兵","cat":"爱情","wish":12286,"3d":false,"src":"","dur":121,"showDate":"","imax":false,"snum":28675,"id":78324,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"同桌的你","scm":"初恋要结婚，回国忆青春","img":"http://p0.meituan.net/165.220/movie/__40811615__5745234.jpg","sc":8.6,"ver":"2D","rt":"2014-04-25上映","pn":88,"preSale":0,"vd":"","dir":"郭帆","star":"周冬雨,林更新,隋凯","cat":"剧情,爱情","wish":24267,"3d":false,"src":"","dur":98,"showDate":"","imax":false,"snum":73011,"id":78653,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"一路惊喜","scm":"除夕夜奇遇，转角有惊喜","img":"http://p1.meituan.net/165.220/movie/9014cb2360cc64d64acb3abe18d33552131346.jpg","sc":7.7,"ver":"2D","rt":"2015-02-06上映","pn":251,"preSale":0,"vd":"","dir":"金依萌,潘安子,章家瑞,宋迪","star":"郭采洁,凤小岳,赵丽颖","cat":"爱情,家庭,喜剧","wish":15223,"3d":false,"src":"","dur":120,"showDate":"","imax":false,"snum":73895,"id":246049,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"冲上云霄","scm":"男神天上飞，奔着女神追","img":"http://p1.meituan.net/165.220/movie/97b2c700b5ec0cc64ca40a18e818db51849188.jpg","sc":5,"ver":"2D","rt":"2015-02-19上映","pn":174,"preSale":0,"vd":"","dir":"叶伟信,邹凯光","star":"古天乐,郑秀文,吴镇宇","cat":"剧情,爱情","wish":37001,"3d":false,"src":"","dur":100,"showDate":"","imax":false,"snum":131007,"id":78601,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"左耳","scm":"青春要恋爱，别忘堕堕胎","img":"http://p0.meituan.net/165.220/movie/da55f29972ec0b9692ba7055905892c8123092.jpg","sc":7.9,"ver":"2D","rt":"2015-04-24上映","pn":315,"preSale":0,"vd":"","dir":"苏有朋","star":"陈都灵,欧豪,杨洋","cat":"爱情","wish":82116,"3d":false,"src":"","dur":117,"showDate":"","imax":false,"snum":537810,"id":246210,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"美人鱼之海盗来袭","scm":"国产美人鱼，俩海盗来袭","img":"http://p0.meituan.net/165.220/movie/7e15953aa8bc5be4e7bff00913426a06920765.jpg","sc":5.5,"ver":"2D","rt":"2015-07-31上映","pn":38,"preSale":0,"vd":"","dir":"邱浩强","star":"李思娴,郭亚维,宋磊","cat":"动画,喜剧,冒险","wish":27716,"3d":false,"src":"","dur":85,"showDate":"","imax":false,"snum":21942,"id":248550,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"港囧","scm":"宝宝换包包，笑点没变少","img":"http://p1.meituan.net/165.220/movie/aea9291ff4c41e074e2edc2a2d9b20f9500507.jpg","sc":8.4,"ver":"2D/IMAX 2D/中国巨幕/全景声","rt":"2015-09-25上映","pn":498,"preSale":0,"vd":"","dir":"徐峥","star":"徐峥,赵薇,包贝尔","cat":"喜剧,爱情,动作","wish":617005,"3d":false,"src":"","dur":113,"showDate":"","imax":true,"snum":1914276,"id":246577,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"我是证人","scm":"证词相矛盾，姐弟被围困","img":"http://p1.meituan.net/165.220/movie/d75604e123f8cdd8b52c069936f84f5b49504.jpg","sc":8.5,"ver":"2D","rt":"2015-10-30上映","pn":499,"preSale":0,"vd":"","dir":"安尚勋","star":"杨幂,鹿晗,王景春","cat":"悬疑,犯罪,惊悚","wish":139189,"3d":false,"src":"","dur":112,"showDate":"","imax":false,"snum":236460,"id":247711,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"陪安东尼度过漫长岁月","scm":"文艺大暖男，不二常相伴","img":"http://p1.meituan.net/165.220/movie/9f0d994eafbf52e7b0145b7746d1d881246635.jpg","sc":7.8,"ver":"2D","rt":"2015-11-13上映","pn":564,"preSale":0,"vd":"","dir":"秦小珍","star":"刘畅,白百何,唐艺昕","cat":"剧情,爱情","wish":120703,"3d":false,"src":"","dur":121,"showDate":"","imax":false,"snum":78295,"id":246583,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"钢刀","scm":"骨肉两相残，血染戈壁滩","img":"http://p1.meituan.net/165.220/movie/618e4a173fe15df1f57b84b19ecb895d301697.jpg","sc":5.6,"ver":"3D","rt":"2016-05-20上映","pn":242,"preSale":0,"vd":"","dir":"阿甘","star":"何润东,李东学,夏梓桐","cat":"动作,剧情","wish":10540,"3d":true,"src":"","dur":94,"showDate":"","imax":false,"snum":18467,"id":248495,"time":""},{"showInfo":"2016-07-01 下周五上映","late":false,"cnms":0,"sn":0,"nm":"终极胜利","scm":"辛德勒名单，推出中国版","img":"http://p1.meituan.net/165.220/movie/0c93b5987ae440497dd985982aad1c4b233221.jpg","sc":0,"ver":"2D","rt":"下周五上映","pn":114,"preSale":1,"vd":"","dir":"冼杞然","star":"窦骁,约瑟夫·费因斯,娄宇健","cat":"剧情,战争,历史","wish":4674,"3d":false,"src":"","dur":108,"showDate":"","imax":false,"snum":59,"id":341123,"time":""}]}
     */

    private int status;
    /**
     * hasNext : false
     * movies : [{"showInfo":"今天149家影院放映1769场","late":false,"cnms":0,"sn":0,"nm":"海底总动员2：多莉去哪儿","scm":"唠叨鱼多莉，上路找父母","img":"http://p0.meituan.net/165.220/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg","sc":8.7,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2016-06-17上映","pn":123,"preSale":0,"vd":"","dir":"安德鲁·斯坦顿,安格斯·麦克莱恩","star":"艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯","cat":"动画,喜剧,冒险","wish":144949,"3d":true,"src":"","dur":97,"showDate":"","imax":true,"snum":46472,"id":246366,"time":""},{"showInfo":"今天150家影院放映1880场","late":false,"cnms":0,"sn":0,"nm":"魔兽","scm":"怒拳为谁握，联盟斗部落","img":"http://p0.meituan.net/165.220/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg","sc":9.2,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-08上映","pn":347,"preSale":0,"vd":"","dir":"邓肯·琼斯","star":"崔维斯·费米尔,宝拉·巴顿,本·福斯特","cat":"动作,冒险,奇幻","wish":479894,"3d":true,"src":"","dur":124,"showDate":"","imax":true,"snum":673839,"id":78421,"time":""},{"showInfo":"今天92家影院放映95场","late":false,"cnms":0,"sn":0,"nm":"惊天魔盗团2","scm":"周董变魔术，敌人挡不住","img":"http://p0.meituan.net/165.220/movie/9e0e95230b493aafa548e0963c0ef60c274699.jpg","sc":0,"ver":"2D/3D/中国巨幕","rt":"本周五上映","pn":232,"preSale":1,"vd":"","dir":"朱浩伟","star":"杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森","cat":"动作,喜剧,惊悚","wish":506395,"3d":true,"src":"","dur":126,"showDate":"","imax":false,"snum":4967,"id":246333,"time":""},{"showInfo":"今天90家影院放映92场","late":false,"cnms":0,"sn":0,"nm":"独立日：卷土重来","scm":"外星再入侵，地核将燃尽","img":"http://p1.meituan.net/165.220/movie/b408a9322cd0da51d4bdd3261ba3d1c0278866.jpg","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"本周五上映","pn":140,"preSale":1,"vd":"","dir":"罗兰·艾默里奇","star":"利亚姆·海姆斯沃斯,麦卡·梦露,杰西·厄舍","cat":"动作,冒险,科幻","wish":159407,"3d":true,"src":"","dur":120,"showDate":"","imax":true,"snum":3008,"id":246375,"time":""},{"showInfo":"今天144家影院放映972场","late":false,"cnms":0,"sn":0,"nm":"X战警：天启","scm":"天启当炮灰，千年洗剪吹","img":"http://p1.meituan.net/165.220/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg","sc":9.1,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-03上映","pn":688,"preSale":0,"vd":"","dir":"布莱恩·辛格","star":"詹姆斯·麦卡沃伊,迈克尔·法斯宾德,詹妮弗·劳伦斯","cat":"动作,科幻,奇幻","wish":559919,"3d":true,"src":"","dur":144,"showDate":"","imax":true,"snum":419235,"id":246177,"time":""},{"showInfo":"今天36家影院放映36场","late":false,"cnms":0,"sn":0,"nm":"三人行","scm":"悍匪有手段，中枪再作案","img":"http://p1.meituan.net/165.220/movie/1c82df174422d9374f821482f445171b129671.jpg","sc":9.7,"ver":"2D","rt":"本周五上映","pn":186,"preSale":1,"vd":"","dir":"杜琪峰","star":"赵薇,古天乐,钟汉良","cat":"动作,犯罪,悬疑","wish":70065,"3d":false,"src":"","dur":88,"showDate":"","imax":false,"snum":3079,"id":246972,"time":""},{"showInfo":"今天92家影院放映220场","late":false,"cnms":0,"sn":0,"nm":"我叫MT之山口山战记","scm":"贱萌牛头人，爆笑刷副本","img":"http://p0.meituan.net/165.220/movie/73f6abbb90259d1fa8a88fa907ca3062587352.jpg","sc":7.6,"ver":"3D/中国巨幕","rt":"2016-06-17上映","pn":40,"preSale":0,"vd":"","dir":"核桃","star":"奶茶,YOYO,CBI","cat":"动画,喜剧,冒险","wish":43480,"3d":true,"src":"","dur":86,"showDate":"","imax":false,"snum":16802,"id":246045,"time":""},{"showInfo":"今天84家影院放映250场","late":false,"cnms":0,"sn":0,"nm":"爱丽丝梦游仙境2：镜中奇遇记","scm":"镜中再梦游，拯救老朋友","img":"http://p1.meituan.net/165.220/movie/dbcc3eabae012da794fe4b74ed1365fc659390.jpg","sc":8.6,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-05-27上映","pn":82,"preSale":0,"vd":"","dir":"詹姆斯·波宾","star":"约翰尼·德普,安妮·海瑟薇,米娅·华希科沃斯卡","cat":"奇幻,冒险,喜剧","wish":248677,"3d":true,"src":"","dur":115,"showDate":"","imax":true,"snum":217127,"id":248680,"time":""},{"showInfo":"今天69家影院放映111场","late":false,"cnms":0,"sn":0,"nm":"筷仙","scm":"笔仙已玩坏，筷仙来作怪","img":"http://p1.meituan.net/165.220/movie/31a325f0796cfebbab24776024eeec91100800.jpeg","sc":4.6,"ver":"2D","rt":"2016-06-17上映","pn":32,"preSale":0,"vd":"","dir":"姬雨","star":"胡影怡,朱璇,周骏","cat":"恐怖,惊悚","wish":20373,"3d":false,"src":"","dur":87,"showDate":"","imax":false,"snum":10254,"id":343597,"time":""},{"showInfo":"2016-06-24 本周五上映","late":false,"cnms":0,"sn":0,"nm":"近在咫尺的爱恋","scm":"真爱在身旁，挥拳为理想","img":"http://p1.meituan.net/165.220/movie/b77f9474ee477174a8fdff88ded43e76400502.jpg","sc":0,"ver":"2D","rt":"本周五上映","pn":49,"preSale":1,"vd":"","dir":"程孝泽","star":"彭于晏,郭采洁,杨子姗","cat":"爱情,运动,剧情","wish":11950,"3d":false,"src":"","dur":103,"showDate":"","imax":false,"snum":172,"id":57217,"time":""},{"showInfo":"今天28家影院放映61场","late":false,"cnms":0,"sn":0,"nm":"百鸟朝凤","scm":"两代手艺人，唢呐感情深","img":"http://p1.meituan.net/165.220/movie/ef968fd382173c45b0c2d10572ca10b8354896.jpg","sc":9.2,"ver":"2D","rt":"2016-05-06上映","pn":105,"preSale":0,"vd":"","dir":"吴天明","star":"陶泽如,郑伟,李岷城","cat":"历史,音乐,剧情","wish":3981,"3d":false,"src":"","dur":108,"showDate":"","imax":false,"snum":107704,"id":248260,"time":""},{"showInfo":"2016-07-08上映","late":false,"cnms":0,"sn":0,"nm":"致青春·原来你还在这里","scm":"霸道男学霸，爱上女学渣","img":"http://p0.meituan.net/165.220/movie/37e7ed909843270f0880c325b6be7b60436509.jpg","sc":0,"ver":"2D","rt":"2016-07-08上映","pn":332,"preSale":1,"vd":"","dir":"周拓如","star":"吴亦凡,刘亦菲,金世佳","cat":"剧情,爱情","wish":187810,"3d":false,"src":"","dur":98,"showDate":"","imax":false,"snum":3280,"id":246575,"time":""},{"showInfo":"今天21家影院放映52场","late":false,"cnms":0,"sn":0,"nm":"北京遇上西雅图之不二情书","scm":"异国心未远，书信寄情缘","img":"http://p1.meituan.net/165.220/movie/fe80bc40822d0a5f3168b73089c47d71101133.jpg","sc":8.5,"ver":"2D/中国巨幕","rt":"2016-04-29上映","pn":547,"preSale":0,"vd":"","dir":"薛晓路","star":"汤唯,吴秀波,惠英红","cat":"爱情,剧情","wish":307383,"3d":false,"src":"","dur":132,"showDate":"","imax":false,"snum":440391,"id":247575,"time":""},{"showInfo":"今天17家影院放映41场","late":false,"cnms":0,"sn":0,"nm":"南口1937","scm":"南口抗日战，疆场洒血汗","img":"http://p1.meituan.net/165.220/movie/f4b5d903571ec3c3fc952f86261b04fd227842.jpg","sc":0,"ver":"2D","rt":"本周四上映","pn":26,"preSale":0,"vd":"","dir":"朱丹","star":"孙看,孙洪涛,刘忠元","cat":"剧情,历史,战争","wish":2034,"3d":false,"src":"","dur":98,"showDate":"","imax":false,"snum":68,"id":368071,"time":""},{"showInfo":"2016-06-30 下周四上映","late":false,"cnms":0,"sn":0,"nm":"所以\u2026\u2026和黑粉结婚了","scm":"黑粉变新娘，这是闹哪样","img":"http://p1.meituan.net/165.220/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg","sc":0,"ver":"2D","rt":"下周四上映","pn":115,"preSale":1,"vd":"","dir":"金帝荣","star":"朴灿烈,袁姗姗,姜潮","cat":"爱情,喜剧","wish":83647,"3d":false,"src":"","dur":99,"showDate":"","imax":false,"snum":5965,"id":343379,"time":""},{"showInfo":"今天8家影院放映14场","late":false,"cnms":0,"sn":0,"nm":"泰迪熊之玩具大战","scm":"恶势力进攻，泰迪救萌宠","img":"http://p1.meituan.net/165.220/movie/495971f9751f07a720373ad6008146e8575458.jpg","sc":7.3,"ver":"2D","rt":"2016-06-09上映","pn":8,"preSale":0,"vd":"","dir":"胡韵","star":"邓小婷,赵奔,白文显","cat":"动画,冒险,喜剧","wish":7076,"3d":false,"src":"","dur":78,"showDate":"","imax":false,"snum":6117,"id":346658,"time":""},{"showInfo":"今天10家影院放映14场","late":false,"cnms":0,"sn":0,"nm":"海洋之恋","scm":"凄美人鱼恋，海洋是家园","img":"http://p0.meituan.net/165.220/movie/0e3af6f723d8b7d4a3ea62efba49f535814826.jpg","sc":0,"ver":"2D","rt":"2016-06-17上映","pn":26,"preSale":0,"vd":"","dir":"郑淑兰","star":"韩在石,句号,王奎荣","cat":"科幻,爱情,奇幻","wish":2600,"3d":false,"src":"","dur":96,"showDate":"","imax":false,"snum":865,"id":341109,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"赏金猎人","scm":"编外铁饭碗，收钱抓逃犯","img":"http://p1.meituan.net/165.220/movie/45f8587cb425a01c9a279082772a8bd0379497.jpg","sc":0,"ver":"2D/3D","rt":"下周五上映","pn":170,"preSale":1,"vd":"","dir":"申太罗","star":"李敏镐,钟汉良,唐嫣","cat":"动作,喜剧,剧情,悬疑","wish":114200,"3d":true,"src":"","dur":105,"showDate":"","imax":false,"snum":3642,"id":338506,"time":""},{"showInfo":"2016-07-01 下周五上映","late":false,"cnms":0,"sn":0,"nm":"魔轮","scm":"天涯号起航，失控大逃亡","img":"http://p0.meituan.net/165.220/movie/1d44cc6185a7ee4ee1def1f3a0f5821a584683.jpg","sc":0,"ver":"2D/3D","rt":"下周五上映","pn":41,"preSale":1,"vd":"","dir":"王早","star":"林心如,何润东,金世佳","cat":"悬疑,惊悚,恐怖","wish":7730,"3d":true,"src":"","dur":92,"showDate":"","imax":false,"snum":366,"id":342741,"time":""},{"showInfo":"今天5家影院放映10场","late":false,"cnms":0,"sn":0,"nm":"死亡游戏","scm":"同学生日会，恶鬼来相会","img":"http://p1.meituan.net/165.220/movie/c3eec836300c5a9f0429d96921aa168472038.jpg","sc":5.8,"ver":"2D","rt":"2016-06-03上映","pn":145,"preSale":0,"vd":"","dir":"麦子","star":"徐洁儿,陈欢,陈炳强","cat":"恐怖,惊悚,悬疑","wish":3301,"3d":false,"src":"","dur":90,"showDate":"","imax":false,"snum":5162,"id":346286,"time":""},{"showInfo":"今天2家影院放映6场","late":false,"cnms":0,"sn":0,"nm":"白毛女","scm":"欠了高利贷，卖女来抵债","img":"http://p1.meituan.net/165.220/movie/a8dc71209614a071cbc56cfc193b9d9785810.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-03-25上映","pn":80,"preSale":0,"vd":"","dir":"侯克明","star":"雷佳,张英席,高鹏","cat":"剧情","wish":1038,"3d":true,"src":"","dur":122,"showDate":"","imax":false,"snum":1193,"id":345102,"time":""},{"showInfo":"今天4家影院放映5场","late":false,"cnms":0,"sn":0,"nm":"记忆碎片","scm":"宿醉陷疑案，奋力查嫌犯","img":"http://p1.meituan.net/165.220/movie/ea15948d63d527d092a70e39cbb74636357253.jpg","sc":6.9,"ver":"2D","rt":"2016-06-03上映","pn":47,"preSale":0,"vd":"","dir":"朴裕焕","star":"雷佳音,夏梓桐,李菁","cat":"悬疑,喜剧,犯罪","wish":4154,"3d":false,"src":"","dur":94,"showDate":"","imax":false,"snum":2915,"id":345923,"time":""},{"showInfo":"今天4家影院放映5场","late":false,"cnms":0,"sn":0,"nm":"我们毕业啦","scm":"初恋要厮守，毕业不分手","img":"http://p1.meituan.net/165.220/movie/69dbdb2e866a979f3ec1e99a21d8e10868108.jpg","sc":5.3,"ver":"2D","rt":"2016-06-10上映","pn":47,"preSale":0,"vd":"","dir":"程中豪,王凯","star":"童菲,高泰宇,马丁","cat":"爱情,剧情","wish":14685,"3d":false,"src":"","dur":95,"showDate":"","imax":false,"snum":4294,"id":342730,"time":""},{"showInfo":"今天1家影院放映4场","late":false,"cnms":0,"sn":0,"nm":"大唐玄奘","scm":"了却世间恨，尽是取经人","img":"http://p0.meituan.net/165.220/movie/c1cbba6359ef62bbb5bdd5311708c828413080.jpg","sc":7.7,"ver":"2D/中国巨幕","rt":"2016-04-29上映","pn":232,"preSale":0,"vd":"","dir":"霍建起","star":"黄晓明,蒲巴甲,徐峥","cat":"剧情,历史","wish":23799,"3d":false,"src":"","dur":120,"showDate":"","imax":false,"snum":28213,"id":338357,"time":""},{"showInfo":"今天2家影院放映4场","late":false,"cnms":0,"sn":0,"nm":"愤怒的小鸟","scm":"绿猪来偷蛋，鸟儿群奋战","img":"http://p0.meituan.net/165.220/movie/b721e73740601799c065affb619d837e151622.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-05-20上映","pn":132,"preSale":0,"vd":"","dir":"费格尔·雷利,克莱·凯蒂","star":"杰森·苏戴奇斯,乔什·盖德,丹尼·麦克布耐德","cat":"动画,奇幻,冒险","wish":123045,"3d":true,"src":"","dur":97,"showDate":"","imax":false,"snum":312219,"id":246188,"time":""},{"showInfo":"今天2家影院放映4场","late":false,"cnms":0,"sn":0,"nm":"自我救赎","scm":"举报别人易，举报自己难","img":"http://p0.meituan.net/165.220/movie/8f5662a2d71e11c005a3b5f64b973554804794.jpg","sc":0,"ver":"2D","rt":"2016-05-25上映","pn":24,"preSale":0,"vd":"","dir":"朱江华,王首越","star":"孙渤洋,陈美行,陈铮","cat":"剧情","wish":761,"3d":false,"src":"","dur":85,"showDate":"","imax":false,"snum":125,"id":344491,"time":""},{"showInfo":"今天3家影院放映3场","late":false,"cnms":0,"sn":0,"nm":"催眠大师","scm":"催眠治心伤，侧击猜真相","img":"http://p1.meituan.net/165.220/movie/__39582689__9041214.jpg","sc":9,"ver":"2D","rt":"2014-04-29上映","pn":78,"preSale":0,"vd":"","dir":"陈正道","star":"徐峥,莫文蔚,吕中","cat":"剧情,悬疑,惊悚","wish":11396,"3d":false,"src":"","dur":102,"showDate":"","imax":false,"snum":46510,"id":78672,"time":""},{"showInfo":"今天3家影院放映3场","late":false,"cnms":0,"sn":0,"nm":"当流星划过天际","scm":"恋爱遇失忆，错爱富家女","img":"http://p1.meituan.net/165.220/movie/e2b564261eb1230239a52ba911f362a91396648.jpg","sc":0,"ver":"2D","rt":"2016-06-17上映","pn":33,"preSale":0,"vd":"","dir":"宋奇","star":"许诺,孙锂华,梁愚","cat":"爱情,剧情","wish":1781,"3d":false,"src":"","dur":90,"showDate":"","imax":false,"snum":183,"id":341293,"time":""},{"showInfo":"今天2家影院放映2场","late":false,"cnms":0,"sn":0,"nm":"Hold住爱","scm":"假戏变真做，幂威秀爱火","img":"http://p0.meituan.net/165.220/movie/29/274730.jpg","sc":5.9,"ver":"2D","rt":"2012-08-23上映","pn":300,"preSale":0,"vd":"","dir":"张琦","star":"杨幂,刘恺威,周秀娜","cat":"喜剧,爱情,悬疑","wish":280,"3d":false,"src":"","dur":95,"showDate":"","imax":false,"snum":753,"id":729,"time":""},{"showInfo":"今天2家影院放映2场","late":false,"cnms":0,"sn":0,"nm":"山花烂漫时","scm":"学霸变学渣，原来为爸爸","img":"http://p1.meituan.net/165.220/movie/74c2ae23952a874a88b8900eafeaecbc410409.jpg","sc":0,"ver":"2D","rt":"2016-06-17上映","pn":26,"preSale":0,"vd":"","dir":"纪明","star":"陈姗姗,马子晶,赵芙丽","cat":"剧情,家庭","wish":1151,"3d":false,"src":"","dur":88,"showDate":"","imax":false,"snum":264,"id":410649,"time":""},{"showInfo":"2016-06-27 下周一上映","late":false,"cnms":0,"sn":0,"nm":"大火种","scm":"誓死护宣言，智斗救火种","img":"http://p1.meituan.net/165.220/movie/c8545c7bd1f6070f0d52a77bd0ddd8738720802.jpg","sc":0,"ver":"2D","rt":"下周一上映","pn":0,"preSale":1,"vd":"","dir":"苗月","star":"白威,陈瑾,王柠","cat":"剧情,历史,战争","wish":244,"3d":false,"src":"","dur":114,"showDate":"","imax":false,"snum":17,"id":337438,"time":""},{"showInfo":"2016-07-01 下周五上映","late":false,"cnms":0,"sn":0,"nm":"党的女儿尹灵芝","scm":"心中有信仰，少年变战士","img":"http://p1.meituan.net/165.220/movie/f736bb222c8a4048fb19e7e6c27bb569180053.jpg","sc":0,"ver":"2D","rt":"下周五上映","pn":12,"preSale":1,"vd":"","dir":"卫晓茼","star":"郜耀平,张志宏,姚安濂","cat":"剧情,历史","wish":525,"3d":false,"src":"","dur":107,"showDate":"","imax":false,"snum":115,"id":672123,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"叶问2：宗师传奇","scm":"叶问搬香港，仇恨值渐长","img":"http://p0.meituan.net/165.220/movie/70/612717.jpg","sc":8.5,"ver":"2D","rt":"2010-04-27上映","pn":63,"preSale":0,"vd":"","dir":"叶伟信","star":"甄子丹,洪金宝,熊黛林","cat":"动作,历史,传记","wish":211,"3d":false,"src":"","dur":108,"showDate":"","imax":false,"snum":1029,"id":524,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"光棍终结者","scm":"光棍可团购，脱单快节奏","img":"http://p0.meituan.net/165.220/movie/28/668388.jpg","sc":4.2,"ver":"2D","rt":"2011-11-11上映","pn":55,"preSale":0,"vd":"","dir":"赵非","star":"李艾,周韦彤,周晓鸥","cat":"喜剧,爱情","wish":0,"3d":false,"src":"","dur":100,"showDate":"","imax":false,"snum":40,"id":947,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"厨子戏子痞子","scm":"三男一台戏，客栈解僵局","img":"http://p0.meituan.net/165.220/movie/__7277442__6071578.jpg","sc":8.3,"ver":"2D","rt":"2013-03-29上映","pn":281,"preSale":0,"vd":"","dir":"管虎","star":"黄渤,刘烨,张涵予","cat":"剧情,喜剧,动作","wish":10110,"3d":false,"src":"","dur":108,"showDate":"","imax":false,"snum":5753,"id":969,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"爸爸去哪儿","scm":"和动物玩耍，解放了麻麻","img":"http://p1.meituan.net/165.220/movie/__31723366__3815543.jpg","sc":8.5,"ver":"2D","rt":"2014-01-31上映","pn":149,"preSale":0,"vd":"","dir":"谢涤葵","star":"林志颖,小小志,郭涛","cat":"喜剧,家庭","wish":15705,"3d":false,"src":"","dur":95,"showDate":"","imax":false,"snum":40989,"id":78621,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"北京爱情故事","scm":"恋爱分五段，激情不会散","img":"http://p0.meituan.net/165.220/movie/__33456063__6265360.jpg","sc":8,"ver":"2D","rt":"2014-02-14上映","pn":145,"preSale":0,"vd":"","dir":"陈思诚","star":"梁家辉,刘嘉玲,王学兵","cat":"爱情","wish":12286,"3d":false,"src":"","dur":121,"showDate":"","imax":false,"snum":28675,"id":78324,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"同桌的你","scm":"初恋要结婚，回国忆青春","img":"http://p0.meituan.net/165.220/movie/__40811615__5745234.jpg","sc":8.6,"ver":"2D","rt":"2014-04-25上映","pn":88,"preSale":0,"vd":"","dir":"郭帆","star":"周冬雨,林更新,隋凯","cat":"剧情,爱情","wish":24267,"3d":false,"src":"","dur":98,"showDate":"","imax":false,"snum":73011,"id":78653,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"一路惊喜","scm":"除夕夜奇遇，转角有惊喜","img":"http://p1.meituan.net/165.220/movie/9014cb2360cc64d64acb3abe18d33552131346.jpg","sc":7.7,"ver":"2D","rt":"2015-02-06上映","pn":251,"preSale":0,"vd":"","dir":"金依萌,潘安子,章家瑞,宋迪","star":"郭采洁,凤小岳,赵丽颖","cat":"爱情,家庭,喜剧","wish":15223,"3d":false,"src":"","dur":120,"showDate":"","imax":false,"snum":73895,"id":246049,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"冲上云霄","scm":"男神天上飞，奔着女神追","img":"http://p1.meituan.net/165.220/movie/97b2c700b5ec0cc64ca40a18e818db51849188.jpg","sc":5,"ver":"2D","rt":"2015-02-19上映","pn":174,"preSale":0,"vd":"","dir":"叶伟信,邹凯光","star":"古天乐,郑秀文,吴镇宇","cat":"剧情,爱情","wish":37001,"3d":false,"src":"","dur":100,"showDate":"","imax":false,"snum":131007,"id":78601,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"左耳","scm":"青春要恋爱，别忘堕堕胎","img":"http://p0.meituan.net/165.220/movie/da55f29972ec0b9692ba7055905892c8123092.jpg","sc":7.9,"ver":"2D","rt":"2015-04-24上映","pn":315,"preSale":0,"vd":"","dir":"苏有朋","star":"陈都灵,欧豪,杨洋","cat":"爱情","wish":82116,"3d":false,"src":"","dur":117,"showDate":"","imax":false,"snum":537810,"id":246210,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"美人鱼之海盗来袭","scm":"国产美人鱼，俩海盗来袭","img":"http://p0.meituan.net/165.220/movie/7e15953aa8bc5be4e7bff00913426a06920765.jpg","sc":5.5,"ver":"2D","rt":"2015-07-31上映","pn":38,"preSale":0,"vd":"","dir":"邱浩强","star":"李思娴,郭亚维,宋磊","cat":"动画,喜剧,冒险","wish":27716,"3d":false,"src":"","dur":85,"showDate":"","imax":false,"snum":21942,"id":248550,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"港囧","scm":"宝宝换包包，笑点没变少","img":"http://p1.meituan.net/165.220/movie/aea9291ff4c41e074e2edc2a2d9b20f9500507.jpg","sc":8.4,"ver":"2D/IMAX 2D/中国巨幕/全景声","rt":"2015-09-25上映","pn":498,"preSale":0,"vd":"","dir":"徐峥","star":"徐峥,赵薇,包贝尔","cat":"喜剧,爱情,动作","wish":617005,"3d":false,"src":"","dur":113,"showDate":"","imax":true,"snum":1914276,"id":246577,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"我是证人","scm":"证词相矛盾，姐弟被围困","img":"http://p1.meituan.net/165.220/movie/d75604e123f8cdd8b52c069936f84f5b49504.jpg","sc":8.5,"ver":"2D","rt":"2015-10-30上映","pn":499,"preSale":0,"vd":"","dir":"安尚勋","star":"杨幂,鹿晗,王景春","cat":"悬疑,犯罪,惊悚","wish":139189,"3d":false,"src":"","dur":112,"showDate":"","imax":false,"snum":236460,"id":247711,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"陪安东尼度过漫长岁月","scm":"文艺大暖男，不二常相伴","img":"http://p1.meituan.net/165.220/movie/9f0d994eafbf52e7b0145b7746d1d881246635.jpg","sc":7.8,"ver":"2D","rt":"2015-11-13上映","pn":564,"preSale":0,"vd":"","dir":"秦小珍","star":"刘畅,白百何,唐艺昕","cat":"剧情,爱情","wish":120703,"3d":false,"src":"","dur":121,"showDate":"","imax":false,"snum":78295,"id":246583,"time":""},{"showInfo":"今天1家影院放映1场","late":false,"cnms":0,"sn":0,"nm":"钢刀","scm":"骨肉两相残，血染戈壁滩","img":"http://p1.meituan.net/165.220/movie/618e4a173fe15df1f57b84b19ecb895d301697.jpg","sc":5.6,"ver":"3D","rt":"2016-05-20上映","pn":242,"preSale":0,"vd":"","dir":"阿甘","star":"何润东,李东学,夏梓桐","cat":"动作,剧情","wish":10540,"3d":true,"src":"","dur":94,"showDate":"","imax":false,"snum":18467,"id":248495,"time":""},
     * {"showInfo":
     * "2016-07-01 下周五上映",
     * "late":false,
     * "cnms":0,
     * "sn":0,
     * "nm":"终极胜利",
     * "scm":"辛德勒名单，推出中国版",
     * "img":"http://p1.meituan.net/165.220/movie/0c93b5987ae440497dd985982aad1c4b233221.jpg",
     * "sc":0,
     * "ver":"2D",
     * "rt":"下周五上映",
     * "pn":114,
     * "preSale":1,
     * "vd":"",
     * "dir":"冼杞然",
     * "star":"窦骁,约瑟夫·费因斯,娄宇健",
     * "cat":"剧情,战争,历史",
     * "wish":4674,
     * "3d":false,
     * "src":"",
     * "dur":108,
     * "showDate":"",
     * "imax":false,
     * "snum":59,
     * "id":341123,
     * "time":""}]
     */

    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        private boolean hasNext;
        /**
         * showInfo : 今天149家影院放映1769场
         * late : false
         * cnms : 0
         * sn : 0
         * nm : 海底总动员2：多莉去哪儿
         * scm : 唠叨鱼多莉，上路找父母
         * img : http://p0.meituan.net/165.220/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg
         * sc : 8.7
         * ver : 2D/3D/IMAX 3D/中国巨幕
         * rt : 2016-06-17上映
         * pn : 123
         * preSale : 0
         * vd :
         * dir : 安德鲁·斯坦顿,安格斯·麦克莱恩
         * star : 艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯
         * cat : 动画,喜剧,冒险
         * wish : 144949
         * 3d : true
         * src :
         * dur : 97
         * showDate :
         * imax : true
         * snum : 46472
         * id : 246366
         * time :
         */

        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            private String showInfo;
            private boolean late;
            private int cnms;
            private int sn;
            private String nm;
            private String scm;
            private String img;
            private double sc;
            private String ver;
            private String rt;
            private int pn;
            private int preSale;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            private boolean value3d;
            private String src;
            private int dur;
            private String showDate;
            private boolean imax;
            private int snum;
            private int id;
            private String time;

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean isValue3d() {
                return value3d;
            }

            public void setValue3d(boolean value3d) {
                this.value3d = value3d;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }
}
