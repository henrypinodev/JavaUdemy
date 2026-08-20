package POOCollection.Map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new TreeMap<>();

        persona.put("nombre", "John");
        persona.put("Apellido","doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad",30);


        Map<String, String> direccion = new TreeMap<>();

        direccion.put("PAIS","USA");
        direccion.put("ESTADO","CALIFORNIA");
        direccion.put("CIUDAD","SANTA BARBARA");
        direccion.put("CALLE","ONE STREET");
        direccion.put("NUMERO","120");

        persona.put("direccion",direccion);

        System.out.println("Persona => "+persona);


        





    }
}
