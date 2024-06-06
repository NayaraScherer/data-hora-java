package ConvertendoDataHoraParaTexto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DataHoraParaTexto {
    public static void main(String[] args) throws ParseException {


        //AULA 112 CONVERTENDO data-hora para texto:

        LocalDate d04 = LocalDate.parse("2024-06-05");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-05T10:55:26");
        Instant d06 = Instant.parse("2024-06-05T10:55:26Z");

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fm4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fm5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04: " + d04.format(fm1));
        System.out.println("d04: " + fm1.format(d04));

        System.out.println("d05: " + d05.format(fm1));
        System.out.println("d05: " + d05.format(fm2));
        System.out.println("d06: " + fm3.format(d06));
        System.out.println("d05: " + d05.format(fm4));
        System.out.println("d06: " + fm5.format(d06));

          }
}