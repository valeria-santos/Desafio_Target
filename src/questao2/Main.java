
/* 2) Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor sempre ser� a soma dos 2 valores anteriores 
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
 * informado um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem avisando se 
 * o n�mero informado pertence ou n�o � sequ�ncia.
*/
package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0, numero;
		int vetor[] = new int[100];
		boolean encontrou = false;

		System.out.println("Informe um n�mero: ");
		numero = scan.nextInt();

		vetor[0] = 0;
		vetor[1] = 1;
		for (i = 0; i < numero; i++) {
			vetor[i + 2] = vetor[i] + vetor[i + 1];
		}

		for (i = 0; i < numero; i++) {
			while (encontrou == false) {
				if (vetor[i] == numero) {
					System.out.println("Pertence");
					encontrou = true;
				} else if (i == numero) {
					System.out.println("N�o pertence");
					encontrou = true;
				} else {
					i++;
				}
			}
		}
	}

}
