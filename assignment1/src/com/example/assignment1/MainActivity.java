package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.d("mainactivity","onCreate");				
		
		setContentView(R.layout.activity_main);
		
		Button pressMe = (Button) findViewById(R.id.goToLst);
		
		pressMe.setOnClickListener(this);
	}	
	
	protected void onStart(){
		super.onStart();
		Log.d("mainactivity","onStart");	
	}
	
	protected void onRestart(){
		super.onRestart();
		Log.d("mainactivity","onRestart");
	}
	
	protected void onResume(){
		super.onResume();
		Log.d("mainactivity","onResume");	
	}

	protected void onPause(){
		super.onPause();
		Log.d("mainactivity","onPause");
	}

	protected void onStop(){
		super.onStop();
		Log.d("mainactivity","onStop");	
	}
	
	protected void onDestroy(){
		super.onDestroy();
		Log.d("mainactivity","onDestroy");	
	}
	
	protected void onActivityResult(int reqCode, int resultCode, Intent data) {
		if (reqCode == 1) {
	        if(resultCode == RESULT_OK){	    		
	    		Button b = (Button)findViewById(R.id.goToLst);
	        	b.setText("You Selected " + data.getExtras().getString("city"));
	        }
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent listIntent = new Intent(this, ListActivity.class );
		listIntent.putExtra("key1", "value1");
		listIntent.putExtra("key2", "value2");
		startActivityForResult(listIntent,1);
	}
}
