package ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2= 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;
        System.out.println(primBoolean);
        System.out.println(objBoolean);
        System.out.println(objBoolean2);


        // COMPARANDO DOS OBJETOS BOOLEAN

        System.out.println("Comparando dos objetos boolean: "+(objBoolean == objBoolean2) );
        System.out.println("Comparando dos objetos boolean: "+(objBoolean.equals(objBoolean2)) );
        System.out.println("Comparando dos objetos boolean: "+(objBoolean == objBoolean3));

    }
}
