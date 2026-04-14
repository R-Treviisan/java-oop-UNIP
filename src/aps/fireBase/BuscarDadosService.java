package aps.fireBase;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuscarDadosService {

    public static String buscar(){
        StringBuilder resultado = new StringBuilder();

        try{
            URL url = new URL("https://aps-especies-c9700-default-rtdb.firebaseio.com/especies.json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            String linha;

            while ((linha = br.readLine()) != null){
                resultado.append(linha);
            }
             br.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return resultado.toString();
    }
}
