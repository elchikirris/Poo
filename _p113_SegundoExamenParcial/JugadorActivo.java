package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    // Generamos el constructor
    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }

    // Creamos lo getters and setters
    public int getPartidos() {
        return Partidos;
    }
    public void setPartidos(int partidos) {
        Partidos = partidos;
    }
    public int getGoles() {
        return Goles;
    }
    public void setGoles(int goles) {
        Goles = goles;
    }

    // Calculamos el bono
    public double getBono() {
        double bono=(super.getSalario()*0.15) + (Partidos * 50) + (Goles * 5); 
        return bono;
    }

     // Sacamos el total
     public double getTotal(){
        double total= super.getSalario() + getBono();
        return total;
    }

    // Metodo t0String
    @Override
    public String toString() {
        return "JugadorActivo= "+ super.getNombre() +  "Sexo = " + super.getSexo()+"[Partidos=" + Partidos + ", Goles=" + Goles +  "Salario ="+ super.getSalario()+ "Bono= " + getBono() + "Total = "+ Total +"]";
    }
    
    
    
}
