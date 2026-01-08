package POOAbstractas.Ejercicio.Mamifero.Canino;

public class Perro extends Canino {


    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoColmillos, String color, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoColmillos, color);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "el perro va a comer y tiene un color de: "+color;
    }

    @Override
    public String dormir() {
        return "el perro duerme en su habitat de: "+habitat;
    }

    @Override
    public String correr() {
        return "el perro corre a una velocidad y un peso de"+peso;
    }

    @Override
    public String comunicarse() {
        return "el perro y una fuerza de mordida de: "+fuerzaMordida;
    }
}
