package POO;

import POO.Clases.*;

import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Juan", "Perez");


        // El constructor que cree, tiene parametrizado dos atributos, por lo tanto se debe ingresar fabricante y modelo
        Automovil2 subaru = new Automovil2("Subaru", "Impreza", Color.BLANCO, new Motor(1.3, TipoMotor.BENCINA), new Estanque(30));

        //subaru.setRuedas(ruedasSub);


        Persona miguel = new Persona("Miguel", "Angel");
        Persona bea = new Persona("Bea", "Gutierrez");
        Persona lalo = new Persona("Lalo", "Salamanca");

        Automovil2 nissan = new Automovil2("Nissan", "Navara", Color.BLANCO, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50));
        Automovil2 mazda = new Automovil2("Mazda", "BT-50", Color.AZUL, new Motor(1.5, TipoMotor.BENCINA), new Estanque(70));
        Automovil2 nissan2 = new Automovil2("Nissan 2", "Tundra", Color.AMARILLO, new Motor(4.5, TipoMotor.DIESEL), new Estanque(50));

        subaru.setConductor(conductorSubaru);
        nissan.setConductor(bea);
        mazda.setConductor(lalo);
        // FIN úso de objetos inicializados con los constructores
        //Automovil2 subaru1 = new Automovil2("Subaru","Impreza" );
        subaru.setTipo(TipoAutomovil.HASHBACK);
        subaru.setColor(Color.GRIS);
        nissan.setTipo(TipoAutomovil.COUPE);
        nissan.setColor(Color.NARANJO);
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);
        mazda.setColor(Color.AMARILLO);

        Automovil2[] autos = new Automovil2[3];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;

        Arrays.sort(autos);
        for (Automovil2 auto : autos) {
            System.out.println(auto);
        }


    }
}
