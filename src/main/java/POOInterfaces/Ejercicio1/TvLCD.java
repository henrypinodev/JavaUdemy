package POOInterfaces.Ejercicio1;

public class TvLCD extends Electronico {

    private int pulgada;

    public TvLCD(int precio, String fabricante) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
