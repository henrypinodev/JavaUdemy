package POOAbstractas.Ejercicio.Mamifero.Felino;

import POOAbstractas.Ejercicio.Mamifero.Mamifero;

public abstract class Felino extends Mamifero {

    protected Integer velocidad;
    protected Float tamanoColmillos;


    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Integer velocidad, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.velocidad = velocidad;
        this.tamanoColmillos = tamanoColmillos;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
