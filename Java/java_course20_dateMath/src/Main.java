import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate date01 = LocalDate.parse("2013-09-18");
        LocalDateTime date02 = LocalDateTime.parse("2024-01-01T23:34:42");
        Instant date03 = Instant.parse("2015-04-30T01:28:21Z");

        LocalDate pastWeekLocalDate = date01.minusWeeks(1);
        LocalDate nextWeekLocalDate = date01.plusWeeks(1);

        System.out.println("last Week : " + pastWeekLocalDate);
        System.out.println("present Week : " + date01);
        System.out.println("next Week : " + nextWeekLocalDate);
        System.out.println("-------------------------------------------------");

        LocalDateTime pastHoursLocalDateTime = date02.minusHours(3);
        LocalDateTime nextHoursLocalDateTime = date02.plusHours(7);

        System.out.println("past Time : " + pastHoursLocalDateTime);
        System.out.println("present Time : " + date02);
        System.out.println("future Time : " + nextHoursLocalDateTime);
        System.out.println("-------------------------------------------------");

        Instant pastInstant = date03.minus(3, ChronoUnit.DAYS);
        Instant futureInstant = date03.plus(6, ChronoUnit.DAYS);

        System.out.println("past Instant : " + pastInstant);
        System.out.println("present Instant : " + date03);
        System.out.println("future Instant : " + futureInstant);

        System.out.println("-------------------------------------------------");
        System.out.println("DURATION");

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), date01.atStartOfDay());
        System.out.println("T1 : " + t1.toDays() + " days");

        Duration t2 = Duration.between(pastHoursLocalDateTime, date02);
        System.out.println("T2 : " + t2.toHours() + " hours");

        Duration t3 = Duration.between(futureInstant, date03);
        System.out.println("T3 : " + t3.toDays() + " days");
    }
}