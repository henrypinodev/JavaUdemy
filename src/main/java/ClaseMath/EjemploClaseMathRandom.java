package ClaseMath;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        // el metodo random sin especificar solo devuelve un numero random entre 0 y 1 eje 0.564854651

        String[] colores = {"azul", "amarillo", "verde", "Celeste"};
        double random = Math.random();
        System.out.println(random);

        random = random * colores.length;
        System.out.println(random);

        random = Math.floor(random);
        System.out.println("random= "+random);

        System.out.println(random);

        System.out.println("Colores = "+ colores[(int)random]);

        Random randomObj = new Random();

        int randomInt = 15 + randomObj .nextInt(25-15);
        System.out.println("random int: "+ randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = "+ randomInt);
        System.out.println("Colores= "+ colores[randomInt]);

    }
}
