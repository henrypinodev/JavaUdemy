/*package POO;

import POO.Clases.Automovil;

import java.util.Date;

public class EjemploAutomovil {

    public static void main (String[] args) {



        Automovil subaru = new Automovil("Subaru","Impreza" );


        subaru.setCilindrada(2.0);
        subaru.setColor("Rojo");

        Automovil mazda = new Automovil("Mazda", "Sport" );

        mazda.setCilindrada(1.6);
        mazda.setColor("Negro");

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println(subaru.acelerar(5000));
        System.out.println(mazda.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300,0.6f));

        System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300,60));



        Automovil nissan = new Automovil("nissan", "Navara", "Gris oscuro", 3.5,true,
                50, true, 30, 3.5,50);
        Automovil nissan2 = new Automovil("nissan", "Navara", "Gris oscuro", 3.5,true,
                50, true, 30, 3.5,50);

        System.out.println(nissan.verDetalle());

        System.out.println("Comparando dos objetos Automovil con ==: "+ (nissan == nissan2));
        System.out.println("Comparando dos objetos automovil con equals modificado "+ (nissan.equals(nissan2)));

        Date fecha = new Date();



        // modificamos el toString con un override y ahora no imprime el hashcode del objeto, si no, su contenido.
        System.out.println(nissan.toString());



    }



}
*/