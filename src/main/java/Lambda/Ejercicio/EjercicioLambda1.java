package Lambda.Ejercicio;

import java.util.function.Function;

public class EjercicioLambda1 {
    public static void main(String[] args) {


        Function<String, String> nombre = texto -> texto.replaceAll("[0-9,.]", "").toUpperCase();

        System.out.println(nombre.apply("Jor43ge,r"));
    }
}
