package Parciales.Parcial_1.Clases;

import java.util.ArrayList;
import java.util.List;

public class NationalTeam {

	//Atributos
	private String color;
	private String country;
	private List <Athlete> belongs;

	//Constructor
	public NationalTeam(String color, String country) {
		this.color = color;
		this.country = country;
		this.belongs = new ArrayList<>();
	}

	//Getter y Setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public List<Athlete> getBelongs() {
		return belongs;
	}
	public void setBelongs(List<Athlete> belongs) {
		this.belongs = belongs;
	}

	//Metodos
	public void addAthlete(Athlete athlete){
		this.belongs.add(athlete);
	}
}