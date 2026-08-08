package POOCollection.List;

import POOCollection.Set.modelo.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemplLinkedList {
    public static void main(String[] args) {


        LinkedList<Alumno> alumno = new LinkedList<>();

        System.out.println("Alumno:"+ alumno+ ".size(): " + alumno.size());
        System.out.println("alumno.isEmpty()"+ alumno.isEmpty());
        alumno.add(new Alumno("Marcelo",4));
        alumno.add(new Alumno("Tulio",1));
        alumno.add(new Alumno("Jano", 5));
        alumno.add(new Alumno("Ximena",3));
        alumno.add(new Alumno("Johan",9));
        alumno.add(new Alumno("Mercedes", 6));

        System.out.println("Alumno LinkedList: "+ alumno + " .size(): "+alumno.size());

        alumno.addFirst(new Alumno("Jose",3));
        alumno.addLast(new Alumno("Pedro",7));
        System.out.println("Alumno LinkedList: "+ alumno + " .size(): "+alumno.size());

        System.out.println("getFirst(): "+alumno.getFirst());
        System.out.println("getLast(): "+ alumno.getLast());

        System.out.println("Alumno.remove(): "+alumno.removeFirst());
        System.out.println("Alumno.remove(): "+alumno.removeLast());

        ListIterator<Alumno> li = alumno.listIterator();


        System.out.println("----ListIterator hasNext-----");
        while(li.hasNext()){
            Alumno a = li.next();
            System.out.println(a);
        }

        System.out.println("----List Iterator hasPrevious");
        while(li.hasPrevious()){
            Alumno a = li.previous();
            System.out.println(a);
        }
    }
}
