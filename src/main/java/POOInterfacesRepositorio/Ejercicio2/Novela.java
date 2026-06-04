package POOInterfacesRepositorio.Ejercicio2;

public class Novela extends Libro {

    private String genero;
    private int paginas;


    public Novela(String titulo, String autor, String genero, int paginas) {
        super(titulo, autor);
        this.genero = genero;
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public int getPaginas() {
        return paginas;
    }


}
