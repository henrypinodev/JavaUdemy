package POOInterfacesRepositorio.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Producto > {

    private List<T> productos;
    private final int MAX = 5;

    public Inventario() {
         productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void agregar(T producto){
        if (productos.size() >= MAX ){
            throw new IllegalArgumentException("HA SUPERADO EL LIMITE");
        }
        productos.add(producto);
    }

    public void obtenerDatos() {
        if (productos.isEmpty()) {
            throw new IllegalStateException("No hay productos.");
        }
        productos.forEach(producto -> {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
        });
    }

    public int cantidadProductos(){

        return getProductos().size();
    }




}
