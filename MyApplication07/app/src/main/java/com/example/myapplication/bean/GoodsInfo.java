package com.example.myapplication.bean;


import com.example.myapplication.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "牛肉", "糕点", "饼干", "花生", "巧克力", "无骨凤爪", "糖果","紫薯干"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "风干牛肉干四川特产内蒙古手撕耗牛肉干500g袋装牦牛正宗麻辣零食",
            "上海特产沈大成 凤梨酥 黑凤梨酥传统糕点点心 黑金酥 零食礼盒",
            "进口茱蒂丝雷蒙德芝士乳酪夹心饼干代餐营养咸味办公室网红小零食",
            "宅猫日记好哆鱼麻辣花生小鱼干熟花生下酒菜休闲零食小吃",
            "GODIVA歌帝梵巧克力条x8多口味比利时进口休闲零食小吃 伴手礼",
            "酸辣无骨鸡爪罐装网红去骨柠檬凤爪泡椒脱骨即食零食卤味小吃熟食",
            "良品铺子小食仙果汁棒108g宝宝零食水果味吸吸果冻棒棒糖无添加",
            "【良品小食仙-紫薯仔100gx2袋】红薯干番薯干地瓜干早餐健康零食"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {25, 16, 30, 21, 12, 19,23,20};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.niuroua, R.drawable.gaodiana, R.drawable.binggana,
    R.drawable.huashenga, R.drawable.qiaokelia, R.drawable.fengzhuaa,
    R.drawable.tangguoa,R.drawable.zishua
};
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.niurou, R.drawable.gaodian, R.drawable.binggan,
            R.drawable.huasheng, R.drawable.qiaokeli, R.drawable.fengzhua,
            R.drawable.tangguo,R.drawable.zishu
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
