package DateYCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {
    public static void main(String[] args) {

        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
        String strFecha = df.format(fecha);
        long j = 0;
        for (int i = 0; i < 1000000000; i++){
            j = j + i;
        }

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el For"+ tiempoFinal);

    }
}
