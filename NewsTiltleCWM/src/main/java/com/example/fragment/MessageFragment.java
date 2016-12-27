package com.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newstiltlecwm.R;

/**
 * 类描述:首页
 * 作者：陈文梦
 * 时间:2016/12/27 14:31
 * 邮箱:18310832074@163.com
 */

public class MessageFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.messagefragment,null);
        return view;
    }
}
