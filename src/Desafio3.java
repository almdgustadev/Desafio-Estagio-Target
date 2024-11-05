//Desafio 3 realizado com auxilio, pois tive dificuldade ao manusear arquivos JSON, porem com estudos aprendi.

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Desafio3 {

    public static void main(String[] args) {
        try {
            String conteudo = new String(Files.readAllBytes(Paths.get("faturamento.json")));
            JSONArray faturamentoArray = new JSONArray(conteudo);

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            for (int i = 0; i < faturamentoArray.length(); i++) {
                JSONObject dia = faturamentoArray.getJSONObject(i);
                double faturamento = dia.getDouble("faturamento");

                if (faturamento > 0) {
                    if (faturamento < menorFaturamento) {
                        menorFaturamento = faturamento;
                    }
                    if (faturamento > maiorFaturamento) {
                        maiorFaturamento = faturamento;
                    }

                    somaFaturamento += faturamento;
                    diasComFaturamento++;
                }
            }

            double mediaFaturamento = somaFaturamento / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            for (int i = 0; i < faturamentoArray.length(); i++) {
                JSONObject dia = faturamentoArray.getJSONObject(i);
                double faturamento = dia.getDouble("faturamento");

                if (faturamento > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento em um dia do mês: " + menorFaturamento);
            System.out.println("Maior faturamento em um dia do mês: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
