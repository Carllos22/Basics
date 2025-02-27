package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 3: Determinar si un número es par o impar

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
		int numero = scanner.nextInt();
		if (numero % 2 == 0) {
			System.out.print("El número es par");	
		} else {
			System.out.print("El número es impar");
		}
		scanner.close();
	}
	
}