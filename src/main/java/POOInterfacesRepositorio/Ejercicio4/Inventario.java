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

    public void obtenerDatos(){
        for (T x : productos){
            System.out.println("nombre: "+x.getNombre());
            System.out.println("precio: "+x.getPrecio());
        }
    }




}
