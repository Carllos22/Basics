package ejerciciosN0Arrays;

import java.util.Arrays;

//Ejercicio 5. Copiar un array en otro
//Copia los elementos de un array en otro nuevo.

public class Ejercicio5 {

	public static void main(String[] args) {
        int[] original = {1, 25, 3, 4, 22};
        int[] copia = Arrays.copyOf(original, original.length);

        System.out.println("Array copiado: " + Arrays.toString(copia));
    }
}