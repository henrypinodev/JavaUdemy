package Thread.Executor;

import Thread.Sync.Panaderia;
import Thread.runnable.Consumidor;
import Thread.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor ex = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de Tareas en cola: "+ ex.getQueue().size());


        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);
        Future<?> futuro1 = ex.submit(productor);
        Future<?> futuro2 = ex.submit(consumidor);



        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de Tareas en cola: "+ ex.getQueue().size());


        ex.shutdown();
        System.out.println("Continuando con la ejecición del main 1");






    }
}
