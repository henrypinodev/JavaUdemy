package Arreglos;

import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        int [] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.println("Ingrese un numero");
            a[i]= scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++){
            System.out.println("El contenido del array [a] es "+ a[i]);
        }
        int temp =0;
        for (int i = 0; i < a.length; i++){
            if (i < a[i]){
                 temp = a[i];
            }
        }
        System.out.println("El numero mayor es "+ temp);

        /* Puede ser igual de esta manera
         int max = 0;
        * for(int i = 0; i < a.length; i++){
        * max = (a[max] > a[i])? max: i;
        }
        *
        *
        *  */

    }
}
