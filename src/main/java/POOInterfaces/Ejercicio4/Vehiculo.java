package POOInterfaces.Ejercicio4;

public abstract class Vehiculo implements IVehiculo {

    public int precioBase;

    public Vehiculo(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getPrecioBase() {
        return precioBase;
    }

}
