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
        return "El"+this.nombreCientifico+"es una especie de tigre: "+this.especieTigre+" que gusta de comer con sus"+ getHabitat().toLowerCase();
    }

    @Override
    public String dormir() {
        return "el: "+this.especieTigre+" va a dormir en su habitat de:"+getHabitat();
    }

    @Override
    public String correr() {
        return "El: "+this.especieTigre+"comenzará a correr a una velocidad de:"+getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "El:"+this.especieTigre+"tiene una altura de"+getAltura()+ "con un habvitat de: "+ getHabitat().toLowerCase();
    }
}
