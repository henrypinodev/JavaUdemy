package LineaComandos;

public class ArgumentosLineaComandoCalculadora {

    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println("debe ingresar una operacion suma resta division o multipicador y dos enteros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado= a-b;
                break;
            case "multiplicador":
                resultado = a*b;
            case "divisor":
                if (b == 0){
                    System.exit(-1);
                    System.out.println("No se puede dividir por cero");
                }
                resultado = (double)a/b;
                break;
            default:
                resultado = a+b;
        }



    }
}
