package Thread;

public class EjemploInterfaceRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {

        Runnable viaje = () -> {
             {
                for (int i=0; i <10; i++){
                    System.out.println(i+" - "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println("Finalmente me voy de viaje a: "+Thread.currentThread().getName());
            }
        };

        Thread v1 = new Thread (viaje, "Juan Fernandez");
        Thread v2 = new Thread(viaje, "Isla de Chiloe");
        Thread v3 = new Thread(viaje, "Isla de de Pascua");
        Thread v4 = new Thread(viaje,"Isla de Robinson Crusoe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();
        System.out.println("CONTINUANDO CON LA EJECUCION DEL METODO MAIN");



    }
}
