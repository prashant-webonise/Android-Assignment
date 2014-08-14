package com.example.bankuponus;

import android.telephony.SmsManager;

@SuppressWarnings("deprecation")
public class sendsms {

	public void sendSMSMessage() {
	      //Log.i("Send SMS", "");

		String phoneNo=repo.mobileno;
		String message=repo.srcaccno+repo.encrypted+repo.hash;
		System.out.println(message);
		try {
			SmsManager smsManager = SmsManager.getDefault();
			smsManager.sendTextMessage(phoneNo, null, message, null, null);
			//Toast.makeText(getApplicationContext(), "SMS sent.",Toast.LENGTH_LONG).show();
			//System.out.print("jhsgfjhsfjjshf");
			}
		catch (Exception e){
			e.printStackTrace();
			}
		}
	}

/*package com.example.bankuponus;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;

@SuppressWarnings("deprecation")
public class sendsms extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
		String phoneNo=repo.mobileno;
		String message=repo.srcaccno+repo.encrypted+repo.hash;
		System.out.println("jhsgfjhsfjjshf");
		try 
		{
			SmsManager smsManager = SmsManager.getDefault();
			smsManager.sendTextMessage(phoneNo, null, message, null, null);
			//Toast.makeText(getApplicationContext(), "SMS sent.",Toast.LENGTH_LONG).show();
			//System.out.println("jhsgfjhsfjjshf");
		}
		catch (Exception e)
		{
			e.printStackTrace();			
		}
		
	}

}
*/