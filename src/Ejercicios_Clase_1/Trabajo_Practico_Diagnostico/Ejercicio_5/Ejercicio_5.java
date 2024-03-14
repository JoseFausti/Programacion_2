package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_5;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número mínimo
        System.out.println("Ingrese el número mínimo:");
        int minimo = scanner.nextInt();

        // Solicitar al usuario el número máximo
        System.out.println("Ingrese el número máximo:");
        int maximo = scanner.nextInt();

        // Validar que el número mínimo sea menor que el número máximo
        if (minimo >= maximo) {
            System.out.println("Error: El número mínimo debe ser menor que el número máximo.");
            return; // Salir del programa si la validación falla
        }

        // Mostrar los números primos en el rango dado
        System.out.println("Números primos entre " + minimo + " y " + maximo + ":");
        for (int i = minimo; i <= maximo; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
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
