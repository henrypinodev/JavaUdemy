package POOInterfaces.Ejercicio4;

public class Bus extends Vehiculo implements ITransportePasajeros {

    private int capacidadPasajeros;
    private String empresa;


    public Bus(int precioBase, int capacidadPasjeros, String empresa) {
        super(precioBase);
        this.capacidadPasajeros = capacidadPasjeros;
        this.empresa = empresa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public String getEmpresa() {
        return empresa;
    }


    @Override
    public double obtenerPrecioBase() {
        return precioBase;
    }

    @Override
    public double precioFinal() {
        return precioBase*0.19;
    }


    @Override
    public int capacidadPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public String nombreEmpresa() {
        return empresa;
    }
}
