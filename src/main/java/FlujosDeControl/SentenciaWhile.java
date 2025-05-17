package FlujosDeControl;

public class SentenciaWhile {

    public static void main(String[] args) {

        int i = 0;

        while(i<=5){
            System.out.println("i = "+i);
            i++;
        }

        i = 0;

        boolean prueba = true;
        System.out.println("||||||||||| SE INICIA SEGUNDO BLOQUE    |||||||||");
        while (prueba){
            if (i ==7){
                prueba= false;
            }
            System.out.println("i = " +i);
            i++;
        }
        prueba = false;
        while (prueba){
            System.out.println("nunca se ejecutara al ser false el prueba");
        }

        do {
            System.out.println("se ejecutara una vez");

        }while (prueba);



    }


}
