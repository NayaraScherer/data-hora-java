package manipulandoDateComCalendar;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateComCalendar {
    public static void main(String[] args) {
           /*
    Somando uma unidade de tempo:

     */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d =Date.from(Instant.parse("2024-06-06T15:16:07Z"));
        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);
        d= cal.getTime();

        int minutes = cal.get(Calendar.MINUTE);
        //como no Java o mês começa em 0 , é preciso somar 1 antes do cal.get, para poder inicializar Janeiro em 1.
        int month = 1+ cal.get(Calendar.MONTH);

        System.out.println(sdf.format(d));
        System.out.println("Minutes: "+ minutes);
        System.out.println("Month: "+ month);

    }

}
