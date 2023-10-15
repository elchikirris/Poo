package _p103_ClienteFactura;

public class Factura {
    private int Id;
    private Cliente cliente;
    private double Monto;
    public Factura() {
    }
    public Factura(int id, Cliente cliente, double monto) {
        Id = id;
        this.cliente = cliente;
        Monto = monto;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getMonto() {
        return Monto;
    }
    public void setMonto(double monto) {
        Monto = monto;
    }
    public double getMontoConDescuento(){
        return Monto - (Monto* cliente.getDescuento()/100.0);
    }
    @Override
    public String toString() {
        return "Factura [Id=" + Id + ", cliente=" + cliente + ", Monto=" + Monto + "]";
    }
}
