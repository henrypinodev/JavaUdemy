package POOAbstractas.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {


        Empleado[] emple = new Empleado[3];
        Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Juan","169301549",650.000d,150.000d);
        Empleado empleadoPorHoras = new EmpleadoPorHoras("Pedro","6893454",125.000d,15,9.000d);
        Empleado empleadoFreelance = new EmpleadoFreelance("Maricela","78445896",900.000d,2,600.000d);
        emple[0] = empleadoTiempoCompleto;
        emple[1] = empleadoPorHoras;
        emple[2] = empleadoFreelance;

        for (Empleado emp : emple){
            System.out.println(emp.getResumen());
        }


    }
}
