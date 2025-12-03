package POOSobrecarga;

public class Calculadora {


    public static int sumar(int a, int b) {

        return a + b;
    }

    public static float sumar(float x, float y) {

        return x + y;
    }

    public static float sumar(int y, float j) {
        return y + j;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }



}
