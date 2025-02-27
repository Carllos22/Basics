package ejerciciosN0Arrays;

//Ejercicio 4. Contar ocurrencias de un número
//Dado un array y un número, contar cuántas veces aparece en el array.

public class Ejercicio4 {

	public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 2, 3, 2, 5};
        int numeroBuscado = 5;
        int contador = 0;

        for (int num : numeros) {
            if (num == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("El número " + numeroBuscado + " aparece " + contador + " vez.");
    }
}