package Ejercicios_Clase_6.Ejercicios_con_Arrays.Ejercicio_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number;
        int counter = 0;
        int maxNumber = Integer.MIN_VALUE;
        ArrayList <Integer> numberList = new ArrayList<>();

        System.out.println("Ingrese numeros enteros: ");
        try {
            for (int i = 0; i < 10; i++) {
                number = sc.nextInt();
                numberList.add(number);
            }
            for (int num : numberList) {
                if (num > maxNumber) {
                    maxNumber = num;
                    counter = 0;
                }
                if (num == maxNumber){
                    counter += 1;
                }
            }
            System.out.println("El mayor numero se repite " + counter + " veces.");
        }catch (RuntimeException e){
            System.out.println("Ha realizado una operacion invalida");
        }
    }
}

