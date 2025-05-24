package DateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

       // calendario.set(2025,06,23, );
        calendario.set(Calendar.YEAR,2025);
        calendario.set(Calendar.MONTH,Calendar.MAY);
        calendario.set(Calendar.DAY_OF_MONTH,15);
        calendario.set(Calendar.HOUR, 7);
        //calendario.set(Calendar.HOUR_OF_DAY,23);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 30);
        Date fecha = calendario.getTime();

        System.out.println("Calendario: "+ fecha);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss a");
        String fechaConFormato = format.format(fecha);
        System.out.println("Fecha con formato:+ "+ fechaConFormato);




    }
}
