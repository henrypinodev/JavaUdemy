package LineaComandos;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("debe ingresar argumentos o parametro!");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos n°:"+ i + ": "+ args[i]);

        }

    }
}
