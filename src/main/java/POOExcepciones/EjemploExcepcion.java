package POOExcepciones;


import javax.swing.*;

public class EjemploExcepcion {
    public static void main(String[] args)  {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un numero");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10,divisor);
            System.out.println(division);

            double division2 = cal.dividir(10,5);
            System.out.println("division 2: "+division2);
        }catch (NumberFormatException nex){
            System.out.println("NO ES UN NUMERO, SE EJECUTA NUMBERFORMATEXCEPTION"+ nex.getMessage());
            System.out.println("STACKTRACE --");
            nex.printStackTrace(System.out);
        } catch (DivisionporCeroException ae){
            System.out.println("Error  al dividir en 0 "+ "mensaje de e en exception"+ae.getMessage());
            System.out.println("STACKTRACE --");
            ae.printStackTrace(System.out);
        }finally {
            System.out.println("Finally siempre se ejecutará ocurra o no la excepción y se usa para cerrar recursos eje connection de BD, cerrar archivos abiertos etc");
        }
        System.out.println("hola ");




    }
}
