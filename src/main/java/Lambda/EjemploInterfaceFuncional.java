package Lambda;

import Lambda.Aritmetica.Aritmetica;
import Lambda.Aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {

        Aritmetica suma = (a,b) -> a+b;
        Aritmetica resta = (a,b) -> a-b;


        Calculadora cal = new Calculadora();

        System.out.println(cal.calculadora(10,5, suma));
        System.out.println(cal.calculadora(10,5, resta));
        System.out.println(cal.calculadora(10,5, (a,b) -> a*b));

        System.out.println(cal.operacionBiFuncion(12,34,(a,b) -> a+b));


    }
}
