package POOHerencia.Ejercicio3;

public class Vendedor extends Persona {

    private String numeroEmpleado, local;


    public Vendedor(String nombre, String apellido, String sexo, int rut, String numeroEmpleado, String local) {
        super(nombre, apellido, sexo, rut);
        this.numeroEmpleado = numeroEmpleado;
        this.local = local;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tnumeroEmpleado: " + numeroEmpleado +
                "\tlocal: " + local;
    }
}
