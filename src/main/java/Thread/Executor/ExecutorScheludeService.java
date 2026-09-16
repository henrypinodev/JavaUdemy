package Thread.Executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorScheludeService {
    public static void main(String[] args) {

        ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);

        System.out.println("ALguna tarea en el main");
        ex.schedule(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hola tarea");

            },5000, TimeUnit.MILLISECONDS);
        ex.shutdown();
        System.out.println("alguna otra tarea en el main");
    }
}
