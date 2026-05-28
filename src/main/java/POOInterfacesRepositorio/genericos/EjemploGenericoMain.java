package POOInterfacesRepositorio.genericos;

import POOInterfacesRepositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericoMain {
    public static void main(String[] args) {


        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Perez", "Gonzalez"));


        Cliente perez = clientes.get(0);
        System.out.println(perez);
        Cliente[] clientesArreglo = {new Cliente("marcelo", "Gonzalez"),(new Cliente("Pedro","Pablo"))
        };
        Integer[] enterosArreglo = {3,5,9};

        List<Cliente> clientesLista= fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "Luci", "bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(new ClientePremium[]{new ClientePremium("JORGITO", "herrera")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);

        System.out.println("Maximo de 1, 9 y 4:"+ maximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.6 ,7.78 es: "+ maximo(3.9,11.6,7.78) );
        System.out.println("Maximo de zanahoria, arándanos, manzana es: " +maximo("zanahoria", "arándano", "manzana"));

    }


     public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
     }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for (G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    //Permite utilizar el <? extends todas las clases heredadas de Cliente
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);

    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c ){
        T max = a;
        if (b.compareTo(max) >0){
            max = b;
        }
        if (c.compareTo(max) >0){
            max = c;

        }
        return max;

    }

}
