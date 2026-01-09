package POOAbstractas.Ejercicio2;

public abstract class VehiculoTerrestre extends Vehiculo {

    protected int ruedas;

    public VehiculoTerrestre(String marca, String modelo, int velocidadMax, int capacidadPasajeros, int ruedas) {
        super(marca, modelo, velocidadMax, capacidadPasajeros);
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

}
