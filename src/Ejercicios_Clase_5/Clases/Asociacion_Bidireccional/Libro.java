package Ejercicios_Clase_5.Clases.Asociacion_Bidireccional;

import java.util.ArrayList;
import java.util.List;

public class Libro {

	//Atributos
	private List<Persona> propietarios = new ArrayList<>();
	private String titulo;
	private static int id = 0;

	//Constructor
	public Libro(String titulo) {
		this.titulo = titulo;
		id++;
	}

	//Getter y Setter
	public List<Persona> getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(List<Persona> propietarios) {
		this.propietarios = propietarios;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static int getId() {
		return id;
	}

	//Metodos
	public void CrearLibro(String titulo){
		new Libro(titulo);
		id++;
	}

	public void MostrarListaPersonas(){
		System.out.println("Propietarios:");
		for (Persona persona:propietarios) {
			System.out.println("-" + persona.getNombre() + ".");
		}
	}

}