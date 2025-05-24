package DateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println(fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy ");
        // Puede ser el simpleDateFormat como dd-mm-yyyy o dd/mm/yyyy
        // Revisar documentación de todos los formats para Date
        String fechaStr = df.format(fecha);

        System.out.println(fechaStr);



    }
}
