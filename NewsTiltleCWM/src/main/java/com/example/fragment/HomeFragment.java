package com.example.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adapter.TabpagerFragmentadapter;
import com.example.newstiltlecwm.R;

/**
 * 类描述:首页
 * 作者：陈文梦
 * 时间:2016/12/27 14:31
 * 邮箱:18310832074@163.com
 */

public class HomeFragment extends Fragment {


    private View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.homefragment,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        viewPager = (ViewPager) view.findViewById(R.id.home_pager);
        TabpagerFragmentadapter tabpagerFragmentadapter=new TabpagerFragmentadapter(getFragmentManager());
        viewPager.setAdapter(tabpagerFragmentadapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.RED);
        tabLayout.setTabTextColors(Color.BLACK,Color.RED);
    }
}
