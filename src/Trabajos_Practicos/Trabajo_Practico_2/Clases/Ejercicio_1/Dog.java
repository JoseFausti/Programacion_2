package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public class Dog extends Animal {

	//Attributes
	private String race;
	private boolean vacunated;

	//Constructor
	public Dog(){}
	public Dog(int age, String animalType, String name, double price, String race, boolean vacunated) {
		super(age, animalType, name, price);
		this.race = race;
		this.vacunated = vacunated;
	}

	//Getter and Setter
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}

	public boolean isVacunated() {
		return vacunated;
	}
	public void setVacunated(boolean vacunated) {
		this.vacunated = vacunated;
	}

	//Methods
	public void feedAnimal(String name){

	}
	@Override
	public String toString() {
		return super.toString();
	}
}