package POOAbstractas.Ejercicio3;

public class EmpleadoFreelance extends Empleado{

    private int proyectos;
    private double pagoPorProyecto;

    public EmpleadoFreelance(String nombre, String rut, double sueldoBase, int proyectos, double pagoPorProyecto) {
        super(nombre, rut, sueldoBase);
        this.proyectos = proyectos;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    public int getProyectos() {
        return proyectos;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase = proyectos*pagoPorProyecto;
    }

    @Override
    public String getTipoEmpleado() {
        return ":  "+getClass().getSimpleName();
    }
}
