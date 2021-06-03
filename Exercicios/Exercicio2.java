//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.


package Exercícios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float dias, meses, anos, total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual sua idade em dias? ");
		dias = leia.nextFloat();
		
		meses = dias/30;
		anos = dias/365;
		
		System.out.println("\nSua idade em dias é " + dias + ", em meses equivale à " + meses + " e em anos é igual a " + anos);
		

	}

}
