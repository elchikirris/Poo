// Hacer un convertidor de temperaturas
// Edgar Israel Nieves Bautista
// 28 de agosto del 2023

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char op;
        float tem,res;
        Scanner obj=new Scanner (System.in);
        System.out.println("Convierte de centigrados a farenheit y viceversa ");
        System.out.println("[F] arenheit a Centigrados");
        System.out.println("[C] entigrados a farenheit");
        System.out.println("Elije una opcion= ");

        op = Character.toUpperCase( obj.next().charAt(0));

        if (op == 'F') {
            System.out.println("Dame la temperatura en Farenheit=  ");
            tem= obj.nextFloat();
            res= (tem-32) *  5/9;
            System.out.printf("%f grados Farenheit equivale a %f grados centigrados",tem,res);
        }
        else if (op=='C'){
            System.out.println("Dame la temperatura en Centigrados");
            tem= obj.nextFloat();
            res= (tem*9/5) + 32;
            System.out.printf("%f grados centigrados equivale a %f grados farenheit ",tem,res);
        }
        else
            System.out.printf("opcion invalida");

        
    }
}
