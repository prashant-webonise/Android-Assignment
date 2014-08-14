package com.example.assignment3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

	public static int pot = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Configuration conf = getResources().getConfiguration();

		FragmentManager fManager = getFragmentManager();
		FragmentTransaction fTransaction = fManager.beginTransaction();


		if(conf.orientation == Configuration.ORIENTATION_LANDSCAPE){
			LandscapePosition lm = new LandscapePosition();
			fTransaction.add(android.R.id.content, lm);
		}

		else{
			PotraitPosition pm = new PotraitPosition();			
			fTransaction.replace(android.R.id.content, pm);
		}

		fTransaction.commit();
	}
}
