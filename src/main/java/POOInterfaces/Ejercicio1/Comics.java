package POOInterfaces.Ejercicio1;

public class Comics extends Libro implements IProducto {

    private String personaje;


    public Comics(int precio) {
        super(precio);
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
