package POOInterfaces.Ejercicio2;

public class TarjetaCredito extends Pago implements ITarjeta {

    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(double monto, String numeroTarjeta, String titular) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public double calcularComision() {
        return monto*0.03;
    }

    @Override
    public String procesarPago() {
        return "El pago ha sido procesado";
    }

    @Override
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    @Override
    public String getTitular() {
        return titular;
    }
}
