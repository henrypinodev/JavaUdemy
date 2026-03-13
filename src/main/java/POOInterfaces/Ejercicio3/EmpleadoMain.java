package POOInterfaces.Ejercicio3;

public class EmpleadoMain {

    public static void main(String[] args) {

        IEmpleado[] empleados = new Empleado[3];

      empleados[0] = new EmpleadoTiempoCompleto(65000, "Marcelo");
      empleados[1] = new EmpleadoTiempoCompleto(800000, "Jorge");
      empleados[2] = new EmpleadoPorHora("Victoria", 45, 9000);

      for (IEmpleado e : empleados){
          Empleado emp = (Empleado) e;

          System.out.println("Nombre: "+emp.getNombre() + " Sueldo: "+  e.calcularSueldo()+ " Tipo de trabajador: "+ e.getClass().getSimpleName());


      }





    }


}
