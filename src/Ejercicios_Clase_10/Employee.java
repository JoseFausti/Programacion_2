package Ejercicios_Clase_10;

import java.time.LocalDate;

public class Employee extends Person{
    private EmployeeType employeeType;

    public Employee(){}

    public Employee(String name, String surname, String phoneNumber, String email, LocalDate dateOfBirth, EmployeeType employeeType) {
        super(name, surname, phoneNumber, email, dateOfBirth);
        this.employeeType = employeeType;
    }
}
