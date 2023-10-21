package _p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        Banco miBanco = new Banco("Banco del norte ", "Privada de las cumbres 12");
        System.out.print("\033[H\033[2J");System.out.flush();
        miBanco.reporte();
        // Creamos las cuentas
        miBanco.agregarClientes(new Cliente("Paco el capo"));
        miBanco.agregarClientes(new Cliente("Alex el guapo"));
        miBanco.agregarClientes(new Cliente("Isaac el triste"));
        miBanco.agregarClientes(new Cliente("Chino el chinito"));
        miBanco.reporte();

        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000, 500));
        miBanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500, 500));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000, 600));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 0.40));
        miBanco.reporte();

        miBanco.getClientes().get(0).getCuentas().get(0).retira(500);
        miBanco.getClientes().get(0).getCuentas().get(1).retira(100);
        miBanco.getClientes().get(1).getCuentas().get(1).deposita(100);
        miBanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        miBanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        miBanco.reporte();

        miBanco.CalcularInteres();
        miBanco.reporte();
    }
}
