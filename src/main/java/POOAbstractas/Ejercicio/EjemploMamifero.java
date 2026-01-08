package POOAbstractas.Ejercicio;

import POOAbstractas.Ejercicio.Mamifero.Canino.Canino;
import POOAbstractas.Ejercicio.Mamifero.Canino.Lobo;
import POOAbstractas.Ejercicio.Mamifero.Canino.Perro;
import POOAbstractas.Ejercicio.Mamifero.Felino.Felino;
import POOAbstractas.Ejercicio.Mamifero.Felino.Guepardo;
import POOAbstractas.Ejercicio.Mamifero.Felino.Leon;
import POOAbstractas.Ejercicio.Mamifero.Felino.Tigre;
import POOAbstractas.Ejercicio.Mamifero.Mamifero;



public class EjemploMamifero {

    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero lobo = new Lobo("archipielago",49.2f,10.4f,23.4f,"CanudusLobo",4.0f,"Gris",20,"Especie salvaje");
        Mamifero tigre = new Tigre("Selva",30.1f,1.16f, 80.6f,"TigresusAnimales",80,6.0f,"Especie tigre");
        Mamifero perro = new Perro("ciudad", 2.5f, 23.6f,45.6f, "canidus", 92.9f, "Blanco",23);
        Mamifero leon = new Leon("Bengala", 7.9f, 72.3f, 23.3f, "tigrebangeliña", 270,220.3f,12,510.3f);
        Mamifero guepardo = new Guepardo("desierto",1.60f,2.6f,35.3f,"Guerpardiño",60,654.4f);
        mamiferos[0] = lobo;
        mamiferos[1] = tigre;
        mamiferos[2] = perro;
        mamiferos[3] = leon;
        mamiferos[4] = guepardo;




        for (Mamifero animal : mamiferos ) {
            if (animal != null) {

                System.out.println(animal.getClass().getSimpleName());
                System.out.println(animal.getHabitat());
                System.out.println(animal.getPeso());
                System.out.println(animal.getLargo());
                System.out.println(animal.getNombreCientifico());

                if (animal instanceof Canino) {
                    System.out.println("Color: "+ ((Canino) animal).getColor());
                    System.out.println("Tamaño colmillos: "+ ((Canino) animal).getTamanoColmillos());

                    if (animal instanceof Lobo){
                        System.out.println("Especie lobo: "+ ((Lobo) animal).getEspecieLobo());
                        System.out.println("Numero de camada: "+ ((Lobo) animal).getNumCamada());
                    }
                    if (animal instanceof Perro){
                        System.out.println("Fuerza de mordida: "+ ((Perro) animal).getFuerzaMordida());
                    }
                    System.out.println("SALIENDO DE CANINO");

                }
                if (animal instanceof Felino) {
                    System.out.println("Tamaño colmillos Felinos: "+((Felino) animal).getTamanoColmillos());
                    System.out.println("Velocidad Felinos: "+ ((Felino) animal).getVelocidad());

                    if (animal instanceof Tigre){
                        System.out.println("Especie tigre: "+ ((Tigre) animal).getEspecieTigre());

                    }
                    if (animal instanceof Leon){
                        System.out.println("Numero de manada: "+ ((Leon) animal).getNumManada());
                        System.out.println("Potencia de rugido"+ ((Leon) animal).getPotenciaRugidoDecibel());
                    }
                }
                System.out.println("------METODOS --------");
                System.out.println(animal.correr());
                System.out.println(animal.dormir());
                System.out.println(animal.comer());
                System.out.println(animal.comunicarse());


            }
        }

        }

    }



/*
Se requiere escribir un programa para la administración de animales de un zoológico, inicialmente para los mamíferos, para leones, lobos, tigres, guepardos y perros salvaje africano.

Se necesita diseñar una jerarquías de clases en común a todos ellos, por ejemplo para los felinos (Leon, Tigre y Guepardo) vamos a necesitar la clase abstracta Felino, para los caninos (Lobo y Perro) vamos a necesitar la clase abstracta Canino y una clase que sea en comun para todos ellos, la clase abstracta Mamifero.

Para todos los mamíferos mencionados se requieren de los siguientes atributos en común (que deberan de implementar en la clase abstracta Mamifero): el habitat (string), altura (decimal), largo (decimal), peso (decimal), nombre científico (string) con sus respectivos métodos getters, usar constructor para inicializar los datos. También se necesitan 4 métodos abstractos que deberán implementar los tipos concretos: comer(), dormir(), correr(), comunicarse(), todos devuelven string.

Todos los caninos deberán tener ademas de lo anterior los atributos color (string), tamaño colmillos (decimal) e inicializar los datos mediante constructor con sus métodos getters.

Todos los felinos deberán tener los atributos tamaño garras (decimal) y velocidad (int), inicializar los datos mediante constructor y sus métodos getters.

Respecto a los tipos concretos:

- El Leon ademas tiene numero manada (int) y potencia rugido en decibel (decimal)

- El Tigre tiene el atributo especie tigre (string)

- El Guepardo sin atributos adicionales

- El Lobo tiene numero de camada (int) y especieLobo (string)

- El Perro tiene fuerza de mordida en psi (int)

Los métodos abstractos comer(), dormir(), correr() y comunicarse() tienen que ser implementados por las clases concretas devolviendo un string con alguna frase u oración que sea de acuerdo a cada tipo y que interactúe con sus atributos. No hay una regla para implementar estos métodos, pueden aplicar la creatividad, por ejemplo en la clase Leon el método comer() podría ser implementado devolviendo la cadena "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas", o para el Lobo el método dormir() devolver "El Lobo " + color + " duerme en las cavernas de " + habitat.

Al final crear la clase con el método main llamada EjemploMamiferos y crear algunas instancias de ejemplo de cada clase concreta, entre 5 a 7 objetos, asociado al tipo mas genérico posible y mostrar los datos en consola. Por ejemplo:

Mamifero[] mamiferos = new Mamifero[6];

Mamifero leon = new Leon(120d, 5, 7.5f, 58, "Sur Africa", 120, 220, 190);
Mamifero guepardo = new Guepardo(4.9f, 130, "Africa", 94, 140, 72);
...
mamiferos[0] = leon;
mamiferos[1] = guepardo;
...

for (Mamifero animal : mamiferos) {
    ....
}
...
A continuación dejo el diagrama UML de clases como una guía, los métodos getters y constructores se omitieron para simplificar, pero deben ir en el código.


*
* */