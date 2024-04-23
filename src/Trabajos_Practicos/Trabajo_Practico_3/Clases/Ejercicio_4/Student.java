package Trabajos_Practicos.Trabajo_Practico_3.Clases.Ejercicio_4;
class Student {
    private String name;
    private int age;
    private double grade;

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
}
