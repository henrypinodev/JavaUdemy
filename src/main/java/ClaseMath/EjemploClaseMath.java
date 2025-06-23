package ClaseMath;

public class EjemploClaseMath {

    public static void main(String[] args) {
       // viendo los valores minimos y maximos
        int absoluto = Math.abs(-3);
        System.out.println(absoluto);

        double max = Math.max(5.5, 1.2);
        System.out.println("max = "+ max);

        double min = Math.min(6.6, 1.5);
        System.out.println("Valor min:"+ min);
        // redondea hacia arriba
        double techo = Math.ceil(3.5);
        System.out.println("redondeo hacia arriba"+techo);

        double techo2 = Math.floor(3.5);
        System.out.println("Redondeo hacia abajo"+techo2);

        long redodeo = Math.round(3.5);
        System.out.println("Redondeo automatico"+redodeo);

        double exp = Math.exp(1);
        System.out.println("exponencial"+exp);

        double log = Math.log(10);
        System.out.println("Logaritmo"+log);

        double potencia = Math.pow(10,3);
        System.out.println("Potencia"+potencia);

        double raiz = Math.sqrt(5);
        System.out.println("Raiz cuadrada"+raiz);

        double  grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados="+ grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes"+radianes);

        System.out.println("sin(90):"+ Math.sin(radianes));
        System.out.println("cos(90):"+ Math.cos(radianes));

        radianes = Math.toRadians(180);

        System.out.println("sin(90):"+ Math.sin(radianes));
        System.out.println("cos(90):"+ Math.cos(radianes));

        radianes = Math.toRadians(0.00);

        System.out.println("sin(0):"+ Math.sin(radianes));
        System.out.println("cos(0):"+ Math.cos(radianes));

    }
}
