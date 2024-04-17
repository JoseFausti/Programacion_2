package Ejercicios_Clase_6.Ejercicios_con_Arrays.Ejercicio_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number;
        ArrayList <Integer> numberList = new ArrayList<>();
        List<Integer>counter = new ArrayList<>();

        System.out.println("Ingrese numeros enteros: ");
        try {
            for (int i = 0; i < 10; i++) {
                number = sc.nextInt();
                numberList.add(number);
            }
            for (int i = 0; i < numberList.size(); i++) {
                if (numberList.get(i) % 10 == 4){
                    counter.add(i);
                }
            }

            System.out.println("Los numeros terminados en 4 se encuentran en las pocisiones: ");

            for (int i = 0; i < counter.size(); i++) {
                System.out.print(counter.get(i)); // print() escribe en la misma linea, en lugar de println()
                if (i < counter.size() - 1) {
                    System.out.print(", ");
                }
            }

        }catch (RuntimeException e){
            System.out.println("Ha realizado una operacion invalida");
        }
    }
}
