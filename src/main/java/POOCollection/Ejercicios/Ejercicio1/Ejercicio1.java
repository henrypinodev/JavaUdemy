package POOCollection.Ejercicios.Ejercicio1;

import java.lang.reflect.Array;
import java.time.LocalDate;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<Vuelo> listavuelo = new ArrayList<>();
        listavuelo.add(new Vuelo("AAL 933","NEW YORK","SANTIAGO",62, LocalDate.of(2022,8,29), LocalTime.of(5,39)));
        listavuelo.add(new Vuelo("LAT 775","SAO PAULO","SANTIAGO",47, LocalDate.of(2021,9,30),LocalTime.of(4,45)));
        listavuelo.add(new Vuelo("SKU 621","RIO DE JANEIRO","SANTIAGO",52, LocalDate.of(2023,9,26),LocalTime.of(4,15)));
        listavuelo.add(new Vuelo("DAL 147","GUARDALAJARA","SANTIAGO",59, LocalDate.of(2022,3,22),LocalTime.of(4,0)));
        listavuelo.add(new Vuelo("AVA 775","BUENOS AIRES","SANTIAGO",25, LocalDate.of(2020,4,15),LocalTime.of(7,5)));
        listavuelo.add(new Vuelo("IBE 775","MAR DEL PLATA","SANTIAGO",34, LocalDate.of(2023,4,6),LocalTime.of(1,45)));
        listavuelo.add(new Vuelo("CMP 775","URBEKISTAN","SANTIAGO",47, LocalDate.of(2024,6,2),LocalTime.of(2,50)));
        listavuelo.add(new Vuelo("AAL 775","BEIJIN","SANTIAGO",39, LocalDate.of(2021,5,16),LocalTime.of(11,30)));
        listavuelo.add(new Vuelo("AMX 775","TOKYO","SANTIAGO",24, LocalDate.of(2025,2,12),LocalTime.of(6,15)));


        listavuelo.sort(Comparator.comparing(Vuelo::getFecha).thenComparing(Vuelo::getHora));

        for(Vuelo v : listavuelo){
            System.out.println("Vuelo: "+v.getVuelo());
            System.out.println("Oigen: "+v.getOrigen());
            System.out.println("Destino: "+v.getDestino());
            System.out.println("Fecha Llegada: "+v.getFecha());
            System.out.println("Hora Llegada: "+v.getHora());
            System.out.println("Numero de pasanjeros: "+v.getPasajeros());
            System.out.println("----------------------------------");
        }

        /*for (int i =0; i <= listavuelo.size(); i++){

            System.out.println("fori: " + listavuelo.get(i));
            System.out.println(listavuelo.get());
            }*/
        /*for (Vuelo vuelo : listavuelo){
            if (vuelo.getFecha().isAfter(listavuelo.getFecha())){
                ls = vuelo;

            }
        }
*/

        Vuelo ultimo = listavuelo.get(listavuelo.size()-1);
        System.out.println("El ultimo vuelo en llegar es: "+ ultimo.getVuelo()+" el "+ultimo.getFecha()+" a las "+ultimo.getHora());

        listavuelo.sort(Comparator.comparing(Vuelo::getPasajeros).reversed());

        Vuelo ultimoPasajero = listavuelo.get(listavuelo.size()-1);
        System.out.println("El vuelo con menor numero de pasajeros es: "+ultimoPasajero.getPasajeros()+" del vuelo "+ultimoPasajero.getVuelo());


        /*
        *llegadas.sort((v1, v2) -> v2.getFechayHoraLlegada().compareTo(v1.getFechayHoraLlegada()));

        llegadas.forEach(System.out::println);
        Vuelo ultimoVuelo = llegadas.get(0);
        System.out.println("El último vuelo en llegar es " + ultimoVuelo.getNombre() + ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getFechayHoraLlegada());

        llegadas.sort((v1, v2) -> Integer.valueOf(v2.getNumeroPasajeros()).compareTo(v1.getNumeroPasajeros()));
        Vuelo vueloNenorNumero = new LinkedList<>(llegadas).peekLast();
        System.out.println("El vuelo con menor número de pasajeros es " + vueloNenorNumero.getNombre() + ": " + vueloNenorNumero.getOrigen()+ ", con " + vueloNenorNumero.getNumeroPasajeros() + " pasajeros.");
    }
        * */

    }


}
