package Thread.Executor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor ex = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de Tareas en cola: "+ ex.getQueue().size());

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea");
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }

            System.out.println("Finaliza la tarea ");
            return "resultado de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Iniciando tarea2 Callable");
            TimeUnit.SECONDS.sleep(3);
            return 30;
        };

        Future<String> resultado = ex.submit(tarea);
        Future<String> resultado2 = ex.submit(tarea);
        Future<Integer> resultado3 = ex.submit(tarea2);

        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de Tareas en cola: "+ ex.getQueue().size());


        ex.shutdown();
        System.out.println("Continuando con la ejecición del main 1");

        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s", resultado.isDone()? "finalizo:": "En Proceso", resultado2.isDone()? "finalizo:": "En proceso",
                    resultado3.isDone()? "finalizó;": "En proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("metodo Future, resultado.isDone(): "+resultado.isDone());
        System.out.println("Resultado de resultado.get() : "+ resultado.get());
        System.out.println("Resultado de resultado2.get() : "+ resultado2.get());
        System.out.println("Resultado de resultad3.get() : "+ resultado3.get());
        System.out.println("continuamos.");
        System.out.println(resultado.isDone());



    }
}
