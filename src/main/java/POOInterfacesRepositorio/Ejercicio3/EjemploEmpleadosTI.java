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

        for (Desarrollador d : developers.getEmpleados()){
            System.out.println(d.getNombre());
            System.out.println(d.getLenguaje());
        }
        for (SoporteTI s : soporteTI.getEmpleados()){
            System.out.print(s.getNombre());
            System.out.println(" Soporte Nivel: "+s.getNivel());
        }

        System.out.println(developers.cantidad());

        developers.mostrarNombres();


    }
}
