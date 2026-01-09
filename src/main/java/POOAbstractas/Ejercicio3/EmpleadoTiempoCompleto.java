package POOAbstractas.Ejercicio3;

public class EmpleadoTiempoCompleto extends Empleado {

    private double bonoMensual;

    public EmpleadoTiempoCompleto(String nombre, String rut, double sueldoBase, double bonoMensual) {
        super(nombre, rut, sueldoBase);
        this.bonoMensual = bonoMensual;

    }

    public double getBonoMensual() {
        return bonoMensual;
    }

    @Override
    public double calcularSueldo() {
        double sueldoFinal = sueldoBase;
        return sueldoFinal = sueldoBase+bonoMensual;
    }

    @Override
    public String getTipoEmpleado() {
        return ":  "+getClass().getSimpleName();
    }
}
