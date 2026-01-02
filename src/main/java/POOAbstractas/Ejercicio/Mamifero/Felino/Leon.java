package POOAbstractas.Ejercicio.Mamifero.Felino;

public class Leon extends Felino{

    private Integer numManada;
    private Float potenciaRugidoDecibel;


    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Integer velocidad, Float tamanoColmillos, Integer numManada, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, velocidad, tamanoColmillos);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon: "+this.nombreCientifico  +" está comiendo junto a su manada de: "+this.numManada;
    }

    @Override
    public String dormir() {
        return "El leon fue a dormir en la noche con su manada de: "+this.numManada;
    }

    @Override
    public String correr() {
        return "El leon esta corriendo a una velocidad de: "+this.velocidad;
    }

    @Override
    public String comunicarse() {
        return "El "+this.nombreCientifico+" comienza a comunicarse junto con potencial de decibel de: "+this.potenciaRugidoDecibel;
    }
}
