package POOCollection.Map;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();

        persona.put("nombre", "John");
        persona.put("Apellido","doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad",30);

        Map<String, String> direccion = new HashMap<>();

        direccion.put("PAIS","USA");
        direccion.put("ESTADO","CALIFORNIA");
        direccion.put("CIUDAD","SANTA BARBARA");
        direccion.put("CALLE","ONE STREET");
        direccion.put("NUMERO","120");

        persona.put("direccion",direccion);

        System.out.println("persona: "+ persona);

        String nombre = (String)persona.get("nombre");
        System.out.println(nombre);

        String valor=  (String)persona.remove("email");
        System.out.println("Se acaba de borrar el email ->"+ valor);
        System.out.println(persona);
        persona.get("email");

        boolean b = persona.containsKey("email");
        System.out.println(b);

        Collection<Object> valores = persona.values();
        for(Object v: valores){

            System.out.println("values: "+v);
        }

        Set<String> llaves = persona.keySet();
        for (Object l : llaves){
            if (l instanceof Map){

                String nom =  (String)persona.get("nombre");

                Map<String, String> direccioMap = (Map<String, String>) l;
                System.out.println("El pais de la persona: " + nom + direccioMap.get("pais"));
            }else{
                System.out.println("keys "+l);
            }

        }

        for (Map.Entry<String,Object> a : persona.entrySet()){
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



            Map<String, String>direccionPersona;
        direccionPersona = (Map<String, String>) persona.get("direccion");


        String pais = direccionPersona.get("PAIS");
        String estado = direccionPersona.get("ESTADO");
        String ciudad = direccionPersona.get("CIUDAD");
        String ciudad2 = direccionPersona.getOrDefault("ciudad","NO EXISTE CIUDAD 2");

        System.out.println("La persona: "+nombre+" es de: "+ pais+ "en el estado de: "+estado);

        





    }
}
