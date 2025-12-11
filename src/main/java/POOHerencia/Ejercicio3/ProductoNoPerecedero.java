package POOHerencia.Ejercicio3;

public class ProductoNoPerecedero extends Almacen {
    private String TipoNoPerecedero;

    public ProductoNoPerecedero(String nombre, int precio, int gramo, String tipoNoPerecedero) {
        super(nombre, precio, gramo);
        TipoNoPerecedero = tipoNoPerecedero;
    }

    public String getTipoNoPerecedero() {
        return TipoNoPerecedero;
    }

    public void setTipoNoPerecedero(String tipoNoPerecedero) {
        TipoNoPerecedero = tipoNoPerecedero;

    }

    @Override
    public String toString() {
        return super.toString()+
                "\tTipoNoPerecedero: " + TipoNoPerecedero;
    }
}
