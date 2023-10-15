package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();
        autor.setNombre("Baldor");
        autor.setCorreo("baldor@gmail.com");
        libro1.setIsbn("100010145");
        libro1.setNombre("Algebra para principiantes ");
        libro1.setPrecio(1500);
        libro1.setCantidad(30);
        libro1.setAutor(autor);
        System.out.println(libro1);

        Libro libro2 = new Libro("10232320", "Ecuaciones diferenciales", new Autor("El hijo de valdor","baldojr@gmail.com"), 2300, 100);
        System.out.println(libro2);

        // Imprimir parametros por separados
        System.out.println("Nombre del libro= "+ libro2.getNombre());
        System.out.println("Nombre de autor= "+ libro2.getAutor());
    }
}
