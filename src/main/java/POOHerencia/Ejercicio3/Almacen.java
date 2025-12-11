package POOHerencia.Ejercicio3;

public class Almacen {

    private String nombre;
    private int precio,gramo;

    public Almacen(String nombre, int precio, int gramo) {
        this.nombre = nombre;
        this.precio = precio;
        this.gramo = gramo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getGramo() {
        return gramo;
    }

    public void setGramo(int gramo) {
        this.gramo = gramo;
    }

    @Override
    public String toString() {
        return "\tnombre: " + nombre +
                "\tprecio: " + precio +
                "\tgramo: " + gramo;
    }
}
