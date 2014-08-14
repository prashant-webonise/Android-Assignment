package com.example.bankuponus;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menu1 extends ListActivity{

	String list[]={"balenquiry","ministate","fundtransfer","cbrequest"};
	String yo[]={"Balance Enquiry","Mini Statement","Fund Transfer","Cheque Book Request"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(menu1.this, android.R.layout.simple_list_item_1, yo));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		try {
			startActivity(new Intent(menu1.this,Class.forName("com.example.bankuponus."+list[position])));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
