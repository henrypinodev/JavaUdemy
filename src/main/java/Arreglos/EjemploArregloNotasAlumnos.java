package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;


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

        for (int i = 0; i < 7; i++){
            // si utilizo el += no debo castear el int debido a que es implicito para Java, asume
            sumNotasMatematicas = (int) (sumNotasMatematicas + claseMatematicas[i]);
            sumNotasHistoria = (int) (sumNotasHistoria + claseHistoria[i]);
            sumNotasLenguaje = (int) (sumNotasLenguaje + claseLenguaje[i]);
        }

        double promedioMatematicas =  ((double) sumNotasMatematicas /claseMatematicas.length);
        double promedioHistoria = ((double) sumNotasHistoria /claseHistoria.length);
        double promedioLenguaje = ((double) sumNotasLenguaje /claseLenguaje.length);
        double promedioGeneral = (sumNotasMatematicas+sumNotasHistoria+sumNotasLenguaje/3);

        System.out.println("Promedio de notas matematicas: "+ promedioMatematicas);
        System.out.println("Promedio de notas Historia: "+ promedioHistoria );
        System.out.println("Promedio notas Lenguaje: "+ promedioLenguaje);
        System.out.println("Promedio total de los tres cursos: "+ promedioGeneral);

        System.out.println("Ingrese identificador del alumno( de 0 a 6)");
        int id = scanner.nextInt();
        double promedioAlumno = (claseMatematicas[id]+ claseHistoria[id]+ claseLenguaje[id]);
        System.out.println("Promedio alumno es: "+ promedioAlumno+ " y su id es: "+ id);

    }
}
