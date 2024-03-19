package Ejercicios_Clase_3.Ejercicio_en_clase;

public abstract class Empleado {
    //Parametros
    private String nombre;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //Getter
    public String getNombre() {
        return nombre;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo Abstracto
    public abstract String toString();
}
