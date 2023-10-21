package _p112_ControlVentas;

public class VentaContado extends Venta {
    private double Descuento;
    private String Regalo;
    // Generamos los constructores

    public VentaContado(String articulo, int cantidad, double precio, double total, double descuento, String regalo) {
        super(articulo, cantidad, precio, total);
        Descuento = descuento;
        Regalo = regalo;
    }
    // Getters and seters

    public double getDescuento() {
        return Descuento;
    }
    public void setDescuento(double descuento) {
        Descuento = descuento;
    }
    public String getRegalo() {
        return Regalo;
    }
    public void setRegalo(String regalo) {
        Regalo = regalo;
    }
    // Aqui estamos sobrecargando para aplicar el descuento. 
    @Override
    public double getTotalVenta() {
        double total= super.getPrecio() * super.getCantidad();
        total -= Descuento;
        return total;
    }

    @Override
    public String toString() {
        return "VentaContado [Descuento=" + Descuento + ", Regalo=" + Regalo + "Total= "+ getTotalVenta() + "]";
    }
    
    
    
}
