/* package POO;

import POO.Clases.Automovil;
import POO.Clases.Color;
import POO.Clases.TipoAutomovil;

import javax.sql.XAConnection;
import javax.transaction.xa.XAException;
import java.util.Date;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {




        // El constructor que cree, tiene parametrizado dos atributos, por lo tanto se debe ingresar fabricante y modelo
        Automovil subaru = new Automovil("Subaru","Impreza" );

        subaru.setCilindrada(2.0);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.BLANCO, 2.0, false, 50, true, 500, 4.5, 70);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.AZUL, 3.0);

        // FIN úso de objetos inicializados con los constructores
        Automovil subaru1 = new Automovil("Subaru","Impreza" );
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
*/