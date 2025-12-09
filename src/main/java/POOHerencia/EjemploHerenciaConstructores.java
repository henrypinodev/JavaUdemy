package POOHerencia;


import java.sql.SQLOutput;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos del tipo Persona");
        System.out.println("Nombre alumno: " + persona.getNombre() + "\nApellido: " + persona.getApellido() + "\n" + "\nEdad: " + persona.getEdad() + "\nEmail: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo datos del tipo Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Notas matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Notas Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Notas Castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo datos del tipo AlumnoIternacional");
                System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());
                System.out.println("Nota idioma: "+ ((AlumnoInternacional) persona).getNotasIdiomas());
            }

            System.out.println("----------PROMEDIO-----------");
            System.out.println("Promedio: "+ ((Alumno) persona).calcularPromedio());


        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo datos del tipo Profesor");
            System.out.println("Asignatura: "+((Profesor) persona).getAsignatura());
        }

        System.out.println("------------------ SOBRE ESCRITURA DE METODO PERSONA-------------------------");
        System.out.println(persona.saludar());
    }
}
