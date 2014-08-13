package com.example.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayTeam extends ActionBarActivity {
	
	TextView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_team);
		
		Intent T = getIntent();
		
		String teamName = T.getStringExtra("team name");
		String teamCapital = T.getStringExtra("team capital");
		String teamDesc = T.getStringExtra("team desc");
		
		view = (TextView) findViewById(R.id.display_team_name);
		view.setText(teamName);
		
		view = (TextView) findViewById(R.id.display_team_capital);
		view.setText(teamCapital);
		
		view = (TextView) findViewById(R.id.display_team_desc);
		view.setText(teamDesc);
	}
}
