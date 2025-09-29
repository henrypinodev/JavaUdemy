package POO.Clases;

public class Estanque {
    private int capacidad;

    //Constructor vacio con capacidad 40 definida por default.
    public Estanque() {
        this.capacidad = 40;
    }

    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }


    public int getCapacidad() {
        return capacidad;
    }
}
