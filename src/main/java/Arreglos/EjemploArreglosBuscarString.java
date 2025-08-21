package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[5];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < a.length; i ++){
            System.out.print("Ingrese un texto, posición actual = "+"["+ contador+"]");
            a[i] = scanner.nextLine();
            contador++;

        }


        System.out.println("\r\nIngrse el caracter a buscar");
        String letra = scanner.nextLine();

        int i = 0;
        for (; i < a.length && !a[i].equalsIgnoreCase(letra); i++){

        }

        if (i == a.length){
            System.out.println("caracter no encontrado");
        } else if (a[i].equalsIgnoreCase(letra)) {
            System.out.println("encontrado en posición"+ i );

        }


    }
}
