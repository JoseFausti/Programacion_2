package Trabajos_Practicos.Trabajo_Practico_3.Clases.Ejercicio_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miercoles");
        weekDays.add("Jueves");
        weekDays.add("Viernes");
        weekDays.add("Sabado");
        weekDays.add("Domingo");

        weekDays.add(4, "Juernes");

        System.out.println("Contenido en la posición 3: " + weekDays.get(2));
        System.out.println("Contenido en la posición 4: " + weekDays.get(3));

        System.out.println("Primer elemento de la lista: " + weekDays.get(0));
        System.out.println("Último elemento de la lista: " + weekDays.get(weekDays.size() - 1));

        boolean removed = weekDays.remove("Juernes");
        if (removed) {
            System.out.println("'Juernes' eliminado de la lista: " + weekDays);
        } else {
            System.out.println("No se pudo encontrar 'Juernes' en la lista.");
        }

        Iterator<String> iterator = weekDays.iterator();
        System.out.println("Valores de la lista usando el iterador:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        boolean containsMonday = weekDays.contains("Lunes");
        System.out.println("¿Contiene la lista 'Lunes'? " + containsMonday);

        boolean containsMondayLowerCase = false;
        for (String day : weekDays) {
            if (day.equalsIgnoreCase("Lunes")) {
                containsMondayLowerCase = true;
                break;
            }
        }
        System.out.println("¿Contiene la lista 'Lunes' (en minúsculas)? " + containsMondayLowerCase);

        weekDays.clear();
        System.out.println("Lista borrada: " + weekDays);
    }
}
