package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ListActivity extends Activity implements OnItemSelectedListener{
	
	String tmp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lsit_);
		
		Spinner Ipl_Teams = (Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.list, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Ipl_Teams.setAdapter(adapter);
		
		Ipl_Teams.setOnItemSelectedListener(this);
		
		
	}	
	
	public void finish() {
		Intent city = new Intent();
		city.putExtra("city", tmp);
		setResult(RESULT_OK,city);
		super.finish();
	}
	
	protected void onStart(){
		super.onStart();
		Log.d("listactivity","onStart");	
	}
	
	protected void onRestart(){
		super.onRestart();
		Log.d("listactivity","onRestart");	
	}
	
	protected void onResume(){
		super.onResume();
		Log.d("listactivity","onResume");
	}

	protected void onPause(){
		super.onPause();
		Log.d("listactivity","onPause");	
	}

	protected void onStop(){
		super.onStop();
		Log.d("listactivity","onStop");	
	}
	
	protected void onDestroy(){
		super.onDestroy();
		Log.d("listactivity","onDestroy");
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		tmp = (String) parent.getItemAtPosition(position);
		Log.d("city",tmp);
		if(!tmp.equals("Select Team")){
			Intent i = getIntent();
			String msg1 = i.getStringExtra("key1");
			String msg2 = i.getStringExtra("key2");
			
			Log.d("key1",msg1);
			Log.d("key2", msg2);
			
			finish();
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	
}
