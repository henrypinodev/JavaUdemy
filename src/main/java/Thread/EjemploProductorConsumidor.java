package Thread;

import Thread.Sync.Panaderia;
import Thread.runnable.Consumidor;
import Thread.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
