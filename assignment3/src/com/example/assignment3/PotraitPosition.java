package com.example.assignment3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PotraitPosition extends Fragment //implements OnItemClickListener
{

	ListView list;
	private ArrayAdapter<CharSequence> adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.d("potrait", "onCreateView");
		return inflater.inflate(R.layout.potrait_layout, container, false);
	}

	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		Log.d("potrait", "onActivityCreated");

		list = (ListView) getView().findViewById(R.id.listView);

		adapter = ArrayAdapter.createFromResource(getActivity(), R.array.list, android.R.layout.simple_list_item_1);
		list.setAdapter(adapter);

		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {

				String selectedTeam = (String) parent.getItemAtPosition(position);

				FragmentManager fManager = getFragmentManager();
				FragmentTransaction fTransaction = fManager.beginTransaction();

				LandscapePosition lm = new LandscapePosition(selectedTeam);			
				fTransaction.add(android.R.id.content, lm);

				fTransaction.commit();
			}

		});
	}
}
