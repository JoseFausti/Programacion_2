package Trabajos_Practicos.Trabajo_Practico_3.Clases.Ejercicio_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private double grade;
    private static Map<String, Student> students = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre= '" + name + '\'' +
                ", Edad= " + age +
                ", Nota= " + grade +
                '}';
    }

    public void addStudent() {
        System.out.print("Nombre del alumno: ");
        String name = scanner.nextLine();
        System.out.print("Edad del alumno: ");
        int age = scanner.nextInt();
        System.out.print("Nota del alumno: ");
        double grade = scanner.nextDouble();

        Student newStudent = new Student(name, age, grade);
        students.put(name, newStudent);
        System.out.println("Alumno agregado con éxito.");
    }

    public static void showStudentList() {
        if (students.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
            return;
        }

        System.out.println("\nLista de Alumnos:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public static void calculateMeanGrades() {
        if (students.isEmpty()) {
            System.out.println("No hay alumnos para calcular la media de las notas.");
            return;
        }

        double sumGrades = 0;
        for (Student student : students.values()) {
            sumGrades += student.getGrade();
        }

        double mean = sumGrades / students.size();
        System.out.println("La media de notas de todos los alumnos es: " + mean);
    }

    public static void showStudentBestGrade() {
        if (students.isEmpty()) {
            System.out.println("No hay alumnos para mostrar.");
            return;
        }

        Student studentBestGrade = null;
        for (Student student : students.values()) {
            if (studentBestGrade == null || student.getGrade() > studentBestGrade.getGrade()) {
                studentBestGrade = student;
            }
        }

        System.out.println("Alumno con la nota más alta:");
        System.out.println(studentBestGrade);
    }

    public static void searchStudentByName() {
        if (students.isEmpty()) {
            System.out.println("No hay alumnos para buscar.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String searchedName = scanner.nextLine();

        Student student = students.get(searchedName);
        if (student != null) {
            System.out.println("Información del alumno encontrado:");
            System.out.println(student);
        } else {
            System.out.println("No se encontró ningún alumno con ese nombre.");
        }
    }
}
