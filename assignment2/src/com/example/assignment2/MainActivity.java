package com.example.assignment2;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	ListView teams ;
	public static AddTeamToDatabase teamsDB;
	
	Boolean trans=false;
	
	List<String> listOfTeams = new ArrayList<String>();
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.d("mainactivity", "insideit");
		
		teams = (ListView) findViewById(R.id.teams);

		teamsDB = new AddTeamToDatabase(this);
		
		//teamsDB.getAllTeams();
		
		listOfTeams.addAll(teamsDB.getAllTeams());
		
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfTeams);
		teams.setAdapter(adapter);
		
		teams.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
				String selectedTeam = (String) parent.getItemAtPosition(position);
				
				Team seleTeamObject = teamsDB.getSelectedTeam(selectedTeam);
				
				Intent T = new Intent(MainActivity.this, DisplayTeam.class);
				T.putExtra("team name", seleTeamObject.getName());
				T.putExtra("team capital", seleTeamObject.getCaptain());
				T.putExtra("team desc", seleTeamObject.getDesc());
				
				startActivity(T);
				
			}
		});
	}
	
	public void onStart(){
		super.onStart();
		
		listOfTeams.clear();
		
		listOfTeams.addAll(teamsDB.getAllTeams());
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfTeams);
		teams.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.add_team) {
			Intent addNewTeam = new Intent(MainActivity.this, AddTeam.class);			
			startActivity(addNewTeam);
			trans=true;
			return true;
		}
		if(id == R.id.delete_all_teams){
			teamsDB.deleteAllTeams();
			Toast.makeText(getApplicationContext(), "All Teams Deleted", Toast.LENGTH_LONG).show();
			this.onStart();
		}
		return super.onOptionsItemSelected(item);
	}
}
