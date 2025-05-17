package OperadoresYDemases;

public class EjemploStringExtensiónArchivo {
    public static void main(String[] args) {



        String archivo = "alguna_imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length())"+ archivo.length());
        System.out.println("archivo.substring(14))" + archivo.substring(14));
        System.out.println(archivo.substring(archivo.length()-3));

        System.out.println(i + "indexof");
        System.out.println("archivo.substring(i))"+ archivo.substring(i));
        System.out.println("archivo.substring(i))"+ archivo.substring(i+1));



    }
}
