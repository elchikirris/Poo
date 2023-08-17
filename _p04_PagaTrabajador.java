import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga,tasa,impuesto,pagabruta,paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.print("nombre de trabajador= "); nombre = obj.nextLine();
        System.out.print("Horas trabajadas= "); horas = obj.nextInt();
        System.out.print("Paga x hora    ="); paga = obj.nextInt();
        tasa = 0.03;

        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.println("\n Resumen de pagos \n");
        System.out.println(String.format("El trabajador %s, trabajó %d, a una paga de %.2f pesos la hora , con una tasa de impuesto de %.2f", nombre,horas,paga,tasa));
        System.out.println(String.format("paga bruta : %.2f", pagabruta ));
        System.out.println(String.format("impuesto   : %.2f", impuesto ));
        System.out.println(String.format("paganeta   : %.2f", paganeta));




    }
}
