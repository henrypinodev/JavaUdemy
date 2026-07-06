package POOInterfacesRepositorio.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Curso<T extends Estudiante> {

    private List<T> participantes;

    public Curso() {
        participantes = new ArrayList<>();
    }

    public void agregarParticipantes(T participante){
        this.participantes.add(participante);
    }

    public void obtenerParticipantes(){
        for (T p : participantes){
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Carrera: "+p.getCarrera());
            System.out.println("Edad: "+p.getEdad());
        }

    }




}
