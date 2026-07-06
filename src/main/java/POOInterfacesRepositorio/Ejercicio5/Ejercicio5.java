package POOInterfacesRepositorio.Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {

        Curso<Estudiante> matematica = new Curso<>();
        Curso<Estudiante> historia = new Curso<>();


        matematica.agregarParticipantes(new Estudiante("Marcelo","Geografia", 23));
        historia.agregarParticipantes(new Estudiante("Jorge", "Informatica", 24));


        matematica.obtenerParticipantes();
        historia.obtenerParticipantes();

    }
}
