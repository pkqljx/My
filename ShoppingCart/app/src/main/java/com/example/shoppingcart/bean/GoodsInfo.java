package com.example.shoppingcart.bean;

import com.example.shoppingcart.R;

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
            "小风车", "胡萝卜", "小猫", "兔叽", "小恐龙", "小兔几", "小王子","猪猪"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "小风车胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
            "胡萝卜胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
            "小猫胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
            "兔叽胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
            "小恐龙胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
            "小兔几胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
            "小王子胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
            "猪猪胸针女日系可爱防走光别针ins潮胸花配饰书包徽章卡通学生刺马针",
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {8, 9, 2, 5, 8, 8,4,5};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.fengche_s, R.drawable.huluobo_s, R.drawable.maomao_s,
            R.drawable.tuji_s, R.drawable.xiaokonglong_s, R.drawable.xioatuji_s,
            R.drawable.xioawangzi_s,R.drawable.zhuzhu_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.fengche, R.drawable.huluobo, R.drawable.maomao,
            R.drawable.tuji, R.drawable.xiaokonglong, R.drawable.xioatuji,
            R.drawable.xioawangzi,R.drawable.zhuzhu
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
