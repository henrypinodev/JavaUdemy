package POOInterfaces.Ejercicio1;
import java.time.LocalDate;


public class Libro extends Producto implements ILibro {

    private LocalDate fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, LocalDate fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }



    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.95;
    }

    @Override
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }
}
