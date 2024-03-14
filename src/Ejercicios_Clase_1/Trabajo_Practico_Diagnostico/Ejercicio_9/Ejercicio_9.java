package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_9;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de las matrices
        System.out.println("Ingrese las dimensiones de las matrices (NxM):");
        System.out.print("Número de filas (N): ");
        int filas = scanner.nextInt();
        System.out.print("Número de columnas (M): ");
        int columnas = scanner.nextInt();

        // Declarar las matrices
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] sumaMatrices = new int[filas][columnas];

        // Solicitar al usuario que ingrese los elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        ingresarElementosMatriz(scanner, matriz1);

        // Solicitar al usuario que ingrese los elementos de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        ingresarElementosMatriz(scanner, matriz2);

        // Sumar las dos matrices
        sumarMatrices(matriz1, matriz2, sumaMatrices);

        // Mostrar la suma de las matrices
        System.out.println("La suma de las matrices es:");
        imprimirMatriz(sumaMatrices);
    }

    // Método para ingresar los elementos de una matriz desde el teclado
    public static void ingresarElementosMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para sumar dos matrices
    public static void sumarMatrices(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

