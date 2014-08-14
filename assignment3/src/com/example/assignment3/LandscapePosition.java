package com.example.assignment3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class LandscapePosition extends Fragment{

	String selected;
	TextView label;
	TextView details;

	public LandscapePosition(String selected) {
		// TODO Auto-generated constructor stub
		this.selected=selected;
	}

	public LandscapePosition() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		return inflater.inflate(R.layout.landscape_layout, container, false);
	}

	public void onActivityCreated(Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);

		label = (TextView) getView().findViewById(R.id.textView1);
		details = (TextView) getView().findViewById(R.id.editText1);

		label.setText(selected);

		details.setText("aaaaaaaaaajjjjjjjjjjjjjjjjjdddddddddddddddddllllllllllllllllllrrrrrrrrrrrrrrrrrrllmnlsjdfhskjdfhksajdfhoiehjflkkasjdhf");

	}
}
