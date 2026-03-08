package POOInterfaces.Ejercicio1;

public class Iphone extends Electronico {

    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante) {
        super(precio, fabricante);
    }


    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
