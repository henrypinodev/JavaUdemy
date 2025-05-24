package DateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingrese una fecha:");
        try {
            Date fecha = format.parse(scanner.nextLine());
            System.out.println("Fecha: "+fecha);
            System.out.println("Format: "+ format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("Fecha 2:"+fecha2);
            if (fecha.after(fecha2)){
                System.out.println("Fecha ingresada es mayor que fecha 2:");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha ingresada es anterior que fecha 2: ");

            } else if(fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a fecha 2:");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha 1 es despues que fecha 2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha 1 es antes que fecha 2 (Actual)");
            } else if (fecha.compareTo(fecha2) ==0) {
                System.out.println("Fechas son iguales");
            }

        }catch (ParseException e){
            e.printStackTrace();
        }





    }
}
