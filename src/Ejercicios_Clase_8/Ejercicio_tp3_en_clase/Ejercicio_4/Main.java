package Ejercicios_Clase_8.Ejercicio_tp3_en_clase.Ejercicio_4;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Alumno> alumnos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo alumno");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Calcular y mostrar la media de notas");
            System.out.println("4. Mostrar el alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        agregarAlumno(scanner, alumnos);
                        break;
                    case 2:
                        mostrarListaAlumnos(alumnos);
                        break;
                    case 3:
                        calcularMediaNotas(alumnos);
                        break;
                    case 4:
                        mostrarAlumnoNotaMasAlta(alumnos);
                        break;
                    case 5:
                        buscarAlumnoPorNombre(alumnos, scanner);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine();  // Limpiar el buffer de entrada
            }
        }
    }
    private static void agregarAlumno(Scanner scanner, Map<String, Alumno> alumnos) {
        try {
            System.out.print("Nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad del alumno: ");
            int edad = scanner.nextInt();
            System.out.print("Nota del alumno: ");
            double nota = scanner.nextDouble();

            Alumno nuevoAlumno = new Alumno(nombre, edad, nota);
            alumnos.put(nombre, nuevoAlumno);
            System.out.println("Alumno agregado con éxito.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Formato de entrada incorrecto.");
            scanner.nextLine();  // Limpiar el buffer de entrada
        }
    }
    private static void mostrarListaAlumnos(Map<String, Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
            return;
        }

        System.out.println("\nLista de Alumnos:");
        for (Alumno alumno : alumnos.values()) {
            System.out.println(alumno);
        }
    }

    private static void calcularMediaNotas(Map<String, Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos para calcular la media de notas.");
            return;
        }

        double sumaNotas = 0;
        for (Alumno alumno : alumnos.values()) {
            sumaNotas += alumno.getNota();
        }

        double media = sumaNotas / alumnos.size();
        System.out.println("La media de notas de todos los alumnos es: " + media);
    }

    private static void mostrarAlumnoNotaMasAlta(Map<String, Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos para mostrar.");
            return;
        }

        Alumno alumnoMaxNota = null;
        for (Alumno alumno : alumnos.values()) {
            if (alumnoMaxNota == null || alumno.getNota() > alumnoMaxNota.getNota()) {
                alumnoMaxNota = alumno;
            }
        }

        System.out.println("Alumno con la nota más alta:");
        System.out.println(alumnoMaxNota);
    }

    private static void buscarAlumnoPorNombre(Map<String, Alumno> alumnos, Scanner scanner) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos para buscar.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombreBuscado = scanner.nextLine();

        Alumno alumno = alumnos.get(nombreBuscado);
        if (alumno != null) {
            System.out.println("Información del alumno encontrado:");
            System.out.println(alumno);
        } else {
            System.out.println("No se encontró ningún alumno con ese nombre.");
        }
    }
}

