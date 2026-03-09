package POOInterfaces.Ejercicio1;

import java.time.LocalDate;

public class Comics extends Libro implements IProducto {

    private String personaje;


    public Comics(int precio, String personaje, LocalDate fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio,fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;

    }


    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*0.30;
    }
}
