package POOInterfaces.Ejercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class ProyectoCatalogo {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        IProducto[] productos = new Producto[6];

        productos[0] = new TvLCD(60000,"Mitsubishi",48);
        productos[1] = new Libro(12900, LocalDate.of(2026,3,8), "Gotham","Batman", "Salamandra");
        productos[2] = new Iphone(750000, "Apple", "Iphone 17 Pro MAX", "plata");
        productos[3] = new Comics(5990, "Superman", LocalDate.parse("2026-03-10"), "Marvel", "Superman Contrataca", "ChileComics");
        productos[4] = new Comics(7990,"Snoopy", LocalDate.parse("2026-03-01"),"Guillermo","Aventuras de Snoopy", "Salamandra");
        productos[5] = new Iphone(480000, "Apple","Iphone 12 Lite", "Rosa");

        for (IProducto producto : productos){
            System.out.print("Nombre instancia Clase: "+ producto.getClass().getSimpleName());
            System.out.println(" | Valor del producto: " +producto.getPrecio()+ " | Precio final: "+ producto.getPrecioVenta());

            if (producto instanceof IElectronico){
                System.out.println("Fabricante: " + ((IElectronico) producto).getFabricante());

                if (producto instanceof Iphone){
                    System.out.println("Modelo: "+ ((Iphone) producto).getModelo());
                    System.out.println("Color: "+ ((Iphone) producto).getColor());
                }

                if (producto instanceof TvLCD){
                    System.out.println("Pulgadas: "+ ((TvLCD) producto).getPulgada());
                }
            }
            if (producto instanceof ILibro){
                System.out.println("Titulo: "+ ((ILibro) producto).getTitulo());
                System.out.println("Autor: "+ ((ILibro) producto).getAutor());
                System.out.println("Fecha:"+ ((ILibro) producto).getFechaPublicacion());
                System.out.println("Editorial: "+ ((ILibro) producto).getEditorial());

                if (producto instanceof Comics){
                    System.out.println("Personaje: "+ ((Comics) producto).getPersonaje());

                }

            }

        }

        




    }
}
