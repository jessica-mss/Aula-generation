//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e 
//mostre-o expresso em horas, minutos e segundos.

package Exerc�cios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
	
	float segundos, minutos, horas, tempoTotal;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nQual foi a dura��o do evento em segundos? ");
	tempoTotal = leia.nextFloat();
	
	horas = tempoTotal/3600;
	minutos = (tempoTotal%3600) / 60;
	segundos = (tempoTotal%3600) % 60;
	
	System.out.println("\nO evento durou cerca de " + horas + "horas" + minutos + "minutos" + segundos + "segundos");
	
	}
	
}
