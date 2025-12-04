package POOHerencia;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("Creando instancia Alumno");
        Alumno alumno = new Alumno();
        System.out.println("Creando instancia profesor");
        Profesor profesor = new Profesor();

        alumno.setNombre("Julio");
        alumno.setApellido("Perez");

        profesor.setNombre("Profesor Mauricio");
        profesor.setApellido("poblete");
        profesor.setAsignatura("Matematica");

        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.0);
        alumno.setNotaMatematica(4.9);

        System.out.println("Creando instancia AlumnoInternacional");
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
        System.out.println("Nombre alumno Internacional: "+ alumnoInternacional.getNombre()+"\tApellido: "+alumnoInternacional.getApellido()+"\tPais: "+alumnoInternacional.getPais()+"\tNotas idiomas: "+alumnoInternacional.getNotasIdiomas());
        System.out.println("Nombre Profesor: "+profesor.getNombre()+"\nApellido profesor: "+profesor.getApellido()+"\nAsignatura docente: "+profesor.getAsignatura());
        System.out.println("Alumno internacional toString: "+ alumnoInternacional.toString());

        Class claseAlumnoInternacional = alumnoInternacional.getClass();

        /* Viendo las herencias de cada clase hasta la clase object */
        while (claseAlumnoInternacional.getSuperclass()!= null){
            String hija = claseAlumnoInternacional.getName();
            String padre = claseAlumnoInternacional.getSuperclass().getName();
            System.out.println(hija+" es una clase hija de la clase padre "+ padre);
            claseAlumnoInternacional = claseAlumnoInternacional.getSuperclass();
        }




    }
}
