package POOInterfaces.Ejercicio2;

public abstract class Pago implements IPago {

    protected double monto;

    public Pago(double monto){
        this.monto = monto;
    }


    @Override
    public double getMonto() {
        return monto;
    }
}
