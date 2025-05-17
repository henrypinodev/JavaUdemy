package OperadoresYDemases;

import java.util.Scanner;

public class MostrarNumerosOrdenados {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        int numMayor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num1 = scanner.nextInt();
        System.out.println("ingrese un numero");
        num2 = scanner.nextInt();



        numMayor = (num1>num2)? num1 : num2;

        System.out.println("El numero mayor es: "+numMayor);


    }
}
