//1-	Faça um programa que receba três inteiros e diga qual deles é o maior.


package Lacos_de_Decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = ler.nextInt();
		
		if(n1 > n2 && n1 > n3) {
            System.out.print(n1 + "é o maior número");
		} else if(n2 > n1 && n2 > n3) {
            System.out.print(n2 + "é o maior número");
		} else if(n3 > n2 && n3 > n1) {
            System.out.print(n3 + "é o maior número");
		} else {
			System.out.print("\nDigite uma entrada válida");
		}
	} 
}
