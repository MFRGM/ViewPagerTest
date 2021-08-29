package com.unisoc.viewpagertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

//    private TextView tv_item_one;
//    private TextView tv_item_two;
//    private TextView tv_item_three;
//    private ViewPager myViewPager;
//    private List<Fragment> list;
//    private TabFragmentPagerAdapter adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        InitView();
//
//        tv_item_one.setOnClickListener(this);
//        tv_item_two.setOnClickListener(this);
//        tv_item_three.setOnClickListener(this);
//        myViewPager.setOnPageChangeListener(new MyPagerChangeListener());
//
//        list = new ArrayList<>();
//        list.add(new OneFragment());
//        list.add(new TwoFragment());
//        list.add(new ThreeFragment());
//        adapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), list);
//        myViewPager.setAdapter(adapter);
//        myViewPager.setCurrentItem(0);
//        tv_item_one.setBackgroundColor(Color.RED);
//    }
//
//    private void InitView() {
//        tv_item_one = findViewById(R.id.tv_item_one);
//        tv_item_two = findViewById(R.id.tv_item_two);
//        tv_item_three = findViewById(R.id.tv_item_three);
//        myViewPager = findViewById(R.id.myViewPager);
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.tv_item_one:
//                myViewPager.setCurrentItem(0);
//                tv_item_one.setBackgroundColor(Color.RED);
//                tv_item_one.setBackgroundColor(Color.WHITE);
//                tv_item_one.setBackgroundColor(Color.WHITE);
//                break;
//
//            case R.id.tv_item_two:
//                myViewPager.setCurrentItem(1);
//                tv_item_two.setBackgroundColor(Color.WHITE);
//                tv_item_two.setBackgroundColor(Color.RED);
//                tv_item_two.setBackgroundColor(Color.WHITE);
//                break;
//
//            case R.id.tv_item_three:
//                myViewPager.setCurrentItem(2);
//                tv_item_three.setBackgroundColor(Color.WHITE);
//                tv_item_three.setBackgroundColor(Color.WHITE);
//                tv_item_three.setBackgroundColor(Color.RED);
//                break;
//        }
//    }
//
//    public class MyPagerChangeListener implements ViewPager.OnPageChangeListener {
//        @Override
//        public void onPageScrollStateChanged(int state) {
//
//        }
//
//        @Override
//        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//        }
//
//        @Override
//        public void onPageSelected(int position) {
//            switch (position) {
//                case 0:
//                    tv_item_one.setBackgroundColor(Color.RED);
//                    tv_item_one.setBackgroundColor(Color.WHITE);
//                    tv_item_one.setBackgroundColor(Color.WHITE);
//                    break;
//
//                case 1:
//                    tv_item_two.setBackgroundColor(Color.WHITE);
//                    tv_item_two.setBackgroundColor(Color.RED);
//                    tv_item_two.setBackgroundColor(Color.WHITE);
//                    break;
//
//                case 2:
//                    tv_item_three.setBackgroundColor(Color.WHITE);
//                    tv_item_three.setBackgroundColor(Color.WHITE);
//                    tv_item_three.setBackgroundColor(Color.RED);
//                    break;
//            }
//        }
//    }


    private List<Fragment> list;
    private ViewPager myViewPager;
    private TabFragmentPagerAdapter adapter;

    private TextView  text_Control;
    private TextView  text_Oversee;
    private TextView  text_connectDevice;
    private TextView  topTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView()
    {
        text_Control=(TextView)  findViewById(R.id.textView_control ) ;
        text_Oversee =(TextView)  findViewById(R.id.textView_oversee ) ;
        text_connectDevice =(TextView)  findViewById(R.id.textView_connectDevice  ) ;
        topTitle =(TextView)  findViewById(R.id.textView_topTitle ) ;

        myViewPager = (ViewPager) findViewById(R.id.myViewPager);
        //绑定点击事件
        myViewPager.setOnPageChangeListener(new MyPagerChangeListener()) ;
        //把Fragment添加到List集合里面
        list = new ArrayList<>();
        list.add(new Fragment_Control() );
        list.add(new Fragment_Oversee() );
        list.add(new Fragment_ConnectDevice() );
        adapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), list);
        myViewPager.setAdapter(adapter);
        myViewPager.setCurrentItem(1);  //初始化显示第一个页面

    }

    /**
     * 设置一个ViewPager的侦听事件，当左右滑动ViewPager时菜单栏被选中状态跟着改变
     *
     */
    public class MyPagerChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrollStateChanged(int arg0) {
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }

        @Override
        public void onPageSelected(int arg0) {
            switch (arg0) {
                case 0:

                    text_Control  .setTextColor(Color.GREEN  );
                    text_Oversee  .setTextColor(Color.BLACK );
                    text_connectDevice   .setTextColor(Color.BLACK );
                    topTitle .setText("手动控制") ;

                    break;
                case 1:
                    text_Control .setTextColor(Color.BLACK );
                    text_Oversee .setTextColor(Color.GREEN );
                    text_connectDevice  .setTextColor(Color.BLACK );
                    topTitle .setText("数据监控") ;

                    break;
                case 2:
                    text_Control .setTextColor(Color.BLACK );
                    text_Oversee .setTextColor(Color.BLACK  );
                    text_connectDevice  .setTextColor(Color.GREEN );
                    topTitle .setText("连接设备") ;
                    break;
            }

        }

    }
}