package com.example.bankuponus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class samebank extends Activity{
	EditText q;
	EditText w;
	EditText e;
	EditText r;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.samebankx);
		Button o=(Button)findViewById(R.id.button1);
		
		q=(EditText)findViewById(R.id.editText1);
        w=(EditText)findViewById(R.id.editText2);
        e=(EditText)findViewById(R.id.editText4);
        r=(EditText)findViewById(R.id.editText5);
		
		o.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				repo.amt=r.getText().toString();
				repo.srcaccno=(q.getText().toString());
				repo.destaccno=(w.getText().toString());
				repo.pin=(e.getText().toString());
				repo.type=5;
				startActivity(new Intent("com.example.bankuponus.SURE"));
			}
		});
	}

}