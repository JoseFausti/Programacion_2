package Parciales.Parcial_1.Clases;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Creacion de los Atletas
        Athlete athlete1 = new Athlete("Jose Fausti",43417393,23,1.75,72.3);
        Athlete athlete2 = new Athlete("Lucas Gimenez",43151356,24,1.79,75.3);
        Athlete athlete3 = new Athlete("Juan Santucci",39630294,25,1.82,120.3);
        Athlete athlete4 = new Athlete("Agustin Vecino",44419323,20,1.66,65.2);
        Athlete athlete5 = new Athlete("Matias Valot",43621020,22,1.86,85.8);
        Athlete athlete6 = new Athlete("Bautista Viggiani",45830684,19,1.69,65.3);
        // Creacion de los Equipos Nacionales
        NationalTeam team1 = new NationalTeam("Rojo y Blanco","Argentina");
        NationalTeam team2 = new NationalTeam("Azul y Blanco","Argentina");
        NationalTeam team3 = new NationalTeam("Verde y Amarillo","Peru");
        // Creacion de las Pruebas
        Test test1 = new Test(244,"'Carrera de los 150 metros'",athlete1);
        Test test2 = new Test(259,"'Lanzamiento de Jabalina'",athlete2);
        Test test3 = new Test(225,"'Salto en Largo'",athlete3);
        // Creacion de las Instalaciones
        Facility facility1 = new Facility("Nacional","Cordoba","Estadio Mario Kempes","Deportivo");
        Facility facility2 = new Facility("Nacional","Mendoza","Club Andes Talleres","Deportivo");
        // Creacion de las Sedes
        HostPlace place1 = new HostPlace("15/06/2024","10:00 a.m.",1,facility1);
        HostPlace place2 = new HostPlace("23/08/2024","03:30 p.m.",2,facility2);


        // Asignacion de los Atletas en los Equipos
        //Equipo_1
        team1.addAthlete(athlete1);
        team1.addAthlete(athlete4);
        //Equipo_2
        team2.addAthlete(athlete2);
        team2.addAthlete(athlete5);
        //Equipo_3
        team3.addAthlete(athlete3);
        team3.addAthlete(athlete6);

        // Asignacion de los Atletas a las Pruebas
        //Prueba_1
        test1.addCompetitor(athlete2);
        test1.addCompetitor(athlete3);
        test1.addCompetitor(athlete5);
        test1.addCompetitor(athlete6);
        //Prueba_2
        test2.addCompetitor(athlete1);
        test2.addCompetitor(athlete3);
        test2.addCompetitor(athlete4);
        test2.addCompetitor(athlete5);
        //Prueba_3
        test3.addCompetitor(athlete1);
        test3.addCompetitor(athlete2);
        test3.addCompetitor(athlete4);
        test3.addCompetitor(athlete6);

        // Asignacion de las Pruebas a las Sedes
        place1.addTest(test1);
        place1.addTest(test2);
        place2.addTest(test3);


        // Mostrar: Desde un objeto Instalacion: Nombre del 3er atleta de la 2da prueba.
        Facility facility = place1.getWhere().get(0); //Suponemos la primer instlacion ya preestablecida.
        System.out.println("Nombre del tercer atleta de la segunda prueba: \nInstalacion: "+facility.getName()+"\nNombre: "+place1.getItDoes().get(1).getParticipates().get(2).getName());

        System.out.println("-------------------------------------------------------");

        // Mostrar: Desde un objeto Instalacion: Código de la 2da prueba.
        System.out.println("Codigo de la segunda prueba: \nInstalacion: "+facility.getName()+"\nCodigo: "+place1.getItDoes().get(1).getCode());

        System.out.println("-------------------------------------------------------");

        // Mostrar: Desde un objeto EquipoNacional: Altura de todos los atletas.
        List<NationalTeam> teams = new ArrayList<>();
        int index = 1;
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        for (NationalTeam team:teams) {
            System.out.println("Equipo: "+team.getColor());
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre del Atleta: " + team.getBelongs().get(i).getName());
                System.out.println("Altura: " + team.getBelongs().get(i).getHeight());
                System.out.println();
            }
        }

        System.out.println("-------------------------------------------------------");

        // Mostrar: Desde un objeto EquipoNacional: Peso extra de cada atleta.
        System.out.println("Peso extra de cada atleta:");
        for (NationalTeam team:teams) {
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre del Atleta: " + team.getBelongs().get(i).getName());
                if (team.getBelongs().get(i).isExtraWeight(team.getBelongs().get(i).calculateCMI())){
                    System.out.println("Tiene peso extra.");
                }else {
                    System.out.println("No tiene peso extra.");
                }
            }
        }
    }
}