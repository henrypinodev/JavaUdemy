package FlujosDeControl;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int numNaturales = 0;
     int suma = 0;

        System.out.println("Ingrese un numero natural del 1 al 9");
        numNaturales = scanner.nextInt();

        if (numNaturales >=1 && numNaturales <=9){
            for (int i = 1; i <= 9;){
                numNaturales = numNaturales+i;
                System.out.println("El numero es: "+ numNaturales+ "el numero i es:"+ i + "");
                i++;
            }
            System.out.println("numero final es: "+ numNaturales);

        }else {
            System.out.println("eligio 0 o 9 ");
        }


    }
}
