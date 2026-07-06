package POOInterfacesRepositorio.Ejercicio5;

public class Estudiante {

    private String nombre, carrera;
    private int edad;


    public Estudiante(String nombre, String carrera, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }
}
