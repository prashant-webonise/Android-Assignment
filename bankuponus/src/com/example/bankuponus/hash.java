package com.example.bankuponus;

import java.security.MessageDigest;
//import org.apache.commons.codec.binary.Base64;
import java.security.NoSuchAlgorithmException;
//import android.util.Base64;
class hash
{
    String gethash(byte[] key) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] hash = md.digest(key);
        String encodedBytes = new String(Base64.encodeBytes(hash));
        return encodedBytes;
    }
}