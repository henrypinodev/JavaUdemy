package POO;

import POO.Clases.*;

import java.util.Date;

public class EjemploAutomovil {

    public static void main (String[] args) {



        Automovil2 subaru = new Automovil2("Subaru","Impreza" );

        Motor motor = new Motor(2.0, TipoMotor.BENCINA);
        subaru.setMotor(motor);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.ROJO);
        subaru.setTipo(TipoAutomovil.PICK_UP);

        Automovil2 mazda = new Automovil2("Mazda", "Sport", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(80));
        mazda.setTipo(TipoAutomovil.STATION_WAGON);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());


        Automovil2 nissan = new Automovil2("nissan", "Navara", Color.BLANCO, new Motor(4.0, TipoMotor.BENCINA), new Estanque(35));
        Automovil2 nissan2 = new Automovil2("nissan", "Navara",Color.NARANJO, new Motor(2.0, TipoMotor.DIESEL),new Estanque(40));
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);

        System.out.println(nissan.verDetalle());

        System.out.println("Comparando dos objetos Automovil con ==: "+ (nissan == nissan2));
        System.out.println("Comparando dos objetos automovil con equals modificado "+ (nissan.equals(nissan2)));

        Date fecha = new Date();



        // modificamos el toString con un override y ahora no imprime el hashcode del objeto, si no, su contenido.
        System.out.println(nissan.toString());



    }



}
