package de.lucsoft.md5force;

import java.math.BigInteger;
import java.security.MessageDigest;


/**
 * cr4cker
 */
public class cr4cker {

    public cr4cker() {
        
    }

    public String getHash(String string) {
        String hash = null;
        try 
        {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(string.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1,digest);
            hash = bigInt.toString(16);
            while(hash.length() < 32 ){
              hash = "0"+hash;   
            }
        } catch (Exception e1) 
        {
            e1.printStackTrace();
        }
        return hash;    
    }

    private int char_minInt = 32;
    private int char_maxInt = 126;
    
    public String crackAnHashSlow(String hash) {
        for (int e = char_minInt; e < char_maxInt; e++) {
            String g1 = e == 32 ? "": String.valueOf((char)e);
            for (int e1 = char_minInt; e1 < char_maxInt; e1++) {
                String g2 = e1 == 32 ? "": String.valueOf((char)e1);
                for (int e2 = char_minInt; e2 < char_maxInt; e2++) {
                    String g3 = e2 == 32 ? "": String.valueOf((char)e2);
                    for (int e3 = char_minInt; e3 < char_maxInt; e3++) {
                        String g4 = e3 == 32 ?"": String.valueOf((char)e3);
                        for (int e4 = char_minInt; e4 < char_maxInt; e4++) {
                            String g5 = e4 == 32? "": String.valueOf((char)e4);
                            if (getHash(g1 + g2 + g3 + g4 + g5).equals(hash)) {
                                return g1 + g2 + g3 +g4 +g5;
                            } 
                        }
                    }
                }
            }
        }
        return null;
    }
    fastAccessArray faa = new fastAccessArray();
    public String crackAnHashFast(String hash) {
        for (int e = 0; e < (faa.chars.length); e++) {
            String g1 = e == 0 ? "": faa.chars[e].toString();
            for (int e1 = 0; e1 < (faa.chars.length); e1++) {
                String g2 = e1 == 0 ? "":faa.chars[e1].toString();
                for (int e2 = 0; e2 < (faa.chars.length); e2++) {
                    String g3 = e2 == 0 ? "": faa.chars[e2].toString();
                    for (int e3 = 0; e3 < (faa.chars.length); e3++) {
                        String g4 = e == 0 ? "": faa.chars[e3].toString();
                        for (int e4 = 0; e4 < (faa.chars.length); e4++) {
                            String g5 = e4 == 0 ? "": faa.chars[e4].toString();
                            
                            if (getHash(g1 + g2 + g3 + g4 + g5).equals(hash)) {
                                return g1 + g2 + g3 +g4 +g5;                                
                            } 
                        }
                    }
                }
            }
        }
        return null;
    }
}