package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 8: Calcular el promedio de tres números

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingresa el primer número:");
		double num1 = scanner.nextDouble();
		System.out.println("Ingresa el segundo número:");
		double num2= scanner.nextDouble();
		System.out.println("Ingresa el tercer número:");
		double num3 = scanner.nextDouble();
		double promedio = (num1 + num2 + num3) / 3;
		System.out.println("Promedio de los tres números es: " + promedio);
		scanner.close();
	}

}