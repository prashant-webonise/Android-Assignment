package com.example.bankuponus;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


class enc
{
	public  String symmetricEncrypt(String text) 
    {
		//String outputString = new String(Base64.encodeBase64(inputString.getBytes()));
	    
        String encryptedString;
        SecretKeySpec skeySpec;
        //BASE64Encoder bASE64Encoder = new BASE64Encoder();
        byte[] encryptText = text.getBytes();
        Cipher cipher;
        try {
            skeySpec = new SecretKeySpec(("000000"+repo.pin).getBytes(), "AES");
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            encryptedString = Base64.encodeBytes((cipher.doFinal(encryptText)));
        } 
        catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
        return encryptedString;
    }
}