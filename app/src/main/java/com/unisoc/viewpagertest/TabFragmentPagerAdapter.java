package com.unisoc.viewpagertest;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

//    private FragmentManager mFragmentManager;
//    private List<Fragment> mList;
//
//    public TabFragmentPagerAdapter(FragmentManager fm, List<Fragment> list) {
//        super(fm);
//        this.mList = list;
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        //显示第几个页面
//        return mList.get(position);
//    }
//
//    @Override
//    public int getCount() {
//        return mList.size();
//    }

    private FragmentManager mfragmentManager;
    private List<Fragment> mlist;


    public TabFragmentPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.mlist = list;
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
    }

    @Override
    public Fragment getItem(int arg0) {
        return mlist.get(arg0);//显示第几个页面
    }

    @Override
    public int getCount() {
        return mlist.size();//有几个页面
    }
}
