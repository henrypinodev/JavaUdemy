package POOInterfaces.Ejercicio1;

import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio) {
        super(precio);
    }



    @Override
    public double getPrecioVenta() {
        return 0;
    }

    @Override
    public Date getFechaPublicacion() {
        return null;
    }

    @Override
    public String getAutor() {
        return "";
    }

    @Override
    public String getTitulo() {
        return "";
    }

    @Override
    public String getEditorial() {
        return "";
    }
}
