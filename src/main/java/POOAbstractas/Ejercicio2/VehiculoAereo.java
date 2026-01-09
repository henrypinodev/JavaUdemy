package POOAbstractas.Ejercicio2;

public abstract class VehiculoAereo extends Vehiculo {

    protected int altitudMaxima;

    public VehiculoAereo(String marca, String modelo, int velocidadMax, int capacidadPasajeros, int altitudMaxima) {
        super(marca, modelo, velocidadMax, capacidadPasajeros);
        this.altitudMaxima = altitudMaxima;

    }


    public int getAltitudMaxima() {
        return altitudMaxima;
    }


}
