package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la dirección de conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcion = scanner.nextInt();

        System.out.println("Ingrese la temperatura:");

        double temperatura;
        if (opcion == 1) {
            System.out.println("Ingrese la temperatura en grados Celsius:");
            temperatura = scanner.nextDouble();
            double fahrenheit = celsiusAFahrenheit(temperatura);
            System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        } else if (opcion == 2) {
            System.out.println("Ingrese la temperatura en grados Fahrenheit:");
            temperatura = scanner.nextDouble();
            double celsius = fahrenheitACelsius(temperatura);
            System.out.println("La temperatura en Celsius es: " + celsius);
        } else {
            System.out.println("Opción no válida");
        }
    }

    // Método para convertir de Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para convertir de Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
