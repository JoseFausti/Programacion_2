package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public class Cat extends Animal {

	//Attributes
	private String race;
	private boolean sterilized;

	//Constructor
	public Cat(){}
	public Cat(int age, String animalType, String name, double price, String race, boolean sterilized) {
		super(age, animalType, name, price);
		this.race = race;
		this.sterilized = sterilized;
	}

	//Getter and Setter
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}

	public boolean isSterilized() {
		return sterilized;
	}
	public void setSterilized(boolean sterilized) {
		this.sterilized = sterilized;
	}

	//Methods
	public void feedAnimal(String name){

	}
	@Override
	public String toString() {
		return super.toString();
	}
}