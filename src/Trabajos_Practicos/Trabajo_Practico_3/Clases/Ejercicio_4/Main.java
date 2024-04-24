package Trabajos_Practicos.Trabajo_Practico_3.Clases.Ejercicio_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(null, 0, 0);
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
                    student.addStudent();
                    break;
                case 2:
                    Student.showStudentList();
                    break;
                case 3:
                    Student.calculateMeanGrades();
                    break;
                case 4:
                    Student.showStudentBestGrade();
                    break;
                case 5:
                    Student.searchStudentByName();
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
