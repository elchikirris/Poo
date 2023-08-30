// El usuario dara un dia de la semana y el programa dira si es lun,martes,mier....
// Edgar Israel Nieves Bautista
// 30 de agosto del 2023

import java.util.Scanner;

public class _p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un numero del 1 al 7 imprime el dia de la semana ");
        System.out.print("Dame el dia de la semana= ");
        int dia =new Scanner(System.in).nextInt();

        switch (dia) {
            case 1: System.out.println("lunes");break;
            case 2: System.out.println("martes ");break;
            case 3: System.out.println("Miercoles ");break;
            case 4: System.out.println("jueves ");break;
            case 5: System.out.println("viernes ");break;
            case 6: System.out.println("sabado ");break;
            case 7: System.out.println("Domingo ");break;
            default: System.out.println("Dia invalido, en que dia estas??? ");break;

        }
        System.out.print("Proceso Terminado...");
    }
    
}
