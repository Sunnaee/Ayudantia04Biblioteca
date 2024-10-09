public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private int cantidadDisponible;
    private boolean disponible;

    public Libro(String titulo,String autor,String genero,String isbn,int cantidadDisponible, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getCantidadDisponible(){
        return cantidadDisponible;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setCantidadDisponible(int cantidadDisponible){
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void prestar(){
        setCantidadDisponible(this.cantidadDisponible-1);
        if (this.cantidadDisponible == 0) {
            setDisponible(false);
        }
    }

    public void devolver(){
        setCantidadDisponible(this.cantidadDisponible+1);
        setDisponible(true);
    }

    public void mostrarInfo(){
        if (this.disponible) {
            System.out.println("Título: " + this.titulo + " | Autor: " + this.autor + " | Género: " + this.genero + " | ISBN: " + this.isbn + " | Copias disponibles: " + this.cantidadDisponible + " | Disponibilidad: Libro disponible.");
        }
        System.out.println("Título: " + this.titulo + " | Autor: " + this.autor + " | Género: " + this.genero + " | ISBN: " + this.isbn + " | Copias disponibles: " + this.cantidadDisponible + " | Disponibilidad: No se encuentra disponible.");
    }

}
