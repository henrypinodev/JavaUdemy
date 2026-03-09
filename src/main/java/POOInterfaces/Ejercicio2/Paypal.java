package POOInterfaces.Ejercicio2;

public class Paypal extends PagoOnline {


    public Paypal(double monto, String email) {
        super(monto, email);
    }

    @Override
    public double calcularComision() {
        return monto*0.05;
    }

    @Override
    public String procesarPago() {
        return "Pago procesado a través de Paypal exitoso !";
    }
}
