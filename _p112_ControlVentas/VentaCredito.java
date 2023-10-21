package _p112_ControlVentas;

public class VentaCredito extends Venta {
    private int Meses;
    private double Interes;

    // Creamos los constructores  
    public VentaCredito(String articulo, int cantidad, double precio) {
        super(articulo, cantidad, precio);
    }


    public VentaCredito(String articulo, int cantidad, double precio, int meses, double interes) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Interes = interes;
    }

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int meses) {
        Meses = meses;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double interes) {
        Interes = interes;
    }

    @Override
    public double getTotalVenta() {
        double Total = super.getPrecio() * super.getCantidad();
        Total += Meses *Interes;
        return Total;
    }

    @Override
    public String toString() {
        return "VentaCredito [Meses=" + Meses + ", Interes=" + Interes + "Total =" + getTotalVenta() + "]";
    }
    
    
    
    
}
