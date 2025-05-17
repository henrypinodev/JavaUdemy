package FlujosDeControl;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Ingrese un numero a multiplicar");
        num = scanner.nextInt();

        for(int i = 0; i <=10; ){
            result = (num*i);
            System.out.println("num"+ num + "x"+ i + "="+ result );

            i++;

        }




    }
}
