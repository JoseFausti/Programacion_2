package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;
public class PetShop {

	//Attributes
	private Animal animals[];
	private int i;

	//Constructor
	public PetShop(Animal[] animals) {
		this.animals = animals;
		this.i = animals.length;
	}

	//Getter and Setter
	public Animal[] getAnimals() {
		return animals;
	}
	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	//Methods
	public void addAnimal(Animal animal){
		this.animals[i] = animal;
		i++;
	}

	public void feedAnimal(String name,int animalList){
		Animal animal = animals[animalList];
		System.out.println("El " + animal.getAnimalType() + ": '" + name + "' está comiendo.");
	}

	public void listAnimals(){
		System.out.println("Lista de Animales:");
		for (Animal animal: animals) {
			System.out.println(animal);
		}
	}

	public String setAnimal(){
		return "";
	}

}
