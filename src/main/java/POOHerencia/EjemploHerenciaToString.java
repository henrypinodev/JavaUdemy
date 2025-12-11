package POOHerencia;


public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("Creando instancia Alumno");
        Alumno alumno = new Alumno("Julio", "perez", 16, "Instituto Nacional");

        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.0);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("asdasdasd@uss.cl");


        System.out.println("Creando instancia profesor");
        Profesor profesor = new Profesor("Mauricio", "Perez", 32, "Matematicas");
        profesor.setEmail("dogjhsiorghs@jifeas.cl");


        System.out.println("Creando instancia AlumnoInternacional");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Josh", "kaiser", 17, "Cambridge College", "Alemania");
        alumnoInternacional.setNotasIdiomas(7.0);
        alumnoInternacional.setNotaCastellano(4.7);
        alumnoInternacional.setNotaHistoria(5.1);
        alumnoInternacional.setNotaMatematica(5.8);
        alumnoInternacional.setEmail("gihgsiia@ujss.cl");

        System.out.println("Alumno: ");
        imprimir(alumno);
        System.out.println("Profesor: ");
        imprimir(profesor);

        imprimir(alumnoInternacional);




    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);

    }
}
