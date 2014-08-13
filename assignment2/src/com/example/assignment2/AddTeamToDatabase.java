package com.example.assignment2;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class AddTeamToDatabase extends SQLiteOpenHelper{
	
	private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "newteamsdb";
    private static final String TABLE_NAME = "teams";
    private static final String KEY_NAME = "name";
    private static final String KEY_CAPTAIN = "captain";
    private static final String KEY_DESCRIPTION = "description";
	
	AddTeamToDatabase thisClass;
	Context thisContext;
	SQLiteOpenHelper thisDbHelper;
	SQLiteDatabase thisDB;
	Team teamToAdd;
		
		public AddTeamToDatabase(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		
		/*public void setTeam(Team newTeam) {
			teamToAdd=newTeam;
		}*/

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE "+ TABLE_NAME+" ("+KEY_NAME+" TEXT, "+KEY_CAPTAIN+" TEXT, "+KEY_DESCRIPTION+" TEXT);");
		}
		
		public void deleteAllTeams() {
			SQLiteDatabase db = this.getWritableDatabase();
			db.execSQL("delete from "+TABLE_NAME);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			
		}

		public void insertToDataBase(Team newTeam) {
			
			teamToAdd=newTeam;
			SQLiteDatabase db=this.getWritableDatabase();
			
			ContentValues data = new ContentValues();
			data.put(KEY_NAME, teamToAdd.getName());
			data.put(KEY_CAPTAIN, teamToAdd.getCaptain());
			data.put(KEY_DESCRIPTION, teamToAdd.getDesc());
			
			db.insert(TABLE_NAME, null, data);
			db.close();
		}
		
		
		public ArrayList<String> getAllTeams() {
			SQLiteDatabase db = this.getWritableDatabase();			
			Cursor resultSet = db.rawQuery("select * from "+TABLE_NAME, null);						
			ArrayList<String> allTeams = new ArrayList<String>();
			if (resultSet.moveToFirst()){
				   do{
					   try{
						   String data = resultSet.getString(0);
						   allTeams.add(data);
					   }
					   catch(Exception e){
						   Log.d("error", e.getMessage());
					   }
				   }while(resultSet.moveToNext());
				}
			resultSet.close();
			
			return allTeams;
		}

		public Team getSelectedTeam(String selectedTeam) {
			SQLiteDatabase db = this.getWritableDatabase();			
			Cursor resultSet = db.rawQuery("select * from "+TABLE_NAME+" where "+KEY_NAME+"='"+selectedTeam+"'", null);
			
			resultSet.moveToFirst();			
			
			return new Team(resultSet.getString(0), resultSet.getString(1), resultSet.getString(2));
		}
}
