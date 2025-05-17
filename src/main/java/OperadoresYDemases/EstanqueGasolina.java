package OperadoresYDemases;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {

        double litro = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de litros");
        litro = scanner.nextDouble();
        if (litro>=1 && litro<=70){
        if (litro == 70){
            System.out.println("Estanque lleno");

        } else if (litro>=60 && litro<70) {
            System.out.println("Estanque casi lleno");
        } else if (litro>=40 && litro<60) {
            System.out.println("Estanque 3/4");

        } else if (litro>=35 && litro<40) {
            System.out.println("medio estanque");

        } else if (litro>=20 && litro<35) {
            System.out.println("suficiente");

        } else if (litro>=1 && litro<20) {
            System.out.println("Insuficiente");
        }
        }else{
            System.out.println("La cantidad debe estar entre 1 y 70 Litros");
        }

    }
}
