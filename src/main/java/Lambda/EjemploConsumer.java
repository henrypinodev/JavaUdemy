package Lambda;

import Lambda.model.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));

        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> biconsumer = (nombre, edad) -> System.out.println(nombre + "tiene "+ edad+ " años");

        biconsumer.accept("jose", 30);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("joaquin");

        List<String> nombres = Arrays.asList("jose", "pepe","marcelo");
        nombres.forEach(consumidor2);

        Usuario user = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(user,"Andres");

        Supplier<String> proveedor = () -> {
           return ("hola mundo");
        };

        System.out.println(proveedor.get());

    }
}
