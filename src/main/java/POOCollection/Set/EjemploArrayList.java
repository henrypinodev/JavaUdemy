package POOCollection.Set;

import POOCollection.Set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EjemploArrayList {
    public static void main(String[] args) {


        List<Alumno> alumno = new ArrayList<>();

        System.out.println("Alumno:"+ alumno+ ".size(): " + alumno.size());
        System.out.println("alumno.isEmpty()"+ alumno.isEmpty());
        alumno.add(new Alumno("Marcelo",4));
        alumno.add(new Alumno("Tulio",1));
        alumno.add(new Alumno("Jano", 5));
        alumno.add(2, new Alumno("Ximena",3));
        alumno.add(new Alumno("Johan",9));
        alumno.set(3, new Alumno("Mercedes", 6));

        System.out.println("Alumno: "+ alumno + " .size(): "+alumno.size());
        System.out.println("alumno.isEmpty()"+ alumno.isEmpty());

        alumno.remove(new Alumno("Jano",5));
        System.out.println(alumno);

        boolean b = alumno.contains(new Alumno("Jano",5));
        System.out.println(b);

        Object a[] = alumno.toArray();
        for (int i = 0; i< a.length; i++){
            System.out.println("desde el arreglo a[i]= "+a[i]);
        }


        
    }


}
