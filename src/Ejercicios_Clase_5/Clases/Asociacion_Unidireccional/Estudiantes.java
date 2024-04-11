package Ejercicios_Clase_5.Clases.Asociacion_Unidireccional;

public class Estudiantes  {

	//Atributos
	private String nombre;
	public Universidad  universidad;
	private static int id = 0;

	//Constructor
	public Estudiantes (){}
	public Estudiantes(String nombre, Universidad universidad) {
		this.nombre = nombre;
		this.universidad = universidad;
		id++;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public static int getId() {
		return id;
	}

	//Metodos
	public void CrearEstudiantes (){
		new Estudiantes();
		id++;
	}

}