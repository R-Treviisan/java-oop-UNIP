package aps.fireBase;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FireBaseTeste {

    static void main(String[] args) {
        try{
            URL url = new URL("");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String json = "{ \"status\": \"ok via java\"}";

            OutputStream os = conn.getOutputStream();
            os.write(json.getBytes());
            os.flush();
            os.close();

            int responseCode = conn.getResponseCode();
            System.out.println("Resposta " + responseCode);

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
