package Ejercicios_Clase_5.Clases.Asociacion_Unidireccional;
public class Universidad  {

	//Atributos
	private String nombre;
	private static int id = 0;

	//Constructor
	public Universidad (){}
	public Universidad(String nombre) {
		this.nombre = nombre;
		id++;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getId() {
		return id;
	}

	//Metodos
	public void CambiarUniversidad(String nuevaUniversidad){
		setNombre(nuevaUniversidad);
	}

	public void CrearUniversidad(){
		new Universidad();
		id++;
	}

	public String VerUniversidad(){
		return ("Id Universidad: "+ getId() +
				"\r\nUniversidad: " + this.nombre);
	}

}