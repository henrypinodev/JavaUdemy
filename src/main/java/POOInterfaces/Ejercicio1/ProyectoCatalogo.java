package POOInterfaces.Ejercicio1;

public class ProyectoCatalogo {

    public static void main(String[] args) {

        IProducto[] productos = new Producto[6];

        productos[0] = new TvLCD(60000,"Mitsubishi");

        System.out.println(productos[0].getPrecio());
        




    }
}
