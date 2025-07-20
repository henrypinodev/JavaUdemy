package Arreglos;
import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {


        String[] productos = new String[7];


        int total = productos.length;


        productos[0] = "Memoria Kingstone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD EXTERNO Samsung";
        productos[3] = "Macbook air";
        productos[4] = "Chromecast 4ta generacion";
        productos[5] = "Bicicleta Oxford";
        productos[6] = "Asus Notebook";

        System.out.println("Aplicando sort");
        Arrays.sort(productos);

        System.out.println("--------USANDO FOR-------");
        for (int i = 0 ; i < total; i++){
            System.out.println("Para indice: "+ i +" = "+ productos[i]);
        }

        System.out.println("------- USANDO FOREACH------");

        for (String prod: productos){
            System.out.println("prod = "+ prod);
        }

        System.out.println("-------- USANDO WHILE -- -------");
        int i = 0;
        while ( i < total){
            System.out.println("Para indice: "+ i +" = "+ productos[i]);
            i++;
        }

        System.out.println("------ DO WHILE ---------");
        int j = 0;
        do {
            System.out.println("Para indice: "+ j + ": "+ productos[j]);
            j++;

        }while (j < total);


        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        System.out.println(numeros.length);
        for (int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;


        }
        
        System.out.println(numeros.length);
        for (int k = 0; k < totalNumeros; k++){
            System.out.println(numeros[k]);
            k++;

        }





    }
}
