package POOInterfacesRepositorio.Ejercicio;

public class NoPerecible extends Producto {

    private int contenido, calorias;


    public NoPerecible(String nombre, Double precio, int calorias, int contenido) {
        super(nombre, precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
