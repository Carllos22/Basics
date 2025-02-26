package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 10: Concatenar dos cadenas

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la primera cadena: ");
		String cadena1 = scanner.nextLine();
		System.out.println("Ingrese la segunda cadena: ");
		String cadena2 = scanner.nextLine();
		String concatenada = cadena1 + " " + cadena2;
		System.out.println("La cadena concatenada es: " + concatenada);
		scanner.close();
	}

}