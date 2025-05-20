package ClasesWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num1);

        System.out.println("es el mismo objeto num1 y num2?: "+ (num1 == num2));

        num2 = 1000;

        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num1);

        System.out.println("es el mismo objeto num1 y num2?: "+ (num1 == num2));

        // primitivos compara siempre el valor
        // wrapper siempre compara el objeto instanciado
        // comparamos con equals
        System.out.println("es el mismo objeto num1 y num2?: "+ (num1.equals(num2)));

        System.out.println("es el mismo objeto num1 y num2?: "+ (num1.intValue() == num2.intValue()));


    }
}
