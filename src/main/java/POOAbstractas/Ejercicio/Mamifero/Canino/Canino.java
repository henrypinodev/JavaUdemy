package POOAbstractas.Ejercicio.Mamifero.Canino;

import POOAbstractas.Ejercicio.Mamifero.Mamifero;

public abstract class  Canino extends Mamifero {

    protected Float tamanoColmillos;
    protected String color;

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoColmillos, String color) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoColmillos = tamanoColmillos;
        this.color = color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public String getColor() {
        return color;
    }


}
