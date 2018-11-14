package com.assistanceinformatiquetoulouse.freeboxremote;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Class CodeFreebox
public class CodeFreebox {
    // Attributs privés
    private final String pFileName = "code.txt";
    private String pPath;

    // Constructeur
    public CodeFreebox(String a_path) {
        pPath = a_path;
    }

    // Methode lireCode
    public String lireCode() {
        byte[] lBytes;
        String code;
        File lFile;
        FileInputStream lFileInputStream;
        try {
            lFile = new File(pPath, pFileName);
            if (lFile.exists())
            {
                lFileInputStream = new FileInputStream(lFile);
                lBytes = new byte[(int) lFile.length()];
                lFileInputStream.read(lBytes);
                lFileInputStream.close();
                code = "";
                for (byte b : lBytes) {
                    code += String.format("%c", b);
                }
            }
            else
            {
                code = null;
            }
        }
        catch(IOException e) {
            code = null;
            Log.d("CodeFreebox/lireCode", e.toString());
        }
        return(code);
    }

    // Méthode ecrireCode
    public void ecrireCode(String a_code) {
        FileOutputStream lFileOutputStream;
        try {
            lFileOutputStream = new FileOutputStream(pPath + File.separator + pFileName);
            lFileOutputStream.write(a_code.getBytes());
            lFileOutputStream.close();
        }
        catch(IOException e) {
            Log.d("CodeFreebox/ecrireCode", e.toString());
        }
    }
}
