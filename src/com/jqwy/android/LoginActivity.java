package com.jqwy.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	public void loginCheck(View view){
		TextView username = (TextView )findViewById(R.id.username);
		TextView password = (TextView )findViewById(R.id.password);
		Log.v("Test", "loginCheck");
		Log.v("Test", "loginCheck username="+username.getText());
		Log.v("Test", "loginCheck password="+password.getText());
	}

}
