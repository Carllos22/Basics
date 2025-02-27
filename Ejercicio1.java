package ejerciciosN0Arrays;

//Ejercicio 1. Suma de elementos de un array
//Dado un array de enteros, calcula la suma de todos sus elementos.

public class Ejercicio1 {

	public static void main(String[] args) {
		 /*Solución 1:*/
		int[] numeros= {1,2,3,4,5};
		int suma = 0;
		suma += numeros[0];
		suma += numeros[1];
		suma += numeros[2];
		suma += numeros[3];
		suma += numeros[4];
		
		/* Solución 2: 
		 
		for (int i=0;i<numeros.length;i++) {
            suma += numeros[i];
		} */
		
		/*Solución 3: 
		
		for (Integer numero:numeros) {
			suma +=numero;*/
		
		System.out.println("Suma:" + suma);
	}
	
}
