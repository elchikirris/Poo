package _p113_SegundoExamenParcial ;

public class JugadorEntrenador extends Jugador{
    private int Subordinado;
    private int Proyectos;

    // Generamos el constructor 
    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinado,
            int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinado = subordinado;
        Proyectos = proyectos;
        
    }

    // Generamos los getters and setters
    public int getSubordinado() {
        return Subordinado;
    }

    public void setSubordinado(int subordinado) {
        Subordinado = subordinado;
    }

    public int getProyectos() {
        return Proyectos;
    }

    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }

    // Sacamos el Bono con la sobrecarga 
    @Override
    public double getBono() {
        double bono=(super.getSalario()*0.15) + (Proyectos * 100) + (Subordinado * 10); 
        return bono;
    }
    
    // Sacamos el total
    public double getTotal(){
        double total= super.getSalario() + getBono();
        return total;
    }

    // Implementamos el metodo to string con los datos del jugador 
    @Override
    public String toString() {
        return "JugadorEntrenador= "+ super.getNombre() + "Sexo = " + super.getSexo()+ "[Subordinado=" + Subordinado + ", Proyectos=" + Proyectos + "Salario ="+ super.getSalario()+ "Bono= " + getBono() + "Total = "+ Total +" ]";
    }

    
    
    
}
