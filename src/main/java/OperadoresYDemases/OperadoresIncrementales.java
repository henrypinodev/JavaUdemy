package OperadoresYDemases;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        int i = 1;
        int j = ++i;

        System.out.println("valor de i es : "+i);
        System.out.println("valor de j es : "+ j);

        // post incremento

        i = 2;
        j = i++;

        System.out.println(i);
        System.out.println(j);

        System.out.println("valor de i es: "+i);
        System.out.println("valor de j es : "+ j);

    }
}
