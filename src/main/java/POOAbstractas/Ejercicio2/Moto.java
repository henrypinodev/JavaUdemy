package POOAbstractas.Ejercicio2;

public class Moto extends VehiculoTerrestre {

    protected int cilindrada;

    public Moto(String marca, String modelo, int velocidadMax, int capacidadPasajeros, int ruedas, int cilindrada) {
        super(marca, modelo, velocidadMax, capacidadPasajeros, ruedas);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String encender() {
        return "Encendiendo: "+ marca+ " modelo: "+modelo + " con cilindrada: "+cilindrada;
    }

    @Override
    public String acelerar() {
        return "Acelerando: "+ marca+ " A una velocidad de: "+velocidadMax;
    }

    @Override
    public String frenar() {
        return "Frenando con una capacidad de pasajero de: "+capacidadPasajeros+ "con ruedas: "+ruedas;
    }
}
