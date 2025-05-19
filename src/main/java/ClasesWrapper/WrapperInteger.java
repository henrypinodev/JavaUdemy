package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 3225;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto= "+ intObjeto);


        int num = intObjeto;
        System.out.println("num = "+ num);

        int num2 = intObjeto.intValue();

        System.out.println("num2: "+ num2);

        // ------------------------------------------------------------
        String valorTvLCD = "6565";
        Integer valor = Integer.valueOf(valorTvLCD);
        System.out.println("valor LCD" + valor);

        //-------------------------------------------------------------

        Short shortObjeto = 3246;


    }
}
