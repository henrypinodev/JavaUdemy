package POOInterfaces.Ejercicio3;

public abstract class Empleado implements IEmpleado {

    private int salarioBase;
    private String nombre;


    public Empleado(int salarioBase, String nombre) {
        this.salarioBase = salarioBase;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }
}
