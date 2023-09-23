// Imprime el dia de la semana dependiendo el numero del 1 al 7
// Edgar Israel Nieves Bautista

import java.util.Scanner;

public class _p76_DiaSemana {
     public static int encontrarDia(int dia){
        switch (dia) {
            case 1 : System.out.println("Lunes");break;
            case 2 : System.out.println("Martes");break;
            case 3 : System.out.println("Miércoles");break;
            case 4 : System.out.println("Jueves");break;
            case 5 : System.out.println("Viernes");break;
            case 6 : System.out.println("Sábado");break;
            case 7 : System.out.println("Domingo");break;
            default : System.out.println("Día inválido, en que día vives !!!");break;
        }
        return dia;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un numero entre 1 y 7 imprime el dia de la semana\n");
        System.out.print("Dame el día con número? ");
        int dia = new Scanner(System.in).nextInt();

        encontrarDia(dia);

        System.out.println("\n\nProceso terminado ...");
    }
}
