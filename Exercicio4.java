/*4-Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
 * se for �mpar exiba o n�mero elevado ao quadrado. */


package Lacos_de_Decisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("\nEntre com um n�mero: ");
		numero = ler.nextInt();
		
		if(numero %2 == 0) {
			System.out.println(numero + " � um n�mero par");
			System.out.println("\nA raiz quadrada do n�mero " + numero + " �: " + Math.sqrt(numero));
		} else {
			System.out.println(numero + " � um n�mero �mpar");
			System.out.println("\nO n�mero " + numero + " elevado ao quadrado �: " + Math.pow(numero,2));
		}
		
	}

}
