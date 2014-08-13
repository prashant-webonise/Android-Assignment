package com.example.assignment2;

public class Team {

	String name, captain, description;
	
	public Team(String name, String captain, String description) {
		this.name=name;
		this.captain=captain;
		this.description=description;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getCaptain(){
		return this.captain;
	}
	
	public String getDesc() {
		return this.description;
	}
}
