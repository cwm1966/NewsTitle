package com.example.newstiltlecwm;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.adapter.PoneUtils;
import com.example.fragment.HomeFragment;
import com.example.fragment.MessageFragment;
import com.example.fragment.MyFragment;
import com.example.fragment.VideoFragment;

import java.util.ArrayList;
import java.util.List;

public
class
MainActivity extends AppCompatActivity implements View.OnClickListener{

    private FragmentManager manager;
    private HomeFragment homeFragment;
    private VideoFragment videoFragment;
    private MessageFragment messageFragment;
    private MyFragment myFragment;
    private int num=0;
    private List<Button> buttonList;
    private List<TextView> Textlist;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PoneUtils.assistActivity(findViewById(R.id.fl));
        PoneUtils.assistActivity(findViewById(R.id.r1));
        initView();
        addfragment(new HomeFragment());
    }

    private void initView() {
        button1 = (Button) findViewById(R.id.bottom_btn1);
        button2 = (Button) findViewById(R.id.bottom_btn2);
        button3 = (Button) findViewById(R.id.bottom_btn3);
        button4 = (Button) findViewById(R.id.bottom_btn4);
        textView1 = (TextView) findViewById(R.id.bottom_text1);
        textView2 = (TextView) findViewById(R.id.bottom_text2);
        textView3 = (TextView) findViewById(R.id.bottom_text3);
        textView4 = (TextView) findViewById(R.id.bottom_text4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.bottom_btn1:
                if(homeFragment==null){
                    homeFragment=new HomeFragment();
                }
                num=0;

                button1.setBackgroundResource(R.mipmap.zixun_selected2x);
                textView1.setTextColor(getResources().getColor(R.color.blue));
                button2.setBackgroundResource(R.mipmap.faxian2x);
                textView2.setTextColor(Color.BLACK);
                button3.setBackgroundResource(R.mipmap.xiaoxi2x);
                textView3.setTextColor(Color.BLACK);
                button4.setBackgroundResource(R.mipmap.wo2x);
                textView4.setTextColor(Color.BLACK);
                manager.beginTransaction().replace(R.id.fl,homeFragment).commit();
                break;
            case R.id.bottom_btn2:
                if(videoFragment==null){
                    videoFragment=new VideoFragment();
                }
                num=1;
                button1.setBackgroundResource(R.mipmap.zixun2x);
                textView1.setTextColor(Color.BLACK);
                button2.setBackgroundResource(R.mipmap.faxian_selected2x);
                textView2.setTextColor(getResources().getColor(R.color.blue));
                button3.setBackgroundResource(R.mipmap.xiaoxi2x);
                textView3.setTextColor(Color.BLACK);
                button4.setBackgroundResource(R.mipmap.wo2x);
                textView4.setTextColor(Color.BLACK);
                manager.beginTransaction().replace(R.id.fl,videoFragment).commit();
                break;
            case R.id.bottom_btn3:
                if(messageFragment==null){
                    messageFragment=new MessageFragment();
                }
                num=2;
                button1.setBackgroundResource(R.mipmap.zixun2x);
                textView1.setTextColor(Color.BLACK);
                button2.setBackgroundResource(R.mipmap.faxian2x);
                textView2.setTextColor(Color.BLACK);
                button3.setBackgroundResource(R.mipmap.xiaoxi_selected2x);
                textView3.setTextColor(getResources().getColor(R.color.blue));
                button4.setBackgroundResource(R.mipmap.wo2x);
                textView4.setTextColor(Color.BLACK);
                manager.beginTransaction().replace(R.id.fl,messageFragment).commit();
                break;
            case R.id.bottom_btn4:
                if(myFragment==null){
                    myFragment=new MyFragment();
                }
                num=3;
                button1.setBackgroundResource(R.mipmap.zixun2x);
                textView1.setTextColor(Color.BLACK);
                button2.setBackgroundResource(R.mipmap.faxian2x);
                textView2.setTextColor(Color.BLACK);
                button3.setBackgroundResource(R.mipmap.xiaoxi2x);
                textView3.setTextColor(Color.BLACK);
                button4.setBackgroundResource(R.mipmap.wo_selected2x);
                textView4.setTextColor(getResources().getColor(R.color.blue));
                manager.beginTransaction().replace(R.id.fl,myFragment).commit();
                break;
        }
    }
    public void addfragment(Fragment fragment){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl,fragment).commit();
    }
}
