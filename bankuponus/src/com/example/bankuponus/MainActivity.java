package com.example.bankuponus;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button a=(Button)findViewById(R.id.button1);
		
		
		a.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.example.bankuponus.MENU1"));
				Log.d("hi", "kdjgf");
				
				
				
				
				/*
				Intent i = new Intent(MainActivity.this,Test.class);
				startActivity(i);
				*/
				}
		});		
	}
}
