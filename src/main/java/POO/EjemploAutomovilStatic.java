 package POO;

import POO.Clases.*;

import java.util.Date;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {




        // El constructor que cree, tiene parametrizado dos atributos, por lo tanto se debe ingresar fabricante y modelo
        Automovil subaru = new Automovil("Subaru","Impreza" );

        subaru.setCilindrada(2.0);

        Automovil2 nissan = new Automovil2("Nissan", "Navara", Color.BLANCO,new Motor(2.0, TipoMotor.BENCINA));
        Automovil2 mazda = new Automovil2("Mazda", "BT-50", Color.AZUL,new Motor(1.5, TipoMotor.BENCINA) );

        // FIN úso de objetos inicializados con los constructores
        Automovil2 subaru1 = new Automovil2("Subaru","Impreza" );
        subaru.setTipo(TipoAutomovil.HASHBACK);
        subaru.setColor(Color.GRIS);
        nissan.setTipo(TipoAutomovil.COUPE);
        nissan.setColor(Color.NARANJO);
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);
        mazda.setColor(Color.AMARILLO);


        System.out.println(subaru.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(mazda.verDetalle());



        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("El tipo de auto de subaru es:"+ tipoSubaru);
        System.out.println("El numero de puertas es"+ tipoSubaru.getNumeroPuertas());
        System.out.println("La descripcion es"+ tipoSubaru.getDescripcion());



    }



}
