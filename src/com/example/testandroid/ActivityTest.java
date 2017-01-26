package com.example.testandroid;
import com.example.testandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.util.Log;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.util.Log;

public class ActivityTest extends Activity {
    private static final String TAG="##ActivityTest##";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d(TAG, "onCreate: "+this.toString()+", taskId="+this.getTaskId());
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(this.toString()+", taskId="+this.getTaskId());
    }

    @Override
	protected void onRestart() {
		super.onRestart();
		 Log.d(TAG, "onRestart: "+this.toString()+", taskId="+this.getTaskId());
	}

	public void onJump(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
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

