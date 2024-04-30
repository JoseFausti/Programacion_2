package Parciales.Parcial_1.Clases;
public abstract class Person {

	//Atributos
	private String name;
	private int dni;

	//Constructor
	public Person(String name, int dni) {
		this.name = name;
		this.dni = dni;
	}

	//Getter y Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
}