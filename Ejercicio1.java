package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 1: Sumar dos números enteros

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scanner.nextInt();
		int suma = num1 + num2;
		System.out.println("La suma es: " + suma);
		scanner.close();

	}

}