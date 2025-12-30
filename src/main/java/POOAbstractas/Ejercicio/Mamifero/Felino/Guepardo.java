package POOAbstractas.Ejercicio.Mamifero.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Integer velocidad, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico, velocidad, tamanoColmillos);
    }



    @Override
    public String comer() {
        return "El gueopardo del habitat: "+getHabitat()+"con un tamaño de colmillos de:"+ getTamanoColmillos();
    }

    @Override
    public String dormir() {
        return "el gueopardo va a dormir y su peso es: "+this.peso+" y su nombre cientifico es"+ getNombreCientifico();
    }

    @Override
    public String correr() {
        return "el geopardo corre a una velocidad de: "+this.velocidad+"en su habitat de: "+ getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El gueopardo se comunica en su habitat: "+this.habitat;
    }
}
