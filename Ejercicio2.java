package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 2: Calcular el área de un rectángulo

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la base del rectángulo: ");
		double base = scanner.nextDouble();
		System.out.print("Introduce la altura del rectángulo: ");
		double altura = scanner.nextDouble();
		double area = base * altura;
		System.out.print("El área del rectángulo es: " + area);
		scanner.close();
	}

}