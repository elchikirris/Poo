// Calcula la paga de un trabajador, las horas doble se pagan al doble
// Edgar Israel Nieves Bautista
// 28 de agosto del 2023

import java.util.Scanner;

public class _p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        int horas,extr;
        float paga,total;
        Scanner obj=new Scanner (System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calcula la paga de un trabajador, la hora extra se paga doble ");

        System.out.println("Horas trabajadas = "); horas = obj.nextInt();
        System.out.println("Paga x hora = "); paga = obj.nextFloat();

        if (horas > 40 ){
            extr = horas - 40;
            total= 40* paga + (2 * paga * extr);

        }else total = horas * paga;

        
        System.out.printf("El pago total es %f", total);

    }
}
