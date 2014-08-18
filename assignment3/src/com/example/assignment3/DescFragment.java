package com.example.assignment3;

import android.support.v4.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DescFragment extends Fragment {

	static TextView v;
	static String[] desc ;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		return inflater.inflate(R.layout.desc_layout, container, false);
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		Resources res = getResources();
		desc = res.getStringArray(R.array.team_desc);

		v = (TextView)getView().findViewById(R.id.description);		

		Log.d("list2", "created");
		
		if(Data.position<0){
			v.setText("nothing is selected");
		}
		/*else{
			changeText();
		}*/

	}
	
	public static void changeText(){

		v.setText("");
		v.setText(desc[Data.position]);
	}
}
