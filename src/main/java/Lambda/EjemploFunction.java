package Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {


        Function<String, String> f1 = param -> "hola que tal" + param;
        String resultado = f1.apply("andres");

        System.out.println(resultado);

        Function<String, String> f2 = param -> param.toUpperCase();
        System.out.println(f2.apply("Andres"));

        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f3.apply("jorge","rodriguez"));

        BiFunction<String, String, Integer> f4 = (a,b) -> a.compareTo(b);
        System.out.println(f4.apply("Fernandes","Roberto"));

        BiFunction<String, String, String> f5 = (a,b) -> a.concat(b).toUpperCase();
        System.out.println(f5.apply("Fernandes","Roberto"));
    }
}
