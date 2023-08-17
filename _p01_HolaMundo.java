//Manda un saludo a la pantalla 
//17 de agosto del 2023
//Edgar Israel Nieves Bautista
public class _p01_HolaMundo{
    public static void main(String[] args) {
        String amigo = "Medio metro ";
        String Hermano = "FrankMaster24";
        String mensaje = String.format("Tanto %s como %s desea aprender java", amigo, Hermano);


        System.out.println("Hola mundo");
        System.out.println("\nHola amigo" + amigo + "bienvenido a java");
        System.out.println("\nMi amigo" + amigo + "Mi hermano es "+ Hermano);
        System.out.println("\n"+mensaje);
    }
}