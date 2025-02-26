package org.ejerciciosNivel0;

import java.util.Scanner;

//Ejercicio 6: Intercambiar valores entre dos variables

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un valor para a: ");
		int a = scanner.nextInt();
		System.out.println("Introduce otro valor para b: ");
		int b = scanner.nextInt();
		int value = a;
		a = b;
		b = value;
		System.out.println("Después de intercambiar valores: a = " + a + " , b = " + b);
		scanner.close();
	}

}