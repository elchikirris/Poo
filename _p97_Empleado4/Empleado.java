package _p97_Empleado4;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Casado;


    public Empleado() {
        
    }
    public Empleado(String nombre, int edad,char sexo, boolean casado) {
        this.Nombre= nombre;
        this.Edad=edad;
        this.Casado=casado;
        this.Sexo=sexo;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public void setCasado(boolean casado) {
        Casado = casado;
    }
    public boolean getCasado() {
        return Casado;
    }
    @Override
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + (Sexo=='H'?"Hombre":"Mujer" )+ ", Casado=" + (Casado?"Jodido":"Libre") + "]";
    }

    
}
