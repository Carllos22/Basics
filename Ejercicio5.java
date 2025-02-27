package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 5: Calcular el perímetro de un círculo

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el radio del círculo: ");
		double radio = scanner.nextDouble();
		double perimetro = 2 * Math.PI * radio;
		System.out.println("El perímetro del círculo es: " + perimetro);
		scanner.close();
	}

}
