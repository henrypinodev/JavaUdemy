package POOAbstractas.Ejercicio2;

public abstract class Vehiculo {

    protected String marca, modelo;
    protected int velocidadMax, capacidadPasajeros;

    public Vehiculo(String marca, String modelo, int velocidadMax, int capacidadPasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public abstract String encender();
    public abstract String acelerar();
    public abstract String frenar();

    public String descripcion(){

        return "Marca: "+ marca + " Modelo: "+ modelo+ " Velocidad maxima: "+ velocidadMax+ " Capacidad Maxima de Pasajeros: " + capacidadPasajeros;
    }


}
