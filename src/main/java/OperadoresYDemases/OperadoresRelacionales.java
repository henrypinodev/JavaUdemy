package OperadoresYDemases;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k= 127e-7f;
        double l= 2.1413e3;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println(b1);

        boolean b2 = !b1;
        System.out.println(b2);


        boolean b3 = i != j;
        System.out.println(b3);

        boolean b4 = m == true;
        System.out.println(b4);

        boolean b5 = m != true;
        System.out.println(b5);

        boolean b6 = i > j ;
        System.out.println(b6);

        boolean b7 = i < j;
        System.out.println(b7);


    }
}
