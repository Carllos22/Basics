package ejerciciosN0Arrays;

//Ejercicio 2. Encontrar el valor máximo en un array
//Encuentra el número más grande en un array de enteros.

public class Ejercicio2 {

	public static void main(String[] args) {
        int[] numeros = {10, 25, 3, 8, 50, 12};
        int max = numeros[0];

        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("El número más grande es: " + max);
    }
}