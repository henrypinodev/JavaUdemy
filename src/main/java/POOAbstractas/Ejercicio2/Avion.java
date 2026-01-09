package POOAbstractas.Ejercicio2;

public class Avion extends VehiculoAereo{

    protected int numeroMotores;

    public Avion(String marca, String modelo, int velocidadMax, int capacidadPasajeros, int altitudMaxima ,int numeroMotores) {
        super(marca, modelo, velocidadMax, capacidadPasajeros, altitudMaxima);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    @Override
    public String encender() {
        return "Encendiendo avion: "+marca+ "a una altitud de: "+ altitudMaxima;
    }

    @Override
    public String acelerar() {
        return "Acelerando avion: "+ modelo+ " con numero de motores: "+numeroMotores;
    }

    @Override
    public String frenar() {
        return "Frenando con pasajeros: " +capacidadPasajeros;
    }
}
