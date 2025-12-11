package POOHerencia.Ejercicios;

public class Cliente extends Persona {

    private int clienteId;


    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId+1;
    }

    public int getClienteId() {
        return clienteId;
    }


    @Override
    public String toString() {
        return super.toString()+
                "\tclienteId: " + clienteId;
    }
}
