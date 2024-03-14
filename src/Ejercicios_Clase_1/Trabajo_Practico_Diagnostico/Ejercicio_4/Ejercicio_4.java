package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        // Verificar si el número es primo
        boolean esPrimo = esNumeroPrimo(numero);

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false; // Si el número es menor o igual a 1, no es primo
        }

        // Verificar si el número es divisible solo por 1 y por sí mismo
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && i != numero) {
                return false; // El número no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, el número es primo
    }
}

