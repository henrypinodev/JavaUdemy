package POOInterfaces.Ejercicio4;

public class Moto extends Motorizado {

    private String cilindrada;


    public Moto(String tipoMotor, int precioBase, String cilindrada) {
        super(tipoMotor, precioBase);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String obtenertipoMotor() {
        return "El tipo de motor es"+ tipoMotor+ "de una cilindrada de: "+cilindrada ;
    }

    @Override
    public double obtenerPrecioBase() {
        return precioBase;
    }

    @Override
    public double precioFinal() {
        return precioBase*0.22;
    }
}
