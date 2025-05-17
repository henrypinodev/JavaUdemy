package OperadoresYDemases;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {


        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("iNGRESE UN NUMERO");
        int num1 = scanner.nextInt();

        System.out.println("iNGRESE UN NUMERO");
        int num2 = scanner.nextInt();

        System.out.println("iNGRESE UN NUMERO");
        int num3 = scanner.nextInt();

        max = (num1>num2)? num1: num2;
        max = (max >num3)? max: num3;

        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);
        System.out.println("num3 = "+ num3);
        System.out.println("numero maximo es = "+ max);


    }
}
