package com.example.bankuponus;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class fundtransfer extends ListActivity{
	
	String list[]={"samebank","otherbank"};
	String yo[]={"Same Bank","Other Bank"};
	
	@Override	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(fundtransfer.this, android.R.layout.simple_list_item_1, yo));	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		try {
			startActivity(new Intent(fundtransfer.this,Class.forName("com.example.bankuponus."+list[position])));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
