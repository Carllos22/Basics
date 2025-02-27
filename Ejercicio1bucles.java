package ejerciciosN0Bucles;

//Ejercicios con Arrays Bidimensionales:

//Ejercicio 1. Suma de los elementos de una matriz
//Calcula la suma de todos los elementos de una matriz 3x3.

public class Ejercicio1bucles {

	public static void main(String[] args) {
	       int[][] matriz = {
	               {1, 2, 3},
	               {4, 5, 6},
	               {7, 8, 9}
	           };
	           int suma = 0;

	           for (int[] fila : matriz) {
	               for (int num : fila) {
	                   suma += num;
	               }
	           }

	           System.out.println("Suma de todos los elementos de la matriz: " + suma);
	       }
	   }