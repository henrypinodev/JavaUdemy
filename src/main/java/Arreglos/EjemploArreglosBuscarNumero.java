package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < a.length; i ++){
            System.out.print("Ingrese un numero, posición actual = "+"["+ contador+"]");
            a[i] = scanner.nextInt();
            contador++;

        }


        System.out.println("\r\nIngrse el numero a buscar");
        int numero = scanner.nextInt();

        int i = 0;
        for (; i < a.length && a[i] != numero; i++){

        }

        if (i == a.length){
            System.out.println("numero no encontrado");
        } else if (a[i] == numero) {
            System.out.println("encontrado en posición"+ i );

        }


    }
}
