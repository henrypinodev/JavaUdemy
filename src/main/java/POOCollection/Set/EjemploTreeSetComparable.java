package POOCollection.Set;

import POOCollection.Set.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        //Set<Alumno> alumno = new TreeSet<>((a,b) -> b.getNombre().compareTo(a.getNombre()));
        // Aplicando interfaz Comparador comparing y reversed.
        Set<Alumno> alumno = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed());
        alumno.add(new Alumno("Marcelo",4));
        alumno.add(new Alumno("Tulio",1));
        alumno.add(new Alumno("Jano", 5));
        alumno.add(new Alumno("Ximena",3));
        alumno.add(new Alumno("Johan",9));
        alumno.add(new Alumno("Mercedes", 6));

        System.out.println(alumno);
        // AL SER TREESET, OMITO LOS CAMPOS IGUALES, ES DECIR SOLO IMPRIME 1 POR CADA VALOR ÚNICO POR LAS CARACTERISTICAS DE TREESET


    }
}
