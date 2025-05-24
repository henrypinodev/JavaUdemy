package ValorYReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("iniciamos el metodo main con i = 10" + i);
        test(i);
        System.out.println("finaliza el metodo main con valor de i: "+i);

    }

    public static void test(int i){
        System.out.println("iniciamos el metodo i con test: "+i);
        i = 35;
        System.out.println("iniciamos otra vez i: "+i);

    }
}
