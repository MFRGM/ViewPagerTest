package com.example.dx.testviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dx on 2018/9/8.
 */
public class Fragment_Control extends Fragment {

    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState){
        View view=inflater .inflate(R.layout .activity_control ,container,false) ;

        return view;
    }

}
