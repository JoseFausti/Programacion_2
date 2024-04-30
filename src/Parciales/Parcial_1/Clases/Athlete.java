package Parciales.Parcial_1.Clases;

import java.lang.annotation.Repeatable;
import java.util.Random;

public class Athlete extends Person implements Contract {

	//Atributos
	private int age;
	private double height;
	private double weight;

	//Constructor
	public Athlete(String name, int dni, int age, double height, double weight) {
		super(name, dni);
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//Getter y Setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//Metodos
	@Override
	public double calculateCMI(){
		return (weight / Math.pow(height,2));
	} //Uso de la biblioteca Math para calcular el exponente.
	@Override
	public boolean isExtraWeight(double cmi){
		return cmi > 25;
	}
	@Override
	public double takePulses(){
		Random random = new Random();
		return (random.nextDouble(80 + 1) + 60);
	} // Creacion de un numero aleatorio entre [60 - 140]
}