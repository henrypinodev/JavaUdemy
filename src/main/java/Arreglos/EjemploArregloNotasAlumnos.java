package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;

        claseMatematicas = new double[7];
        claseLenguaje = new double[7];
        claseHistoria = new double[7];

        Scanner scanner = new Scanner(System.in);

        int temp = 0;
        System.out.println("Ingrese 7 notas Para matematicas"+ temp);
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextDouble();
            temp++;
        }

        System.out.println("Ingrese 7 notas para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas para Historia");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = scanner.nextDouble();
        }




    }
}
