/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto */


package Lacos_de_Decisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("\nEntre com uma idade: ");
		numero = ler.nextInt();
		
		if(numero>=10 && numero<=14) {
			System.out.println("\nCategoria Infantil");
		} else if(numero>=15 && numero<=17) {
			System.out.println("\nCategoria Juvenil");
		} else if(numero>=18 && numero<=25) {
			System.out.println("\nCategoria Adulto");
		} else {
			System.out.println("\nSua idade não está enquadrada em nenhuma categoria");
		}
	}
}
