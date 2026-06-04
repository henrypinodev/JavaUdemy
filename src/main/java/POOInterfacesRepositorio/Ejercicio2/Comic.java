package POOInterfacesRepositorio.Ejercicio2;

public class Comic extends Libro {

    private String ilustrador, universo;


    public Comic(String titulo, String autor, String ilustrador, String universo) {
        super(titulo, autor);
        this.ilustrador = ilustrador;
        this.universo = universo;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public String getUniverso() {
        return universo;
    }
}
