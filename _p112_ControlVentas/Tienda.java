package _p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
// Constructor 
    public Tienda() {
        Clientes= new ArrayList<>();
    }

    public Tienda(String nombre, String propietario, String domicilio) {
        this();
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        Clientes = clientes;
    }
    public void setCliente(Cliente cliente1) {
        this.Clientes.add(cliente1);
    }

    // Ponemos el total de ventas con el get total
        
    public double getTotal() {
        double totalVentas = 0;
        for (Cliente cliente : Clientes) {
            totalVentas += cliente.getTotalVentas();
        }
        return totalVentas;
    }


    public void reporte() {
        System.out.println("Reporte de la tienda: " + Nombre);
        System.out.println("Propietario: " + Propietario);
        System.out.println("Domicilio: " + Domicilio);
        System.out.println("Total de ventas de la tienda: $" + getTotal());
        System.out.println("Clientes:");
        for (Cliente cliente : Clientes) {
            System.out.println( "\t>>" + cliente.toString());
        }
        System.out.println("Reporte de ventas de los clientes :");
        for (Cliente cliente : Clientes) {
            System.out.println("> Cliente : " + cliente.getNombre());
            System.out.println("\t>> " + cliente.getVentas());
        }
    }
    
    
// Metodo ToString 

  @Override
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio
                + " \t>>clientes=" + Clientes.toString() + "]";
    }
}