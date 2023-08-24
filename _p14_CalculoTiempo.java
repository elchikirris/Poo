//Hacer un programa que al darle una cantidad de horas te calcule los dias minutos y segundos
//Edgar Israel Nieves Bautista
//23 de agosto del 2023

import java.util.Scanner;

public class _p14_CalculoTiempo {

    public static void main(String[] args) {
        int horas,dias,minutos,segundos;

        Scanner obj=new Scanner(System.in);
        System.out.print("Dame las horas que quieras convertir= "); horas  = obj.nextInt();

        dias=horas/24;
        minutos=horas * 60;
        segundos= minutos * 60;

        System.out.println(String.format("Las horas que ingresaste son= %d en dias, %d en minuros, %d segundos", dias,minutos,segundos));

    }
}
