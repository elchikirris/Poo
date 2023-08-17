//Calcular Area de un circulo 
//17 de agosto del 2023
//Edgar Israel Nieves Bautista
import java.util.Scanner;

public class _p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\n Calcular el area de un circulo \n");
        System.out.print("Dame el radio =" );
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El circulo con un radio de= " + radio + " tiene un area de= " + area );

    }
    
}
