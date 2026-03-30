package POOInterfaces.Ejercicio4;

public class Auto extends Motorizado {

    private String marca, modelo;


    public Auto(String tipoMotor, int precioBase, String marca, String modelo) {
        super(tipoMotor, precioBase);
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String obtenertipoMotor() {
        return "El tipo de motor es "+ marca+ ", "+modelo+ " Combustión "+ tipoMotor;
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
