/*
 * 
Escreva um programa na linguagem que desejar onde calcule o percentual de representação 
que cada estado teve dentro do valor total mensal da distribuidora
SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53
 */
package questao4;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		
		double totalMensal = sp+rj+mg+es+outros;
		double percentualSp = (sp / totalMensal) *100;
		double percentualRj = (rj / totalMensal) *100;
		double percentualMg = (mg / totalMensal) *100;
		double percentualEs = (es / totalMensal) *100;
		double percentualOutros = (outros / totalMensal) *100;
		
		System.out.printf("SP – %.2f%%\n", percentualSp);
		System.out.printf("RJ – %.2f%%\n", percentualRj);
		System.out.printf("MG – %.2f%%\n", percentualMg);
		System.out.printf("ES – %.2f%%\n", percentualEs);
		System.out.printf("Outros – %.2f%%\n", percentualOutros);
	}

}
