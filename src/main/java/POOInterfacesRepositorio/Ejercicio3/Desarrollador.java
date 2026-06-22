package POOInterfacesRepositorio.Ejercicio3;

public class Desarrollador extends Empleado {

    private String lenguaje;


    public Desarrollador(String nombre, String lenguaje) {
        super(nombre);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }



}
