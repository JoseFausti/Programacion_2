package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_10;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de notas a ingresar
        System.out.println("Ingrese la cantidad de notas a ingresar:");
        int cantidadNotas = scanner.nextInt();

        // Verificar si la cantidad de notas es válida
        if (cantidadNotas <= 0) {
            System.out.println("Error: La cantidad de notas debe ser mayor que cero.");
            return;
        }

        // Solicitar al usuario ingresar las notas
        System.out.println("Ingrese las notas:");

        double sumaNotas = 0;

        // Leer las notas ingresadas por el usuario y sumarlas
        for (int i = 0; i < cantidadNotas; i++) {
            double nota;
            boolean notaValida = false;

            // Solicitar la nota al usuario hasta que sea válida
            while (!notaValida) {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = scanner.nextDouble();

                // Verificar si la nota ingresada es válida (entre 1 y 10)
                if (nota >= 1 && nota <= 10) {
                    notaValida = true;
                    sumaNotas += nota;
                } else {
                    System.out.println("Error: La nota debe estar entre 1 y 10.");
                }
            }
        }

        // Calcular el promedio de las notas
        double promedio = sumaNotas / cantidadNotas;

        // Mostrar el promedio de las notas
        System.out.println("El promedio de las notas es: " + promedio);
    }
}

