package Thread.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            //private int contador = 3;
            @Override
            public void run() {
                int i = contador.getAndDecrement();
                if (i > 0) {

                    System.out.println("Contador = "+ contador);
                    System.out.println("Tarea periodica: "+ i+ "en: " + new Date() + " nombre del Thread: " + Thread.currentThread().getName());
                    //contador = contador-1;
                }else {
                    System.out.println("Finaliza el tiempo (Tarea)");
                    timer.cancel();
                }
            }
        },
        5000, 10000);

        System.out.println("Agendar tarea para 5 segundos más...");

    }
}
