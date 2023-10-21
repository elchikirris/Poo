package _p112_ControlVentas;

public abstract class Venta {
    private String Articulo;
    private int Cantidad;
    private double Precio;
    
    public Venta(String articulo, int cantidad, double precio) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        
    }
    // generamos los getters and setters

    public String getArticulo() {
        return Articulo;
    }
    public void setArticulo(String articulo) {
        Articulo = articulo;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
   

    // El metodo abstracto para eredarlo a las otras ventas creeeooooo

    public abstract double getTotalVenta();
    // Generamos el metodo to string 
    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + 
                 "]";
    }
    
    
    


}
