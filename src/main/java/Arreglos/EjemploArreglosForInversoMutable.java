package Arreglos;
import java.util.Arrays;

import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }



    public static void main(String[] args) {




        //String[] productos = new String[7];
        // OTRA FORMA DE ARREGLOS
        String[] productos = {"Memoria Kingstone Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD EXTERNO Samsung", "Macbook air","Asus Notebook",
                "Chromecast 4ta generacion", "Bicicleta Oxford"};

        int total = productos.length;
        System.out.println("Aplicando sort");
        Arrays.sort(productos);
        arregloInverso(productos);
        //API DE JAVA EL COLLECTION
        //Collections.reverse(Arrays.asList(productos));



        System.out.println("---- USANDO FOR YA INVERSO -------");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice: " + i + " = " + productos[i]);
        }

    }
}
