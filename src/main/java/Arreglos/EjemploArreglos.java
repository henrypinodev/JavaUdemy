package Arreglos;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {


        String[] productos = new String[7];
        System.out.println("valor del principio"+ productos[2]);
        //arroja null porque aún no le asigno el valor

        productos[0] = "Memoria Kingstone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD EXTERNO Samsung";
        productos[3] = "Macbook air";
        productos[4] = "chromecast 4ta generacion";
        productos[5] = "Bicicleta Oxford";
        productos[6] = "Asus Notebook";

        System.out.println("Aplicando sort");
        Arrays.sort(productos);

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println(productos[3]);
        System.out.println(productos[4]);
        System.out.println(productos[5]);
        System.out.println(productos[6]);

        // o tambien podemos

        productos[0] = "Memoria Kingstone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD EXTERNO Samsung";
        productos[3] = "Macbook air";
        productos[4] = "chromecast 4ta generacion";
        productos[5] = "Bicicleta Oxford";
        productos[6] = "Asus Notebook";

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0]"+ prod1 );
        System.out.println("productos[1]"+ prod2);
        System.out.println("productos[2]"+prod3);
        System.out.println("productos[3]"+prod4);
        System.out.println("productos[4]"+prod5);
        System.out.println("productos[5]"+prod6);
        System.out.println("productos[6]"+prod7);



        int[] numeros = new int[4];

        numeros[0] = 7;
        numeros[1] = 20;
        numeros[2] = 3;
        numeros[3] = 500;

        System.out.println("----------------------------");

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        int f = numeros.length;
        //numeros.length te muestra el total de elementos que el arreglo tiene
        //

        Arrays.sort(numeros);
        System.out.println("Aplicando sort a numeros");
        //asegurarse de siempre forzar un recorrido en el arreglo e imprimir
        for (int num : numeros) {
            System.out.println(num);
        }
        System.out.println("---------------------------------");

        System.out.println("j = "+ j);
        System.out.println("i = "+ i);
        System.out.println("k ="+ k);
        System.out.println("l numeros[numeros.length -1] = "+l);
        System.out.println("F numeros.length: "+ f);

    }
}
