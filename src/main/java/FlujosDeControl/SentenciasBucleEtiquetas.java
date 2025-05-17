package FlujosDeControl;

public class SentenciasBucleEtiquetas {

    public static void main(String[] args) {


        String palabra = "trigo";
        String frase = "tres trigo tristes tigres trigaban en un trigal";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i;
            for (int j = 0; j <maxPalabra; j++){
               if (frase.charAt(k++) != palabra.charAt(j)){
                   i++;
                   continue buscar;

               }

        }
            cantidad++;
            i = i+maxPalabra;
        }

        System.out.println("el numero de palabra trio es: "+ cantidad);





    }
}
