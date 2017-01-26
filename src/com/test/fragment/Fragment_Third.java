package com.test.fragment;

import com.example.testandroid.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import android.support.v4.app.Fragment;

public class Fragment_Third extends Fragment{

    private View rootView;
    private FragmentCallBack fragmentCallBack = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(container==null)return null;
        rootView = inflater.inflate(R.layout.fragment_third, container,false);
       
        Bundle mBundle = new Bundle();
        mBundle.putInt("FragmentName", FragmentMain.intFragment_Third);
        fragmentCallBack.fragmentCallBack(mBundle);
        return rootView;
    }

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		fragmentCallBack = (FragmentMain) activity;
	}
}
