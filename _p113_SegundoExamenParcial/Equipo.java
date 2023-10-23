package _p113_SegundoExamenParcial;


    import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String Liga;
    private ArrayList<Jugador> Jugadores;
    
    // Creamos constructores
    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombreEquipo, String liga) {
        this();
        Liga = liga;
        
    }

    // Getters and Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getLiga() {
        return Liga;
    }
    public void setLiga(String liga) {
        Liga = liga;
    }
    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        Jugadores = jugadores;
    }
    public void agregarJugador( Jugador jugadores){
        Jugadores.add(jugadores);
        
    }
    // Calculamos el total bono de todos los jugadores

    public double getTotalBono() {
        double totalBono = 0.0;
        for (Jugador jugadores : Jugadores) {
            totalBono += jugadores.getBono();
        }
        return totalBono;
    }

    // Total de salarios
    public double getTotal() {
        double totalSalarios = 0.0;
        for (Jugador jugadores : Jugadores) {
            totalSalarios += jugadores.getTotal();
        }
        return totalSalarios;
    }

    // Total de hombres
    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugadores : Jugadores) {
            if (jugadores.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    // Total de mujeres
    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugadores : Jugadores) {
            if (jugadores.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    // Sacamos el reporte
    public void reporte() {
        System.out.println("Reporte del Equipo: " + nombreEquipo);
        System.out.println("Liga: " + Liga);
        System.out.println("Total de jugadores: " + Jugadores.size());
        System.out.println("Total de bono del equipo: " + getTotalBono());
        System.out.println("Total de salarios del equipo: " + getTotal());
        System.out.println("Total de jugadores Hombres: " + getTotalH());
        System.out.println("Total de jugadores Mujeres: " + getTotalM());
        System.out.println("Listado de Jugadores:");
        for (Jugador jugadores : Jugadores) {
            System.out.print(jugadores.getClass().getSimpleName() + " ");
            if (jugadores instanceof JugadorEntrenador) {
                System.out.println("[" + jugadores.toString() + "]");
            } else {
                System.out.println(jugadores.toString());
            }
        }
    }



}



