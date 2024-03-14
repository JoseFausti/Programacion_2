package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_1;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        // Solicitar al usuario que elija la operación
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = scanner.nextInt();

        // Realizar la operación seleccionada por el usuario
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("El resultado de la división es: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    // Método para realizar la suma
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para realizar la resta
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para realizar la multiplicación
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para realizar la división
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
