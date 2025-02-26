package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 4: Convertir grados Celsius a Fahrenheit

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa los grados celsius que deseas convetir: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.print("Los grados fahrenheit son: " + fahrenheit);
		scanner.close();
	}

}
