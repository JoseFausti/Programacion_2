package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public class Bird extends Animal {

	//Attributes
	private String species;
	private boolean talk;

	//Constructor
	public Bird(){}
	public Bird(int age, String animalType, String name, double price, String species, boolean talk) {
		super(age, animalType, name, price);
		this.species = species;
		this.talk = talk;
	}

	//Getter and Setter
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isTalk() {
		return talk;
	}
	public void setTalk(boolean talk) {
		this.talk = talk;
	}

	//Methods
	public void feedAnimal(String name){

	}
	@Override
	public String toString() {
		return super.toString();
	}
}