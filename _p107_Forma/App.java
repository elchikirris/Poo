package _p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Forma f1 = new Forma("Azul"); NO SE PUEDE CREAR CLASES DE UNA CLASE ABSTRACTA
        // System.out.println(f1);
        Circulo circulo = new Circulo("Rojo",10.3 );
        System.out.println(circulo);
        System.out.println("Area circulo = " + circulo.getArea());

        Triangulo triangulo= new Triangulo("Verde", 10, 20);
        System.out.println(triangulo);
        System.out.println("Area triangulo= " + triangulo.getArea());


        // Creamos un arreglo 
        ArrayList<Forma> Forma= new ArrayList<>();
        Forma.add(circulo);  
        Forma.add(triangulo);  
        Forma.add(new Circulo("Rosa", 33.45));
        // Falta hacerlo
        // for (Forma forma : formas) {
        //     System.out.println(forma);
        // }
    }
}
