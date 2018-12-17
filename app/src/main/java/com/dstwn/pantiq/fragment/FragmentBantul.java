package com.dstwn.pantiq.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dstwn.pantiq.R;

import androidx.fragment.app.Fragment;

public class FragmentBantul extends Fragment {
    public FragmentBantul(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.f_bantul,container,false);
    }

}
