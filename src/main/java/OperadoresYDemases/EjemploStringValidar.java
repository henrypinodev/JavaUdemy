package OperadoresYDemases;

public class EjemploStringValidar {
    public static void main(String[] args) {


        String curso = null;

        boolean esNulo = curso == null;

        if (curso == null){
            curso = "Programacion Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(curso));
        if (!esVacio)
            System.out.println("");
    }
}