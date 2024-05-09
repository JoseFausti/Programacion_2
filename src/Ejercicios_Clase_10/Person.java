package Ejercicios_Clase_10;

import java.time.LocalDate;

public class Person {
    protected String name;
    protected String surname;
    protected String phoneNumber;
    protected String email;
    protected LocalDate dateOfBirth;

    public Person(){}
    public Person(String name, String surname, String phoneNumber, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}
