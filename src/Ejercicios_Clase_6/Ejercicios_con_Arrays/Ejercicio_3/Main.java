package Ejercicios_Clase_6.Ejercicios_con_Arrays.Ejercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number;
        int maxNumber = Integer.MIN_VALUE;
        int maxPosition = -1;
        int [] numberList = new int[10];

        System.out.println("Ingrese numeros enteros entre 100 y 300: ");
        try {
            for (int i = 0; i < 10; i++) {
                number = sc.nextInt();
                if (number >= 100 && number <= 300) {
                    numberList[i] = number;
                }else {
                    System.out.println("Numero incorrecto");
                    i--;
                }
            }
            for (int i = 0; i < numberList.length; i++) {
                if (isPrime(numberList[i]) && numberList[i] > maxNumber){
                    maxNumber = numberList[i];
                    maxPosition = i;
                }
            }
            System.out.println("El mayor numero leido se encuentra en la posicion " + maxPosition + " del arreglo.");
        }catch (RuntimeException e){
            System.out.println("Ha realizado una operacion invalida");
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
