package com.example.dx.testviewpager;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
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
