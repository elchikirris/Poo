//Verifica si un numero es positivo, negativo o cero>0
//Edgar Israel Nieves Bautista
// 28 de ago System.out.println("el numero es cero");sto del 2023

import java.util.Scanner;

public class _p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Determina si un numero es positivo, negativo o cero");

        System.out.print("Dame un numero entero =");
        int num = new Scanner(System.in).nextInt();

        if (num>0) System.out.println("Es positivo");
        if (num<0) System.out.println("El numero es Negativo");
        if (num == 0) System.out.println("el numero es cero");

    }
}
