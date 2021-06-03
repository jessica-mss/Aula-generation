/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
 */

package Exercícios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double A, B, C, D, R, S;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		A = leia.nextFloat();
		System.out.println("\nEntre com o valor de B: ");
		B = leia.nextFloat();
		System.out.println("\nEntre com o valor de C: ");
		C = leia.nextFloat();
		
		R = Math.pow((A + B),2);
		System.out.println(R);

	}

}
