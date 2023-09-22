// Calcular la temperatura dependiendo lo que el usuario indique
// Edgar Israel Neves Bautista
// 18 de septiembre del 2023
// Actividad 11

import java.util.Scanner;

public class _p66_ConversionTemperaturas {
    public static float Farenheit(float t){
        float r;
        r= (t * 9/5) + 32;
        return r;
    }
    public static float Celcius(float t ){
        float r;
        r = (t - 32) * 5/9;
        return r;  
    }
    

    public static void main(String[] args) {
        int op;
        float temp=0, res=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("[1] Farenheit\n[2] Celcius\nElige= "); op=obj.nextInt();

        switch(op){
            case 1:
                System.out.print("Convertir Celcius a Farenheit, Dame la temperatura=");temp= obj.nextFloat();
                res=Farenheit(temp);
                System.out.printf("la temperatura  %.2f en grados celcius equivale a %.2f grados Farenheit ", temp,res);
                break;
            case 2:
            System.out.print("Dame la temperatura ? "); temp = obj.nextFloat();
            res = Celcius(temp);
            System.out.printf("\n%.2f grados farenheit equivale a %.2f grandos celcius ..", temp, res);
            break;
        }
    }
}