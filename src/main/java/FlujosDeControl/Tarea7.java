package FlujosDeControl;

import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        int count = 10;
        for (int i = 0; i <10; i++){
            System.out.println("ingresa" + count + "numeros");
            numeros[i] = scanner.nextInt();
            count --;
        }
        int mayor = numeros[0];
        for (int i = 0; i< numeros.length; i++){
            if (mayor < numeros[i]){
               mayor = numeros[i];
            }

        }
        System.out.println("el numero mayor es"+ mayor);











    }
}
