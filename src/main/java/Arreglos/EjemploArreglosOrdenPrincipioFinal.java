package Arreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
            System.out.println("indice i: "+ i + " numeros[i] "+ numeros[i]);
        }

        int aux = 0;
        // puede ser for (int i = 0; i <numeros.length - i; i++)
        for (int i = 0; i <numeros.length/2; i++){
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length -1 -i];
            //System.out.print(numeros[i]+" ");
            //System.out.println(numeros[numeros.length-1-i]);
        }

        for (int i= 0 ; i < a.length; i++){
            System.out.println("indice i: "+i+" arreglo [a] = "+a[i]);
        }


    }
}
