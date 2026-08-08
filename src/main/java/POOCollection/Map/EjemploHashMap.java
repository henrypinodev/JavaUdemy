package POOCollection.Map;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "John");
        persona.put("Apellido","doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad","30");

        System.out.println("persona: "+ persona);

        String nombre = persona.get("nombre");
        System.out.println(nombre);

        String valor=  persona.remove("email");
        System.out.println("Se acaba de borrar el email ->"+ valor);
        System.out.println(persona);
        persona.get("email");

        boolean b = persona.containsKey("email");
        System.out.println(b);

        Collection<String> valores = persona.values();
        for(String v: valores){

            System.out.println("values: "+v);
        }

        Set<String> llaves = persona.keySet();
        for (String l : llaves){
            System.out.println("keys "+l);
        }

        for (Map.Entry<String,String> a : persona.entrySet()){
            System.out.println("Key && Value: "+a);
        }

        persona.forEach((llave, valore) ->{
            System.out.println("FOREACH LAMBDA");
            System.out.println(llave+ valore);
        });


        System.out.println("Persona.size() -> "+persona.size());
        System.out.println("!Persona.isEmpty() -> "+!persona.isEmpty());

        boolean b3 = persona.replace("nombre","John","Marcelo");
        System.out.println("Cambió el valor solicitado por persona.replace(): "+b3);
        System.out.println(persona.get("nombre"));





    }
}
