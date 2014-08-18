package com.example.assignment3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

public class MainActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.d("mainactivity","onCreate");

		Configuration config = getResources().getConfiguration();

		//SupportFragmentManager fManager = getSupportFragmentManager();
		
		FragmentTransaction fTransaction = getSupportFragmentManager().beginTransaction();


		ListFragment ls_fragment = new ListFragment();
		fTransaction.replace(android.R.id.content, ls_fragment);


		DescFragment pm_fragment = new DescFragment();
		fTransaction.add(android.R.id.content, pm_fragment);


		if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
			/*
			LinearLayout layout = new LinearLayout(this);
			layout.setOrientation(LinearLayout.HORIZONTAL);
			 */



			//Log.d("desc", "done");
		}

		if (config.orientation == Configuration.ORIENTATION_PORTRAIT) {

			/*LinearLayout layout = new LinearLayout(this);
			layout.setOrientation(LinearLayout.VERTICAL);*/



			//Log.d("list", "done");
		}
		fTransaction.commit();
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
}