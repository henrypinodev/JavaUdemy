package POOCollection.Set;
import POOCollection.Set.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {


        List<Alumno> alumno = new ArrayList<>();

        alumno.add(new Alumno("Marcelo",4));
        alumno.add(new Alumno("Tulio",1));
        alumno.add(new Alumno("Jano", 5));
        alumno.add(new Alumno("Ximena",3));
        alumno.add(new Alumno("Johan",9));
        alumno.add(new Alumno("Mercedes", 6));

        //Ordena según el ComparteTo de clase Alumno con sort
        //  -> Forma con Collections:  Collections.sort(alumno, (a, b)-> a.getNota().compareTo(b.getNota()));
        //-> Forma con Link.sort:  alumno.sort((a, b)-> a.getNota().compareTo(b.getNota()));
        // Utilizando interfaz Comparator.comparing y luego una expresión lamnbda.
        alumno.sort(Comparator.comparing((Alumno a)-> a.getNota()).reversed());

        System.out.println(alumno);

        
    }


}
