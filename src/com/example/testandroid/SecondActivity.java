package com.example.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.util.Log;

public class SecondActivity extends Activity {

    private static final String TAG="##SecondActivity##";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Log.d(TAG, "onCreate: "+this.toString()+", taskId="+this.getTaskId());
        TextView tv = (TextView) findViewById(R.id.tv2);
        tv.setText(this.toString()+", taskId="+this.getTaskId());
    }

    public void onBack(View view) {
        Intent intent = new Intent(this, ActivityTest.class);
        startActivity(intent);
    }
    @Override
	protected void onRestart() {
		super.onRestart();
		 Log.d(TAG, "onRestart: "+this.toString()+", taskId="+this.getTaskId());
	}
    @Override
    protected void onNewIntent(Intent intent) {
        Log.d(TAG, "onNewIntent: intent="+intent+", activity="+this+", taskId="+this.getTaskId());
    }   

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.d(TAG, "onDestroy: "+this.toString()+", taskId="+this.getTaskId());
		super.onDestroy();
	} 
    
    
}
