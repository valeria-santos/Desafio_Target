/*  Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, 
 *  na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
Estes dias devem ser ignorados no cálculo da média;
 *
 */
package questao3;

import java.io.FileReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

public class Main {

	public static void main(String[] args) {
		
		try {
			Gson gson = new Gson();
			FileReader reader = new FileReader("q3/dados.json");
			Faturamento[] faturamentos = gson.fromJson(reader, Faturamento[].class);
			double maior = 0, menor = 0, mediaMensal, soma = 0;
			int qtdDias= faturamentos.length, i, count=0, contador=0, diaMenor=0, diaMaior=0;
			
			for (i = 0; i < qtdDias; i++) {
				if(faturamentos[i].valor == 0.0) {
					count++;
				}
				soma = soma + faturamentos[i].valor;
			}
			qtdDias = qtdDias - count;
			mediaMensal = soma / qtdDias ;

			for (i = 0; i < faturamentos.length; i++) {
				if(faturamentos[i].valor > mediaMensal) {
					contador=contador+1;
				}
			}

			menor = faturamentos[0].valor;
			maior = faturamentos[0].valor;
			
			for (i = 0; i < faturamentos.length; i++) {
				if(menor > faturamentos[i].valor && faturamentos[i].valor !=0) {
					menor = faturamentos[i].valor;
					diaMenor = faturamentos[i].dia;
				}
			}
			for (i = 0; i < faturamentos.length; i++) {
				if(maior < faturamentos[i].valor) {
					maior = faturamentos[i].valor;
					diaMaior = faturamentos[i].dia;
				}
			}
			
			System.out.println("O menor valor de faturamento do mês foi de: R$" + menor + " ocorrido no dia " + diaMenor);
			System.out.println("O maior valor de faturamento do mês foi de: R$" + maior + " ocorrido no dia " + diaMaior );
			System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + contador);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
