package _p103_ClienteFactura;

public class App {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Factura Factura = new Factura();
        cliente1.setNombre("FIFA-0010");
        cliente1.setId("Jugador 10");
        cliente1.setDescuento(0);
        Factura.setId(1);
        Factura.setMonto(3500);
        Factura.setCliente(cliente1);
        System.out.println(Factura);
        System.out.println("Monto con descuento"+ Factura.getMontoConDescuento());

        Factura factura2 = new Factura(2,new Cliente("LIGAMX-0012","Gillermo Ochoa", 10), 5000);
        System.out.println("Factura Id "+ Factura.getId());
        System.out.println("Cliente Id "+ factura2.getCliente().getId());
        System.out.println("Cliente Nombre"+ factura2.getCliente().getNombre());
        System.out.println("Cliente Descuento "+ factura2.getCliente().getDescuento()/100.0 + "%");
        System.out.println("Factura Monto= "+ factura2.getMonto());
        System.out.println("Monto con Descuento= "+ factura2.getMontoConDescuento());

    }
}
