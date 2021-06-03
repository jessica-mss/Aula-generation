/*4-Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
 * se for ímpar exiba o número elevado ao quadrado. */


package Lacos_de_Decisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("\nEntre com um número: ");
		numero = ler.nextInt();
		
		if(numero %2 == 0) {
			System.out.println(numero + " é um número par");
			System.out.println("\nA raiz quadrada do número " + numero + " é: " + Math.sqrt(numero));
		} else {
			System.out.println(numero + " é um número ímpar");
			System.out.println("\nO número " + numero + " elevado ao quadrado é: " + Math.pow(numero,2));
		}
		
	}

}
