import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        //ZoneId.getAvailableZoneIds(); get every zone names

        LocalDate date01 = LocalDate.parse("2013-09-18");
        LocalDateTime date02 = LocalDateTime.parse("2024-01-01T23:34:42");
        Instant date03 = Instant.parse("2015-04-30T01:28:21Z");

        LocalDate r1 = LocalDate.ofInstant(date03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(date03, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(date03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(date03, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        System.out.println("date01 day = " + date01.getDayOfMonth());
        System.out.println("date01 month = " + date01.getMonth());
        System.out.println("date01 year = " + date01.getYear());
        System.out.println("date02 hour = " + date02.getHour());
        System.out.println("date02 minute = " + date02.getMinute());
        System.out.println("date02 second = " + date02.getSecond());
        System.out.println("date02 dayOfWeek = " + date02.getDayOfWeek());
        System.out.println("date02 MonthValue = " + date02.getMonthValue());

    }
}