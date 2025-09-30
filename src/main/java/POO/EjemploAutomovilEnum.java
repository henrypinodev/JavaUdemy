package POO;

import POO.Clases.*;


public class EjemploAutomovilEnum {

    public static void main(String[] args) {


        // El constructor que cree, tiene parametrizado dos atributos, por lo tanto se debe ingresar fabricante y modelo
        Automovil2 subaru = new Automovil2("Subaru","Impreza" );

        Automovil2 nissan = new Automovil2("Nissan", "Navara", Color.BLANCO, new Motor(3.0, TipoMotor.DIESEL));
        Automovil2 mazda = new Automovil2("Mazda", "BT-50", Color.AZUL, new Motor(1.7, TipoMotor.BENCINA));

        subaru.setTipo(TipoAutomovil.HASHBACK);
        subaru.setColor(Color.GRIS);
        nissan.setTipo(TipoAutomovil.COUPE);
        nissan.setColor(Color.NARANJO);
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);



        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("El tipo de auto de subaru es:"+ tipo);
        System.out.println("El numero de puertas es"+ tipo.getNumeroPuertas());
        System.out.println("La descripcion es"+ tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil de transporte, empresarial");
                break;
            case HASHBACK:
                System.out.println("Es un automovil mediano compacti, aspecto deportivo");
                break;
            case PICK_UP:
                System.out.println("Es un automovil de doble cabina o camioneta ");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil mas grande, con maleta y espacio altamente disponbible");
                break;

        }

        // FOREACH, ITERANDO UN ENUM

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.print(ta + "=>"+ ta.name()+ "," + ta.getNombre()+ ", "+ ta.getDescripcion()+". "+ ta.getNumeroPuertas());
        }






    }
}
