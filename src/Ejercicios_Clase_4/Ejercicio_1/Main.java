package Ejercicios_Clase_4.Ejercicio_1;

import Ejercicios_Clase_4.Ejercicio_1.Clases.*;
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Circulo circulo1 = new Circulo(2);

        System.out.println("El area del cuadrado es = "+cuadrado1.area());
        System.out.println("El area del circulo es = "+circulo1.area());
    }

}
