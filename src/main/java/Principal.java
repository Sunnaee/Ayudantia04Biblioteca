public class Principal {
    public static void main(String[] args) {
        System.out.println("\nCrear un objeto de la clase Biblioteca.");
        Libro libro1 = new Libro("Titulo1","Autor1","Genero1","123456789",5,true);
        System.out.println("\nCrear varios objetos de la clase Libro y agregarlos a la biblioteca.");
        Libro libro2 = new Libro("Titulo2","Autor2","Genero2","987654321",1,true);
        Libro libro3 = new Libro("Titulo3","Autor3","Genero3","000000000",7,true);
        Libro libro4 = new Libro("Titulo3","Autor2","Genero4","000012345",4,true);
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca1");
        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        biblioteca1.agregarLibro(libro3);
        biblioteca1.agregarLibro(libro4);
        biblioteca1.agregarLibro("Titulo4","Autor4","Genero5","123456789",3,true); //No se podrá agregar ya que tiene un isbn existente.
        System.out.println("\nMostrar la lista de libros disponibles.");
        biblioteca1.mostrarLibrosDisponibles();
        System.out.println("\nPrestar un libro y volver a mostrar la lista de libros disponibles.");
        biblioteca1.prestarLibro("Titulo2");
        biblioteca1.mostrarLibrosDisponibles();
        System.out.println("\nDevolver un libro y mostrar nuevamente la lista de libros disponibles.");
        biblioteca1.devolverLibro("Titulo2");
        biblioteca1.mostrarLibrosDisponibles();
        System.out.println("\nBuscar un libro por su título.");
        biblioteca1.buscarLibroPorTitulo("Titulo3");
        System.out.println("\nBuscar libros de un autor específico.");
        biblioteca1.prestarLibro("Titulo2"); //Para que el número de copias se vuelva 0, se vea que la disponibilidad cambia a false, y se pueda eliminar en la siguiente prueba.
        biblioteca1.buscarLibroPorAutor("Autor2");
        System.out.println("\nEliminar un libro de la biblioteca y mostrar la lista actualizada de libros.");
        biblioteca1.eliminarLibro("Título2");
        biblioteca1.mostrarLibrosDisponibles();
    }
}
