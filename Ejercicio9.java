package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 9: Calcular el residuo de una división

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese el dividendo: ");
		int dividendo = scanner.nextInt();
		System.out.println("Ingrese el divisor: ");
		int divisor = scanner.nextInt();
		int residuo = dividendo % divisor;
		System.out.println("El residuo de la división sería: " + residuo);
		scanner.close();
	}

}
