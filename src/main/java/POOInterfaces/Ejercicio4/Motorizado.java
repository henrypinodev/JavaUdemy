package POOInterfaces.Ejercicio4;

public abstract class Motorizado extends Vehiculo implements IMotorizado {

    public String tipoMotor;

    public Motorizado(String tipoMotor, int precioBase) {
        super(precioBase);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }



}
