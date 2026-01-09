package POOAbstractas.Ejercicio3;

public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;
    private double valorHora;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public EmpleadoPorHoras(String nombre, String rut, double sueldoBase, int horasTrabajadas, double valorHora) {
        super(nombre, rut, sueldoBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {

        return sueldoBase = horasTrabajadas*valorHora;
    }

    @Override
    public String getTipoEmpleado() {
        return ":  "+getClass().getSimpleName();
    }
}
