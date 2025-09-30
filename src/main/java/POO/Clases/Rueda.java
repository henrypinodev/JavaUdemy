package POO.Clases;

public class Rueda {
    private String fabricante;
    private String aro;
    private double ancho;

    public Rueda(double ancho, String aro, String fabricante) {
        this.ancho = ancho;
        this.aro = aro;
        this.fabricante = fabricante;
    }

    public double getAncho() {
        return ancho;
    }

    public String getAro() {
        return aro;
    }

    public String getFabricante() {
        return fabricante;
    }
}
