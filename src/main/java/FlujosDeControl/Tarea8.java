package FlujosDeControl;

import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {

        /* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5,
        promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa. */


        Scanner scanner = new Scanner(System.in);
        double[] notasFinales = new double[20];
        int i = 0;
        int count = 1;
        double promedio5 = 0;
        double promedio4 = 0;
        double notas1 = 0;
        int contadornota5 = 0;
        int contadornota4 = 0;
        int contadornotas1 = 0;

        
        for (i = 0; i < 20; i++){
            System.out.println("Ingrese la nota "+ count + " final");
            count++;
            notasFinales[i] = scanner.nextDouble();
            if (notasFinales[i] != 0){
                if(notasFinales[i] >=5){
                    promedio5 = notasFinales[i]+ promedio5;
                    contadornota5++;
                } else if (notasFinales[i] <= 4 && notasFinales[i] >1 ) {
                    promedio4 = promedio4+notasFinales[i];
                    contadornota4++;

                } else if (notasFinales[i] == 1) {
                   contadornotas1++;
                }
            }else {
                System.out.println("No puede ingresar un 0");
                i--;
                count--;
            }
        }
        double promfinal5 = (promedio5/contadornota5);
        double promfinal4 = (promedio4/contadornota4);
        System.out.println("El PROMEDIO DE LAS NOTAS IGUALES O SUPERIORES DE 5 ES: "+ promfinal5);
        System.out.println("EL PROEDIO DE LAS NOTAS INFERIORES A 4 ES: "+ promfinal4);
        System.out.println("EL NUMERO TOTALES DE NOTAS 1 ES" + contadornotas1);


    }
}


/* prompt sugerido por GPT  */

/*    Scanner scanner = new Scanner(System.in);
        double[] notasFinales = new double[20];
        int count = 1;
        double suma5 = 0;
        double suma4 = 0;
        int contadornota5 = 0;
        int contadornota4 = 0;
        int contadornotas1 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la nota " + count + " final:");
            double nota = scanner.nextDouble();

            if (nota != 0) {
                notasFinales[i] = nota;
                count++;

                if (nota == 1) {
                    contadornotas1++;
                } else if (nota >= 5) {
                    suma5 += nota;
                    contadornota5++;
                } else if (nota > 1 && nota <= 4) {
                    suma4 += nota;
                    contadornota4++;
                }
            } else {
                System.out.println("No puede ingresar un 0.");
                i--; // repetir ingreso
                count--;
            }
        }

        double promfinal5 = (contadornota5 > 0) ? (suma5 / contadornota5) : 0;
        double promfinal4 = (contadornota4 > 0) ? (suma4 / contadornota4) : 0;

        System.out.println("EL PROMEDIO DE LAS NOTAS IGUALES O SUPERIORES A 5 ES: " + promfinal5);
        System.out.println("EL PROMEDIO DE LAS NOTAS MENORES A 5 Y MAYORES A 1 ES: " + promfinal4);
        System.out.println("EL NÚMERO TOTAL DE NOTAS IGUALES A 1 ES: " + contadornotas1); */

