package _p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Trabajo trabajo= new Trabajo();
        trabajo.setId(1);
        trabajo.setRol("Chofers");
        trabajo.setSalario(2000);
        persona1.setTrabajo(trabajo);
        persona1.setNombre("Julia Urina");
        System.out.println(persona1);
        Persona persona2 = new Persona("Jose Perez",new Trabajo(2,"Cocinero",2500));
        System.out.println(persona2);

        Persona persona3 = new Persona("FrankMaster24",new Trabajo(3, "Softawe", 300));
        System.out.println(persona3);
    }
}
