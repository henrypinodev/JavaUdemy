package Arreglos;
import java.awt.font.FontRenderContext;
import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {


        //String[] productos = new String[7];
        // OTRA FORMA DE ARREGLOS
        String[] productos = {"Memoria Kingstone Pendrive 64GB","Samsung Galaxy","Disco Duro SSD EXTERNO Samsung","Macbook air",
                "Chromecast 4ta generacion","Bicicleta Oxford","Asus Notebook"};

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
        System.out.println("----> USANDO FOR INVERSO <-------------");
        for (int i = 0; i< total; i++){
            System.out.println("Para i = "+ (total-1-i) + "valor: "+ productos[total-1-i] );
        }

        System.out.println("----> USANDO FOR INVERSO 2 <-------------");
        for (int i = total -1; i >= 0; i--){
            System.out.println("Para i: "+i +" valor  producto "+ productos[i] );
        }
    }
}
