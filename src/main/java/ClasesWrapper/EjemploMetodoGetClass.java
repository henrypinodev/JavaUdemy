package ClasesWrapper;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "holamundo";

        Class strClass = texto.getClass();

        System.out.println("strClass: "+ strClass.getName());
        System.out.println("strClass: "+ strClass.getSimpleName());
        System.out.println("strClass: "+ strClass.getPackage());
        System.out.println("strClass: "+ strClass);
        //System.out.println("strClass: "+ strClass.arrayType());

        Integer num = 32;
        Class intClass = num.getClass();
        System.out.println("intClass = "+ num.getClass());
        System.out.println("intClass = "+ intClass.getSuperclass());


    }
}
