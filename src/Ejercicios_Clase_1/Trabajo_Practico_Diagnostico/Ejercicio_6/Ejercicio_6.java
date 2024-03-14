package Ejercicios_Clase_1.Trabajo_Practico_Diagnostico.Ejercicio_6;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertir la frase a minúsculas para facilitar la comparación

        // Contar la cantidad de vocales y consonantes en la frase
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            // Verificar si el caracter es una vocal
            if (esVocal(caracter)) {
                vocales++;
            }
            // Verificar si el caracter es una consonante (no es una vocal ni un espacio en blanco)
            else if (caracter >= 'a' && caracter <= 'z' && !esVocal(caracter)) {
                consonantes++;
            }
        }

        // Mostrar la cantidad de vocales y consonantes en la frase
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }

    // Método para verificar si un caracter es una vocal
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
