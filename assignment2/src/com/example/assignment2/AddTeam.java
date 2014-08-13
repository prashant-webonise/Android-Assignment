package com.example.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class AddTeam extends ActionBarActivity implements OnClickListener{
	
	Button b;
	EditText txtVw;
	
	AddTeamToDatabase db = MainActivity.teamsDB;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_team);
		
		b = (Button) findViewById(R.id.add_team);
		b.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 
		
		txtVw = (EditText) findViewById(R.id.team_name);		
		String teamName = txtVw.getText().toString();
		
		txtVw = (EditText) findViewById(R.id.team_captain);
		String teamCaptain = txtVw.getText().toString();
		
		txtVw = (EditText) findViewById(R.id.team_description);
		String teamDesc = txtVw.getText().toString();
				
		// setResult(RESULT_OK, data);
		
		Team newTeam = new Team(teamName, teamCaptain, teamDesc);
		
		//db.setTeam(newTeam);
		
		//db.onCreate(db.thisDB);
		
		db.insertToDataBase(newTeam);
		
		Toast.makeText(getApplicationContext(), "Successfully Added", Toast.LENGTH_LONG).show();
		
		super.finish();
	}
}
