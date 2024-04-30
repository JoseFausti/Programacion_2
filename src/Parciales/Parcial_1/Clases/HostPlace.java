package Parciales.Parcial_1.Clases;

import java.util.ArrayList;
import java.util.List;

public class HostPlace {

	//Atributos
	private String date;
	private String hour;
	private int phase;
	private List <Test> itDoes;
	private List <Facility> where;

	//Constructor
	public HostPlace(String date, String hour, int phase, Facility firstFacility) {
		this.date = date;
		this.hour = hour;
		this.phase = phase;
		this.itDoes = new ArrayList<>();
		this.where = new ArrayList<>();
		this.where.add(firstFacility);
	}

	//Getter y Setter
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}

	public int getPhase() {
		return phase;
	}
	public void setPhase(int phase) {
		this.phase = phase;
	}

	public List<Test> getItDoes() {
		return itDoes;
	}
	public void setItDoes(List<Test> itDoes) {
		this.itDoes = itDoes;
	}

	public List<Facility> getWhere() {
		return where;
	}
	public void setWhere(List<Facility> where) {
		this.where = where;
	}

	//Metodos
	public void addTest(Test test){
		this.itDoes.add(test);
	}
	public void addFacility(Facility facility){
		this.where.add(facility);
	}

}