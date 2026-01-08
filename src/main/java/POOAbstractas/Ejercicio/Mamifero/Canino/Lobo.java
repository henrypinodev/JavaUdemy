package POOAbstractas.Ejercicio.Mamifero.Canino;

public class Lobo extends Canino{

    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoColmillos, String color, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoColmillos, color);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo come con su especie: "+especieLobo+"y tienen un color a: "+color;
    }

    @Override
    public String dormir() {
        return "El lobo se va a dormir junto a su manada: "+especieLobo;
    }

    @Override
    public String correr() {
        return "El lobo corre y tiene un largo de: "+largo;
    }

    @Override
    public String comunicarse() {
        return "El lobo se comunica con su manada de: "+numCamada;
    }
}
