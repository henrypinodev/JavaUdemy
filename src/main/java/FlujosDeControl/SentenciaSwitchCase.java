package FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {


        int num = 7;
        switch (num){
            case 0:
                System.out.println("el numero es cero");
                break;
            case 1:
                System.out.println("el numero es uno");
                break;
            case 2:
                System.out.println("el numero es dos");
                break;
            case 3:
                System.out.println("el numero es tres");
                break;
            default:
                System.out.println("no se encontraron coincidencias");
        }
        String nombre = "Henry";
        switch (nombre){
            case "henry":
                System.out.println("bienvenido henry");
                break;
            case "admin":
                System.out.println("bienvenido admin");
                break;
            case "pepe":
                System.out.println("bienvenido pepe");
                break;
            default:
                System.out.println("usuario no  calza");
        }
    }
}
