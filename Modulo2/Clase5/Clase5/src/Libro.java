public class Libro {
    String titulo;
    String autor;
    int paginas;
//el constructor vacio tiene el mismo nombre de la clase

    public Libro() {
    }

    String descripcion() {
        return titulo + " de " + autor + " (" + paginas + " paginas)";
    }
}