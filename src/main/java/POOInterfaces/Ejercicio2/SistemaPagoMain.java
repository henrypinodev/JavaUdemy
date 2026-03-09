package POOInterfaces.Ejercicio2;

public class SistemaPagoMain {

    public static void main(String[] args) {


        IPago[] pagos = new Pago[5];

        pagos[0] = new TarjetaCredito(6000,"66666444","Celedonio Aldunate");
        pagos[1] = new TarjetaCredito(1000,"123123123", "Marcela");
        pagos[2] = new Paypal(60200,"correo@correo.cl");
        pagos[3] = new Paypal(4000, "cledonio@sdasd.cl");
        pagos[4] = new TransferenciaBancaria(6000,"Banco de Chile");

        for (IPago pago : pagos){

            System.out.println("Monto: "+ pago.getMonto());
            System.out.println("Comisión: "+ pago.calcularComision());
            System.out.println(pago.procesarPago());

            if (pago instanceof IPagoOnline){
                System.out.println("Email: "+ ((IPagoOnline) pago).getEmail());

            }
            if (pago instanceof ITarjeta){
                System.out.println("Titular: "+ ((ITarjeta) pago).getTitular());
            }



        }


    }
}
