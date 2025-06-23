package ClaseMath;

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

    }
}
