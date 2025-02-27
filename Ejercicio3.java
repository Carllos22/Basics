package ejerciciosN0Arrays;

import java.util.Arrays;

//Ejercicio 3. Invertir un array
//Invierte el orden de los elementos en un array.

public class Ejercicio3 {

	public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int n = numeros.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }

        System.out.println("Array invertido: " + Arrays.toString(numeros));
    }
}