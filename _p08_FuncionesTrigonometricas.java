//Callcular los valores trigonometricas
//Edgar Israel Nieves Bautista
// 22 de agosto de 2023

import java.util.Scanner;

public class _p08_FuncionesTrigonometricas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un angulo en Grados: ");
        double angulog = new Scanner(System.in).nextDouble();
        double angulor = Math.toRadians(angulog);

        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);

        System.out.println(String.format("El ángulo es: %.2f grados, Seno: %.2f, Coseno: %.2f, Tangente: %.2f", angulor, sen, cos, tan));

        

    }
}
