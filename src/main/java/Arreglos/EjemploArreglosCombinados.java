package Arreglos;

public class EjemploArreglosCombinados {
    public static void main(String[] args) {

        int[]  a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
        }
        for (int i = 0; i < b.length; i++){
            b[i] = (i+1)*5;
        }
        int aux = 0;
        // puede ser tambien   for (int i= 0; i < b.length; i++){
        for (int i= 0; i < 10; i++){
        c[aux++] = a[i];
        c[aux++] = b[i];
        }
        System.out.println("------- arreglo llenado en C");

        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]);
        }


    }
}
