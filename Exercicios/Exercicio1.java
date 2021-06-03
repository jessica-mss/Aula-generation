//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 


package Exercícios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float anos, meses, dias, totalDias;
		Scanner leia = new Scanner(System.in);
				
		System.out.println("\nQual a quantidade de anos? ");
		anos = leia.nextFloat();
		System.out.println("\nQual a quantidade de meses? ");
		meses = leia.nextFloat();
		System.out.println("\nQual a quantidade de dias? ");
		dias = leia.nextFloat();
		
		totalDias = anos*365 + meses*30 + dias;
				
		System.out.println(totalDias);
		
	}

}
