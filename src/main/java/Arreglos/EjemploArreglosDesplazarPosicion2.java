package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++)
        {
            System.out.println("Ingrese el numero");
            a[i] = scanner.nextInt();
        }
        System.out.println("Nuevo elemento");
       elemento = scanner.nextInt();
        System.out.println("Posicion a agregar (0 a 9)");
        posicion = scanner.nextInt();


        for (int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;
        System.out.println("El arreglo;");
        for (int i = 0; i <a.length; i++){
            System.out.println(a[i]);
        }

    }
}
