package POOInterfaces.Ejercicio2;

public abstract class PagoOnline extends Pago implements IPagoOnline   {

    protected String email;

    public PagoOnline(double monto, String email) {
        super(monto);
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
