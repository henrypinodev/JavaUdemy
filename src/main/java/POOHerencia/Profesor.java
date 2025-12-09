package POOHerencia;

public class Profesor extends Persona {

    public Profesor() {
        System.out.println("Inicializando constructor profesor");
    }

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Profesor(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    private String asignatura;


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Hola que tal, soy un profesor: "+ getNombre()+ "De la asignatura: "+ getAsignatura();
    }
}
