package Ejercicios_Clase_6.Ejercicios_con_Arrays.Ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number;
        int maxNumber = Integer.MIN_VALUE;
        ArrayList <Integer> numberList = new ArrayList<>();

        System.out.println("Ingrese numeros enteros: ");
            try {
                for (int i = 0; i < 10; i++) {
                    number = sc.nextInt();
                    numberList.add(number);
                }
                for (int num : numberList) {
                    if (num > maxNumber){
                        maxNumber = num;
                    }
                }
                System.out.println("El mayor numero leido se encuentra en la posicion " + numberList.indexOf(maxNumber) + " del arreglo.");
            }catch (RuntimeException e){
                System.out.println("Ha realizado una operacion invalida");
            }
    }
}
