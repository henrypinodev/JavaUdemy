package POOAbstractas.Ejercicio2;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[3];

        Vehiculo vehiculoauto = new Auto("Mercedez", "Estrada", 220, 5, 4, true);
        Vehiculo vehiculoAvion = new Avion("Boeing", "Jumbo", 560, 160, 1200, 4);
        Vehiculo vehiculoMoto = new Moto("Suzuki", "Hayabusa", 260, 1, 2, 600);

        vehiculos[0] = vehiculoauto;
        vehiculos[1] = vehiculoAvion;
        vehiculos[2] = vehiculoMoto;

        for (Vehiculo veh : vehiculos) {
            System.out.print(veh.getClass().getSimpleName() + ": ");
            System.out.print(veh.getMarca() + ", ");
            System.out.print(veh.getModelo() + ", ");
            System.out.print(veh.getCapacidadPasajeros() + ", ");
            System.out.print(veh.getVelocidadMax() + "\n");

            if (veh instanceof VehiculoTerrestre) {
                System.out.println("N° Ruedas: "+((VehiculoTerrestre) veh).getRuedas());

                if (veh instanceof Auto) {
                    System.out.println("Tipo de cambio: " +((Auto) veh).automatico+ " de "+veh.getClass().getSimpleName());
                }
                if (veh instanceof Moto) {
                    System.out.println(((Moto) veh).getCilindrada());
                }

            }
            if (veh instanceof VehiculoAereo) {
                System.out.println("Altitud: "+((VehiculoAereo) veh).getAltitudMaxima()+"de: "+ veh.getClass().getSimpleName());

                if (veh instanceof Avion) {
                    System.out.println("N° de motores: "+((Avion) veh).numeroMotores+ "de: "+ veh.getClass().getSimpleName());
                }
            }

            System.out.println(veh.acelerar());
            System.out.println(veh.encender());
            System.out.println(veh.frenar());
            System.out.println(veh.descripcion());


        }
    }
}
