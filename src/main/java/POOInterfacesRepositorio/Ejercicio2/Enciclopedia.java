package POOInterfacesRepositorio.Ejercicio2;

public class Enciclopedia extends Libro {

    private String tema;
    private int volumen;


    public Enciclopedia(String titulo, String autor, String tema, int volumen) {
        super(titulo, autor);
        this.tema = tema;
        this.volumen = volumen;
    }

    public String getTema() {
        return tema;
    }

    public int getVolumen() {
        return volumen;
    }
}
