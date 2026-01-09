package POOAbstractas.Ejercicio2;

public class Auto extends VehiculoTerrestre {

    protected boolean automatico;


    public Auto(String marca, String modelo, int velocidadMax, int capacidadPasajeros,int ruedas ,boolean automatico) {
        super(marca, modelo, velocidadMax, capacidadPasajeros, ruedas);
        this.automatico = automatico;
    }



    public boolean isAutomatico() {
        return automatico;
    }

    @Override
    public String encender() {
        return "Velocidad maxima: "+ velocidadMax+ " en auto: "+marca+ "modelo: "+modelo;
    }

    @Override
    public String acelerar() {
        return "Acelerando: "+marca+ " Modelo: "+modelo+ " con cambios automaticos: "+automatico;
    }

    @Override
    public String frenar() {
        return "Frenando: "+marca+ " a velocidad maxima de: "+velocidadMax;
    }
}
