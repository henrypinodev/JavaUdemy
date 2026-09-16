package Thread.Executor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService ex = Executors.newSingleThreadExecutor();

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

        Future<String> resultado = ex.submit(tarea);

        ex.shutdown();
        System.out.println("Continuando con la ejecición del main 1");
        System.out.println("metodo Future, resultado.isDone(): "+resultado.isDone());
        System.out.println("Resultado de resultado.get() : "+ resultado.get());
        System.out.println("continuamos.");
        System.out.println(resultado.isDone());



    }
}
