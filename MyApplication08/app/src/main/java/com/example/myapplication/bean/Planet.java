package com.example.myapplication.bean;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = { R.drawable.niurou, R.drawable.gaodian, R.drawable.binggan,
            R.drawable.huasheng, R.drawable.qiaokeli, R.drawable.fengzhua,
            R.drawable.tangguo,R.drawable.zishu};
    private static String[] nameArray = { "牛肉", "糕点", "饼干", "花生", "巧克力", "无骨凤爪", "糖果","紫薯干"};
    private static String[] descArray = {
            "风干牛肉干四川特产内蒙古手撕耗牛肉干500g袋装牦牛正宗麻辣零食",
            "上海特产沈大成 凤梨酥 黑凤梨酥传统糕点点心 黑金酥 零食礼盒",
            "进口茱蒂丝雷蒙德芝士乳酪夹心饼干代餐营养咸味办公室网红小零食",
            "宅猫日记好哆鱼麻辣花生小鱼干熟花生下酒菜休闲零食小吃",
            "GODIVA歌帝梵巧克力条x8多口味比利时进口休闲零食小吃 伴手礼",
            "酸辣无骨鸡爪罐装网红去骨柠檬凤爪泡椒脱骨即食零食卤味小吃熟食",
            "良品铺子小食仙果汁棒108g宝宝零食水果味吸吸果冻棒棒糖无添加",
            "【良品小食仙-紫薯仔100gx2袋】红薯干番薯干地瓜干早餐健康零食"


    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
