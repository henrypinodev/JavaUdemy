package POOSobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {


        Calculadora cal = new Calculadora();

        System.out.println("sumar dos enteros"+ cal.sumar(10,5));
        System.out.println("sumar float: "+cal.sumar(10.0F,5F));
        System.out.println("sumar float int: "+ cal.sumar(10f,5));
        System.out.println("sumar integer float: "+ cal.sumar(10,5.0F) );
        System.out.println("sumar double:" + cal.sumar(10d,5d));
        System.out.println("sumar String"+ cal.sumar("6","13"));
        System.out.println("sumar tres enteros:" + cal.sumar(5,13,5));

        System.out.println("sumar Long"+ cal.sumar(10L, 30L));
        System.out.println("sumar unicode con integer: "+ cal.sumar(10,'@'));
        
    }
}
