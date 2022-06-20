//Escreva um programa que inverta os caracteres de uma string.
package questao5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		String caractere =  "";
		System.out.println("Informe uma palavra: ");
		palavra = scan.next();
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			caractere = caractere + Character.toString(palavra.charAt(i));
		}
		System.out.println(caractere);
	}
}
