package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_8;
import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNumeros = 0;

        // Solicitar números al usuario hasta que se ingrese -1
        System.out.println("Ingrese números (ingrese -1 para terminar):");

        while (true) {
            numero = scanner.nextInt();

            // Verificar si se ingresó -1 para terminar el programa
            if (numero == -1) {
                break;
            }

            // Actualizar el mayor y el menor número ingresado
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);

            // Sumar al total y contabilizar la cantidad de números ingresados
            sumaTotal += numero;
            cantidadNumeros++;

            // Sumar a la suma de positivos o negativos según el signo del número
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                sumaNegativos += numero;
            }
        }

        // Calcular la media
        double media = (double) sumaTotal / cantidadNumeros;

        // Mostrar los resultados
        System.out.println("a. Mayor número introducido: " + (mayor == Integer.MIN_VALUE ? "No se ingresaron números" : mayor));
        System.out.println("b. Menor número introducido: " + (menor == Integer.MAX_VALUE ? "No se ingresaron números" : menor));
        System.out.println("c. Suma de todos los números: " + sumaTotal);
        System.out.println("d. Suma de los números positivos: " + sumaPositivos);
        System.out.println("e. Suma de los números negativos: " + sumaNegativos);
        System.out.println("f. Media de la suma: " + (cantidadNumeros == 0 ? "No se ingresaron números" : media));
    }
}
