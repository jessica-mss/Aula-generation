//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.


package Exerc�cios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float dias, meses, anos, total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual sua idade em dias? ");
		dias = leia.nextFloat();
		
		meses = dias/30;
		anos = dias/365;
		
		System.out.println("\nSua idade em dias � " + dias + ", em meses equivale � " + meses + " e em anos � igual a " + anos);
		

	}

}
