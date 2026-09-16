package Thread.Executor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorScheludeServicePeriodo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);


        System.out.println("ALguna tarea en el main");

        //CountDownLatch lock = new CountDownLatch(5);
        AtomicInteger contador = new AtomicInteger(5);
        Future<?> future = ex.scheduleAtFixedRate(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hola tarea");

            },5000,2000, TimeUnit.MILLISECONDS);

        //TimeUnit.SECONDS.sleep(10);

        //lock.await();
        //future.cancel(true);
        while (contador.get() >=0){
            if (contador.get() ==0){
                future.cancel(true);
                contador.getAndDecrement();
            }
        }
        ex.shutdown();

        System.out.println("alguna otra tarea en el main");
    }
}
