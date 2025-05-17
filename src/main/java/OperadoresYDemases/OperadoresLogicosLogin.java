package OperadoresYDemases;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

       /*  String[] usernames = new String[3];
         usernames[0] = "henry";
        String[] passwords = new String[3];
        passwords[0] = "123456";
        usernames[1] = "admin";
        passwords[1] = "123456";
        usernames[2] = "pepe";
        passwords[2] = "123456";
*/
        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"123", "1234", "123456"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = scanner.nextLine();
        System.out.println("Ingrese la contraseña");
        String p = scanner.nextLine();
        boolean isAutenticado = false;

        for (int i=0; i< usernames.length; i++) {
            isAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: isAutenticado;
        }


        /* if (isAutenticado){
            System.out.println("Ha iniciado sesión, bienvenido usuario "+ u );
        }else{
            System.out.println("error al iniciar");

        }
*/
        String mensaje = isAutenticado ? ("bienvenido usuario"+ u): "no encontrado";
        System.out.println(mensaje);

    }
}
