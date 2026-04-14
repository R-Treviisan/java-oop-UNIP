package aps.fireBase;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FirebaseService {
    public static void sincronizarDados() {

        try {
            URL urlCvs = new URL("https://dados.mma.gov.br/dataset/41a79b71-445f-4a6a-8c70-d46af991292a/resource/1f13b062-f3f6-4198-a4c5-3581548bebec/download/lista-de-especiesameacas-2020.csv");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(urlCvs.openStream())
            );

            String jsonFinal = "{";
            String linha;
            int i = 0;

            br.readLine();

            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;

                linha = linha.replace("\"", "");

                String[] dados = linha.split(";");

                if (dados.length >= 6) {

                    String nome = dados[3];
                    String categoria = dados[5];

                    String jsonLinha = "{"
                            + "\"nome\":\"" + nome + "\","
                            + "\"categoria\":\"" + categoria + "\""
                            + "}";

                    jsonFinal += "\"" + i + "\":" + jsonLinha + ",";
                    i++;
                }
            }

            br.close();

            if (jsonFinal.length() > 1) {
                jsonFinal = jsonFinal.substring(0, jsonFinal.length() - 1);
            }

            jsonFinal += "}";

            URL urlFireBase = new URL("https://aps-especies-c9700-default-rtdb.firebaseio.com/especies.json");

            //Utilizei HttpURLConnection para realizar uma requisição HTTP do tipo PUT,
            // configurando o Content-Type como JSON e
            // enviando os dados através de um OutputStream para o Firebase.

            HttpURLConnection conn = (HttpURLConnection) urlFireBase.openConnection();
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();
            os.write(jsonFinal.getBytes());
            os.flush();
            os.close();

            int responseCode = conn.getResponseCode();


            System.out.println("Resposta FireBase: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
