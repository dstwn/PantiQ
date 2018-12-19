package com.dstwn.pantiq.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dstwn.pantiq.R;
import com.dstwn.pantiq.api.ApiServis;
import com.dstwn.pantiq.api.InitApi;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;

public class FragmentBantul extends Fragment {
    public FragmentBantul(){

    }

    private RecyclerView recyclerView;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        recyclerView = (RecyclerView) recyclerView.findViewById(R.id.listpanti);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pantibantul();
    }

    private void pantibantul() {
        ApiServis api = InitApi.getInstance();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_list,container,false);

    }

}
