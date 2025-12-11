package POOHerencia.Ejercicio3;

public class Cliente extends Persona {

    private int boleta;

    public Cliente(String nombre, String apellido, String sexo, int rut, int boleta) {
        super(nombre, apellido, sexo, rut);
        this.boleta = boleta;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
    
}
