// Hacer un programa que te diga cuantos dolares ajustas con pesos
// Edgar Israel Nieves Bautista 
// 23 de agosto del 2023

import java.util.Scanner;

public class _p15_ConvertirDorlares {
    public static void main(String[] args) {

        float pesos,dolares,div;
        Scanner obj=new Scanner(System.in);
        System.out.print("Dame la cantidad de pesos que quieras convertir= "); pesos  = obj.nextInt();
        System.out.print("Dame el precio del dolar actual= "); dolares  = obj.nextInt();

        div= pesos/dolares;

        System.out.println(String.format("Con %.2f pesos ajustas %.2f dolares ",pesos,div));


    }
}
