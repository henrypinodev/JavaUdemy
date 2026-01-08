package POOAbstractas.Ejercicio.Mamifero.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Integer velocidad, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico, velocidad, tamanoColmillos);
    }



    @Override
    public String comer() {
        return "El gueopardo del habitat: "+habitat+"con un tamaño de colmillos de:"+ tamanoColmillos;
    }

    @Override
    public String dormir() {
        return "el gueopardo va a dormir y su peso es: "+peso+" y su nombre cientifico es"+ nombreCientifico;
    }

    @Override
    public String correr() {
        return "el geopardo corre a una velocidad de: "+velocidad+"en su habitat de: "+ habitat;
    }

    @Override
    public String comunicarse() {
        return "El gueopardo se comunica en su habitat: "+habitat;
    }
}
