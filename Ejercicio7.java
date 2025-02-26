package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 7: Determinar si un número es positivo, negativo o cero

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce número:");
		int num = scanner.nextInt();
		if (num > 0) {
			System.out.println("El número es positivo");
		} else if (num < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es cero");
		}
		scanner.close();
	}

}