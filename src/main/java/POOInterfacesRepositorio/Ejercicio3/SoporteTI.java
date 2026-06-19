package POOInterfacesRepositorio.Ejercicio3;

public class SoporteTI extends Empleado{

    private int nivel;

    public SoporteTI(String nombre, int nivel) {
        super(nombre);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
