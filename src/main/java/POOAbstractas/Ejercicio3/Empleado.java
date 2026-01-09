package POOAbstractas.Ejercicio3;

public abstract class Empleado {

    protected String nombre, rut;
    protected  double sueldoBase;

    public Empleado(String nombre, String rut, double sueldoBase) {
        this.nombre = nombre;
        this.rut = rut;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldo ();
    public abstract String getTipoEmpleado();

    public String getResumen(){
        return nombre + " | "+ getTipoEmpleado()+ " sueldo: "+ calcularSueldo();
    }


}


