package Lambda;

import Lambda.model.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;{
          boolean resultado = test.test(7);
            System.out.println(resultado);
        };

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_ADMIn"));

        BiPredicate<String, String> t3 = (a,b) -> a.equals(b);
        System.out.println(t3.test("Andres", "Andres"));

        BiPredicate<Integer, Integer> t4 = (i, j) -> j > i;
        boolean r2 = t4.test(5,10);
        System.out.println(r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Maria");
        b.setNombre("Maria");
        BiPredicate<Usuario, Usuario> t5 = (usuario, usuario2) -> usuario.getNombre().equals(usuario2.getNombre());
        System.out.println(t5.test(a,b));





    }
}
