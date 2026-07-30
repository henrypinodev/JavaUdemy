package POOCollection.Set;

import POOCollection.Set.modelo.Alumno;

import java.util.*;


public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> alumno = new HashSet<>();
        //List<Alumno> alumno = new ArrayList<>();

        alumno.add(new Alumno("Marcelo",4));
        alumno.add(new Alumno("Tulio",1));
        alumno.add(new Alumno("Jano", 5));
        alumno.add(new Alumno("Ximena",3));
        alumno.add(new Alumno("Johan",9));
        alumno.add(new Alumno("Mercedes", 6));

        System.out.println(alumno);
        // AL SER TREESET, OMITO LOS CAMPOS IGUALES, ES DECIR SOLO IMPRIME 1 POR CADA VALOR ÚNICO POR LAS CARACTERISTICAS DE TREESET


        System.out.println("ITERACIÓN POR FOREACH");
        for (Alumno a: alumno){
            System.out.println(a.getNombre());
        }

        System.out.println("ITERANDO WHILE Y ITERATOR");
        Iterator<Alumno> it = alumno.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println("ITERANDO CON STREAM FOREACH");
        alumno.forEach(a -> System.out.println(a));

        /*System.out.println("ITERANDO CON FOR CON ARRAYLIST");
        for (int i = 0; i < alumno.size(); i++){
            Alumno a = alumno.get(i);
            System.out.println(a.getNombre());
        }*/

    }


}
