//1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.


package Lacos_de_Decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if(n1 > n2 && n1 > n3) {
            System.out.print(n1 + "� o maior n�mero");
		} else if(n2 > n1 && n2 > n3) {
            System.out.print(n2 + "� o maior n�mero");
		} else if(n3 > n2 && n3 > n1) {
            System.out.print(n3 + "� o maior n�mero");
		} else {
			System.out.print("\nDigite uma entrada v�lida");
		}
	} 
}
