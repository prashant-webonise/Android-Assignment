package com.example.bankuponus;

import javax.crypto.Cipher;
//import org.apache.commons.codec.binary.Base64;
import javax.crypto.spec.SecretKeySpec;
class dec
{
public String symmetricDecrypt(String text) {
        
	//String outputString = new String(Base64.encodeBase64(inputString.getBytes()));
        //BASE64Decoder base64Decoder = new BASE64Decoder();
        
        Cipher cipher;
        String encryptedString;
        byte[] encryptText = null;
        SecretKeySpec skeySpec;
        
        try {
            skeySpec = new SecretKeySpec("ThisIs128bitSize".getBytes(), "AES");
            encryptText = Base64.decode(text);
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            encryptedString = new String(cipher.doFinal(encryptText));
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
        return encryptedString;
    }
}