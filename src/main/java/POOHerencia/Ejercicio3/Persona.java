package POOHerencia.Ejercicio3;

public class Persona {

    private String nombre,apellido,sexo;
    private int rut;

    public Persona(String nombre, String apellido, String sexo, int rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return
                "\tnombre: " + nombre+
                "\tapellido: " + apellido+
                "\tsexo: " + sexo+
                "\trut: " + rut;
    }
}
