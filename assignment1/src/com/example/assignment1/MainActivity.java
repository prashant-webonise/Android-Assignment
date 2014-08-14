package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener{

	Button pressMe;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.d("mainactivity","onCreate");				
		
		setContentView(R.layout.activity_main);
		
		pressMe = (Button) findViewById(R.id.goToLst);
		
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
	    		pressMe = (Button)findViewById(R.id.goToLst);
	    		String team = data.getExtras().getString("city");
	    		if(!team.equals("Select Team"))
	    			pressMe.setText("You Selected " + team);
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
