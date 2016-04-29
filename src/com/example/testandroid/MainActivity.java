package com.example.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;

public class MainActivity extends Activity {
	Spinner spinLockMode = null;
	private SwitchButton mSB = null;
	public static String tag = "AndroidTest";
//	private SwitchButton mFlymeSb, mMiuiSb, mCustomSb, mDefaultSb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinLockMode = (Spinner) findViewById(R.id.spinner1);
		mSB = (SwitchButton) findViewById(R.id.sb_text_state);

		ArrayAdapter<CharSequence> mAdapter = ArrayAdapter.createFromResource(
				this, R.array.lock_mode, R.layout.myspinner);
		mAdapter.setDropDownViewResource(R.layout.myspinner);
		spinLockMode.setAdapter(mAdapter);

	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		if(mSB.getText()!=null){
		Log.e(tag, "SwitchButton status = "+mSB.getText());}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
