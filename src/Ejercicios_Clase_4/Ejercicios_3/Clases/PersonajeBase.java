package Ejercicios_Clase_4.Ejercicios_3.Clases;

import Ejercicios_Clase_4.Ejercicios_3.Interfaces.Personaje;

public abstract class PersonajeBase implements Personaje {
    private int nivel;
    private int vida;
    private String nombre;

    //Constructor
    public PersonajeBase(int nivel, int vida, String nombre) {
        this.nivel = nivel;
        this.vida = vida;
        this.nombre = nombre;
    }

    //Metodos
    @Override
    public int defender(int danio) {
        return 0;
    }
    //Método para recibir daño
    @Override
    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

}
