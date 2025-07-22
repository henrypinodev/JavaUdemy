package Arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        a = new int[10];
        int totalpares = 0;
        int totalInpares = 0;
        int j = 0;
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            if ((a[i] % 2) == 0){
                totalpares++;
            }else{
                totalInpares++;
            }
        }

        pares = new int[totalpares];
        impares = new int[totalInpares];


        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[j++] = a[i];

            }else{
                impares[k++] = a[i];
            }
        }
        for (int i = 0; i < pares.length; i++){

            System.out.print("pares: " + pares[i]);

        }
        for (int i = 0; i < impares.length; i++){
            System.out.println("Impares:" + impares[i]);
        }

    }
}
