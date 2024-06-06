package calculoComDataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class CalculoDataHora {
    public static void main(String[] args) throws ParseException {

        //Aula 114. Como fazer cálculos com data-hora
        //Data-hora em Java são objetos imutáveis

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-05T10:55:26");
        Instant d06 = Instant.parse("2024-06-05T10:55:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nexWeekLocalDate = d04.plusYears(7);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nexWeekLocalDateTime = d05.plusDays(7);

        Instant pastWeekInstatnt = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstatnt = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("pastWeekLocalDate: "+ pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: "+ nexWeekLocalDate);

        System.out.println("nexWeekLocalDateTime d05: "+ nexWeekLocalDateTime);
        System.out.println("pastWeekLocalDateTime d05: "+ pastWeekLocalDateTime);

        System.out.println("pastWeekInstatnt d06: "+ pastWeekInstatnt);
        System.out.println("nextWeekInstatnt d06: "+ nextWeekInstatnt);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime,d05);
        Duration t3 = Duration.between(pastWeekInstatnt,d06);
        Duration t4 = Duration.between(d06,pastWeekInstatnt);

        System.out.println("t1 dias= " + t1.toDays());
        System.out.println("t2 dias= " + t2.toDays());
        System.out.println("t3 dias= " + t3.toDays());
        System.out.println("t4 dias= " + t4.toDays());


    }
}