package com.example.bankuponus;

import java.security.NoSuchAlgorithmException;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Test extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		
		while(repo.amt.length()<10){
			repo.amt="0"+repo.amt;
		}
		
/*
		System.out.println(repo.srcaccno);
		//String a="0000000000";//s.next();
        
        System.out.println(repo.pin);
        //String p="1111111111";//s.next();
        
        System.out.println(repo.type);
        //String t="2";//s.next();
        
        System.out.println(repo.destaccno);
        //String da="3333333333";//s.next();
        
        System.out.println(repo.amt);
        //String amt="4444444444";//s.next();
        
        System.out.println(repo.ifsc);
        //String code="66666666666";//s.next();
        
        //@SuppressWarnings("deprecation");
        //System.out.println(repo.time);
				
		
		*/
			
		repo.time=Long.toString(System.currentTimeMillis());
		
		while(repo.time.length()<15){
			repo.time="0"+repo.time;
		}
		
		//System.out.println(repo.time);
		String encrypted=new enc().symmetricEncrypt(repo.pin+Integer.toString(repo.type)+repo.destaccno+repo.amt+repo.ifsc+repo.time);
		repo.encrypted=encrypted;
		//System.out.println((repo.srcaccno+encrypted));
        
			try {
				repo.hash= new hash().gethash(encrypted.getBytes());
				
				System.out.println(repo.hash);
				
				//startActivity(new Intent("com.example.bankuponus.SENDSMS"));
				

				//PrintWriter q=new PrintWriter(new FileWriter("yes.txt",true));
				
				//q.printf("%s%s%d%s%s%s%s%s%n",repo.srcaccno,repo.pin,repo.type,repo.destaccno,repo.amt,repo.ifsc,repo.time,repo.hash,repo.encrypted);
				//q.close();
				new sendsms().sendSMSMessage();
				repo.reset();
				setContentView(R.layout.testx);
				
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}

}
