package POOInterfaces.Ejercicio3;

public class EmpleadoTiempoCompleto  extends Empleado implements IEmpleado{


    public EmpleadoTiempoCompleto(int salarioBase, String nombre) {
        super(salarioBase, nombre);
    }


    @Override
    public double calcularSueldo() {
        return getSalarioBase()*0.20;
    }
}
