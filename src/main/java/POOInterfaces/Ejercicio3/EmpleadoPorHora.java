package POOInterfaces.Ejercicio3;

public class EmpleadoPorHora extends Empleado implements IEmpleado {

    private int horasTrabajadas;
    private int valorHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, int valorHora) {
        super(0, nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }


    @Override
    public double calcularSueldo() {
        return horasTrabajadas*valorHora;
    }
}
