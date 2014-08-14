package com.example.bankuponus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class otherbank extends Activity implements OnItemSelectedListener{
	Spinner s;
	String[] banknames = {
		    "Allahabad Bank",
		    "Andhra Bank",
		    "Bank of Baroda",
		    "Bank of India",
		    "Bank of Maharashtra",
		    "Bhartiya Mahila Bank",
		    "Canara Bank",
		    "Central Bank of India",
		    "Corporation Bank",
		    "Dena Bank",
		    "IDBI Bank",
		    "Indian Bank",
		    "Indian Overseas Bank",
		    "Oriental Bank of Commerce",
		    "Punjab National Bank",
		    "Punjab & Sind Bank",
		    "Syndicate Bank",
		    "UCO Bank",
		    "Union Bank of India",
		    "United Bank of India",
		    "Vijaya Bank"
			};

	EditText q;
	EditText w;
	EditText e;
	EditText r;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.otherbankx);
		s = (Spinner)findViewById(R.id.expandableListView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, banknames);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(this);
        Button d=(Button)findViewById(R.id.button1);
        q=(EditText)findViewById(R.id.editText1);
        w=(EditText)findViewById(R.id.editText2);
        e=(EditText)findViewById(R.id.editText4);
        r=(EditText)findViewById(R.id.editText3);
        d.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				repo.amt=r.getText().toString();
				repo.srcaccno=(q.getText().toString());
				repo.destaccno=(w.getText().toString());
				repo.pin=(e.getText().toString());
				repo.type=4;
				
				startActivity(new Intent("com.example.bankuponus.SURE"));
			}
		});
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,long arg3) 
	{
		// TODO Auto-generated method stub
		int position = s.getSelectedItemPosition();
        repo.bank_name=(banknames[position]);
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
