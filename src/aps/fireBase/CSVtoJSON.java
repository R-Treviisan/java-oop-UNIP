package aps.fireBase;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CSVtoJSON {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://dados.mma.gov.br/dataset/41a79b71-445f-4a6a-8c70-d46af991292a/resource/1f13b062-f3f6-4198-a4c5-3581548bebec/download/lista-de-especiesameacas-2020.csv");
            System.out.println(url);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            String jsonFinal = "{";
            int i = 0;
            String linha;

            // pula cabeçalho
            br.readLine();

            while ((linha = br.readLine()) != null) {

                if (linha.trim().isEmpty()) continue;

                // remove aspas
                linha = linha.replace("\"", "");

                // separa por ;
                String[] dados = linha.split(";");

                // garante que tem dados suficientes
                if (dados.length >= 6) {

                    String nome = dados[3];        // espécie
                    String categoria = dados[5];   // categoria

                    String jsonLinha = "{"
                            + "\"nome\":\"" + nome + "\","
                            + "\"categoria\":\"" + categoria + "\""
                            + "}";

                    jsonFinal += "\"" + i + "\":" + jsonLinha + ",";
                    i++;
                }
            }

            br.close();

            // remove última vírgula
            if (jsonFinal.length() > 1) {
                jsonFinal = jsonFinal.substring(0, jsonFinal.length() - 1);
            }

            jsonFinal += "}";

            // resultado final
            System.out.println(jsonFinal);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}