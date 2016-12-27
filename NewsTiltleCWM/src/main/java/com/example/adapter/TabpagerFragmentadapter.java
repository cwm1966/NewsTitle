package com.example.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.example.fragment.HomeFragment_f1;

/**
 * 类描述:
 * 作者：陈文梦
 * 时间:2016/12/27 14:48
 * 邮箱:18310832074@163.com
 */

public class TabpagerFragmentadapter extends FragmentPagerAdapter {
    private String[] title = new String[]{
            "推荐", "热点", "北京", "视频",
            "社会", "科技", "汽车", "体育",
            "财经", "娱乐"
    };
    public TabpagerFragmentadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        HomeFragment_f1 homeFragment_f1=new HomeFragment_f1();
        return homeFragment_f1;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public int getItemPosition(Object object) {

        return PagerAdapter.POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return title[position];
    }
}
