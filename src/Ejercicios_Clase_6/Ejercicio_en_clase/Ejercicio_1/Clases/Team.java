package Ejercicios_Clase_6.Ejercicio_en_clase.Ejercicio_1.Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable<Player> {

    //Atributos
    private List<Player>players;

    //Constructor
    public Team() {
        this.players = new ArrayList<>();
    }

    //Getter y Setter
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }



    //Metodos
    public void addPlayer(Player player){
        players.add(player);
    }

    /*Si no se personaliza lo dejo asi

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
        }
    */

    @Override
    public Iterator<Player> iterator() {
        return new TeamIterator();
    }

    private class TeamIterator implements Iterator<Player>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return (index < players.size());
        }

        @Override
        public Player next() {
            return (players.get(index++));
        }
    }
}
