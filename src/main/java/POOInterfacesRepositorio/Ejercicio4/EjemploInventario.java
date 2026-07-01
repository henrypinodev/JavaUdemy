package POOInterfacesRepositorio.Ejercicio4;

public class EjemploInventario {
    public static void main(String[] args) {

        Inventario<Producto> p = new Inventario<>();
        p.agregar(new Producto("Omo", 6500));
        p.agregar(new Producto("QUIX", 1000));
        p.agregar(new Producto("TOALLAS HELIX", 4500));
        p.agregar(new Producto("GALLETAS TOX", 1300));
        p.agregar(new Producto("BUBBLE TEA", 2500));

        p.obtenerDatos();


    }
}
