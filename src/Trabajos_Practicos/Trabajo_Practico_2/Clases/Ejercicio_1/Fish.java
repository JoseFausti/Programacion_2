package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public class Fish extends Animal {

	//Attributes
	private String species;
	private double weight;

	//Constructor
	public Fish(){}
	public Fish(int age, String animalType, String name, double price, String species, double weight) {
		super(age, animalType, name, price);
		this.species = species;
		this.weight = weight;
	}

	//Getter and Setter
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//Methods
	public void feedAnimal(String name){

	}
	@Override
	public String toString() {
		return super.toString();
	}
}