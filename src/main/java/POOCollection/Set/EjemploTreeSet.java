package POOCollection.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        // expresion lambda
        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cuatro");
        System.out.println("TreeSet String: "+ts);

        Set<Integer> tsNumerico = new TreeSet<>(Comparator.reverseOrder());

        tsNumerico.add(1);
        tsNumerico.add(2);
        tsNumerico.add(3);
        tsNumerico.add(45);
        tsNumerico.add(6);
        System.out.println("TreeSet Numerico: "+tsNumerico);


    }
}
