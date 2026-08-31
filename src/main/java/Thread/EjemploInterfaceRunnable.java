package Thread;

import Thread.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {

    public static void main(String[] args) {

        // ViajeTarea implementa Runnable, no hereda de Thread, por lo tanto, no puede asignar directamente un runnable a una variable Thread
        //FORMA 1
       Runnable tarea = new ViajeTarea("Isla de Pascua");
       Thread viajePascua = new Thread(tarea);
       // Tambien puede ser => Thread viaje = new Thread(new ViajeTarea("Isla de Pascua"));

        // FORMA 2
        Thread viajeRobinson = new Thread(new ViajeTarea("Robinson Crusoe"));


        viajePascua.start();
        viajeRobinson.start();
        // FORMA 3
        new Thread (new ViajeTarea("Juan Fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();


    }
}
