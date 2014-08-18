package com.example.assignment3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListFragment extends Fragment implements OnItemClickListener{	
	
	ListView list;
	ArrayAdapter adapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		return inflater.inflate(R.layout.list_layout, container, false);
	}
	
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		list = (ListView)getView().findViewById(R.id.team_list);
		adapter = ArrayAdapter.createFromResource(getActivity(), R.array.team_names, android.R.layout.simple_list_item_1);
		
		list.setAdapter(adapter);
		
		Log.d("list1", "created");
		
		list.setOnItemClickListener(this);
		
		return;
		
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,	long id) {
		
		Log.d("pressed", ""+position);
		
		Toast.makeText(getActivity(), "clicked position "+position, Toast.LENGTH_LONG).show();
		
		Data.position=position;
		DescFragment.changeText();
		
	}
	
	public void onSaveInstanceState(Bundle outState){
		super.onSaveInstanceState(outState);
		outState.putInt("position", Data.position);
	}
}
