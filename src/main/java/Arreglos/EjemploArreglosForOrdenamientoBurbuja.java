package Arreglos;
import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total -1 -i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador: "+ contador);
    }


    public static void main(String[] args) {




        String[] productos = {"Memoria Kingstone Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD EXTERNO Samsung", "Macbook air","Asus Notebook",
                "Chromecast 4ta generacion", "Bicicleta Oxford"};

        int total = productos.length;


        sortBurbuja(productos);

        System.out.println("---- USANDO FOR  -------");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice: " + i + " = " + productos[i]);
        }




    }
}
