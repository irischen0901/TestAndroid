package com.test.fragment;

import android.R.integer;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentTransaction;
import android.view.View;
//import android.view.View.OnClickListener;


import android.view.View.OnClickListener;

import com.test.fragment.Fragment_Third;
import com.example.testandroid.R;

	public class FragmentMain extends Activity implements OnClickListener, FragmentCallBack{
		Fragment mFragment_Third, mFragment_First, mFragment_Second;
		FragmentManager mFragmentManager;
		android.app.FragmentTransaction mFragmentTransaction;
		public static final int  intFragment_First = 1;
		public static final int  intFragment_Second = 2;
		public static final int  intFragment_Third = 3;
		
		    @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        // TODO Auto-generated method stub
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.fragment_main);
	
		            //一開始必須先指定一個fragment給main
		        mFragment_Third = new Fragment_Third();
		        mFragment_First = new Fragment_First();
		        mFragment_Second= new Fragment_Second();
		        mFragmentManager = this.getFragmentManager();
		        mFragmentTransaction = mFragmentManager.beginTransaction();
		        mFragmentTransaction.replace(R.id.fragment_replace_layout, mFragment_Third,"third_Fragment");
		        mFragmentTransaction.commit();
		        findViewById(R.id.btn_one).setOnClickListener(this);
		        findViewById(R.id.btn_two).setOnClickListener(this);
		        findViewById(R.id.btn_three).setOnClickListener(this);
		    }
			@Override
			public void onClick(View arg0) {
		        switch (arg0.getId()) {
		        case R.id.btn_one:
		            // 加载不同的Fragment
		        	Log.e("Iris", "click one");
		            if (null == mFragment_First) {
		                mFragment_First = new Fragment_First();
		            }
		            mFragmentTransaction = mFragmentManager.beginTransaction(); //每次轉換都要加
		            mFragmentTransaction.replace(R.id.fragment_replace_layout, mFragment_First, "fist_Fragment");
		            mFragmentTransaction.commit();
		            break;
		        case R.id.btn_two:
		         	Log.e("Iris", "click two");
		            if (null == mFragment_Second) {
		            	mFragment_Second = new Fragment_Second();
		            }
		            mFragmentTransaction = mFragmentManager.beginTransaction(); //每次轉換都要加
		            mFragmentTransaction.replace(R.id.fragment_replace_layout, mFragment_Second, "second_Fragment");
		            mFragmentTransaction.commit();
		            break;
		        case R.id.btn_three:
		        	Log.e("Iris", "click three");
		            if (null == mFragment_Third) {
		            	mFragment_Third = new Fragment_Third();
		            }
		            mFragmentTransaction = mFragmentManager.beginTransaction(); //每次轉換都要加
		            mFragmentTransaction.replace(R.id.fragment_replace_layout, mFragment_Third, "third_Fragment");
		            mFragmentTransaction.commit();
	
		        default:
		            break;
		        }
				
			}
			@Override
			public void fragmentCallBack(Bundle mBundle) {
				switch (mBundle.getInt("FragmentName")) {
				case intFragment_First:
					Log.e("Iris", "fragmentCallBack/come from Fragment_First");
					
					break;
				case intFragment_Second:
					Log.e("Iris", "fragmentCallBack/come from Fragment_Second");
					break;
				case intFragment_Third:
					Log.e("Iris", "fragmentCallBack/come from Fragment_Third");
					break;
				default:
					break;
				}
				
			}

	
//		    @Override
//		    public void onClick(View arg0) {
//		    	Log.e("Iris", "getId="+arg0.getId());
//		        switch (arg0.getId()) {
//		        case R.id.btn_one:
//		            // 加载不同的Fragment
//		        	Log.e("Iris", "click one");
//		            if (null == mFragment_First) {
//		                mFragment_First = new Fragment_First();
//		            }
//		            mFragmentTransaction = mFragmentManager.beginTransaction(); //每次轉換都要加
//		            mFragmentTransaction.replace(R.id.fragment_replace_layout, mFragment_First, "fist_Fragment");
//		            mFragmentTransaction.commit();
//		            break;
//		        case R.id.btn_two:
//		         	Log.e("Iris", "click two");
//		            if (null == mFragment_Second) {
//		            	mFragment_Second = new Fragment_Second();
//		            }
//		            mFragmentTransaction = mFragmentManager.beginTransaction(); //每次轉換都要加
//		            mFragmentTransaction.replace(R.id.fragment_replace_layout, mFragment_Second, "second_Fragment");
//		            mFragmentTransaction.commit();
//		        case R.id.btn_three:
//		        	Log.e("Iris", "click three");
//		            if (null == mFragment_Third) {
//		            	mFragment_Third = new Fragment_Third();
//		            }
//		            mFragmentTransaction = mFragmentManager.beginTransaction(); //每次轉換都要加
//		            mFragmentTransaction.replace(R.id.fragment_replace_layout, mFragment_Third, "third_Fragment");
//		            mFragmentTransaction.commit();
//	
//		        default:
//		            break;
//		        }
//		    }

		
		}

