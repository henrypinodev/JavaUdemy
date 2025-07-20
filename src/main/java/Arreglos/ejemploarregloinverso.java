package Arreglos;

public class ejemploarregloinverso {
    public static void main(String[] args) {


        String[] abecedario = {"a","b","c","d"};

        int total = abecedario.length;
        int total2 = abecedario.length;



        for (int i = 0; i < total; i++ ) {
            System.out.println("Indice [i]: "+i+" "+abecedario[i]);
        }

        for (int i = 0; i < total2; i++){
            String actual = abecedario[i];
            String inverso = abecedario[total2 - 1 -i];
            abecedario[i] = inverso;
            abecedario[total2 -1 -i] = actual;
            total2--;
        }
        // revisar el total del for de invertido
        for(int i = 0; i < total; i++){
            System.out.println("Indice [i]: "+i+" "+ abecedario[i]);
        }
    }
}
