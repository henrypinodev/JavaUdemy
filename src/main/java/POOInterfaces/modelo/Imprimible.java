package POOInterfaces.modelo;

public interface Imprimible {

    final static String TEXTO_DE_DEFECTO = "iMPRIMIENDO UN VALOR POR DEFECTO EN CONSTANTE FINAL";

    static void imp(Imprimible imp) {
        System.out.println(imp.imprimir());
    }

    default String imprimir() {
        return "imprimiento valor por defecto";
    }

}