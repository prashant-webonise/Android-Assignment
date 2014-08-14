package com.example.bankuponus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class balenquiry extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.balenquiryx);
		
		final EditText a=(EditText)findViewById(R.id.editText1);
		final EditText b=(EditText)findViewById(R.id.editText4);
		
		Button d = (Button) findViewById(R.id.button1);
		d.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				repo.srcaccno=a.getText().toString();
				repo.pin=b.getText().toString();
				repo.type=1;
				startActivity(new Intent("com.example.bankuponus.TEST"));
				Log.d("this", "hi");
			}
		});
	}

}
