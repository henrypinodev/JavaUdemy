package POOInterfacesRepositorio.Ejercicio;

import java.util.List;

public class EjercicioProducto {
    public static void main(String[] args) {



        BolsaSupermercado<Fruta> Bolsafrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> BolsaLacteo = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> BolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> BolsaNoPerecible = new BolsaSupermercado<>();

        Bolsafrutas.addProductos(new Fruta("Frambuesa", 1.500, 60.0, "Roja"));
        Bolsafrutas.addProductos(new Fruta("Melón", 2.000, 5.000, "gris"));
        Bolsafrutas.addProductos(new Fruta("Tomate", 2.500, 80.0, "Rojo"));
        Bolsafrutas.addProductos(new Fruta("Manzana verde", 1.800, 40.0, "Verde"));
        Bolsafrutas.addProductos(new Fruta("Platano", 1.000, 1.000,"Amarillo"));
        Bolsafrutas.addProductos(new Fruta("Kiwi", 1.000, 2.000,"Verde olivo"));

        for (Fruta fruta : Bolsafrutas.getProductos()){
            System.out.println("Nombre de Fruta: "+fruta.getNombre());
            System.out.println("Precio de Fruta: "+ fruta.getPrecio());
            System.out.println("Peso de Fruta: "+fruta.getPeso());
            System.out.println("Color de Fruta: "+ fruta.getColor());
        };

        BolsaLimpieza.addProductos(new Limpieza("Paños Limpieza", 2.200,"Quimicos de Limpieza ",0.0));
        BolsaLimpieza.addProductos(new Limpieza("Cloro", 800.0, "Cloro", 1.0));
        BolsaLimpieza.addProductos(new Limpieza("Quix", 1.200, "Detergente", 1.0));
        BolsaLimpieza.addProductos(new Limpieza("Omo", 5.600, "Detergente lavadora", 5.0));
        BolsaLimpieza.addProductos(new Limpieza("Toallas", 6.0, "Toalla seda", 1.0));

        for (Limpieza limpieza : BolsaLimpieza.getProductos()){
            System.out.println("Nombre de producto Limpieza: "+limpieza.getNombre());
            System.out.println("Precio de producto Limpieza: "+limpieza.getPrecio());
            System.out.println("Componente de producto Limpieza: "+limpieza.getComponentes());
            System.out.println("Litros del producto Limpieza: "+ limpieza.getLitros());
        }

        BolsaLacteo.addProductos(new Lacteo("Leche", 1.100, 1, 200));
        BolsaLacteo.addProductos(new Lacteo("Yogurt", 600.0, 4, 80));
        BolsaLacteo.addProductos(new Lacteo("Queso", 3.500, 15, 900));
        BolsaLacteo.addProductos(new Lacteo("Mantequilla", 1.900, 2, 400));
        BolsaLacteo.addProductos(new Lacteo("Crema", 1.100, 1, 180));

        for (Lacteo lacteo : BolsaLacteo.getProductos()){
            System.out.println("Nombre de lacteo: "+lacteo.getNombre());
            System.out.println("Precio de lacteo: "+lacteo.getPrecio());
            System.out.println("Cantidad de lacteo: "+lacteo.getCantidad());
            System.out.println("Proteinas de lacteo: "+lacteo.getProteinas());
        }

        BolsaNoPerecible.addProductos(new NoPerecible("Fideos", 990.0,400,1));
        BolsaNoPerecible.addProductos(new NoPerecible("Arroz",1.900, 600, 1 ));
        BolsaNoPerecible.addProductos(new NoPerecible("Puré",5.200, 900, 1 ));
        BolsaNoPerecible.addProductos(new NoPerecible("Atún",2.200, 100, 1 ));
        BolsaNoPerecible.addProductos(new NoPerecible("Salsa",600.0, 180, 1 ));

        for (NoPerecible noPerecible : BolsaNoPerecible.getProductos()){
            System.out.println("Nombre de no Perecible: "+noPerecible.getNombre());
            System.out.println("Precio de no Perecible: "+noPerecible.getPrecio());
            System.out.println("Calorias de no Perecible: "+noPerecible.getCalorias());
            System.out.println("Contenido de no Perecible: "+noPerecible.getContenido());

        }



    }
}
