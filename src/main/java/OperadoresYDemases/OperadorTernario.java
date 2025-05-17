package OperadoresYDemases;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "si es verdadero": "si es falso";
        System.out.println("variable = "+ variable);

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        String estado = "aprobado";
        double promedio = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las notas de matematicas");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese las notas de ciencias");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese las notas de Historia");
        historia = scanner.nextDouble();


        promedio = (matematicas+ciencias+historia)/3;
        estado = promedio >= 5.49 ? "aprobado": "rechazado";
        System.out.println("el estado es = "+ estado);



    }
}
