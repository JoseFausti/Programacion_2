package Trabajos_Practicos.Ejercicio_8;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Gerente
        Gerente gerente1 = new Gerente("Juan", 35, 5000, true, Actividades.OrganizarInventario);
        Gerente gerente2 = new Gerente("Pedro", 40, 6000, false, Actividades.InspeccionGeneral);

        // Llamar al método realizarActividad() en cada gerente
        gerente1.realizarActividad();
        gerente2.realizarActividad();

        // Crear instancias de Trabajador
        Trabajador trabajador1 = new Trabajador("José", 25, 3000, true, 10);
        Trabajador trabajador2 = new Trabajador("Joaquín", 30, 3500, false, 8);

        // Llamar al método producirEnArea() en cada trabajador
        trabajador1.producirEnArea();
        trabajador2.producirEnArea();
    }
}

