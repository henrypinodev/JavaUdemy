package Matrices;

import java.util.Scanner;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese numero a buscar en matriz");




        int[][] matrizDeEnteros =
                {{35,90,3,1978},
                {15,2020,10,5},
                {677,127,32767,1999} };

        int elementobuscar = scanner.nextInt();
        boolean encontrado = false;
        int i;
        int j = 0;

        buscar: for (i = 0; i < matrizDeEnteros.length; i++){
            for (j= 0; j < matrizDeEnteros[i].length; j++){
                if (matrizDeEnteros[i][j] == elementobuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("Encontrado: "+ elementobuscar + " en las coordenadas: "+ i+ " y "+ j);
        }else{
            System.out.println("No se encontró en la matriz");
        }
        }catch(Exception e){
            System.out.println("Debe ingresar numeros"+ e.getMessage());
        }

    }
}
