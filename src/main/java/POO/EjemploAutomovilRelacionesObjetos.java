 package POO;

import POO.Clases.*;

 public class EjemploAutomovilRelacionesObjetos {

     public static void main(String[] args) {


         Persona conductorSubaru = new Persona("Juan", "Perez");


         Rueda[] ruedasSub = new Rueda[5];
         // El constructor que cree, tiene parametrizado dos atributos, por lo tanto se debe ingresar fabricante y modelo
         Automovil2 subaru = new Automovil2("Subaru","Impreza", Color.BLANCO, new Motor(1.3, TipoMotor.BENCINA), new Estanque(30), conductorSubaru, ruedasSub);
         subaru.setConductor(conductorSubaru);
         //subaru.setRuedas(ruedasSub);


         for (int i = 0; i < ruedasSub.length; i++) {
             subaru.addRueda(new Rueda(2.0, "Aro 14", "Yokohama"));

         }
         Rueda[] ruedasMazda = new Rueda[5];
         Rueda[] ruedasNissan = new Rueda[5];




         Persona miguel = new Persona("Miguel", "Angel");
         Persona bea = new Persona("Bea","Gutierrez");
         Persona lalo = new Persona("Lalo", "Salamanca");

         Automovil2 nissan = new Automovil2("Nissan", "Navara", Color.BLANCO,new Motor(2.0, TipoMotor.BENCINA),new Estanque(50), bea, ruedasNissan);
         Automovil2 mazda = new Automovil2("Mazda", "BT-50", Color.AZUL,new Motor(1.5, TipoMotor.BENCINA), new Estanque(70), lalo, ruedasMazda);
         Automovil2 nissan2 = new Automovil2("Nissan 2", "Tundra", Color.AMARILLO, new Motor(4.5, TipoMotor.DIESEL), new Estanque(50), lalo, ruedasNissan);

         mazda.setConductor(miguel);


         for (int i = 0; i < ruedasMazda.length; i++){
             mazda.addRueda(new Rueda(1.4,"Aro 19", "Valve"));
         }

         nissan.addRueda(new Rueda(1.9, "Aro 22", "Michellin"))
                 .addRueda(new Rueda(1.9, "Aro 22", "Michellin"))
                 .addRueda(new Rueda(1.9, "Aro 22", "Michellin"))
                 .addRueda(new Rueda(1.9, "Aro 22", "Michellin"))
                 .addRueda(new Rueda(1.9, "Aro 22", "Michellin"));










         // FIN úso de objetos inicializados con los constructores
         //Automovil2 subaru1 = new Automovil2("Subaru","Impreza" );
         subaru.setTipo(TipoAutomovil.HASHBACK);
         subaru.setColor(Color.GRIS);
         nissan.setTipo(TipoAutomovil.COUPE);
         nissan.setColor(Color.NARANJO);
         mazda.setTipo(TipoAutomovil.CONVERTIBLE);
         mazda.setColor(Color.AMARILLO);


         System.out.println(subaru.verDetalle());
         System.out.println(nissan.verDetalle());
         System.out.println(mazda.verDetalle());


         System.out.println("Conductor subaru: "+ subaru.getConductor());

         System.out.println("Inicio de FOREACH ruedasSub");
         for(Rueda r: subaru.getRuedas()){
             System.out.println(r.getFabricante()+", Aro: "+ r.getAro()+", Ancho: "+ r.getAncho());
         }





     }



 }
