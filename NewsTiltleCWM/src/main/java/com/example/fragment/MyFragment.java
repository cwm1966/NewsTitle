package com.example.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.newstiltlecwm.MyApp;
import com.example.newstiltlecwm.R;

/**
 * 类描述:首页
 * 作者：陈文梦
 * 时间:2016/12/27 14:31
 * 邮箱:18310832074@163.com
 */

public class MyFragment extends Fragment {


    private SharedPreferences sha;
    private SharedPreferences.Editor editor;
    private View view;
    private LinearLayout linearLayout;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private Button button1;
    private Button button2;
    private Button button3;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.myfragment,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        sha=getActivity().getSharedPreferences("clifg", Context.MODE_PRIVATE);
        editor=sha.edit();
        initview();
        //MyApp.getdate(1);
        editor.putBoolean("flag",true).commit();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean flag = sha.getBoolean("flag", false);
                if(flag){
                    editor.putBoolean("flag",false).commit();
                    MyApp.getdate(0);
                    t1.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
                    t5.setText("日间");
                }else{
                    editor.putBoolean("flag",true).commit();
                    MyApp.getdate(1);
                    t1.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv1")));
                    t5.setText("夜间");
                }
                getdate();
            }
        });
    }
    public void getdate(){

        linearLayout.setBackgroundResource(MyApp.hashMap.get("bc"));
        imageView1.setImageResource(MyApp.hashMap.get("wb"));
        imageView2.setImageResource(MyApp.hashMap.get("wx"));
        imageView3.setImageResource(MyApp.hashMap.get("qq"));
        button1.setBackgroundResource(MyApp.hashMap.get("sc"));
        button2.setBackgroundResource(MyApp.hashMap.get("yj"));
        button3.setBackgroundResource(MyApp.hashMap.get("sz"));
        t2.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t3.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t4.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t5.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t6.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t7.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t8.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t9.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t10.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t11.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
        t12.setTextColor(getActivity().getResources().getColor(MyApp.hashMap.get("tv")));
    }
    public  void initview(){
        linearLayout = (LinearLayout) view.findViewById(R.id.my_fragment);
        imageView1 = (ImageView) view.findViewById(R.id.weiboimage);
        imageView2 = (ImageView) view.findViewById(R.id.weixinimage);
        imageView3 = (ImageView) view.findViewById(R.id.qqimage);
        button1 = (Button) view.findViewById(R.id.my_shoucang);
        button2 = (Button) view.findViewById(R.id.my_yejian);
        button3 = (Button) view.findViewById(R.id.my_shezhi);
         t1= (TextView) view.findViewById(R.id.my_t1);
         t2= (TextView) view.findViewById(R.id.my_t2);
         t3= (TextView) view.findViewById(R.id.my_t3);
         t4= (TextView) view.findViewById(R.id.my_bottom_text1);
         t5= (TextView) view.findViewById(R.id.my_bottom_text2);
         t6= (TextView) view.findViewById(R.id.my_bottom_text3);
         t7= (TextView) view.findViewById(R.id.my_message1);
         t8= (TextView) view.findViewById(R.id.my_message2);
         t9= (TextView) view.findViewById(R.id.my_message3);
         t10= (TextView) view.findViewById(R.id.my_message4);
         t11= (TextView) view.findViewById(R.id.my_message5);
         t12= (TextView) view.findViewById(R.id.my_message6);
    }
}
