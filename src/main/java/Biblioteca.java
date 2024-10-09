import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private String nombreBiblioteca;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombreBiblioteca){
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new ArrayList<>();
    }

    public boolean libroUnico(String isbn){
        for (Libro libro : this.libros){
            if (Objects.equals(libro.getIsbn(), isbn)){
                return false;
            }
        }
        return true;
    }

    public boolean agregarLibro(Libro libro){ //mediante ingresar el objeto libro.
        if (libroUnico(libro.getIsbn())){
            this.libros.add(libro);
            return true;
        }
        libro.devolver();
        return false;
    }

    public boolean agregarLibro(String titulo,String autor,String genero,String isbn,int cantidadDisponible,boolean disponible){ //mediante ingresar todos los parámetros.
        Libro libro = new Libro(titulo,autor,genero,isbn,cantidadDisponible,disponible);
        if (libroUnico(libro.getIsbn())){
            this.libros.add(libro);
            return true;
        }
        libro.devolver();
        return false;
    }

    public void mostrarLibrosDisponibles(){
        for (Libro libro : this.libros){
            if (libro.getDisponible()){
                libro.mostrarInfo();
            }
        }
    }

    public void buscarLibroPorTitulo(String titulo){
        for (Libro libro : this.libros){
            if(Objects.equals(libro.getTitulo(), titulo)){
                libro.mostrarInfo();
            }
        }
    }

    public void buscarLibroPorAutor(String autor){
        for (Libro libro : this.libros){
            if(Objects.equals(libro.getAutor(), autor)){
                libro.mostrarInfo();
            }
        }
    }

    public Libro buscarLibro(String titulo){ //para devolver el objeto libro en vez de imprimir la información como en los métodos anteriores.
        for (Libro libro : this.libros){
            if(Objects.equals(libro.getTitulo(), titulo)){
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String titulo){
        Libro libro = this.buscarLibro(titulo);
        if (libro != null && !libro.getDisponible()){ //getDisponible ya que este se vuelve false automáticamente cuando la cantidad disponible es 0.
            this.libros.remove(libro);
            return true;
        }
        return false;
    }

    public void prestarLibro(String titulo){
        for (Libro libro : this.libros){
            if(Objects.equals(libro.getTitulo(), titulo)){
                libro.prestar();
            }
        }
    }

    public void devolverLibro(String titulo){
        for (Libro libro : this.libros){
            if(Objects.equals(libro.getTitulo(), titulo)){
                libro.devolver();
            }
        }
    }

}