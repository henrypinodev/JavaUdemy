package POOHerencia;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();

        alumno.setNombre("Julio");
        alumno.setApellido("Perez");

        profesor.setNombre("Profesor Mauricio");
        profesor.setApellido("poblete");
        profesor.setAsignatura("Matematica");

        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.0);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();

        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("matuarna");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(16);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotasIdiomas(7.0);
        alumnoInternacional.setNotaCastellano(4.7);
        alumnoInternacional.setNotaHistoria(5.1);
        alumnoInternacional.setNotaMatematica(5.8);




        System.out.println("Nombre alumno: "+alumno.getNombre()+"\nApellido: "+alumno.getApellido()+"\n");
        System.out.println("Nombre Profesor: "+profesor.getNombre()+"\nApellido profesor: "+profesor.getApellido()+"\nAsignatura docente: "+profesor.getAsignatura());
        System.out.println("Alumno internacional toString: "+ alumnoInternacional.toString());

        Class claseAlumnoInternacional = alumnoInternacional.getClass();

        while (claseAlumnoInternacional.getSuperclass()!= null){
            String hija = claseAlumnoInternacional.getName();
            String padre = claseAlumnoInternacional.getSuperclass().getName();
            System.out.println(hija+" es una clase hija de la clase padre "+ padre);
            claseAlumnoInternacional = claseAlumnoInternacional.getSuperclass();
        }




    }
}
