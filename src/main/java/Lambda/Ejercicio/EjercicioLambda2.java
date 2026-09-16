package Lambda.Ejercicio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class EjercicioLambda2 {
    public static void main(String[] args) {
        Function<String, Map<String, Integer>> palabraMasRepetida = frase -> {
            frase = frase.replaceAll("[,.]", "").toLowerCase();
            String[] palabras = frase.split("\\s+");
            Map<String, Integer> contador = new HashMap<>();

            for (String palabra : palabras) {
                contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
            }

            String palabra = null;
            int max = 0;

            for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
                if (entrada.getValue() > max) {
                    palabra = entrada.getKey(); max = entrada.getValue();
                }
            }
            return Collections.singletonMap(palabra, max);
        };


            String frase = "Hola mundo, hola Java. Hola mundo.";
            Map<String, Integer> resultado = palabraMasRepetida.apply(frase);

        resultado.forEach((palabra, cantidad) -> System.out.println("Palabra: " + palabra + " | Cantidad: " + cantidad) );


        }
    }




