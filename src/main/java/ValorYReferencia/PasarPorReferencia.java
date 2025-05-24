package ValorYReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12};

        System.out.println("iniciamos el metodo main");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i]: "+ edad[i]);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("despues de llamar al metodo test");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i]"+ edad[i]);
        }
        System.out.println("Finaliza el metodo main");
    }

    public static void test(int[] edadArr){
        System.out.println("iniciamos el metodo test: ");
        for (int i = 0; i < edadArr.length; i++){
            System.out.println("edadArr[i]; "+edadArr[i]);
        }
        System.out.println("iniciamos otra vez i: "+edadArr);

    }
}

