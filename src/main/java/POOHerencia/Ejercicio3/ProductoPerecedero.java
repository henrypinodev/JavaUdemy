package POOHerencia.Ejercicio3;

public class ProductoPerecedero extends Almacen {
    private String TipoDePerecedero;


    public ProductoPerecedero(String nombre, int precio, int gramo, String tipoDePerecedero) {
        super(nombre, precio, gramo);
        TipoDePerecedero = tipoDePerecedero;
    }

    public String getTipoDePerecedero() {
        return TipoDePerecedero;
    }

    public void setTipoDePerecedero(String tipoDePerecedero) {
        TipoDePerecedero = tipoDePerecedero;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tTipoDePerecedero: " + TipoDePerecedero;
    }
}
