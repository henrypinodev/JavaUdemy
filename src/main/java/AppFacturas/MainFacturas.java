package AppFacturas;

import AppFacturas.model.Cliente;
import AppFacturas.model.Factura;
import AppFacturas.model.ItemFactura;
import AppFacturas.model.Producto;

import java.util.Scanner;

public class MainFacturas {

    public static void main(String[] args) {


        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Jorge");
        cliente1.setRUT("169301549");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura");
        String desc = scanner.nextLine();
        Factura factura1 = new Factura(desc, cliente1);

        Producto producto1;
        String nombre;
        Double precio;
        int cantidad;


        System.out.println();
        for (int i = 0; i <2; i++){

            producto1 = new Producto();
            System.out.print("Ingrese producto n°: "+ producto1.getCodigo()+ ": ");
            nombre = scanner.nextLine();
            producto1.setNombre(nombre);

            System.out.print("Ingrese precio: n°: ");
            precio = Double.parseDouble(scanner.nextLine());
            producto1.setPrecio(precio);

            System.out.print("Ingrese cantidad: ");
            cantidad = Integer.parseInt(scanner.nextLine());


            ItemFactura item = new ItemFactura(cantidad,producto1);
            factura1.addItemFactura(item);


            System.out.println();

        }

        System.out.println(factura1);



    }
}
