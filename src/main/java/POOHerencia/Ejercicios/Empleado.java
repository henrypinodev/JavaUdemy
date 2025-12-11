package POOHerencia.Ejercicios;

public class Empleado extends Persona{

    private Double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tremuneracion: " + remuneracion +
                "\templeadoId: " + empleadoId;
    }

    public void aumentarremuneracion(int porcentaje){
           if (porcentaje <1 ) {
               System.out.println("No puede aumentar remuneración a 0");

           }
          this.remuneracion = this.remuneracion + remuneracion * porcentaje/100;

    }
}
