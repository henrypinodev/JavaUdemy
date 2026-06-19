package POOInterfacesRepositorio.Ejercicio3;

public class EjemploEmpleadosTI {

    public static void main(String[] args) {

        Registro<Desarrollador> developers = new Registro<>();
        Registro<SoporteTI> soporteTI = new Registro<>();


        soporteTI.agregarEmpleado(new SoporteTI("Rodrigo", 1));
        soporteTI.agregarEmpleado(new SoporteTI("Fernando",2 ));
        soporteTI.agregarEmpleado(new SoporteTI("Kaarin", 2));

        developers.agregarEmpleado(new Desarrollador("Henry","Java Spring boot"));
        developers.agregarEmpleado(new Desarrollador("Juan", "NodeJS, Ruby"));
        developers.agregarEmpleado(new Desarrollador("roxana", "Javascript Python"));

        for ();
    }
}
