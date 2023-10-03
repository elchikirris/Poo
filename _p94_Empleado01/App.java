// Clase para manejar onjetos

package _p94_Empleado01;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.Nombre="Juan Perez";
        empleado.Edad=35;

        // System.out.println(empleado.Nombre); aqui imprimiriamos los objetos?
        // System.out.println(empleado.Edad);

        // Probando metodos, este es para imprimir todo los objetos que tenemos 
        Empleado empleado2;
        empleado2=new Empleado();
        empleado2.Nombre="Maria de Jesus";
        empleado2.Edad=23;
        System.out.println(empleado.toString());
        System.out.println(empleado2.toString());
    }
}
