package com.example.newstiltlecwm;

import android.app.Application;

import java.util.HashMap;

/**
 * 类描述:
 * 作者：陈文梦
 * 时间:2016/12/27 16:03
 * 邮箱:18310832074@163.com
 */

public class MyApp extends Application {

    public static HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
    @Override
    public void onCreate() {
        super.onCreate();
    }
    public static void getdate(int i) {

        switch (i){
            case 0:
                hashMap.put("wb",R.mipmap.sina_allshare_pressed);
                hashMap.put("wx",R.mipmap.weixin_allshare_pressed);
                hashMap.put("qq",R.mipmap.qq_allshare_pressed);
                hashMap.put("sc",R.mipmap.favoriteicon_profile_press);
                hashMap.put("yj",R.mipmap.dayicon_profile);
                hashMap.put("sz",R.mipmap.setupicon_profile_press);
                hashMap.put("bc",R.color.blake);
                hashMap.put("tv",R.color.weite);
                 break;
            case 1:
                hashMap.put("wb",R.mipmap.sina_allshare_normal);
                hashMap.put("wx",R.mipmap.weixin_allshare_normal);
                hashMap.put("qq",R.mipmap.qq_allshare_pressed);
                hashMap.put("sc",R.mipmap.favoriteicon_profile);
                hashMap.put("yj",R.mipmap.nighticon_profile);
                hashMap.put("sz",R.mipmap.setupicon_profile);
                hashMap.put("bc",R.color.weite);
                hashMap.put("tv",R.color.blake);
                hashMap.put("tv1",R.color.tv2);
                break;
        }




    }

}
