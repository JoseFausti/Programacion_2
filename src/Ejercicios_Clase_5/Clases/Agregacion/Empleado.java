package Ejercicios_Clase_5.Clases.Agregacion;
public class Empleado {

	//Atributos
	private String cargo;
	private String nombre;
	private static int id = 1;

	//Constructor
	public Empleado(String cargo, String nombre) {
		this.cargo = cargo;
		this.nombre = nombre;
		id++;
	}

	//Getter y Setter
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void CrearEmpleado(String cargo, String nombre){
		new Empleado(cargo,nombre);
		id++;
	}

}