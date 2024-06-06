package convertendoDataHoraGlobalParaLocal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class DataHoraGlobalParaLocal {
    public static void main(String[] args) throws ParseException {

        //AULA 113. CONVERTENDO data-hora global para local:
        LocalDate d04 = LocalDate.parse("2024-06-05");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-05T10:55:26");
        Instant d06 = Instant.parse("2024-06-05T10:55:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);

        System.out.println("d04 dia : " + d04.getDayOfMonth());
        System.out.println("d04 mês : " + d04.getMonthValue());
        System.out.println("d04 mês : " + d04.getMonth());
        System.out.println("d04 ANO : " + d04.getYear() + d04.getMonth() + d04.getDayOfMonth());


        //Verifica todas as times zones
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

    }
}