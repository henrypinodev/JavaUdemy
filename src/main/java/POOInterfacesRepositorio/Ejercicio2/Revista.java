package POOInterfacesRepositorio.Ejercicio2;

public class Revista extends Libro {

    private int numeroEdicion;
    private String categoria;


    public Revista(String titulo, String autor, int numeroEdicion, String categoria){
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
        this.categoria = categoria;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public String getCategoria() {
        return categoria;
    }
}
