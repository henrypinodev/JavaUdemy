package Thread.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService ex = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }

            System.out.println("Finaliza la tarea ");
        };

        ex.submit(tarea);

        ex.shutdown();
        System.out.println("Continuando con la ejecición del main 1");
        //Main, espera hasta 2 segundos a que el executor termine. Si no terminó, continúa.
        ex.awaitTermination(2,TimeUnit.SECONDS);
        System.out.println("Continuando con la ejecición del main 2");


    }
}
