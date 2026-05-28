package POOInterfacesRepositorio.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productos;
    private int indiceProductos;
    private final int indiceMax = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProductos(T p){
        if (this.productos.size() <= indiceMax){
            this.productos.add(p);
        }else {
            throw new RuntimeException("Error, no hay mas espacio en la bolsa");
        }
    }


}
