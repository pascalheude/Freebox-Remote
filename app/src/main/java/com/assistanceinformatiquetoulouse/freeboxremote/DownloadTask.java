package com.assistanceinformatiquetoulouse.freeboxremote;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


// Class DownloadTask
public class DownloadTask extends AsyncTask<String, Void, String> {
    // Attributs privés
    Context pContext;

    // Méthode lireDonneesDepuisURL
    private String lireDonneesDepuisURL(String url) throws IOException {
        String lDonnees = "";
        InputStream lInputStream = null;
        URL lURL = new URL(url);
        try {
            // Creer une communication http pour communiquer avec l'URL
            HttpURLConnection lHttpURLConnection = (HttpURLConnection) lURL.openConnection();
            // Connexion à l'URL
            lHttpURLConnection.connect();
            // Lire le flux depuis la connexion
            lInputStream = lHttpURLConnection.getInputStream();
        }
        catch(Exception e) {
            Log.d("Error downloading url", e.toString());
            lDonnees = null;
        }
        finally {
            if (lInputStream != null)
            {
                lInputStream.close();
            }
            else
            {
            }
        }
        return(lDonnees);
    }

    // Contructor
    public DownloadTask(Context a_context) {
        pContext = a_context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... url) {
        try
        {
            return(lireDonneesDepuisURL(url[0]));
        }
        catch(IOException e)
        {
            Log.d("Background Task", e.toString());
        }
        return(null);
    }

    @Override
    protected void onPostExecute(String result) {
        if (result == null) {
            Toast.makeText(pContext, "Impossible de se connecter à la freebox", Toast.LENGTH_LONG);
        }
        else {
        }
    }
}