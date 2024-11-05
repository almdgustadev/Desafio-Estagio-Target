import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Desafio3 {

    public static void main(String[] args) {
        try {
            // Carrega os dados do JSON
            String conteudo = new String(Files.readAllBytes(Paths.get("faturamento.json")));
            JSONArray faturamentoArray = new JSONArray(conteudo);

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            // Itera sobre os valores de faturamento
            for (int i = 0; i < faturamentoArray.length(); i++) {
                JSONObject dia = faturamentoArray.getJSONObject(i);
                double faturamento = dia.getDouble("faturamento");

                // Ignora dias sem faturamento
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

            // Calcula a média de faturamento dos dias válidos
            double mediaFaturamento = somaFaturamento / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            // Conta os dias com faturamento acima da média
            for (int i = 0; i < faturamentoArray.length(); i++) {
                JSONObject dia = faturamentoArray.getJSONObject(i);
                double faturamento = dia.getDouble("faturamento");

                if (faturamento > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibe os resultados
            System.out.println("Menor faturamento em um dia do mês: " + menorFaturamento);
            System.out.println("Maior faturamento em um dia do mês: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}