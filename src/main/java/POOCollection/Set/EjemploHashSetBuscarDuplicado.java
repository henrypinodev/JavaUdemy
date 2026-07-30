package POOCollection.Set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corbina", "pejerrey", "Lenguado", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for (String pez : peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento duplicado: "+ pez);
                unicos.size();
            }
        }
        System.out.println(unicos.size()+ " Elementos no duplicados: "+ unicos);


    }
}
