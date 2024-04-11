package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public abstract class Animal {

	//Attributes
	private int age;
	private String animalType;
	private String name;
	private double price;

	//Constructor
	public Animal(){}
	public Animal(int age, String animalType, String name, double price) {
		this.age = age;
		this.animalType = animalType;
		this.name = name;
		this.price = price;
	}

	//Methods
	public void feedAnimal(String name){

	}
	@Override
	public String toString() {
		return super.toString();
	}
}