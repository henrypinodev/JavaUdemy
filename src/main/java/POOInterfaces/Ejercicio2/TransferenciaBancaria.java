package POOInterfaces.Ejercicio2;

public class TransferenciaBancaria extends Pago {

    private String banco;

    public TransferenciaBancaria(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public double calcularComision() {
        return monto*0.01;
    }

    @Override
    public String procesarPago() {
        return "Pago realizado con transferencia bancaria exitosa ! ";
    }
}
