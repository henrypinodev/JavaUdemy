package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros= {1,3,5,7,9,11,13,14};
        for (int num: numeros){
            System.out.println("num = "+num);
        }

        String[] nombres = {"marcela", "juancarlos", "pepa", "josephine", "mauricio"};

        for (String nom: nombres){
            System.out.println(nom);
        }

    }
}
