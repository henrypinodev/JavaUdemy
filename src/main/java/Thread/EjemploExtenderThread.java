package Thread;

import Thread.threads.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) throws InterruptedException {


        Thread thread = new NombreThread(" John Doe");

        thread.start();
        // Thread.sleep(10000);

        Thread thread2 = new NombreThread("Maria");
        thread2.start();

        Thread thread3 = new NombreThread("Felipe");
        thread3.start();

        System.out.println("Estado del Hilo: "+thread.getState());

    }
}
