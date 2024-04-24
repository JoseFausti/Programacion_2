package Ejercicios_Clase_8.Ejercicio_tp3_en_clase.Ejercicio_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo alumno");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Calcular y mostrar la media de notas");
            System.out.println("4. Mostrar al estudiante con la nota más alta");
            System.out.println("5. Buscar estudiante por nombre");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (option) {
                case 1:
                    Student.addStudent(scanner, students);
                    break;
                case 2:
                    Student.showStudentList(students);
                    break;
                case 3:
                    Student.calculateMeanGrades(students);
                    break;
                case 4:
                    Student.showBestStudentGrade(students);
                    break;
                case 5:
                    Student.searchStudentByName(students, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
