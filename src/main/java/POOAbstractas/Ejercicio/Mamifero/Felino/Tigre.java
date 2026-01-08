package POOAbstractas.Ejercicio.Mamifero.Felino;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Integer velocidad, Float tamanoColmillos, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, velocidad, tamanoColmillos);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El"+nombreCientifico+"es una especie de tigre: "+especieTigre+" que gusta de comer con sus"+ habitat;
    }

    @Override
    public String dormir() {
        return "el: "+ especieTigre+" va a dormir en su habitat de:"+habitat;
    }

    @Override
    public String correr() {
        return "El: "+especieTigre+"comenzará a correr a una velocidad de:"+ velocidad;
    }

    @Override
    public String comunicarse() {
        return "El:"+especieTigre+"tiene una altura de"+ altura + "con un habvitat de: "+ habitat;
    }
}
