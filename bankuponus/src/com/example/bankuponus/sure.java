package com.example.bankuponus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sure extends Activity{

	TextView a,b,c,d;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.surex);
		
		a=(TextView)findViewById(R.id.textView2);
		b=(TextView)findViewById(R.id.textView4);
		c=(TextView)findViewById(R.id.textView6);
		d=(TextView)findViewById(R.id.textView8);
		
				
		a.setText(repo.srcaccno);
		b.setText(repo.destaccno);
		d.setText(repo.amt);
		c.setText(repo.bank_name);
				
		Button r=(Button)findViewById(R.id.button1);


		r.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.example.bankuponus.TEST"));
			}
		});
	}
	

	
}
